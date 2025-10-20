package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMField;
import org.tzi.use.plugins.monitor.vm.mm.VMMethod;
import org.tzi.use.plugins.monitor.vm.mm.VMObject;
import org.tzi.use.plugins.monitor.vm.mm.VMType;
import org.tzi.use.uml.mm.MClass;

import java.util.*;

public class PyType implements VMType {

    private final String typeName;
    private final PythonAdapter adapter;

    private String file;
    private MClass useClass;

    public PyType(PythonAdapter adapter, String typeName) {
        this.adapter = adapter;
        this.typeName = typeName;
    }

    @Override
    public String getName() {
        return typeName;
    }

    @Override
    public Set<VMType> getSuperClasses() {
        return Set.of();
    }

    @Override
    public Set<VMType> getSubClasses() {
        return Set.of();
    }

    @Override
    public boolean isClassType() {
        return true;
    }

    @Override
    public Set<VMObject> getInstances() {
        return adapter.readInstances(this);
    }

    @Override
    public List<VMMethod> getMethodsByName(String methodName) {
        VMMethod vmMethod = adapter.getVMMethod(typeName, methodName);
        return (vmMethod != null)
                ? Collections.singletonList(vmMethod)
                : Collections.emptyList();
    }

    @Override
    public VMField getFieldByName(String fieldName) {
        return adapter.getVMField(typeName, fieldName);
    }

    @Override
    public MClass getUSEClass() {
        return useClass;
    }

    @Override
    public void setUSEClass(MClass cls) {
        this.useClass = cls;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return typeName;
    }

}
