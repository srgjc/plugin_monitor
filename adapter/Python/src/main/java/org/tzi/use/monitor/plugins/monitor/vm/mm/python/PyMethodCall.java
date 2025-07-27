package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.adapter.VMAccessException;
import org.tzi.use.plugins.monitor.vm.mm.VMMethod;
import org.tzi.use.plugins.monitor.vm.mm.VMMethodCall;
import org.tzi.use.plugins.monitor.vm.mm.VMObject;
import org.tzi.use.uml.ocl.value.Value;

import java.util.List;

public class PyMethodCall extends PyBase implements VMMethodCall {

    private final PyMethod pyMethod;
    private final PyObject pyObject;

    public PyMethodCall(PythonAdapter adapter, PyMethod pyMethod, PyObject pyObject) {
        super(adapter);
        this.pyMethod = pyMethod;
        this.pyObject = pyObject;
    }

    @Override
    public List<Value> getArgumentValues() throws VMAccessException {
        return List.of();
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
        return this.pyMethod.getArgumentTypes().size();
    }

}
