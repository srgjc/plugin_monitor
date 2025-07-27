package org.tzi.use.monitor.adapter.python;

import org.tzi.use.monitor.adapter.python.custom.DAPValue;
import org.tzi.use.monitor.adapter.python.dap.*;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.*;
import org.tzi.use.plugins.monitor.MonitorException;
import org.tzi.use.plugins.monitor.vm.adapter.AbstractVMAdapter;
import org.tzi.use.plugins.monitor.vm.adapter.InvalidAdapterConfiguration;
import org.tzi.use.plugins.monitor.vm.adapter.VMAdapterSetting;
import org.tzi.use.plugins.monitor.vm.mm.*;
import org.tzi.use.uml.ocl.type.TupleType;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.type.TypeFactory;
import org.tzi.use.uml.ocl.value.*;

import java.lang.Thread;
import java.util.*;
import java.util.logging.Level;

/**
 * @author Sergio Jimenez
 */
public class PythonAdapter extends AbstractVMAdapter {

    private static final int SETTING_HOST_IDX = 0;
    private static final int SETTING_PORT_IDX = 1;
    private static final int SETTING_WORKSPACE_IDX = 2;

    private String host;
    private int port;
    private boolean isConnected;
    private DebugpyClient debugpyClient;
    public Map<String, PyType> typeMapping;
    private Map<String, Map<Integer, BreakpointType>> breakpoints;
    private Thread breakpointWatcher;
    private Map<String, String> fileToClassNameMap;

    public Set<VMObject> readInstances(PyType type) {
        var className = type.getName();
        System.out.println("Reading instances of class: " + className);
        PyObjectRaw pyObjectRaw = debugpyClient.getInstance(typeMapping.get(className));
        if (pyObjectRaw == null) {
            return Set.of();
        }
        System.out.println("GotInstance OBJECT_ID: " + pyObjectRaw.getId());
        PyObject pyObj = new PyObject(this, pyObjectRaw, typeMapping.get(className));
        return Set.of(pyObj);
    }

    @Override
    protected void validateSettings() throws InvalidAdapterConfiguration {
        System.out.println("Validating PythonAdapter settings...");
        List<VMAdapterSetting> settings = getSettings();

        String settingHostVal = settings.get(SETTING_HOST_IDX).value;
        if (settingHostVal == null || settingHostVal.isBlank()) {
            throw new InvalidAdapterConfiguration("Host is missing!");
        }
        host = settingHostVal;

        try {
            port = Integer.parseInt(settings.get(SETTING_PORT_IDX).value);
        } catch (NumberFormatException e) {
            throw new InvalidAdapterConfiguration("Port must be a number!");
        }
    }

    @Override
    protected void createSettings(List<VMAdapterSetting> settings) {
        System.out.println("Creating Python adapter settings...");
        settings.add(SETTING_HOST_IDX, new VMAdapterSetting("Host", "localhost"));
        settings.add(SETTING_PORT_IDX, new VMAdapterSetting("Port", "5678"));
        settings.add(SETTING_WORKSPACE_IDX, new VMAdapterSetting("Workspace", "/Users/serj/git/uni/dpy-server"));
    }

    @Override
    public void attachToVM() throws MonitorException {
        System.out.println("Connecting to debugpy server...");

        typeMapping = new HashMap<>();
        breakpoints = new HashMap<>();
        fileToClassNameMap = new HashMap<>();

        try {
            debugpyClient = new DebugpyClient(host, port);
        } catch (Exception e) {
            throw new MonitorException("Failed to create socket!", e);
        }

        System.out.println("Debugpy socket created!");

        if (debugpyClient.attach(host, port)) {
            isConnected = true;
            breakpointWatcher = new Thread(new BreakpointWatcher(), "PythonAdapter breakpoint watcher");
            breakpointWatcher.start();
            System.out.println("Connected to debugpy server!");
        } else {
            System.out.println("Failed to attach to debugpy server!");
        }
    }

    @Override
    public void resume() {
        System.out.println("Resuming debugpy server...");
        debugpyClient.resume();
        System.out.println("Resumed debugpy server...");
    }

