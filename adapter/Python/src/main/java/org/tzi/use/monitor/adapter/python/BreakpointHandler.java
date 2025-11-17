package org.tzi.use.monitor.adapter.python;

import org.tzi.use.monitor.adapter.python.custom.DAPValue;
import org.tzi.use.monitor.adapter.python.dap.StackFrame;
import org.tzi.use.monitor.adapter.python.dap.StoppedEventClass;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.*;
import org.tzi.use.plugins.monitor.Monitor;
import org.tzi.use.uml.ocl.value.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
                Optional<StackFrame> currFrameOpt = messenger.getCurrentFrame(Math.toIntExact(breakpointEvent.getBody().getThreadID()));
                if (currFrameOpt.isEmpty()) {
                    throw new IllegalStateException();
                }
                StackFrame currFrame = currFrameOpt.get();
                int currLineNo = (int) currFrame.getLine();
                String file = currFrame.getSource().getPath();
                String qualifiedClassName = debugpyClient.fileToClassNameMap.get(file).get(currLineNo);

                BreakpointType breakpointType = debugpyClient.fileToBreakpointTypeMap.get(file).get(currLineNo);
                switch (breakpointType) {
                    case CONSTRUCTOR_CALL -> onConstructorCall(currFrame, qualifiedClassName);
                    case METHOD_CALL -> onMethodCall(currFrame, qualifiedClassName);
                    case METHOD_EXIT -> onMethodExit(currFrame, qualifiedClassName);
                    case MODIFICATION -> onAttrMod(currFrame, qualifiedClassName);
                }

                debugpyClient.resume(); // Match monitor running state
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
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
        if (pyType == null) {
            methodId = String.format("%s:%s.%s", fullyQualifiedClassName, fullyQualifiedClassName, stackFrame.getName());
        } else {
            methodId = (String) pyType.getMethodsByName(stackFrame.getName()).getFirst().getId();
        }
        PyMethod pyMethod = (PyMethod) controller.getVMMethod(methodId);

        Long pyObjId = (pyType == null)
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
        String methodId;
        if (pyType == null) {
            methodId = String.format("%s:%s.%s", qualifiedClassName, qualifiedClassName, stackFrame.getName());
        } else {
            methodId = (String) pyType.getMethodsByName(stackFrame.getName()).getFirst().getId();
        }
        PyMethod pyMethod = (PyMethod) controller.getVMMethod(methodId);
        controller.onMethodExit(pyMethod, pyMethod.getId());
    }

    private void onAttrMod(StackFrame stackFrame, String qualifiedClassName) {
        controller.newLogMessage(this, Level.FINE, "onAttributeModification: " + qualifiedClassName + "." + stackFrame.getName());

        Long pyObjId = messenger.getSelfId(stackFrame.getID());
        PyObject pyObject = (PyObject) controller.getVMObject(pyObjId);

        PyField pyField = (PyField) pyObject.getType().getFieldByName(stackFrame.getName().replace("set_", ""));

        String methodId = (String) pyObject.getType().getMethodsByName(stackFrame.getName()).getFirst().getId();
        PyMethod m = (PyMethod) controller.getVMMethod(methodId);

        // TODO FIX assert only one arg
        List<Value> argValues = new ArrayList<>();
        for (String argName : m.getArgumentNames()) {
            DAPValue argDAPValue = messenger.getMethodArgDAPValue(stackFrame.getID(), argName);
            argValues.add(debugpyClient.getUSEValue(argDAPValue));
        }

        controller.onUpdateAttribute(pyObjId, pyField.getId(), argValues.get(0));
    }

}
