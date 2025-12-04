package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.dap.*;
import org.tzi.use.monitor.adapter.python.dap.Thread;
import org.tzi.use.monitor.adapter.python.dap.custom.*;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

/**
 * This class is responsible for sending and receiving messages to and from
 * the debugpy socket.
 */
public class Messenger {

    private static int REQUEST_COUNTER = 1;

    private final ObjectMapper mapper = new ObjectMapper();

    private final Socket socket;
    private final BufferedReader in;
    private final BufferedWriter out;
    private final DebugpyClient client;

    private final ConcurrentHashMap<Long, CompletableFuture<DAPResponse>> pendingRequests = new ConcurrentHashMap<>();
    private CompletableFuture<InitializedEventClass> initEventFuture = new CompletableFuture<>();
    private CompletableFuture<StoppedEventClass> pauseEventFuture = new CompletableFuture<>();
    private CompletableFuture<ContinuedEventClass> continuedEventFuture = new CompletableFuture<>();
    public CompletableFuture<StoppedEventClass> breakpointEventFuture = new CompletableFuture<>();

    public Messenger(Socket socket, DebugpyClient client) throws IOException {
        this.socket = socket;
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        startReaderThread();
        this.client = client;
    }

    public InitializeResponseClass initialize() {
        initEventFuture = new CompletableFuture<>();
        var initArgs = new InitializeRequestArguments();
        initArgs.setAdapterID("USE");
        initArgs.setLinesStartAt1(true);
        initArgs.setColumnsStartAt1(true);
        initArgs.setPathFormat("path");
        var initReq = new InitializeRequestClass();
        initReq.setSeq(REQUEST_COUNTER++);
        initReq.setArguments(initArgs);
        return (InitializeResponseClass) sendRequestSync(initReq);
    }

