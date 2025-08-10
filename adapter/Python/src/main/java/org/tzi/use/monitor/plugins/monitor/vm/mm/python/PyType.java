package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMField;
import org.tzi.use.plugins.monitor.vm.mm.VMMethod;
import org.tzi.use.plugins.monitor.vm.mm.VMObject;
import org.tzi.use.plugins.monitor.vm.mm.VMType;
import org.tzi.use.uml.mm.MClass;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class PyType extends PyBase implements VMType {

    private final PyTypeRaw rawType;
    private MClass useClass;

    public PyType(PythonAdapter adapter, PyTypeRaw rawType) {
        super(adapter);
        this.rawType = rawType;
    }

    public PyTypeRaw getRawType() {
        return rawType;
    }

    @Override
    public String getName() {
        return rawType.getName();
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
        Optional<PyMethodRaw> methodOpt = rawType.getMethods().stream()
                .filter(m -> m.getName().equals(methodName))
                .findAny();
        return methodOpt.<List<VMMethod>>map(pyMethodRaw -> List.of(new PyMethod(getAdapter(), pyMethodRaw))).orElseGet(List::of);
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
        PyFieldRaw f = rawType.getFields().stream()
                .filter(fi -> fi.getName().equals(javaFieldName))
                .findFirst()
                .orElse(null);
        System.out.println("Got field by name: " + javaFieldName + " = " + f);
        return f != null ? new PyField(adapter, f, getName()) : null;
    }

    @Override
    public String toString() {
        return "PyType{" +
                "rawType=" + rawType +
                ", useClass=" + useClass +
                '}';
    }
}
