package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.custom.DAPValue;
import org.tzi.use.monitor.adapter.python.dap.*;
import org.tzi.use.monitor.adapter.python.dap.Thread;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.*;
import org.tzi.use.plugins.monitor.Monitor;
import org.tzi.use.plugins.monitor.vm.mm.VMObject;
import org.tzi.use.uml.ocl.type.TupleType;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.type.TypeFactory;
import org.tzi.use.uml.ocl.value.*;

import java.io.*;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sergio Jimenez
 */
public class DebugpyClient {

    private static final Pattern MEMORY_ADDR_PATTERN = Pattern.compile("0x[0-9a-fA-F]+");

    private static int REQUEST_COUNTER = 1;

    private final Socket socket;
    private final BufferedReader in;
    private final BufferedWriter out;
    private final ObjectMapper mapper = new ObjectMapper();
    private CompletableFuture<DAPResponse> futureResp;
    private CompletableFuture<InitializedEventClass> initEventFuture;
    private CompletableFuture<StoppedEventClass> pauseEventFuture;
    private CompletableFuture<StoppedEventClass> breakpointEventFuture;
    protected boolean running = false;
    private final String workspace;
    private final String host;
    private final int port;
    private final PythonAdapter adapter;
    private boolean isConnected;
    private Map<String, Map<Integer, BreakpointType>> fileToBreakpointTypeMap;
    private Map<String, Map<Integer, String>> fileToClassNameMap;
    private java.lang.Thread breakpointWatcher;
    private Monitor.Controller controller;

    DebugpyClient(String host, int port, String workspace,
                  PythonAdapter adapter, Monitor.Controller controller) throws IOException {
        this.socket = new Socket(host, port);
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.workspace = workspace;
        this.host = host;
        this.port = port;
        this.controller = controller;

        fileToBreakpointTypeMap = new HashMap<>();
        fileToClassNameMap = new HashMap<>();

        this.adapter = adapter;
        startReaderThread();
    }

