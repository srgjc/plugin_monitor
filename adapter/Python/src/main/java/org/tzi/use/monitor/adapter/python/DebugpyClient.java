package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.dap.*;
import org.tzi.use.monitor.adapter.python.dap.Thread;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.PyFieldRaw;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.PyTypeRaw;

import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * @author Sergio Jimenez
 */
public class DebugpyClient {
    private static final String WORKSPACE = "/Users/srgj/git/uni/ba/dpy-server";

    private static int REQUEST_COUNTER = 1;

    private final Socket socket;
    private final BufferedReader in;
    private final BufferedWriter out;
    private final BreakpointHandler breakpointHandler;
    private final ObjectMapper mapper = new ObjectMapper();
    private CompletableFuture<DAPResponse> futureResp;
    private CompletableFuture<DAPEvent> initEvent;
    private CompletableFuture<DAPEvent> stoppedEvent;

    DebugpyClient(String host, int port, BreakpointHandler breakpointHandler) throws IOException {
        this.socket = new Socket(host, port);
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.breakpointHandler = breakpointHandler;
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
        return initResp.getSuccess();
    }

    PyTypeRaw getVMType(String qualifiedClassName) {
        // Pause
        pause();

        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setContext("watch");
        evalArgs.setFrameID((long) getCurrentFrameId(getThreadId("MainThread")));
        evalArgs.setExpression(PyEvalExBuilder.getClassFieldTypesExp(qualifiedClassName));
        var evalReq = new EvaluateRequestClass();
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        // New internal PyType
        var rawType = new PyTypeRaw(qualifiedClassName);
        var rawField1 = new PyFieldRaw("name", "string", null);
        var rawField2 = new PyFieldRaw("salary", "int", null);
        rawType.setFields(List.of(rawField1, rawField2));

        // Resume
        resume();
        return rawType;
    }

    protected boolean pause() {
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
        return pauseResp.getSuccess();
    }

    protected boolean resume() {
        var continueArgs = new ContinueRequestArguments();
        continueArgs.setThreadID(getThreadId("MainThread"));
        var continueReq = new ContinueRequestClass();
        continueReq.setSeq(REQUEST_COUNTER++);
        continueReq.setArguments(continueArgs);
        var continueResp = (ContinueResponseClass) sendRequest(continueReq);
        return continueResp.getSuccess();
    }

    private int getThreadId(String threadName) {
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
                    while (!(line = in.readLine()).isEmpty()) {
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
                           stoppedEvent.complete((DAPEvent) msg);
                        }
                        if (msg instanceof BreakpointEventClass) {
                            handleBreakpoint((BreakpointEventClass) msg);
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

    private void handleBreakpoint(BreakpointEventClass event) {
        breakpointHandler.handleBreakpoint(event);
    }

}
