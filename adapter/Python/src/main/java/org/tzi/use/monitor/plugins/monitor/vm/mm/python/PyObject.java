package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.monitor.adapter.python.custom.DAPValue;
import org.tzi.use.plugins.monitor.vm.mm.VMField;
import org.tzi.use.plugins.monitor.vm.mm.VMObject;
import org.tzi.use.plugins.monitor.vm.mm.VMType;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.sys.MObject;

public class PyObject extends PyBase implements VMObject {

    private final PyObjectRaw rawObject;
    private final VMType type;

    private MObject useObject;

    public PyObject(PythonAdapter adapter, PyObjectRaw rawObject, PyType type) {
        super(adapter);
        this.rawObject = rawObject;
        this.type = type;
    }

    @Override
    public Object getId() {
        return rawObject.getId();
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
        DAPValue dapValue = adapter.getDAPValue((Long) getId(), field.getName());
        return adapter.getUSEValue(dapValue);
    }

}
