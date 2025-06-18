package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import com.sun.jdi.Method;
import org.tzi.use.plugins.monitor.vm.adapter.VMAccessException;
import org.tzi.use.plugins.monitor.vm.adapter.jvm.JVMAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMMethod;
import org.tzi.use.plugins.monitor.vm.mm.VMType;
import org.tzi.use.plugins.monitor.vm.mm.jvm.JVMBase;
import org.tzi.use.uml.mm.MOperation;

import java.util.List;

public class PyMethod extends JVMBase implements VMMethod {

    private final PyMethodRaw method;

    private MOperation useOperation;

    public PyMethod(JVMAdapter adapter, PyMethodRaw method) {
        super(adapter);
        this.method = method;
    }

    @Override
    public Object getId() {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public List<VMType> getArgumentTypes() throws VMAccessException {
        return List.of();
    }

    @Override
    public MOperation getUSEOperation() {
        return useOperation;
    }

    @Override
    public void setUSEOperation(MOperation useOperation) {
        this.useOperation = useOperation;
    }

}
