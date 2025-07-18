package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import java.util.List;

public class PyTypeRaw {
    private String name;
    private List<PyFieldRaw> fields;
    private List<PyMethodRaw> methods;
    private boolean isPrimitive;
    private String file;

    public PyTypeRaw(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PyFieldRaw> getFields() {
        return fields;
    }

    public void setFields(List<PyFieldRaw> fields) {
        this.fields = fields;
    }

    public List<PyMethodRaw> getMethods() {
        return methods;
    }

    public void setMethods(List<PyMethodRaw> methods) {
        this.methods = methods;
    }

    public boolean isPrimitive() {
        return isPrimitive;
    }

    public void setPrimitive(boolean primitive) {
        isPrimitive = primitive;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "PyTypeRaw{" +
                "name='" + name + '\'' +
                ", fields=" + fields +
                ", methods=" + methods +
                ", isPrimitive=" + isPrimitive +
                ", file='" + file + '\'' +
                '}';
    }
}