    @Override
    public void suspend() {
        System.out.println("Suspending debugpy server...");
        debugpyClient.pause();
    }

    @Override
    public void stop() {
        System.out.println("Stopping debugpy server...");
        debugpyClient.stop();
        isConnected = false;
    }

    @Override
    public VMType getVMType(String name) {
        System.out.println("Getting VMType '" + name + "'...");
        PyType res = null;
        if (!typeMapping.containsKey(name)) {
            var rawType = debugpyClient.getVMType(name);
            if (rawType != null) {
                res = new PyType(this, rawType);
            }
            if (res != null && !res.getRawType().isPrimitive()) {
                fileToClassNameMap.put(res.getRawType().getFile(), name);
                System.out.println("fileToClassNameMap: " + fileToClassNameMap);
            }
            typeMapping.put(name, res);
        }
        System.out.println("Got VMType '" + name + "'..." + res);
        return typeMapping.get(name);
    }

    public DAPValue getDAPValue(Long objId, String fName) {
        return debugpyClient.getDAPValue(objId, fName);
    }


    public Value getUSEValue(DAPValue dapValue) {
        if (dapValue == null) {
            return UndefinedValue.instance;
        }

        System.out.println("Getting DAPValue for type: " + dapValue.getType());

        return switch (dapValue.getType()) {
            case "int" -> IntegerValue.valueOf(Integer.parseInt(dapValue.getResult()));
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
            default -> UndefinedValue.instance;
        };
    }

    private List<DAPValue> fetchChildren(long variablesReference) {
        List<DAPValue> res = new ArrayList<>();
        Variable[] vars = debugpyClient.getDAPChildren(variablesReference);
        for (Variable var : vars) {
            var dapVal = new DAPValue(var.getValue(), var.getType(), var.getVariablesReference());
            dapVal.setName(var.getName());
            res.add(dapVal);
        }
        return res;
    }


    @Override
    public void registerClassPrepareEvent(String javaClassName) {

    }

    @Override
    public void unregisterClassPrepareInterest(Object adapterEventInformation) {

    }

    @Override
    public boolean isVMTypeLoaded(String javaClassName) {
        return getVMType(javaClassName) != null;
    }

    @Override
    public void registerOperationCallInterest(VMMethod m) {
        if (!m.getName().equals("__init__")) {
            PyMethodRaw method = ((PyMethod) m).getMethod();
            String file = method.getFile();
            int startLine = method.getStartLineNo();
            List<Integer> returnLines = method.getReturnLines();
            if (!breakpoints.containsKey(file)) {
                Map<Integer, BreakpointType> breakpointTypes = new HashMap<>();
                breakpointTypes.put(startLine, BreakpointType.METHOD_CALL);
                for (Integer returnLine : returnLines) {
                    breakpointTypes.put(returnLine, BreakpointType.METHOD_EXIT);
                }
                breakpoints.put(file, breakpointTypes);
            } else {
                Map<Integer, BreakpointType> lineBreakpointTypes = breakpoints.get(file);
                lineBreakpointTypes.put(startLine, BreakpointType.METHOD_CALL);
                for (Integer returnLine : returnLines) {
                    lineBreakpointTypes.put(returnLine, BreakpointType.METHOD_EXIT);
                }
            }
            debugpyClient.setBreakpoints(file, breakpoints.get(file).keySet());
        }
        System.out.println("BREAKPOINT_MAP: " + breakpoints);
    }

    @Override
    public void registerMethodExit(VMMethodCall call) {

    }

    @Override
    public void unregisterOperationeExit(Object adapterExitInformation) {

    }

    @Override
    public Value getMethodResultValue(Object adapterExitInformation) {
        return null;
    }

    @Override
    public void registerConstructorCallInterest(VMType vmType) {
        PyMethodRaw method = ((PyMethod) vmType.getMethodsByName("__init__").getFirst()).getMethod();
        String file = method.getFile();
        int startLine = method.getStartLineNo();
        if (!breakpoints.containsKey(file)) {
            Map<Integer, BreakpointType> breakpointTypeMap = new HashMap<>();
            breakpointTypeMap.put(startLine, BreakpointType.CONSTRUCTOR_CALL);
            breakpoints.put(file, breakpointTypeMap);
        } else {
           Map<Integer, BreakpointType> currBps = breakpoints.get(file);
           currBps.put(startLine, BreakpointType.CONSTRUCTOR_CALL);
        }
        debugpyClient.setBreakpoints(file, breakpoints.get(file).keySet());
        System.out.println("BREAKPOINT_MAP: " + breakpoints);
    }