    boolean attach() {
        initEventFuture = new CompletableFuture<>();

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

        try {
            initEventFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
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
        breakpointWatcher = new java.lang.Thread(new BreakpointHandler(), "BreakpointHandler");
        breakpointWatcher.start();
        isConnected = true;
        return initResp.getSuccess();
    }

    PyType getVMType(String qualifiedClassName) {
        if (qualifiedClassName.equals("Mock")) {
            return new PyType(adapter, "Mock");
        }

        pause();

        PyType pyType = new PyType(adapter, qualifiedClassName);

        // Set Methods
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setContext("watch");
        evalArgs.setFrameID((long) getCurrentFrameId(getThreadId("MainThread")));
        evalArgs.setExpression(PyEvalExBuilder.getMethodSignaturesExp(qualifiedClassName));
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        if (!evalResp.getSuccess()) {
            controller.newLogMessage(this, Level.WARNING, String.format("Could not find type '%s' in VM...", qualifiedClassName));
            return pyType;
        }

        String result = evalResp.getBody().getResult();

        if (!result.equals("''")) {
            List<PyMethod> methods = new LinkedList<>();

            String escapedResult = result.substring(1, result.length() - 1);

            String[] methodSigs = escapedResult.split(";");

            for (String methodSig : methodSigs) {
                String[] sigParts = methodSig.split(":");
                PyMethod pyMethod = new PyMethod(adapter, sigParts[0], qualifiedClassName);

                List<String> argNames = new ArrayList<>();
                List<String> argTypes = new ArrayList<>();
                for (String argName : sigParts[1].split(",")) {
                    if (argName.equals("self")) {
                        continue;
                    }
                    argNames.add(argName);
                    argTypes.add("Mock");
                }
                pyMethod.setArgumentNames(argNames);
                pyMethod.setArgumentTypes(argTypes);

                // Set line nos and filename
                evalArgs.setExpression(PyEvalExBuilder.getMethodBreakpointInfo(qualifiedClassName, pyMethod.getName()));
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
                pyMethod.setFile(normalizedFile);
                pyMethod.setStartLineNo(root.get("start").asInt());
                pyMethod.setEndLineNo(root.get("end").asInt());
                List<Integer> returnLines = new ArrayList<>();
                for (JsonNode r : root.get("returns")) {
                    returnLines.add(r.asInt());
                }
                pyMethod.setReturnLines(returnLines);

                methods.add(pyMethod);
                controller.storeVMMethod(pyMethod.getId(), pyMethod);
            }
            pyType.setMethods(methods);
        }

        // Set Fields
        setFields(pyType);

        // Set File
        evalArgs.setExpression(PyEvalExBuilder.getFileForClass(qualifiedClassName));
        evalReq.setSeq(REQUEST_COUNTER++);
        evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        String file = evalResp.getBody().getResult();
        String normalizedPath = Path.of(file).normalize().toString().replace("'", "");
        System.out.println("SETTING FILE TO: " + normalizedPath);
        pyType.setFile(normalizedPath);

        controller.storeVMType(qualifiedClassName, pyType);
        return pyType;
    }

    private void setFields(PyType pyType) {
        List<PyField> pyFields = new ArrayList<>();
        for (PyMethod pyMethod : pyType.getMethods()) {
            if (pyMethod.getName().startsWith("set_")) {
                String fieldName = pyMethod.getName().substring(4);
                PyField pyField = new PyField(adapter, fieldName, pyMethod.getClassName());
                pyField.setModBreakpointLineNo(pyMethod.getStartLineNo());
                pyField.setFile(pyMethod.getFile());
                pyFields.add(pyField);
            }
        }
        pyType.setFields(pyFields);
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

    protected List<PyField> getInstanceVariables(long objId, long currFrameId, String className) {
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setExpression(PyEvalExBuilder.getVarsByObjId(objId));
        evalArgs.setFrameID(currFrameId);
        evalArgs.setContext("watch");
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        EvaluateResponseClass evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        return getFieldsFromVarsResp(evalResp, className);
    }

    protected List<PyField> getInstanceVariables(long currFrameId, String className) {
        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setExpression(PyEvalExBuilder.getSelfVarsWithType());
        evalArgs.setFrameID(currFrameId);
        evalArgs.setContext("watch");
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        EvaluateResponseClass evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        return getFieldsFromVarsResp(evalResp, className);
    }

    private List<PyField> getFieldsFromVarsResp(EvaluateResponseClass varsResponse, String className) {
        List<PyField> pyFields = new ArrayList<>();
        String result = varsResponse.getBody().getResult();
        if (!result.equals("''")) {
            String vars = result.substring(1, result.length() - 1);
            String[] fields = vars.split(",");
            for (String field : fields) {
                String[] fieldParts = field.split(":");
                String fieldName = fieldParts[0];
                String fieldType = fieldParts[1];
                PyField pyField = new PyField(adapter, fieldName, className);
                pyField.setType(fieldType);
                pyFields.add(pyField);
            }
        }
        return pyFields;
    }

    protected boolean setBreakpoints(String file) {
        Set<Integer> lines = fileToBreakpointTypeMap.get(file).keySet();
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

        pauseEventFuture = new CompletableFuture<>();

        var pauseArgs = new PauseRequestArguments();
        pauseArgs.setThreadID(getThreadId("MainThread"));
        var pauseReq = new PauseRequestClass();
        pauseReq.setSeq(REQUEST_COUNTER++);
        pauseReq.setArguments(pauseArgs);
        var pauseResp = (PauseResponseClass) sendRequest(pauseReq);

        if (!pauseResp.getSuccess()) {
            controller.newLogMessage(this, Level.SEVERE, "Failed to pause debugpy!");
            return false;
        }

        try {
            pauseEventFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        running = false;
        return true;
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
        isConnected = false;
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

    protected Set<VMObject> getInstances(PyType pyType) {
        controller.storeVMType(pyType.getName(), pyType);
        pause();

        long frameId = getCurrentFrameId(getThreadId("MainThread"));

        var evalArgs = new EvaluateRequestArguments();
        evalArgs.setContext("watch");
        evalArgs.setFrameID(frameId);
        evalArgs.setExpression(PyEvalExBuilder.getInstanceIds(pyType.getName()));
        var evalReq = new EvaluateRequestClass();
        evalReq.setSeq(REQUEST_COUNTER++);
        evalReq.setArguments(evalArgs);
        var evalResp = (EvaluateResponseClass) sendRequest(evalReq);

        String result = evalResp.getBody().getResult();

        Set<VMObject> objs = new HashSet<>();
        if (result.equals("[]")) {
            return objs;
        }
        String[] ids = result.substring(1, result.length() - 1).split(",");
        for (String id : ids) {
            // TODO: Fix debugpy list truncation
            if (id.trim().equals("...")) {
                continue;
            }
            long objId = Long.parseLong(id.trim());
            boolean missedConstructorCallForObj = !controller.existsVMObject(objId);
            if (missedConstructorCallForObj) {
                List<PyField> instanceVars = getInstanceVariables(objId, frameId, pyType.getName());
                pyType.setFields(instanceVars);
            }
            PyObject pyObject = new PyObject(adapter, objId, pyType);
            objs.add(pyObject);
        }
        return objs;
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
                    if (msg instanceof DAPEvent dapEvent) {
                        if (dapEvent instanceof InitializedEventClass initializedEvent) {
                            initEventFuture.complete(initializedEvent);
                        }
                        if (dapEvent instanceof StoppedEventClass stoppedEvent) {
                            running = false;
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

    public Value getUSEValue(DAPValue dapValue) {
        if (dapValue == null) {
            return UndefinedValue.instance;
        }

        System.out.println("Getting DAPValue for type: " + dapValue.getType());

        return switch (dapValue.getType()) {
            case "int" -> IntegerValue.valueOf(Integer.parseInt(dapValue.getResult()));
            case "float" -> new RealValue(Double.parseDouble(dapValue.getResult()));
            case "bool" -> BooleanValue.get(Boolean.parseBoolean(dapValue.getResult()));
            case "str" -> new StringValue(dapValue.getResult());
            case "list"-> {
                List<DAPValue> allChildren = fetchChildren(dapValue.getVariablesReference());

                List<DAPValue> items = allChildren.stream()
                        .filter(child -> child.getName().matches("\\d+"))
                        .sorted(Comparator.comparingInt(child -> Integer.parseInt(child.getName())))
                        .toList();

                Value[] sequence = new Value[items.size()];
                for (int i = 0; i < items.size(); i++) {
                    sequence[i] = getUSEValue(items.get(i));
                }
                yield new SequenceValue(TypeFactory.mkVoidType(), sequence);
            }
            case "tuple" -> {
                List<DAPValue> allChildren = fetchChildren(dapValue.getVariablesReference());

                List<DAPValue> items = allChildren.stream()
                        .filter(child -> child.getName().matches("\\d+"))
                        .sorted(Comparator.comparingInt(child -> Integer.parseInt(child.getName())))
                        .toList();

                TupleType.Part[] typeParts = new TupleType.Part[items.size()];
                List<TupleValue.Part> valueParts = new ArrayList<>();

                for (int i = 0; i < items.size(); i++) {
                    DAPValue item = items.get(i);
                    String name = "item" + i;

                    Value value = getUSEValue(item);
                    Type type = value.type();

                    typeParts[i] = new TupleType.Part(i, name, type);
                    valueParts.add(new TupleValue.Part(i, name, value));
                }

                TupleType tupleType = TypeFactory.mkTuple(typeParts);
                yield new TupleValue(tupleType, valueParts);
            }
            // TODO FIXME: custom debugpy call for type resolution of keys and values separately needed
            case "dict" -> {
                List<DAPValue> dictEntries = fetchChildren(dapValue.getVariablesReference());

                TupleType.Part[] p = new TupleType.Part[] {
                        new TupleType.Part(0, "key", TypeFactory.mkVoidType()),
                        new TupleType.Part(1, "value", TypeFactory.mkVoidType())
                };
                TupleType tupleType = TypeFactory.mkTuple(p);

                List<Value> tupleValues = new ArrayList<>();

                for (DAPValue entry : dictEntries) {
                    if (entry.getVariablesReference() == 0) continue; // skip non-expandable entries

                    List<DAPValue> keyValueChildren = fetchChildren(entry.getVariablesReference());

                    DAPValue keyDap = keyValueChildren.stream()
                            .filter(child -> "key".equals(child.getName()))
                            .findFirst()
                            .orElse(null);

                    DAPValue valueDap = keyValueChildren.stream()
                            .filter(child -> "value".equals(child.getName()))
                            .findFirst()
                            .orElse(null);

                    if (keyDap != null && valueDap != null) {
                        Value useKey = getUSEValue(keyDap);
                        Value useValue = getUSEValue(valueDap);

                        List<TupleValue.Part> parts = List.of(
                                new TupleValue.Part(0, "key", useKey),
                                new TupleValue.Part(1, "value", useValue)
                        );

                        tupleValues.add(new TupleValue(tupleType, parts));
                    }
                }

                yield new SetValue(TypeFactory.mkVoidType(), tupleValues);
            }
            case "set" -> {
                List<DAPValue> allChildren = fetchChildren(dapValue.getVariablesReference());

                var items = allChildren.stream()
                        .filter(child -> child.getName().matches("\\d+"))
                        .toList();

                List<Value> useValues = new ArrayList<>();

                for (DAPValue item : items) {
                    Value v = getUSEValue(item);
                    useValues.add(v);
                }

                yield new SetValue(TypeFactory.mkVoidType(), useValues);
            }

            default -> {
                // Object
                if (dapValue.getResult().contains("object")) {
                    long objId = extractHexAndConvertToDecimal(dapValue.getResult());
                    if (controller.existsVMObject(objId)) {
                        System.out.println("Found obj for USE value with id: " + objId);
                        VMObject obj = controller.getVMObject(objId);
                        yield new ObjectValue(obj.getUSEObject().cls(), obj.getUSEObject());
                    }
                }
                // Unknown
                System.out.println("Unknown case for dapValue type: " + dapValue.getType());
                yield UndefinedValue.instance;
            }
        };
    }

    private long extractHexAndConvertToDecimal(String input) {
        Matcher matcher = MEMORY_ADDR_PATTERN.matcher(input);
        if (matcher.find()) {
            String hexString = matcher.group();
            return Long.parseLong(hexString.substring(2), 16);
        }
        return 0;
    }

    private List<DAPValue> fetchChildren(long variablesReference) {
        List<DAPValue> res = new ArrayList<>();
        Variable[] vars = getDAPChildren(variablesReference);
        for (Variable var : vars) {
            var dapVal = new DAPValue(var.getValue(), var.getType(), var.getVariablesReference());
            dapVal.setName(var.getName());
            res.add(dapVal);
        }
        return res;
    }

    public void registerOperationCallInterest(PyMethod pyMethod) {
        if (!pyMethod.getName().equals("__init__")) {
            String file = pyMethod.getFile();
            int startLine = pyMethod.getStartLineNo();
            String className = pyMethod.getClassName();
            List<Integer> returnLines = pyMethod.getReturnLines();

            updateInternalBreakpointMappings(file, className, List.of(startLine), BreakpointType.METHOD_CALL);
            updateInternalBreakpointMappings(file, className, returnLines, BreakpointType.METHOD_EXIT);
            setBreakpoints(file);
        }
    }

    public void registerConstructorCallInterest(PyType pyType) {
        PyMethod method = ((PyMethod) pyType.getMethodsByName("__init__").getFirst());
        String file = method.getFile();
        int endLineNo = method.getEndLineNo();
        String className = method.getClassName();

        updateInternalBreakpointMappings(file, className, List.of(endLineNo), BreakpointType.CONSTRUCTOR_CALL);
        setBreakpoints(file);
    }

    public void registerFieldModificationInterest(PyField pyField) {
        String file = pyField.getFile();
        Integer modBreakpointLineNo = pyField.getModBreakpointLineNo();
        String className = pyField.getClassName();

        updateInternalBreakpointMappings(file, className, List.of(modBreakpointLineNo), BreakpointType.MODIFICATION);
        setBreakpoints(file);
    }

    private void updateInternalBreakpointMappings(String file, String className, List<Integer> lineNos, BreakpointType breakpointType) {
        if (!fileToBreakpointTypeMap.containsKey(file)) {
            Map<Integer, BreakpointType> lineNoToBreakpointType = new HashMap<>();
            Map<Integer, String> lineNoToClassName = new HashMap<>();

            for (Integer lineNo : lineNos) {
                lineNoToBreakpointType.put(lineNo, breakpointType);
                lineNoToClassName.put(lineNo, className);
            }

            fileToBreakpointTypeMap.put(file, lineNoToBreakpointType);
            fileToClassNameMap.put(file, lineNoToClassName);
        } else {
            Map<Integer, BreakpointType> lineNoToBreakpointType = fileToBreakpointTypeMap.get(file);
            Map<Integer, String> lineNoToClassName = fileToClassNameMap.get(file);

            for (Integer lineNo : lineNos) {
                lineNoToBreakpointType.put(lineNo, breakpointType);
                lineNoToClassName.put(lineNo, className);
            }
        }
    }

    private class BreakpointHandler implements Runnable {
        @Override
        public void run() {
            while (isConnected) {
                try {
                    breakpointEventFuture = new CompletableFuture<>();
                    StoppedEventClass breakpointEvent = breakpointEventFuture.get();
                    if (!isConnected) {
                        return;
                    }
                    StackFrame currFrame = getCurrentFrame(Math.toIntExact(breakpointEvent.getBody().getThreadID()));
                    int currLineNo = (int) currFrame.getLine();
                    String file = currFrame.getSource().getPath();
                    String qualifiedClassName = fileToClassNameMap.get(file).get(currLineNo);

                    BreakpointType breakpointType = fileToBreakpointTypeMap.get(file).get(currLineNo);
                    switch (breakpointType) {
                        case CONSTRUCTOR_CALL -> onConstructorCall(currFrame, qualifiedClassName);
                        case METHOD_CALL -> onMethodCall(currFrame, qualifiedClassName);
                        case METHOD_EXIT -> onMethodExit(currFrame, qualifiedClassName);
                        case MODIFICATION -> onAttrMod(currFrame, qualifiedClassName);
                    }

                    resume(); // Match monitor running state
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void onConstructorCall(StackFrame currentFrame, String fullyQualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, "onConstructorCall: " + fullyQualifiedClassName + "." + currentFrame.getName());

        PyType pyType = (PyType) controller.getVMType(fullyQualifiedClassName);

        List<PyField> instanceVars = getInstanceVariables(currentFrame.getID(), fullyQualifiedClassName);
        pyType.setFields(instanceVars);

        PyObject pyObject = new PyObject(adapter,
                getSelfId(currentFrame.getID()),
                pyType);

        controller.onNewVMObject(pyObject);
    }

    private void onMethodCall(StackFrame stackFrame, String fullyQualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, String.format("onMethodCall: %s.%s", fullyQualifiedClassName, stackFrame.getName()));

        PyType pyType = (PyType) controller.getVMType(fullyQualifiedClassName);
        String methodId = (String) pyType.getMethodsByName(stackFrame.getName()).getFirst().getId();
        PyMethod pyMethod = (PyMethod) controller.getVMMethod(methodId);

        Long pyObjId = getSelfId(stackFrame.getID());
        PyObject pyObject = (PyObject) controller.getVMObject(pyObjId);

        List<Value> argValues = new ArrayList<>();
        for (String argName : pyMethod.getArgumentNames()) {
            DAPValue argDAPValue = getMethodArgDAPValue(stackFrame.getID(), argName);
            argValues.add(getUSEValue(argDAPValue));
        }

        PyMethodCall pyMethodCall = new PyMethodCall(adapter, pyMethod, pyObject, argValues);

        controller.onMethodCall(pyMethodCall);
    }

    private void onMethodExit(StackFrame stackFrame, String qualifiedClassName) {
        PyType pyType = (PyType) controller.getVMType(qualifiedClassName);
        PyMethod pyMethod = (PyMethod) pyType.getMethodsByName(stackFrame.getName()).getFirst();
        // TODO construct method call with runtime values
        controller.onMethodExit(pyMethod, pyMethod.getId());
    }

    private void onAttrMod(StackFrame stackFrame, String qualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, "onAttributeModification: " + qualifiedClassName + "." + stackFrame.getName());

        Long pyObjId = getSelfId(stackFrame.getID());
        PyObject pyObject = (PyObject) controller.getVMObject(pyObjId);

        PyField pyField = (PyField) pyObject.getType().getFieldByName(stackFrame.getName().replace("set_", ""));

        String methodId = (String) pyObject.getType().getMethodsByName(stackFrame.getName()).getFirst().getId();
        PyMethod m = (PyMethod) controller.getVMMethod(methodId);

        // TODO FIX assert only one arg
        List<Value> argValues = new ArrayList<>();
        for (String argName : m.getArgumentNames()) {
            DAPValue argDAPValue = getMethodArgDAPValue(stackFrame.getID(), argName);
            argValues.add(getUSEValue(argDAPValue));
        }

        controller.onUpdateAttribute(pyObjId, pyField.getId(), argValues.get(0));
    }

}
