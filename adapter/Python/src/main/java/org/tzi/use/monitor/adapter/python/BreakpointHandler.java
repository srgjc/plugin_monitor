package org.tzi.use.monitor.adapter.python;

import org.tzi.use.monitor.adapter.python.dap.custom.DAPValue;
import org.tzi.use.monitor.adapter.python.dap.StackFrame;
import org.tzi.use.monitor.adapter.python.dap.StoppedEventClass;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.*;
import org.tzi.use.plugins.monitor.Monitor;
import org.tzi.use.uml.ocl.value.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/**
 * This class is responsible for handling breakpoint events for
 * constructor calls and method calls and exits, and informing
 * the monitor of such events.
 */
public class BreakpointHandler implements Runnable {

    private final Monitor.Controller controller;
    private final PythonAdapter adapter;
    private final Messenger messenger;
    private final DebugpyClient debugpyClient;

    public BreakpointHandler(DebugpyClient debugpyClient, PythonAdapter adapter,
                             Monitor.Controller controller, Messenger messenger) {
        this.debugpyClient = debugpyClient;
        this.adapter = adapter;
        this.controller = controller;
        this.messenger = messenger;
    }

    @Override
    public void run() {
        while (debugpyClient.isConnected) {
            try {
                messenger.breakpointEventFuture = new CompletableFuture<>();
                StoppedEventClass breakpointEvent = messenger.breakpointEventFuture.get();
                if (!debugpyClient.isConnected) {
                    return;
                }
                StackFrame currFrame = messenger.getCurrentFrame(Math.toIntExact(breakpointEvent.getBody().getThreadID()));
                int currLineNo = (int) currFrame.getLine();
                String file = currFrame.getSource().getPath();

                Map<Integer, String> lineToClass = debugpyClient.fileToClassNameMap.get(file);
                if (lineToClass == null || !lineToClass.containsKey(currLineNo)) {
                    controller.newLogMessage(this, Level.WARNING, "No mapped class for " + file + ":" + currLineNo);
                    debugpyClient.resume();
                    continue;
                }

                Map<Integer, BreakpointType> lineToBP = debugpyClient.fileToBreakpointTypeMap.get(file);
                if (lineToBP == null || !lineToBP.containsKey(currLineNo)) {
                    controller.newLogMessage(this, Level.WARNING, "No breakpoint type for " + file + ":" + currLineNo);
                    debugpyClient.resume();
                    continue;
                }

                String qualifiedClassName = lineToClass.get(currLineNo);
                BreakpointType breakpointType = lineToBP.get(currLineNo);

                switch (breakpointType) {
                    case CONSTRUCTOR_CALL -> onConstructorCall(currFrame, qualifiedClassName);
                    case METHOD_CALL -> onMethodCall(currFrame, qualifiedClassName);
                    case METHOD_EXIT -> onMethodExit(currFrame, qualifiedClassName);
                    case MODIFICATION -> onAttrMod(currFrame, qualifiedClassName);
                }

                debugpyClient.resume(); // Match monitor running state
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            } catch (ExecutionException e) {
                controller.newLogMessage(this, Level.SEVERE, "Failed to process breakpoint event: " + e.getMessage());
            }
        }
    }

    private void onConstructorCall(StackFrame currentFrame, String fullyQualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, "onConstructorCall: " + fullyQualifiedClassName + "." + currentFrame.getName());

        PyType pyType = (PyType) controller.getVMType(fullyQualifiedClassName);
        PyObject pyObject = new PyObject(adapter, messenger.getSelfId(currentFrame.getID()), pyType);

