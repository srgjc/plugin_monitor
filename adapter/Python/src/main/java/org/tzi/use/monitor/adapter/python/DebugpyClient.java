package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.custom.DAPValue;
import org.tzi.use.monitor.adapter.python.dap.*;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.*;
import org.tzi.use.plugins.monitor.Monitor;
import org.tzi.use.plugins.monitor.vm.mm.VMField;
import org.tzi.use.plugins.monitor.vm.mm.VMMethod;
import org.tzi.use.plugins.monitor.vm.mm.VMObject;
import org.tzi.use.uml.ocl.type.TupleType;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.type.TypeFactory;
import org.tzi.use.uml.ocl.value.*;

import java.io.*;
import java.net.Socket;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sergio Jimenez
 */
public class DebugpyClient {

    private static final Pattern MEMORY_ADDR_PATTERN = Pattern.compile("0x[0-9a-fA-F]+");
    private static final ObjectMapper mapper = new ObjectMapper();
    static final long GLOBAL_MODULE_ID = 1L;

    public boolean running = false;
    private final String workspace;
    private final String host;
    private final int port;
    private final PythonAdapter adapter;
    public boolean isConnected;
    public final Map<String, Map<Integer, BreakpointType>> fileToBreakpointTypeMap = new HashMap<>();
    public final Map<String, Map<Integer, String>> fileToClassNameMap = new HashMap<>();
    private java.lang.Thread breakpointHandler;
    private final Monitor.Controller controller;
    private final Messenger messenger;

    DebugpyClient(String host, int port, String workspace,
                  PythonAdapter adapter, Monitor.Controller controller) throws IOException {
        this.workspace = workspace;
        this.host = host;
        this.port = port;
        this.controller = controller;
        this.messenger = new Messenger(new Socket(host, port), this);
        this.adapter = adapter;
    }

    boolean attach() {
        var initResp = messenger.initialize();
        messenger.attach(host, port, workspace);
        messenger.configurationDone();
        running = true;
        breakpointHandler = new java.lang.Thread(new BreakpointHandler(this, adapter, controller, messenger), "BreakpointHandler");
        breakpointHandler.start();
        isConnected = true;
        return initResp.getSuccess();
    }

    PyType getVMType(String fqcn) {
        if (controller.existsVMType(fqcn)) {
            controller.getVMType(fqcn);
        }
        if (fqcn.equals("Global")) {
            return new PyType(adapter, fqcn, false);
        }
        if (fqcn.equals("Mock")) {
            return new PyType(adapter, fqcn, true);
        }

        pause(); // Match monitor state

        Optional<String> fileOpt = messenger.evaluate(PyEvalExBuilder.getClass(fqcn));
        if (fileOpt.isEmpty()) {
            return null;
        }

        PyType pyType = new PyType(adapter, fqcn, true);

        controller.storeVMType(fqcn, pyType);
        return pyType;
    }

    protected VMMethod getVMMethod(String fqcn, String methodName, boolean isModule) {
        String methodId = String.format("%s:%s", fqcn, methodName);
        if (controller.existsVMMethod(methodId)) {
            return controller.getVMMethod(methodId);
        }

        Optional<String> methodInfoOpt = messenger.evaluate(PyEvalExBuilder.getMethodInfo(fqcn, methodName, isModule));
        if (methodInfoOpt.isEmpty()) {
            return null;
        }

        String json = methodInfoOpt.get().replace("'", "\"");
        JsonNode root;
        try {
            root = mapper.readTree(json);
        } catch (JsonProcessingException e) {
            return null;
        }

        PyMethod pyMethod = new PyMethod(adapter, isModule ? fqcn + "." + methodName : methodName, fqcn);

        String methodArguments = root.get("args").asText();

        List<String> argNames = new ArrayList<>();
        List<String> argTypes = new ArrayList<>();
        for (String argName : methodArguments.split(",")) {
            if (argName.equals("self")) {
                continue;
            }
            argNames.add(argName);
            argTypes.add("Mock");
        }
        pyMethod.setArgumentNames(argNames);
        pyMethod.setArgumentTypes(argTypes);

        // Set line nos and filename
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

        controller.storeVMMethod(pyMethod.getId(), pyMethod);
        return pyMethod;
    }

    protected VMField getVMField(String fqcn, String fieldName) {
        String fId = String.format("%s:%s", fqcn, fieldName);
        if (controller.existsVMField(fId)) {
            return controller.getVMField(fId);
        }
        PyField pyField = new PyField(fieldName, fqcn);
        controller.storeVMField(pyField.getId(), pyField);
        return pyField;
    }

