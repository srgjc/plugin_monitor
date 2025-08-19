package org.tzi.use.monitor.adapter.python;

import org.tzi.use.monitor.adapter.python.custom.DAPValue;
import org.tzi.use.monitor.adapter.python.dap.*;
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

    public Set<VMObject> readInstances(PyType pyType) {
        return debugpyClient.getInstances(pyType);
    }

    public Value getUSEValue(long objId, String fName) {
        DAPValue dapValue = debugpyClient.getDAPValue(objId, fName);
        return debugpyClient.getUSEValue(dapValue);
    }

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
        settings.add(SETTING_WORKSPACE_IDX, new VMAdapterSetting("SUM root dir", "/home/serj/git/uni/dpy-server"));
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

    @Override
    public VMType getVMType(String qualifiedClassName) {
        return debugpyClient.getVMType(qualifiedClassName);
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
        debugpyClient.registerOperationCallInterest(m);
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
        debugpyClient.registerConstructorCallInterest(vmType);
    }

    @Override
    public void registerFieldModificationInterest(VMField f) {
    }

    @Override
    public String toString() {
        return "PythonAdapter";
    }

}
