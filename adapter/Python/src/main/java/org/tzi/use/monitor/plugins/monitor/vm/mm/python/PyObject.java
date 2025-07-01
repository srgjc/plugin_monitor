package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMField;
import org.tzi.use.plugins.monitor.vm.mm.VMObject;
import org.tzi.use.plugins.monitor.vm.mm.VMType;
import org.tzi.use.uml.ocl.value.IntegerValue;
import org.tzi.use.uml.ocl.value.StringValue;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.sys.MObject;

import java.util.UUID;

public class PyObject extends PyBase implements VMObject {

    private final PyObjectRaw rawObject;
    private final VMType type;
    private final Object id;

    private MObject useObject;

    public PyObject(PythonAdapter adapter, PyObjectRaw rawObject, PyType type) {
        super(adapter);
        this.rawObject = rawObject;
        this.type = type;
        this.id = UUID.randomUUID();
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
        System.out.println("getValue for:" + field.getName());
        PyField f = (PyField) field;
        String valTypeStr = f.getPyFieldRaw().getType();
        System.out.println("getValue valTypeStr:" + valTypeStr);
        String valStr = f.getPyFieldRaw().getValue();
        System.out.println("getValue valstr:" + valStr);
        return switch (valTypeStr) {
            case "int" -> IntegerValue.valueOf(Integer.parseInt(valStr));
            case "str" -> new StringValue(valStr);
            default -> null;
        };
    }

}
