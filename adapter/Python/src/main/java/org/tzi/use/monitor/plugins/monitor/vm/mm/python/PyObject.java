package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMField;
import org.tzi.use.plugins.monitor.vm.mm.VMObject;
import org.tzi.use.plugins.monitor.vm.mm.VMType;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.sys.MObject;

public class PyObject implements VMObject {

    private final long id;
    private final VMType type;
    private final PythonAdapter adapter;

    private MObject useObject;

    public PyObject(PythonAdapter adapter, long id, PyType type) {
        this.adapter = adapter;
        this.type = type;
        this.id = id;
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public VMType getType() {
        return type;
    }

    @Override
    public MObject getUSEObject() {
        return useObject;
    }

    @Override
    public void setUSEObject(MObject obj) {
        useObject = obj;
    }

    @Override
    public Value getValue(VMField field) {
        return adapter.getUSEValue(id, field.getName());
    }

    @Override
    public String toString() {
        return String.format("%s:%d", type, type.toString(), id);
    }

}
