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

    private List<PyField> fields = new ArrayList<>();
    private List<PyMethod> methods;
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
        Optional<VMMethod> methodOpt = methods.stream()
                .filter(m -> m.getName().equals(methodName))
                .map(m -> (VMMethod) m)
                .findAny();
        return methodOpt.map(Collections::singletonList).orElseGet(List::of);
    }

    @Override
    public MClass getUSEClass() {
        return useClass;
    }

    @Override
    public void setUSEClass(MClass cls) {
        this.useClass = cls;
    }

    @Override
    public VMField getFieldByName(String javaFieldName) {
        System.out.println("Getting field by name: " + javaFieldName + " for type: " + getName());
        PyField f = fields.stream()
                .filter(fi -> fi.getName().equals(javaFieldName))
                .findFirst()
                .orElse(null);
        System.out.println("Got field by name: " + javaFieldName + " = " + f);
        return f;
    }

    public List<PyMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<PyMethod> methods) {
        this.methods = methods;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public List<PyField> getFields() {
        return fields;
    }

    public void setFields(List<PyField> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "PyType{" +
                "typeName='" + typeName + '\'' +
                ", fields=" + fields +
                ", methods=" + methods +
                ", file='" + file + '\'' +
                ", useClass=" + useClass +
                '}';
    }

}
