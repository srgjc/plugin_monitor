package org.tzi.use.monitor.adapter.python;

import org.tzi.use.monitor.adapter.python.custom.DAPValue;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.*;
import org.tzi.use.plugins.monitor.MonitorException;
import org.tzi.use.plugins.monitor.vm.adapter.AbstractVMAdapter;
import org.tzi.use.plugins.monitor.vm.adapter.InvalidAdapterConfiguration;
import org.tzi.use.plugins.monitor.vm.adapter.VMAdapterSetting;
import org.tzi.use.plugins.monitor.vm.mm.*;
import org.tzi.use.uml.ocl.value.*;

import java.nio.file.Files;
import java.nio.file.Path;
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
    private String workspace;
    private DebugpyClient debugpyClient;

    // FIXME: More robust validation
    @Override
    protected void validateSettings() throws InvalidAdapterConfiguration {
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

        String settingWorkspace = settings.get(SETTING_WORKSPACE_IDX).value;
        try {
            // FIXME: SUM should not be assumed to be in the localhost.
            Path workspacePath = Path.of(settingWorkspace);
            boolean isValidDir = Files.isDirectory(workspacePath);
            if (isValidDir) {
                workspace = workspacePath.toString();
            } else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            throw new InvalidAdapterConfiguration("Invalid directory!");
        }
    }

    @Override
    protected void createSettings(List<VMAdapterSetting> settings) {
        settings.add(SETTING_HOST_IDX, new VMAdapterSetting("Host", "localhost"));
        settings.add(SETTING_PORT_IDX, new VMAdapterSetting("Port", "5678"));
        settings.add(SETTING_WORKSPACE_IDX, new VMAdapterSetting("SUM root dir", "/Users/serj/git/uni/dpy-server"));
    }

    @Override
    public void attachToVM() throws MonitorException {
        String errMsg = "Failed to attach to debugpy server!";
        try {
            debugpyClient = new DebugpyClient(host, port, workspace, this, controller);
            if (!debugpyClient.attach()) {
                controller.newLogMessage(this, Level.SEVERE, errMsg);
            }
        } catch (Exception e) {
            throw new MonitorException(errMsg, e);
        }
    }

    @Override
    public void resume() {
        debugpyClient.resume();
    }

    @Override
    public void suspend() {
        debugpyClient.pause();
    }

    @Override
    public void stop() {
        debugpyClient.stop();
    }

    public Set<VMObject> readInstances(PyType pyType) {
        return debugpyClient.getInstances(pyType);
    }

    public Value getUSEValue(long objId, String fName) {
        DAPValue dapValue = debugpyClient.getDAPValue(objId, fName);
        return debugpyClient.getUSEValue(dapValue);
    }

    @Override
    public VMType getVMType(String fqcn) {
        controller.newLogMessage(this, Level.FINE, String.format("Getting runtime type '%s'...", fqcn));
        VMType vmType = debugpyClient.getVMType(fqcn);
        if (vmType == null) {
            controller.newLogMessage(this, Level.WARNING, String.format("Could not find runtime type '%s'!", fqcn));
        }
        return vmType;
    }

    public VMMethod getVMMethod(String fqcn, String methodName, boolean isModule) {
        controller.newLogMessage(this, Level.FINE, String.format("Getting runtime method '%s' for type '%s'...", methodName, fqcn));
        String classOrModuleName = fqcn;
        String mName = methodName;
        if (isModule) {
            if (methodName.equals("__init__")) {
                return null;
            }
            int lastDot = methodName.lastIndexOf('.');
            classOrModuleName = methodName.substring(0, lastDot);
            mName = methodName.substring(lastDot + 1);
        }
        VMMethod vmMethod = debugpyClient.getVMMethod(classOrModuleName, mName, isModule);
        if (vmMethod == null) {
            controller.newLogMessage(this, Level.WARNING, String.format("Could not find runtime method '%s' for type '%s'!", mName, classOrModuleName));
        }
        return vmMethod;
    }

    public VMField getVMField(String fqcn, String fieldName) {
        controller.newLogMessage(this, Level.FINE, String.format("Getting runtime field '%s' for type '%s'...", fieldName, fqcn));
        VMField vmField = debugpyClient.getVMField(fqcn, fieldName);
        if (vmField == null) {
            controller.newLogMessage(this, Level.WARNING, String.format("Could not get runtime field '%s' for type '%s'!", fieldName, fqcn));
        }
        return vmField;
    }

    @Override
    public void registerConstructorCallInterest(VMType vmType) {
        controller.newLogMessage(this, Level.FINE, String.format("Registering constructor call interest for type '%s'...", vmType));
        if (!debugpyClient.registerConstructorCallInterest((PyType) vmType)) {
            controller.newLogMessage(this, Level.WARNING, String.format("Could not register constructor call interestest for type '%s'!", vmType));
        }
    }

    @Override
    public void registerOperationCallInterest(VMMethod vmMethod) {
        controller.newLogMessage(this, Level.FINE, String.format("Registering operation call interest for '%s'...", vmMethod));
        if (!debugpyClient.registerOperationCallInterest((PyMethod) vmMethod)) {
            controller.newLogMessage(this, Level.WARNING, String.format("Could not register operation call interestest for '%s'!", vmMethod));
        }
    }

    @Override
    public void registerFieldModificationInterest(VMField vmField) {
        controller.newLogMessage(this, Level.FINE, String.format("Registering field modification interest for '%s'...", vmField));
        if (!debugpyClient.registerFieldModificationInterest((PyField) vmField)) {
            controller.newLogMessage(this, Level.WARNING, String.format("Could not register field modification interestest for '%s'!", vmField));
        }
    }

    @Override
    public boolean isVMTypeLoaded(String javaClassName) {
        return getVMType(javaClassName) != null;
    }

    @Override
    public void registerClassPrepareEvent(String javaClassName) {
    }

    @Override
    public void unregisterClassPrepareInterest(Object adapterEventInformation) {
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
    public String toString() {
        return "PythonAdapter";
    }

}
