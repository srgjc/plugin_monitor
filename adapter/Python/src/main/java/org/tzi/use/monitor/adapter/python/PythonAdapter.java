package org.tzi.use.monitor.adapter.python;

import org.tzi.use.monitor.adapter.python.tmp.BreakpointEvent;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.PyObject;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.PyObjectRaw;
import org.tzi.use.monitor.plugins.monitor.vm.mm.python.PyType;
import org.tzi.use.plugins.monitor.MonitorException;
import org.tzi.use.plugins.monitor.vm.adapter.AbstractVMAdapter;
import org.tzi.use.plugins.monitor.vm.adapter.InvalidAdapterConfiguration;
import org.tzi.use.plugins.monitor.vm.adapter.VMAdapterSetting;
import org.tzi.use.plugins.monitor.vm.mm.*;
import org.tzi.use.uml.ocl.value.Value;

import java.util.*;
import java.util.logging.Level;

/**
 * @author Sergio Jimenez
 */
public class PythonAdapter extends AbstractVMAdapter {

    private static final int SETTING_HOST_IDX = 0;
    private static final int SETTING_PORT_IDX = 1;

    private String host;
    private int port;
    private boolean isConnected;
    private DebugpyClient debugpyClient;
    private Map<String, VMType> typeMapping;
    private HashMap<String, HashMap<Integer, Breakpoint>> breakpoints;

    public Set<VMObject> readInstances(PyType type) {
        var pyObjectRaw = new PyObjectRaw(); // TODO construct from client call instead
        pyObjectRaw.setRawType(type.getRawType());
        pyObjectRaw.getRawType().getFields().get(0).setValue("John Doe");
        pyObjectRaw.getRawType().getFields().get(1).setValue("60000"); // TODO Fix is not getting set...
        Set<VMObject> vmObjects = new HashSet<>();
        for (PyObjectRaw ref : Set.of(pyObjectRaw)) {
            PyObject pyObj = new PyObject(this, ref);
            vmObjects.add(pyObj);
        }
        return vmObjects;
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
    }

    @Override
    public void attachToVM() throws MonitorException {
        System.out.println("Connecting to debugpy server...");

        typeMapping = new HashMap<>();
        breakpoints = new HashMap<>();

        try {
            debugpyClient = new DebugpyClient(host, port, new Handler());
        } catch (Exception e) {
            throw new MonitorException("Failed to create socket!", e);
        }

        System.out.println("Debugpy socket created!");

        if (debugpyClient.attach(host, port)) {
            isConnected = true;
            System.out.println("Connected to debugpy server!");
        } else {
            System.out.println("Failed to attach to debugpy server!");
        }
    }

    @Override
    public void resume() {
        System.out.println("Resuming debugpy server...");

    }

    @Override
    public void suspend() {
        System.out.println("Suspending debugpy server...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping debugpy server...");

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
            typeMapping.put(name, res);
        }
        return typeMapping.get(name);
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
        PyType type = (PyType) vmType;
        for (VMMethod m : type.getMethodsByName("__init__")) {
            controller.newLogMessage(this, Level.FINE, "Registering constructor " + m.toString());
            // set breakpoints via debugpy for constructor
        }
    }

    @Override
    public void registerFieldModificationInterest(VMField f) {

    }

    private class Handler implements BreakpointHandler {

        @Override
        public void handleBreakpoint(BreakpointEvent event) {
            // TODO
        }
    }

    @Override
    public String toString() {
        return "PythonAdapter";
    }

}