    protected DAPValue getDAPValue(Long objectId, String fName) {
        EvaluateResponseClass evalResp = messenger.evaluateRaw(PyEvalExBuilder.getDAPValue(objectId, fName));
        if (!evalResp.getSuccess()) {
            return null;
        }
        EvaluateResponseBody body = evalResp.getBody();
        return new DAPValue(body.getResult(), body.getType(), body.getVariablesReference());
    }

    protected boolean setBreakpoints(String file) {
        Set<Integer> lines = fileToBreakpointTypeMap.get(file).keySet();
        return messenger.setBreakpoints(file, lines);
    }

    protected boolean pause() {
        if (!running) {
            return true;
        }
        if (!messenger.pause()) {
            controller.newLogMessage(this, Level.SEVERE, "Failed to pause debugpy!");
            return false;
        }
        running = false;
        return true;
    }

    protected boolean resume() {
        if (running) {
            return true;
        }
        boolean res = messenger.resume();
        if (!res) {
            controller.newLogMessage(this, Level.SEVERE, "Failed to resume debugpy!");
            return false;
        }
        running = true;
        return true;
    }

    protected void stop() {
        boolean res = messenger.stop();
        if (!res) {
            controller.newLogMessage(this, Level.SEVERE, "Failed to stop debugpy!");
        } else {
            isConnected = false;
        }
    }

    protected Set<VMObject> getInstances(PyType pyType, int maxInstances) {
        controller.storeVMType(pyType.getName(), pyType); // Stores PyType with mapped MClass
        if (pyType.isModule()) {
            VMObject obj = controller.existsVMObject(GLOBAL_MODULE_ID)
                    ? controller.getVMObject(GLOBAL_MODULE_ID)
                    : new PyObject(adapter, GLOBAL_MODULE_ID, pyType);
            return Set.of(obj);
        }
        pause();
        Optional<String> instanceIdsOpt = messenger.evaluate(PyEvalExBuilder.getInstanceIds(pyType.getName(), maxInstances));
        if (instanceIdsOpt.isEmpty()) {
            controller.newLogMessage(this, Level.SEVERE, String.format("Could not query instances for type '%s'", pyType.getName()));
            return Set.of();
        }
        String instanceIds = instanceIdsOpt.get();
        Set<VMObject> objs = new HashSet<>();
        if (instanceIds.equals("'[]'")) {
            return objs;
        }
        String[] ids = instanceIds.substring(2, instanceIds.length() - 2).split(",");
        for (String id : ids) {
            long objId = Long.parseLong(id.trim());
            PyObject pyObject = new PyObject(adapter, objId, pyType);
            objs.add(pyObject);
        }
        return objs;
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
        Variable[] vars = messenger.getDAPChildren(variablesReference);
        for (Variable var : vars) {
            var dapVal = new DAPValue(var.getValue(), var.getType(), var.getVariablesReference());
            dapVal.setName(var.getName());
            res.add(dapVal);
        }
        return res;
    }

    public boolean registerConstructorCallInterest(PyType pyType) {
        if (pyType.isModule()) {
            return true;
        }
        PyMethod method = ((PyMethod) pyType.getMethodsByName("__init__").getFirst());
        String file = method.getFile();
        int endLineNo = method.getStartLineNo();
        String className = method.getClassName();

        updateInternalBreakpointMappings(file, className, List.of(endLineNo), BreakpointType.CONSTRUCTOR_CALL);
        return setBreakpoints(file);
    }

    public boolean registerOperationCallInterest(PyMethod pyMethod) {
        if (!pyMethod.getName().equals("__init__")) {
            String file = pyMethod.getFile();
            int startLine = pyMethod.getStartLineNo();
            String className = pyMethod.getClassName();
            List<Integer> returnLines = pyMethod.getReturnLines().isEmpty() ? List.of(pyMethod.getEndLineNo()) : pyMethod.getReturnLines();

            updateInternalBreakpointMappings(file, className, List.of(startLine), BreakpointType.METHOD_CALL);
            updateInternalBreakpointMappings(file, className, returnLines, BreakpointType.METHOD_EXIT);
            return setBreakpoints(file);
        }
        return true;
    }

    public boolean registerFieldModificationInterest(PyField pyField) {
        String fqcn = pyField.getClassName();
        String fName = pyField.getName();
        String setterName = String.format("set_%s", fName);
        PyMethod pyMethod = (PyMethod) getVMMethod(fqcn, setterName, false);
        if (pyMethod == null) {
            return false;
        }
        String file = pyMethod.getFile();
        updateInternalBreakpointMappings(file, fqcn, List.of(pyMethod.getStartLineNo()), BreakpointType.MODIFICATION);
        return setBreakpoints(file);
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

}
