package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMMethod;
import org.tzi.use.plugins.monitor.vm.mm.VMType;
import org.tzi.use.uml.mm.MOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PyMethod extends PyBase implements VMMethod {

    private final PyMethodRaw method;

    private MOperation useOperation;
    private UUID id;

    public PyMethod(PythonAdapter adapter, PyMethodRaw method) {
        super(adapter);
        this.method = method;
        this.id = UUID.randomUUID();
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public String getName() {
        return method.getName();
    }

    @Override
    public List<VMType> getArgumentTypes() {
        List<VMType> types = new ArrayList<>(method.getArgumentTypeNames().size());
        for (String typeName : method.getArgumentTypeNames()) {
            types.add(adapter.getVMType(typeName));
        }
        return types;
    }

    @Override
    public MOperation getUSEOperation() {
        return useOperation;
    }

    @Override
    public void setUSEOperation(MOperation useOperation) {
        this.useOperation = useOperation;
    }

    @Override
    public String toString() {
        return "PyMethod{" +
                "method=" + method +
                ", useOperation=" + useOperation +
                ", id=" + id +
                '}';
    }
}
