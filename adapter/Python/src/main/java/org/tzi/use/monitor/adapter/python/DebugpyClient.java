package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.custom.DAPValue;
import org.tzi.use.monitor.adapter.python.dap.*;
import org.tzi.use.monitor.adapter.python.dap.Thread;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.*;

import java.io.*;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sergio Jimenez
 */
public class DebugpyClient {
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
    protected boolean running = false;
    protected final BlockingQueue<DAPEvent> eventQueue = new LinkedBlockingQueue<>();
    private final String workspace;
    private final String host;
    private final int port;

    DebugpyClient(String host, int port, String workspace) throws IOException {
        this.socket = new Socket(host, port);
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.workspace = workspace;
        this.host = host;
        this.port = port;
        startReaderThread();
    }

    boolean attach() {
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
        attachArgs.setPathMappings(List.of(Map.of("localRoot", workspace, "remoteRoot", ".")));
        // FIXME: Dynamic OS resolution with debugpy expected values
        attachArgs.setClientOs("unix");
        attachArgs.setDebugOptions(List.of("RedirectOutput", "ShowReturnValue"));
        attachArgs.setShowReturnValue(true);
        attachArgs.setJustMyCode(true);
        attachArgs.setWorkspaceFolder(workspace);
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
        if (!qualifiedClassName.contains(".")) {
            return new PyTypeRaw("Mock");
        }

        pause();

        PyTypeRaw rawType = new PyTypeRaw(qualifiedClassName);

        // Set Methods
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setContext("watch");
        evalArgs.setFrameID((long) getCurrentFrameId(getThreadId("MainThread")));
        evalArgs.setExpression(PyEvalExBuilder.getMethodSignaturesExp(qualifiedClassName));
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        String result = evalResp.getBody().getResult();

        if (!result.equals("''")) {
            List<PyMethodRaw> methods = new LinkedList<>();

            String escapedResult = result.substring(1, result.length() - 1);

            String[] methodSigs = escapedResult.split(";");

            for (String methodSig : methodSigs) {
                PyMethodRaw mRaw = new PyMethodRaw();

                String[] sigParts = methodSig.split(":");

                mRaw.setName(sigParts[0]);

                mRaw.setClassName(qualifiedClassName);

                List<String> argNames = new ArrayList<>();
                List<String> argTypes = new ArrayList<>();
                for (String argName : sigParts[1].split(",")) {
                    if (argName.equals("self")) {
                        continue;
                    }
                    argNames.add(argName);
                    argTypes.add("Mock");
                }
                mRaw.setArgumentNames(argNames);
                mRaw.setArgumentTypeNames(argTypes);

                // Set line nos and filename
                evalArgs.setExpression(PyEvalExBuilder.getMethodBreakpointInfo(qualifiedClassName, mRaw.getName()));
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
                mRaw.setEndLineNo(root.get("end").asInt());
                List<Integer> returnLines = new ArrayList<>();
                for (JsonNode r : root.get("returns")) {
                    returnLines.add(r.asInt());
                }
                mRaw.setReturnLines(returnLines);

                methods.add(mRaw);
            }
            rawType.setMethods(methods);
        }

        // Set File
        evalArgs.setExpression(PyEvalExBuilder.getFileForClass(qualifiedClassName));
        evalReq.setSeq(REQUEST_COUNTER++);
        evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        String file = evalResp.getBody().getResult();
        String normalizedPath = Path.of(file).normalize().toString().replace("'", "");
        System.out.println("SETTING FILE TO: " + normalizedPath);
        rawType.setFile(normalizedPath);

        return rawType;
    }

    protected DAPValue getDAPValue(Long objectId, String fName) {
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setExpression(PyEvalExBuilder.getDAPValue(objectId, fName));
        evalArgs.setFrameID(getCurrentFrame(getThreadId("MainThread")).getID());
        evalArgs.setContext("watch");
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);
        return new DAPValue(evalResp.getBody().getResult(), evalResp.getBody().getType(), evalResp.getBody().getVariablesReference());
    }

    protected List<PyFieldRaw> getInstanceVariables(long currFrameId) {
        List<PyFieldRaw> rawFields = new ArrayList<>();

        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setExpression(PyEvalExBuilder.getSelfVarsWithType());
        evalArgs.setFrameID(currFrameId);
        evalArgs.setContext("watch");
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        String result = evalResp.getBody().getResult();
        if (!result.equals("''")) {
            String vars = result.substring(1, result.length() - 1);
            String[] fields = vars.split(",");
            for (String field : fields) {
                String[] fieldParts = field.split(":");
                String fieldName = fieldParts[0];
                String fieldType = fieldParts[1];
                rawFields.add(new PyFieldRaw(fieldName, fieldType));
            }
        }
        return rawFields;
    }

    protected boolean setBreakpoints(String file, Set<Integer> lines) {
        var source = new Source();
        source.setName(file.substring(file.lastIndexOf("/") + 1));
        source.setPath(file);
        var bpArgs = new SetBreakpointsRequestArguments();
        bpArgs.setSource(source);
        SourceBreakpoint[] sourceBreakpoints = new SourceBreakpoint[lines.size()];
        Iterator<Integer> linesIter = lines.iterator();
        for (int i = 0; i < sourceBreakpoints.length; i++) {
            var srcBp = new SourceBreakpoint();
            srcBp.setLine(linesIter.next());
            sourceBreakpoints[i] = srcBp;
        }
        bpArgs.setBreakpoints(sourceBreakpoints);
        bpArgs.setLines(lines.stream().mapToLong(Integer::longValue).toArray());
        bpArgs.setSourceModified(false);
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

    protected Set<PyObjectRaw> getInstances(PyType pyType) {
        pause();

        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setContext("watch");
        evalArgs.setFrameID((long) getCurrentFrameId(getThreadId("MainThread")));
        evalArgs.setExpression(PyEvalExBuilder.getInstanceIds(pyType.getName()));
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        Set<PyObjectRaw> rawObjs = new HashSet<>();

        String result = evalResp.getBody().getResult();
        if (result.equals("[]")) {
            return rawObjs;
        }

        String[] objIds = result.substring(1, result.length() - 1).split(",");
        for (String id : objIds) {
            PyObjectRaw rawObj = new PyObjectRaw(Long.parseLong(id.trim()));
            rawObj.setRawType(pyType.getRawType());
            rawObjs.add(rawObj);
        }

        return rawObjs;
    }

    public Variable[] getDAPChildren(long variablesReference) {
        var varArgs = new VariablesRequestArguments();
        varArgs.setVariablesReference(variablesReference);
        var varReq = new VariablesRequestClass();
        varReq.setSeq(REQUEST_COUNTER++);
        varReq.setArguments(varArgs);
        var varResp = (VariablesResponseClass) sendRequest(varReq);
        return varResp.getBody().getVariables();
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

    protected Long getSelfId(long frameId) {
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setFrameID(frameId);
        evalArgs.setContext("watch");
        evalArgs.setExpression(PyEvalExBuilder.getSelfIdAtCurrentFrame());
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);
        return Long.parseLong(evalResp.getBody().getResult());
    }

    protected DAPValue getMethodArgDAPValue(long frameId, String argName){
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setFrameID(frameId);
        evalArgs.setContext("watch");
        evalArgs.setExpression(argName);
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);
        return new DAPValue(evalResp.getBody().getResult(), evalResp.getBody().getType(), evalResp.getBody().getVariablesReference());
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
                                running = false;
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
