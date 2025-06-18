package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.dap.*;
import org.tzi.use.monitor.adapter.python.tmp.*;
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
//        var initArgs = new InitializeRequest.InitializeRequestArguments();
//        initArgs.setAdapterID("USE");
//        initArgs.setLinesStartAt1(true);
//        initArgs.setColumnsStartAt1(true);
//        initArgs.setPathFormat("path");
//        var initReq = new InitializeRequest(REQUEST_COUNTER++, initArgs);
//        var initResp = (InitializeResponse) sendRequest(initReq);

        // Attach
        var attachArgs = new AttachRequest.AttachRequestArguments();
        attachArgs.setConnect(Map.of("host", host, "port", port));
        attachArgs.setPathMappings(List.of(Map.of("localRoot", WORKSPACE, "remoteRoot", ".")));
        attachArgs.setClientOS(System.getProperty("os.name"));
        attachArgs.setDebugOptions(List.of("RedirectOutput", "ShowReturnValue"));
        attachArgs.setShowReturnValue(true);
        attachArgs.setJustMyCode(true);
        attachArgs.setWorkspaceFolder(WORKSPACE);
        attachArgs.setSessionId(UUID.randomUUID().toString());
        var attachReq = new AttachRequest(REQUEST_COUNTER++, attachArgs);
        sendAsyncRequest(attachReq);

//        arguments.put("name", "DebugpyClient");
//        arguments.put("type", "debugpy");
//        arguments.put("request", "attach");
//        var connect = arguments.putObject("connect");
//        connect.put("host", host);
//        connect.put("port", port);
//        // TODO: Add localRoot setting
//        ArrayNode pathMappings = mapper.createArrayNode();
//        ObjectNode mapping = mapper.createObjectNode();
//        mapping.put("localRoot", WORKSPACE);
//        mapping.put("remoteRoot", ".");
//        pathMappings.add(mapping);
//        arguments.set("pathMappings", pathMappings);
//        arguments.put("__configurationTarget", 6);
//        arguments.put("clientOS", "unix");
//        var debugOptions = arguments.putArray("debugOptions");
//        debugOptions.add("RedirectOutput");
//        debugOptions.add("ShowReturnValue");
//        arguments.put("justMyCode", true);
//        arguments.put("showReturnValue", true);
//        arguments.put("workspaceFolder", WORKSPACE);
//        arguments.put("__sessionId", UUID.randomUUID().toString());
//        attachReq.setArguments(arguments);
//        sendAsyncRequest(attachReq);
//
        // TODO wait for init event
        try {
            System.out.println("Waiting for init event...");
            initEvent.get();
            System.out.println("Got init event...");
        } catch (InterruptedException | ExecutionException e) {
            return false;
        }
