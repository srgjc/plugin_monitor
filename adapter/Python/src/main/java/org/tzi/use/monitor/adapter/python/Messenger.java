package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.custom.DAPValue;
import org.tzi.use.monitor.adapter.python.dap.*;
import org.tzi.use.monitor.adapter.python.dap.Thread;

import java.io.*;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * This class is responsible for sending and receiving messages to and from
 * the debugpy socket.
 */
public class Messenger {

    public static int REQUEST_COUNTER = 1;

    private final ObjectMapper mapper = new ObjectMapper();

    private final Socket socket;
    private final BufferedReader in;
    private final BufferedWriter out;

    private final DebugpyClient client;

    private CompletableFuture<DAPResponse> futureResp = new CompletableFuture<>();
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
        return (InitializeResponseClass) sendRequest(initReq);
    }

    public void attach(String host, int port, String workspace) {
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

        try {
            initEventFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public void configurationDone() {
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

    }

    public boolean pause() {
        pauseEventFuture = new CompletableFuture<>();

        var pauseArgs = new PauseRequestArguments();
        var threadIdOpt = getThreadId();
        if (threadIdOpt.isEmpty()) {
            return false;
        }
        pauseArgs.setThreadID(threadIdOpt.get());
        var pauseReq = new PauseRequestClass();
        pauseReq.setSeq(REQUEST_COUNTER++);
        pauseReq.setArguments(pauseArgs);
        var pauseResp = (PauseResponseClass) sendRequest(pauseReq);

        if (!pauseResp.getSuccess()) {
            return false;
        }

        try {
            pauseEventFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public boolean resume() {
        continuedEventFuture = new CompletableFuture<>();

        var continueArgs = new ContinueRequestArguments();
        continueArgs.setThreadID(getThreadId().get());
        var continueReq = new ContinueRequestClass();
        continueReq.setSeq(REQUEST_COUNTER++);
        continueReq.setArguments(continueArgs);
        if (!((ContinueResponseClass) sendRequest(continueReq)).getSuccess()) {
            return false;
        }

        try {
            continuedEventFuture.get();
        } catch (InterruptedException | ExecutionException e) {
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
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);
        return Long.parseLong(evalResp.getBody().getResult());
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


    public boolean stop() {
        var stopArgs = new DisconnectRequestArguments();
        stopArgs.setRestart(false);
        stopArgs.setSuspendDebuggee(true);
        stopArgs.setTerminateDebuggee(false);
        var stopReq = new DisconnectRequestClass();
        stopReq.setSeq(REQUEST_COUNTER++);
        stopReq.setArguments(stopArgs);
        return ((DisconnectResponseClass) sendRequest(stopReq)).getSuccess();
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
        var bpResp = (SetBreakpointsResponseClass) sendRequest(bpReq);
        return bpResp.getSuccess();
    }

    public Optional<String> evaluate(String expression) {
        EvaluateResponseClass raw = evaluateRaw(expression);
        if (raw == null) {
            return Optional.empty();
        }
        return raw.getSuccess()
                ? Optional.of(raw.getBody().getResult())
                : Optional.empty();
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

    public EvaluateResponseClass evaluateRaw(String expression) {
        Optional<Long> threadIdOpt = getThreadId();
        if (threadIdOpt.isEmpty()) {
            return null;
        }
        Optional<StackFrame> currStackFrameOpt = getCurrentFrame(threadIdOpt.get());
        if (currStackFrameOpt.isEmpty()) {
            return null;
        }
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setContext("watch");
        evalArgs.setFrameID(currStackFrameOpt.get().getID());
        evalArgs.setExpression(expression);
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        return (EvaluateResponseClass) sendRequest(evalReq);
    }

    public Optional<Long> getThreadId() {
        var threadsReq = new ThreadsRequestClass();
        threadsReq.setSeq(REQUEST_COUNTER++);
        var threadsResp = (ThreadsResponseClass) sendRequest(threadsReq);
        if (threadsResp.getSuccess()) {
            for (Thread thread : threadsResp.getBody().getThreads()) {
                if (thread.getName().equals("MainThread")) {
                    return Optional.of(thread.getID());
                }
            }
        }
        return Optional.empty();
    }

    public Optional<StackFrame> getCurrentFrame(long threadId) {
        var stackTraceArgs = new StackTraceRequestArguments();
        stackTraceArgs.setThreadID(threadId);
        var stackTraceReq = new StackTraceRequestClass();
        stackTraceReq.setSeq(REQUEST_COUNTER++);
        stackTraceReq.setArguments(stackTraceArgs);
        var stackTraceResp = (StackTraceResponseClass) sendRequest(stackTraceReq);

        return stackTraceResp.getSuccess()
                ? Optional.of(stackTraceResp.getBody().getStackFrames()[0])
                : Optional.empty();
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
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        readerThread.setDaemon(true);
        readerThread.start();
    }

}