        controller.onNewVMObject(pyObject);
    }

    private void onMethodCall(StackFrame stackFrame, String fullyQualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, String.format("onMethodCall: %s.%s", fullyQualifiedClassName, stackFrame.getName()));

        PyType pyType = (PyType) controller.getVMType(fullyQualifiedClassName);

        String methodId;
        boolean isModuleMethod = pyType == null;
        if (isModuleMethod) {
            methodId = String.format("%s:%s.%s", fullyQualifiedClassName, fullyQualifiedClassName, stackFrame.getName());
        } else {
            var methods = pyType.getMethodsByName(stackFrame.getName());
            if (methods.isEmpty()) {
                controller.newLogMessage(this, Level.WARNING,
                        "No VM method found for " + fullyQualifiedClassName + "." + stackFrame.getName());
                return;
            }
            methodId = (String) methods.getFirst().getId();
        }

        PyMethod pyMethod = (PyMethod) controller.getVMMethod(methodId);
        if (pyMethod == null) {
            controller.newLogMessage(this, Level.WARNING, "VM method lookup returned null for id: " + methodId);
            return;
        }

        Long pyObjId = isModuleMethod
                ? DebugpyClient.GLOBAL_MODULE_ID
                : messenger.getSelfId(stackFrame.getID());
        PyObject pyObject = (PyObject) controller.getVMObject(pyObjId);

        List<Value> argValues = new ArrayList<>();
        for (String argName : pyMethod.getArgumentNames()) {
            DAPValue argDAPValue = messenger.getMethodArgDAPValue(stackFrame.getID(), argName);
            argValues.add(debugpyClient.getUSEValue(argDAPValue));
        }

        PyMethodCall pyMethodCall = new PyMethodCall(pyMethod, pyObject, argValues);

        controller.onMethodCall(pyMethodCall);
    }

    private void onMethodExit(StackFrame stackFrame, String qualifiedClassName) {
        PyType pyType = (PyType) controller.getVMType(qualifiedClassName);

        boolean isModuleMethod = pyType == null;

        String methodId;
        if (isModuleMethod) {
            methodId = String.format("%s:%s.%s", qualifiedClassName, qualifiedClassName, stackFrame.getName());
        } else {
            var methods = pyType.getMethodsByName(stackFrame.getName());
            if (methods.isEmpty()) {
                controller.newLogMessage(this, Level.WARNING, "No VM method found for exit of " +
                        qualifiedClassName + "." + stackFrame.getName());
                return;
            }
            methodId = (String) methods.getFirst().getId();
        }

        PyMethod pyMethod = (PyMethod) controller.getVMMethod(methodId);
        controller.onMethodExit(pyMethod, pyMethod.getId());
    }

    private void onAttrMod(StackFrame stackFrame, String qualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, "onAttributeModification: " + qualifiedClassName + "." + stackFrame.getName());

        boolean isSetter = stackFrame.getName().startsWith("set");
        if (!isSetter) {
            controller.newLogMessage(this, Level.WARNING, "Wrongly stopped at non-setter method for attribute modification!");
            return;
        }

        String attrName = stackFrame.getName().substring(4);

        Long pyObjId = messenger.getSelfId(stackFrame.getID());
        PyObject pyObject = (PyObject) controller.getVMObject(pyObjId);

        PyField pyField = (PyField) pyObject.getType().getFieldByName(attrName);
        if (pyField == null) {
            controller.newLogMessage(this, Level.WARNING,
                    "Cannot determine target attribute for setter: " + stackFrame.getName());
            return;
        }

        var methods = pyObject.getType().getMethodsByName(stackFrame.getName());
        if (methods.isEmpty()) {
            controller.newLogMessage(this, Level.WARNING, "No VM method found for attribute modification on " +
                    qualifiedClassName + "." + stackFrame.getName());
            return;
        }
        String methodId = (String) methods.getFirst().getId();

        PyMethod m = (PyMethod) controller.getVMMethod(methodId);

        if (m != null) {
            if (m.getArgumentNames().size() == 1) {
                DAPValue argDAPValue = messenger.getMethodArgDAPValue(stackFrame.getID(), m.getArgumentNames().getFirst());
                Value useValue = debugpyClient.getUSEValue(argDAPValue);
                controller.onUpdateAttribute(pyObjId, pyField.getId(), useValue);
            } else {
                controller.newLogMessage(this, Level.WARNING,
                        String.format("Could not resolve new value for attribute %s! Expected 1 setter method argument. Found: %d",
                                pyField.getName(), m.getArgumentNames().size()));
            }
        }
    }
}