//
//        System.out.println("Sending configuration done...");
//        //Configuration Done
//        var confDoneReq = new Request();
//        var confMsg = new DAPMessage();
//        confMsg.setSeq(currReqSeq++);
//        confMsg.setType("request");
//        confDoneReq.setProtocolMessage(confMsg);
//        confDoneReq.setCommand("configurationDone");
//        // TODO Fix should not be async request
//        //Response confDoneResp = (Response) sendRequest(confDoneReq);
//        sendAsyncRequest(confDoneReq);
//
//        // Wait for attach async response
//        // TODO FIX! responseQueue instead of single slot
//        //Response attachResponse = (Response) waitForAsyncResponse();
//        //return initResp.getSuccess() && attachResponse.getSuccess() && confDoneResp.getSuccess();
//        try {
//            java.lang.Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        return initResp.getSuccess();
        return true;
    }

    PyTypeRaw getVMType(String qualifiedClassName) {
//        // Pause
//        pause();
//
//        Request dapRequest = new Request();
//        var msg = new DAPMessage();
//        msg.setSeq(currReqSeq++);
//        msg.setType("request");
//        dapRequest.setCommand("evaluate");
//        dapRequest.setProtocolMessage(msg);
//        var evalExp = PyEvalExBuilder.getClassFieldTypesExp(qualifiedClassName);
//        ObjectNode arguments = mapper.createObjectNode();
//        // arguments.put("context", "watch"); // Not required?
//        arguments.put("expression", evalExp);
//        // arguments.put("frameId", getCurrentFrameId(getThreadId("MainThread"))); // Not required?
//        EvaluateRequest req = new EvaluateRequest();
//        dapRequest.setArguments(arguments);
//        req.setDapRequest(dapRequest);
//        DAPResponse evalResp = sendRequest(req);
//
//        // New internal PyType
//        var rawType = new PyTypeRaw(qualifiedClassName);
//        var rawField1 = new PyFieldRaw("name", "string", null);
//        var rawField2 = new PyFieldRaw("salary", "int", null);
//        rawType.setFields(List.of(rawField1, rawField2));
//
//        // Resume
//        return rawType;
        return null;
    }

    private DAPResponse pause() {
//        stoppedEvent = new CompletableFuture<>();
//        var tid = getThreadId("MainThread");
//        Request pauseReq = new Request();
//        pauseReq.setCommand("pause");
//        var msg = new DAPMessage();
//        msg.setSeq(currReqSeq++);
//        msg.setType("request");
//        ObjectNode arguments = mapper.createObjectNode();
//        arguments.put("threadId", tid);
//        pauseReq.setArguments(arguments);
//        pauseReq.setProtocolMessage(msg);
//        var res = sendRequest(pauseReq);
//        try {
//            System.out.println("Waiting for stopped event...");
//            stoppedEvent.get();
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        return res;
        return null;
    }

    private int getThreadId(String threadName) {
//        System.out.println("Getting thread id: " + threadName);
//        Request dapRequest = new Request();
//        var msg = new DAPMessage();
//        msg.setSeq(currReqSeq++);
//        msg.setType("request");
//        dapRequest.setCommand("threads");
//        dapRequest.setProtocolMessage(msg);
//        ThreadsResponse threadsResponse = (ThreadsResponse) sendRequest(dapRequest);
//        JsonNode body = threadsResponse.getResponse().getBody();
//        JsonNode threadsNode = body.get("threads");
//
//        ObjectMapper mapper = new ObjectMapper();
//        List<Thread> threads = mapper.convertValue(
//                threadsNode,
//                new TypeReference<>() {}
//        );
//        for (Thread thread : threads) {
//            if (thread.getName().equals(threadName)) {
//                System.out.println("Found thread: " + thread.getName() + " with id: " + thread.getId());
//                return thread.getId();
//            }
//        }
          return -1;
    }

    private int getCurrentFrameId(int threadId) {
//        Request stackTraceReq = new Request();
//        var msg = new DAPMessage();
//        msg.setSeq(currReqSeq++);
//        msg.setType("request");
//        stackTraceReq.setProtocolMessage(msg);
//        stackTraceReq.setCommand("stackTrace");
//        ObjectNode arguments = mapper.createObjectNode();
//        arguments.put("threadId", threadId);
//        stackTraceReq.setArguments(arguments);
//        Response resp = (Response) sendRequest(stackTraceReq);
//        return resp.getBody().get("stackFrames").get(0).get("id").asInt();
        return 1;
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
                    if (json.contains("\"type\": \"event\"")) {
                        continue;
                    }
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
                        if (msg instanceof InitializedEvent) {
                            initEvent.complete((DAPEvent) msg);
                        }
                    }
//                    if (msg instanceof DAPEvent) {
//                        System.out.println("Event instance: " + msg);
//                        if (msg instanceof Event) {
//                            if (((Event) msg).getEvent().equals("initialized")) {
//                                initEvent.complete((Event) msg);
//                            }
//                            if (((Event) msg).getEvent().equals("stopped")) {
//                               stoppedEvent.complete((Event) msg);
//                            }
//                        }
//                        if (msg instanceof BreakpointEvent) {
//                            handleBreakpoint((BreakpointEvent) msg);
//                        }
//                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        readerThread.setDaemon(true);
        readerThread.start();
    }

    private void handleBreakpoint(BreakpointEvent event) {
        breakpointHandler.handleBreakpoint(event);
    }

}