    public void attach(String host, int port, String workspace) {
        var attachArgs = new AttachRequestArgumentsClass();
        attachArgs.setConnect(Map.of("host", host, "port", port));
        attachArgs.setPathMappings(List.of(Map.of("localRoot", workspace, "remoteRoot", ".")));
        attachArgs.setClientOs(resolveClientOS());
        attachArgs.setDebugOptions(List.of("RedirectOutput", "ShowReturnValue"));
        attachArgs.setShowReturnValue(true);
        attachArgs.setJustMyCode(true);
        attachArgs.setWorkspaceFolder(workspace);
        attachArgs.setSessionId(UUID.randomUUID().toString());
        var attachReq = new AttachRequestClass();
        attachReq.setArguments(attachArgs);
        attachReq.setSeq(REQUEST_COUNTER++);
        sendRequestAsync(attachReq);

        try {
            initEventFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) java.lang.Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    private String resolveClientOS() {
        return System.getProperty("os.name").toLowerCase().contains("win")
                ? "WINDOWS"
                : "UNIX";
    }

    public void configurationDone() {
        var confDoneReq = new ConfigurationDoneRequestClass();
        confDoneReq.setSeq(REQUEST_COUNTER++);
        // TODO Fix should not be async request
        //Response confDoneResp = (Response) sendRequest(confDoneReq);
        sendRequestAsync(confDoneReq);

        // Wait for attach async response
        // TODO FIX! responseQueue instead of single slot
        //Response attachResponse = (Response) waitForAsyncResponse();
        //return initResp.getSuccess() && attachResponse.getSuccess() && confDoneResp.getSuccess();
        try {
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public boolean pause() {
        pauseEventFuture = new CompletableFuture<>();

        var pauseArgs = new PauseRequestArguments();
        var threadId = getThreadId();
        pauseArgs.setThreadID(threadId);
        var pauseReq = new PauseRequestClass();
        pauseReq.setSeq(REQUEST_COUNTER++);
        pauseReq.setArguments(pauseArgs);
        var pauseResp = (PauseResponseClass) sendRequestSync(pauseReq);

        if (!pauseResp.getSuccess()) {
            return false;
        }

        try {
            pauseEventFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) java.lang.Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        return true;
    }

    public boolean resume() {
        continuedEventFuture = new CompletableFuture<>();

        var continueArgs = new ContinueRequestArguments();
        continueArgs.setThreadID(getThreadId());
        var continueReq = new ContinueRequestClass();
        continueReq.setSeq(REQUEST_COUNTER++);
        continueReq.setArguments(continueArgs);
        if (!((ContinueResponseClass) sendRequestSync(continueReq)).getSuccess()) {
            return false;
        }

        try {
            continuedEventFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) java.lang.Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        return true;
    }


    protected Long getSelfId(long frameId) {
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setFrameID(frameId);
        evalArgs.setContext("watch");
        evalArgs.setExpression(PyEvalExBuilder.getSelfIdAtCurrentFrame());
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequestSync(evalReq);
        return Long.parseLong(evalResp.getBody().getResult());
    }


    public Variable[] getDAPChildren(long variablesReference) {
        var varArgs = new VariablesRequestArguments();
        varArgs.setVariablesReference(variablesReference);
        var varReq = new VariablesRequestClass();
        varReq.setSeq(REQUEST_COUNTER++);
        varReq.setArguments(varArgs);
        var varResp = (VariablesResponseClass) sendRequestSync(varReq);
        return varResp.getBody().getVariables();
    }


    public boolean stop() {
        var stopArgs = new DisconnectRequestArguments();
        stopArgs.setRestart(false);
        stopArgs.setSuspendDebuggee(true);
        stopArgs.setTerminateDebuggee(false);
        var stopReq = new DisconnectRequestClass();
        stopReq.setSeq(REQUEST_COUNTER++);
        stopReq.setArguments(stopArgs);
        return ((DisconnectResponseClass) sendRequestSync(stopReq)).getSuccess();
    }

    public boolean setBreakpoints(String file, Set<Integer> lines) {
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
        var bpResp = (SetBreakpointsResponseClass) sendRequestSync(bpReq);
        return bpResp.getSuccess();
    }

    public String evaluate(String expression) throws Exception {
        EvaluateResponseClass raw = evaluateRaw(expression);
        if (raw.getSuccess()) {
            return raw.getBody().getResult();
        }
        throw new Exception("Failed to evaluate expression: " + expression);
    }

    protected DAPValue getMethodArgDAPValue(long frameId, String argName) {
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setFrameID(frameId);
        evalArgs.setContext("watch");
        evalArgs.setExpression(argName);
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequestSync(evalReq);
        return new DAPValue(evalResp.getBody().getResult(), evalResp.getBody().getType(), evalResp.getBody().getVariablesReference());
    }

    public EvaluateResponseClass evaluateRaw(String expression) {
        StackFrame currStackFrame = getCurrentFrame(getThreadId());
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setContext("watch");
        evalArgs.setFrameID(currStackFrame.getID());
        evalArgs.setExpression(expression);
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        return (EvaluateResponseClass) sendRequestSync(evalReq);
    }

    public Long getThreadId() {
        var threadsReq = new ThreadsRequestClass();
        threadsReq.setSeq(REQUEST_COUNTER++);
        var threadsResp = (ThreadsResponseClass) sendRequestSync(threadsReq);
        if (threadsResp.getSuccess()) {
            for (Thread thread : threadsResp.getBody().getThreads()) {
                if (thread.getName().equals("MainThread")) {
                    return thread.getID();
                }
            }
        }
        throw new IllegalMonitorStateException("Could not get thread id from threads request!");
    }

    public StackFrame getCurrentFrame(long threadId) {
        var stackTraceArgs = new StackTraceRequestArguments();
        stackTraceArgs.setThreadID(threadId);
        var stackTraceReq = new StackTraceRequestClass();
        stackTraceReq.setSeq(REQUEST_COUNTER++);
        stackTraceReq.setArguments(stackTraceArgs);
        var stackTraceResp = (StackTraceResponseClass) sendRequestSync(stackTraceReq);

        if (stackTraceResp.getSuccess()) {
            return stackTraceResp.getBody().getStackFrames()[0];
        }
        throw new IllegalMonitorStateException(String.format("Could not get current stack frame for threadId: %d!", threadId));
    }

    private DAPResponse sendRequestSync(DAPRequest dapRequest) {
        CompletableFuture<DAPResponse> futureResp = sendRequestAsync(dapRequest);
        return waitForAsyncResponse(futureResp);
    }

    private DAPResponse waitForAsyncResponse(CompletableFuture<DAPResponse> futureResp) {
        DAPResponse res;
        try {
            res = futureResp.get();
        } catch (InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) java.lang.Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        return res;
    }

    private CompletableFuture<DAPResponse> sendRequestAsync(DAPRequest request) {
        long reqSeq = request.getSeq();
        CompletableFuture<DAPResponse> future =
                pendingRequests.computeIfAbsent(reqSeq, ignored -> new CompletableFuture<>());

        String json;
        try {
            json = mapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
        String header = "Content-Length: " + bytes.length + "\r\n\r\n";
        try {
            out.write(header);
            out.flush();
            out.write(json);
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return future;
    }

    private void startReaderThread() {
        var readerThread = new java.lang.Thread(() -> {
            try {
                while (true) {
                    String line;
                    int contentLength = 0;
                    while ((line = in.readLine()) != null && !line.isEmpty()) {
                        if (line.startsWith("Content-Length:")) {
                            String val = line.substring("Content-Length:".length()).trim();
                            try {
                                contentLength = Integer.parseInt(val);
                            } catch (NumberFormatException ignored) {
                            }
                        }
                    }

                    if (contentLength <= 0) {
                        continue;
                    }

                    char[] body = new char[contentLength];
                    int read = 0;
                    while (read < contentLength) {
                        int r = in.read(body, read, contentLength - read);
                        if (r == -1) return;
                        read += r;
                    }
                    String json = new String(body);
                    if (json.isBlank()) {
                        continue;
                    }
                    DAPMessage msg = MessageMapper.parseMessage(json);
                    if (msg == null) {
                        continue;
                    }
                    if (msg instanceof DAPResponse dapResp) {
                        long reqSeq = dapResp.getRequestSeq();
                        CompletableFuture<DAPResponse> future = pendingRequests.remove(reqSeq);
                        if (future != null) {
                            future.complete(dapResp);
                        }
                    }
                    if (msg instanceof DAPEvent dapEvent) {
                        if (dapEvent instanceof InitializedEventClass initializedEvent) {
                            initEventFuture.complete(initializedEvent);
                        }
                        if (dapEvent instanceof ContinuedEventClass continuedEventClass) {
                            client.running = true;
                            continuedEventFuture.complete(continuedEventClass);
                        }
                        if (dapEvent instanceof StoppedEventClass stoppedEvent) {
                            client.running = false;
                            String reason = stoppedEvent.getBody().getReason();
                            if (reason.equals("pause")) {
                                pauseEventFuture.complete(stoppedEvent);
                            }
                            if (reason.equals("breakpoint")) {
                                breakpointEventFuture.complete(stoppedEvent);
                            }
                        }
                    }
                    if (msg instanceof DAPUnknown dapUnknown) {
                        System.err.println(dapUnknown);
                    }
                }
            } catch (InterruptedIOException e) {
                java.lang.Thread.currentThread().interrupt();
            } catch (IOException e) {
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        readerThread.setDaemon(true);
        readerThread.start();
    }

}
