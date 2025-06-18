package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

public class PyMethodRaw {

    private String name;
    private String returnType;
    private String lineNoStart;
    private String lineNoEnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getLineNoStart() {
        return lineNoStart;
    }

    public void setLineNoStart(String lineNoStart) {
        this.lineNoStart = lineNoStart;
    }

    public String getLineNoEnd() {
        return lineNoEnd;
    }

    public void setLineNoEnd(String lineNoEnd) {
        this.lineNoEnd = lineNoEnd;
    }

}
