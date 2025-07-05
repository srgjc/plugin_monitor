package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import java.util.List;

public class PyMethodRaw {

    private String name;
    private List<String> argumentTypeNames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getArgumentTypeNames() {
        return argumentTypeNames;
    }

    public void setArgumentTypeNames(List<String> argumentTypeNames) {
        this.argumentTypeNames = argumentTypeNames;
    }

    @Override
    public String toString() {
        return "PyMethodRaw{" +
                "name='" + name + '\'' +
                ", argumentTypeNames=" + argumentTypeNames +
                '}';
    }
}