    @Override
    public void registerFieldModificationInterest(VMField f) {

    }

    private class BreakpointWatcher implements Runnable {

        @Override
        public void run() {
            while (isConnected) {
                try {
                    StoppedEventClass event = (StoppedEventClass) debugpyClient.eventQueue.take();
                    if (!isConnected) {
                        return;
                    }

                    // Get file and line at current frame
                    var currFrame = debugpyClient.getCurrentFrame(Math.toIntExact(event.getBody().getThreadID()));
                    System.out.println("Current Frame: " + currFrame);

                    String file = currFrame.getSource().getPath();

                    // Breakpoint Type Lookup
                    BreakpointType bpt = breakpoints.get(file).get((int) currFrame.getLine());
                    System.out.println("BreakpointType: " + bpt.name());


                    var qualifiedClassName = fileToClassNameMap.get(file);

                    if (bpt == BreakpointType.CONSTRUCTOR_CALL) {
                        handleConstructorCall(currFrame, qualifiedClassName);
                    } else if (bpt == BreakpointType.METHOD_CALL) {
                        handleMethodCall(currFrame, qualifiedClassName);
                    } else if (bpt == BreakpointType.METHOD_EXIT) {
                        handleMethodExit(currFrame, qualifiedClassName, event);
                    } else if (bpt == BreakpointType.MODIFICATION) {
                        handleAttributeModification(currFrame, qualifiedClassName);
                    }

                    // Match monitor running state
                    debugpyClient.resume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void handleConstructorCall(StackFrame currentFrame, String fullyQualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, "onConstructorCall: " + fullyQualifiedClassName + "." + currentFrame.getName());

        PyType pyType = typeMapping.get(fullyQualifiedClassName);

        PyObjectRaw pyObjectRaw = new PyObjectRaw(debugpyClient.getSelfId(currentFrame.getID()));
        pyObjectRaw.setRawType(pyType.getRawType());
        PyObject pyObject = new PyObject(this, pyObjectRaw, pyType);

        System.out.println("OnConstructor OBJECT_ID: " + pyObjectRaw.getId());
        controller.onNewVMObject(pyObject);
    }

    private void handleMethodCall(StackFrame stackFrame, String fullyQualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, String.format("onMethodCall: %s.%s", fullyQualifiedClassName, stackFrame.getName()));

        PyType pyType = typeMapping.get(fullyQualifiedClassName);
        PyMethod internalPyMethod = (PyMethod) pyType.getMethodsByName(stackFrame.getName()).getFirst();
        PyMethod upToDatePyMethod = (PyMethod) controller.getVMMethod(internalPyMethod.getId());

        Long pyObjId = debugpyClient.getSelfId(stackFrame.getID());
        PyObject pyObject = (PyObject) controller.getVMObject(pyObjId);

        PyMethodCall pyMethodCall = new PyMethodCall(this, upToDatePyMethod, pyObject);

        controller.onMethodCall(pyMethodCall);
    }

    private void handleMethodExit(StackFrame stackFrame, String qualifiedClassName, StoppedEventClass stoppedEvent) {
        PyType pyType = typeMapping.get(qualifiedClassName);
        PyMethod pyMethod = (PyMethod) pyType.getMethodsByName(stackFrame.getName()).getFirst();
        // TODO construct method call with runtime values
        controller.onMethodExit(pyMethod, pyMethod.getId());
    }

    private void handleAttributeModification(StackFrame stackFrame, String qualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, "onAttributeModification: " + qualifiedClassName + "." + stackFrame.getName());
        // update class instance variables from __dict__
        // get object id from current frame
        // get field name from method name
    }

    @Override
    public String toString() {
        return "PythonAdapter";
    }

}
