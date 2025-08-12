package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.adapter.VMAccessException;
import org.tzi.use.plugins.monitor.vm.mm.VMMethod;
import org.tzi.use.plugins.monitor.vm.mm.VMMethodCall;
import org.tzi.use.plugins.monitor.vm.mm.VMObject;
import org.tzi.use.uml.ocl.value.Value;

import java.util.List;

public class PyMethodCall implements VMMethodCall {

    private final PyMethod pyMethod;
    private final PyObject pyObject;
    private final List<Value> argVals;
    private final PythonAdapter adapter;

    public PyMethodCall(PythonAdapter adapter, PyMethod pyMethod, PyObject pyObject, List<Value> argVals) {
        this.adapter = adapter;
        this.pyMethod = pyMethod;
        this.pyObject = pyObject;
        this.argVals = argVals;
    }

    @Override
    public List<Value> getArgumentValues() throws VMAccessException {
        return argVals;
    }

    @Override
    public VMMethod getMethod() {
        return pyMethod;
    }

    @Override
    public VMObject getThisObject() throws VMAccessException {
        return pyObject;
    }

    @Override
    public int getNumArguments() throws VMAccessException {
        return pyMethod.getArgumentTypes().size();
    }

    @Override
    public String toString() {
        return "PyMethodCall{" +
                "pyMethod=" + pyMethod +
                ", pyObject=" + pyObject +
                ", argVals=" + argVals +
                '}';
    }

}
