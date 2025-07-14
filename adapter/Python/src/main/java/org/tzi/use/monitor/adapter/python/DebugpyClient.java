package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.dap.*;
import org.tzi.use.monitor.adapter.python.dap.Thread;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.*;

import java.io.*;
import java.net.Socket;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sergio Jimenez
 */
public class DebugpyClient {
    private static final String WORKSPACE = "/Users/serj/git/uni/dpy-server";
    private static final Pattern SIGNATURE_PATTERN = Pattern.compile("^(\\w+)\\((.*?)\\)\\s*->\\s*.*$");
    private static final Pattern TYPE_CLASS_PATTERN = Pattern.compile("\"(\\w+)\":\\s*\"(\\w+)\"");
    private static final Pattern JSON_STRINGIFY_PATTERN = Pattern.compile("(:\\s*)([^\"{},\\s][^,}]*)");

    private static int REQUEST_COUNTER = 1;

    private final Socket socket;
    private final BufferedReader in;
    private final BufferedWriter out;
    private final ObjectMapper mapper = new ObjectMapper();
    private CompletableFuture<DAPResponse> futureResp;
    private CompletableFuture<DAPEvent> initEvent;
    private CompletableFuture<DAPEvent> stoppedEvent;
    private boolean running = false;
    protected final BlockingQueue<DAPEvent> eventQueue = new LinkedBlockingQueue<>();

    DebugpyClient(String host, int port) throws IOException {
        this.socket = new Socket(host, port);
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        startReaderThread();
    }

