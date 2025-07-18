package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

public class PyObjectRaw {
    private final Long id;
    private PyTypeRaw rawType;

    public PyObjectRaw(Long id) {
        this.id = id;
    }

    public PyTypeRaw getRawType() {
        return rawType;
    }

    public void setRawType(PyTypeRaw rawType) {
        this.rawType = rawType;
    }

    public Long getId() {
        return id;
    }
}