    boolean attach(String host, int port) {
        initEvent = new CompletableFuture<>();

        // Initialize
        var initArgs = new InitializeRequestArguments();
        initArgs.setAdapterID("USE");
        initArgs.setLinesStartAt1(true);
        initArgs.setColumnsStartAt1(true);
        initArgs.setPathFormat("path");
        var initReq = new InitializeRequestClass();
        initReq.setSeq(REQUEST_COUNTER++);
        initReq.setArguments(initArgs);
        var initResp = (InitializeResponseClass) sendRequest(initReq);

        // Attach
        var attachArgs = new AttachRequestArgumentsClass();
        attachArgs.setConnect(Map.of("host", host, "port", port));
        attachArgs.setPathMappings(List.of(Map.of("localRoot", WORKSPACE, "remoteRoot", ".")));
        attachArgs.setClientOs("unix");
        attachArgs.setDebugOptions(List.of("RedirectOutput", "ShowReturnValue"));
        attachArgs.setShowReturnValue(true);
        attachArgs.setJustMyCode(true);
        attachArgs.setWorkspaceFolder(WORKSPACE);
        attachArgs.setSessionId(UUID.randomUUID().toString());
        var attachReq = new AttachRequestClass();
        attachReq.setArguments(attachArgs);
        attachReq.setSeq(REQUEST_COUNTER++);
        sendAsyncRequest(attachReq);

        // TODO wait for init event
        try {
            System.out.println("Waiting for init event...");
            initEvent.get();
            System.out.println("Got init event...");
        } catch (InterruptedException | ExecutionException e) {
            return false;
        }

        System.out.println("Sending configuration done...");
        //Configuration Done

        var confDoneReq = new ConfigurationDoneRequestClass();
        confDoneReq.setSeq(REQUEST_COUNTER++);
        // TODO Fix should not be async request
        //Response confDoneResp = (Response) sendRequest(confDoneReq);
        sendAsyncRequest(confDoneReq);

        // Wait for attach async response
        // TODO FIX! responseQueue instead of single slot
        //Response attachResponse = (Response) waitForAsyncResponse();
        //return initResp.getSuccess() && attachResponse.getSuccess() && confDoneResp.getSuccess();
        try {
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        running = true;
        return initResp.getSuccess();
    }

    PyTypeRaw getVMType(String qualifiedClassName) {
        // TODO: Handle remaining build-in types
        var t = switch (qualifiedClassName) {
            case "str" -> new PyTypeRaw("str");
            case "int" -> new PyTypeRaw("int");
            case "bool" -> new PyTypeRaw("bool");
            default -> null;
        };

        if (t != null) {
            return t;
        }

        pause();

        // Set Fields
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setContext("watch");
        evalArgs.setFrameID((long) getCurrentFrameId(getThreadId("MainThread")));
        evalArgs.setExpression(PyEvalExBuilder.getClassFieldTypesExp(qualifiedClassName));
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        var classMappings = parsePythonTypeString(evalResp.getBody().getResult());
        PyTypeRaw rawType = new PyTypeRaw(qualifiedClassName);
        List<PyFieldRaw> fields = new ArrayList<>();
        for (Map.Entry<String, String> entry : classMappings.entrySet()) {
            fields.add(new PyFieldRaw(entry.getKey(), entry.getValue(), null));
        }
        rawType.setFields(fields);

        // Set Methods
        evalArgs.setExpression(PyEvalExBuilder.getMethodsExpVar(qualifiedClassName));
        evalReq.setSeq(REQUEST_COUNTER++);
        evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        Map<String, Map<String, String>> mSigs = parseMethodSignatures(evalResp.getBody().getResult());
        List<PyMethodRaw> methods = new LinkedList<>();
        for (String mName : mSigs.keySet()) {
            PyMethodRaw mRaw = new PyMethodRaw();
            // Set name
            mRaw.setName(mName);
            // Set arg type names
            List<String> argTypeNames = new LinkedList<>();
            for (Map.Entry<String, String> mArg : mSigs.get(mName).entrySet()) {
               argTypeNames.add(mArg.getValue());
            }
            mRaw.setArgumentTypeNames(argTypeNames);
            // Set line nos and filename
            evalArgs.setExpression(PyEvalExBuilder.getMethodBreakpointInfo(qualifiedClassName, mName));
            evalReq.setSeq(REQUEST_COUNTER++);
            evalResp = (EvaluateResponseClass) sendRequest(evalReq);

            String json = evalResp.getBody().getResult().replace("'", "\"");
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root;
            try {
                root = mapper.readTree(json);
            } catch (JsonProcessingException e) {
                return null;
            }
            String fileRaw = root.get("file").asText();
            String normalizedFile = Paths.get(fileRaw).normalize().toString();
            mRaw.setFile(normalizedFile);
            mRaw.setStartLineNo(root.get("start").asInt());
            mRaw.setEndLineNo(root.get("end").asInt() - 1);
            List<Integer> returnLines = new ArrayList<>();
            for (JsonNode r : root.get("returns")) {
                returnLines.add(r.asInt());
            }
            mRaw.setReturnLines(returnLines);
            // TODO: Set return type

            methods.add(mRaw);
        }
        rawType.setMethods(methods);
        return rawType;
    }

    public static Map<String, Map<String, String>> parseMethodSignatures(String evalResp) {
        Map<String, Map<String, String>> result = new HashMap<>();
        evalResp = evalResp.strip().replaceAll("^'+|'+$", ""); // Remove outer quotes
        String[] lines = evalResp.split("\\\\n"); // split on literal `\n`

        for (String line : lines) {
            Matcher matcher = SIGNATURE_PATTERN.matcher(line.strip());
            if (matcher.matches()) {
                String methodName = matcher.group(1);
                String params = matcher.group(2);
                Map<String, String> paramMap = new LinkedHashMap<>();
                if (!params.isEmpty()) {
                    for (String param : params.split(",")) {
                        param = param.strip();
                        if (param.equals("self")) continue;
                        String[] parts = param.split(":");
                        if (parts.length == 2) {
                            String paramName = parts[0].strip();
                            String paramType = parts[1].strip();
                            paramMap.put(paramName, paramType);
                        } else {
                            // TODO: Unknown handling
                            System.out.printf("Unknown type for argument '%s'\n", parts[0].strip());
                        }
                    }
                }
                result.put(methodName, paramMap);
            }
        }
        return result;
    }

    public Map<String, String> parsePythonTypeString(String input) {
        Map<String, String> result = new HashMap<>();

        String cleaned = input
                .replace("'", "\"")
                .replaceAll("<class\\s+\"(.*?)\">", "\"$1\"")
                .replaceAll("<class\\s+'(.*?)'>", "\"$1\"");

        Matcher matcher = TYPE_CLASS_PATTERN.matcher(cleaned);

        while (matcher.find()) {
            String variable = matcher.group(1);
            String type = matcher.group(2);
            result.put(variable, type);
        }

        return result;
    }

    protected boolean setBreakpoint(String file, List<Integer> lines) {
        var source = new Source();
        source.setPath(file);
        var bpArgs = new SetBreakpointsRequestArguments();
        bpArgs.setSource(source);
        SourceBreakpoint[] sourceBreakpoints = new SourceBreakpoint[lines.size()];
        for (int i = 0; i < sourceBreakpoints.length; i++) {
            var srcBp = new SourceBreakpoint();
            srcBp.setLine(lines.get(i));
            sourceBreakpoints[i] = srcBp;
        }
        bpArgs.setBreakpoints(sourceBreakpoints);
        var bpReq = new SetBreakpointsRequestClass();
        bpReq.setSeq(REQUEST_COUNTER++);
        bpReq.setArguments(bpArgs);
        var bpResp = (SetBreakpointsResponseClass) sendRequest(bpReq);
        return bpResp.getSuccess();
    }

    protected boolean pause() {
        if (!running) {
            return true;
        }

        stoppedEvent = new CompletableFuture<>();

        var pauseArgs = new PauseRequestArguments();
        pauseArgs.setThreadID(getThreadId("MainThread"));
        var pauseReq = new PauseRequestClass();
        pauseReq.setSeq(REQUEST_COUNTER++);
        pauseReq.setArguments(pauseArgs);
        var pauseResp = (PauseResponseClass) sendRequest(pauseReq);
        try {
            System.out.println("Waiting for stopped event...");
            stoppedEvent.get();
            System.out.println("Got stopped event. Continuing...");
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        running = false;
        return pauseResp.getSuccess();
    }

    protected boolean resume() {
        if (running) {
            return true;
        }
        var continueArgs = new ContinueRequestArguments();
        continueArgs.setThreadID(getThreadId("MainThread"));
        var continueReq = new ContinueRequestClass();
        continueReq.setSeq(REQUEST_COUNTER++);
        continueReq.setArguments(continueArgs);
        var continueResp = (ContinueResponseClass) sendRequest(continueReq);
        running = true;
        return continueResp.getSuccess();
    }

    protected boolean stop() {
        var stopArgs = new DisconnectRequestArguments();
        stopArgs.setRestart(false);
        stopArgs.setSuspendDebuggee(true);
        stopArgs.setTerminateDebuggee(false);
        var stopReq = new DisconnectRequestClass();
        stopReq.setSeq(REQUEST_COUNTER++);
        stopReq.setArguments(stopArgs);
        var stopResp = (DisconnectResponseClass) sendRequest(stopReq);
        return stopResp.getSuccess();
    }

    protected int getThreadId(String threadName) {
        System.out.println("Getting thread id: " + threadName);
        var threadsReq = new ThreadsRequestClass();
        threadsReq.setSeq(REQUEST_COUNTER++);
        var threadsResp = (ThreadsResponseClass) sendRequest(threadsReq);
        for (Thread thread : threadsResp.getBody().getThreads()) {
            if (thread.getName().equals(threadName)) {
                System.out.println("Found thread: " + thread.getName() + " with id: " + thread.getID());
                return (int) thread.getID();
            }
        }
        return -1;
    }

    private int getCurrentFrameId(int threadId) {
        var stackTraceArgs = new StackTraceRequestArguments();
        stackTraceArgs.setThreadID(threadId);
        var stackTraceReq = new StackTraceRequestClass();
        stackTraceReq.setSeq(REQUEST_COUNTER++);
        stackTraceReq.setArguments(stackTraceArgs);
        var stackTraceResp = (StackTraceResponseClass) sendRequest(stackTraceReq);
        return (int) stackTraceResp.getBody().getStackFrames()[0].getID();
    }

    protected StackFrame getCurrentFrame(int threadId) {
        var stackTraceArgs = new StackTraceRequestArguments();
        stackTraceArgs.setThreadID(threadId);
        var stackTraceReq = new StackTraceRequestClass();
        stackTraceReq.setSeq(REQUEST_COUNTER++);
        stackTraceReq.setArguments(stackTraceArgs);
        var stackTraceResp = (StackTraceResponseClass) sendRequest(stackTraceReq);
        return stackTraceResp.getBody().getStackFrames()[0];
    }

    protected Thread[] getThreads() {
        var threadsReq = new ThreadsRequestClass();
        threadsReq.setSeq(REQUEST_COUNTER++);
        var threadsResp = (ThreadsResponseClass) sendRequest(threadsReq);
        return threadsResp.getBody().getThreads();
    }

    protected PyObjectRaw getInstance(PyType pyType) {
        pause();

        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setContext("watch");
        evalArgs.setFrameID((long) getCurrentFrameId(getThreadId("MainThread")));
        evalArgs.setExpression(PyEvalExBuilder.getInstanceExp(pyType.getName()));
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        // TODO: Use variables reference instead...
        var res = evalResp.getBody().getResult();
        if (res.equals("None")) {
            return null;
        }
        String json = res.replace('\'', '"');
        Map<String, Object> rawMap;
        try {
            rawMap = mapper.readValue(stringifyJsonEntries(json), Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, Object> entry : rawMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue().toString());
        }

        var pyObjectRaw = new PyObjectRaw();
        pyObjectRaw.setRawType(pyType.getRawType());
        for (PyFieldRaw rawField : pyObjectRaw.getRawType().getFields()) {
            System.out.println("Setting value '" + result.get(rawField.getName()) + "' to field '" + rawField.getName());
            rawField.setValue(result.get(rawField.getName()));
        }

        return pyObjectRaw;
    }

    private String stringifyJsonEntries(String json) {
        Matcher m = JSON_STRINGIFY_PATTERN.matcher(json);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            String value = m.group(2).trim();
            if (!(value.startsWith("\"") && value.endsWith("\""))) {
                m.appendReplacement(sb, m.group(1) + "\"" + value + "\"");
            } else {
                m.appendReplacement(sb, m.group());
            }
        }
        m.appendTail(sb);
        return sb.toString();
    }

    private void getStackStrace() {

    }

    private DAPResponse sendRequest(DAPRequest dapRequest) {
        sendAsyncRequest(dapRequest);
        return waitForAsyncResponse();
    }

    private DAPResponse waitForAsyncResponse() {
        DAPResponse res;
        try {
            System.out.println("Waiting for response...");
            res = futureResp.get();
            System.out.println("Finished waiting for response...");
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    private void  sendAsyncRequest(DAPRequest DAPRequest) {
        futureResp = new CompletableFuture<>();

        String json;
        try {
            json = mapper.writeValueAsString(DAPRequest);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        String header = "Content-Length: " + json.length() + "\r\n\r\n";

        try {
            System.out.println("Sending request: " + header + json);
            out.write(header + json);
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void startReaderThread() {
        var readerThread = new java.lang.Thread(() -> {
            System.out.println("Reader thread started...");
            try {
                while (true) {
                    String line;
                    int contentLength = 0;
                    while ((line = in.readLine()) != null && !line.isEmpty()) {
                        contentLength = Integer.parseInt(line.substring("Content-Length:".length()).trim());
                    }
                    char[] body = new char[contentLength];
                    int read = 0;
                    while (read < contentLength) {
                        int r = in.read(body, read, contentLength - read);
                        if (r == -1) throw new IOException("Unexpected end of stream");
                        read += r;
                    }
                    String json = new String(body);
                    if (json.isEmpty()) {
                        continue;
                    }
                    System.out.println("Received json response: " + json);
                    DAPMessage msg = MessageMapper.parseMessage(json);
                    System.out.println("Parsed json response to object...");
                    if (msg == null) {
                        System.out.println("Skipping unknown message type...");
                        continue;
                    }
                    if (msg instanceof DAPResponse) {
                        System.out.println("Response instance: " + msg);
                        // TODO FIX workaround
                      //  int reqSeq = ((DAPResponse) msg).getRequestSequence();
                        //if (reqSeq == currReqSeq - 1) {
                            System.out.println("Matched response: " + json);
                            if (futureResp.complete((DAPResponse) msg)) {
                                System.out.println("Response completed!");
                            }
                        //} else {
                          //  System.out.println("Ignored async message: " + json);
                        //}
                    }
                    if (msg instanceof DAPEvent) {
                        System.out.println("Event instance: " + msg);
                        if (msg instanceof InitializedEventClass) {
                            initEvent.complete((DAPEvent) msg);
                        }
                        if (msg instanceof StoppedEventClass) {
                            if (((StoppedEventClass) msg).getBody().getReason().equals("breakpoint")) {
                                eventQueue.add((DAPEvent) msg);
                            } else {
                                stoppedEvent.complete((DAPEvent) msg);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        readerThread.setDaemon(true);
        readerThread.start();
    }

}
