package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import java.util.List;

public class PyMethodRaw {

    private String name;
    private List<String> argumentTypeNames;
    private int startLineNo;
    private int endLineNo;
    private String file;
    private List<Integer> returnLines;
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

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

    public int getStartLineNo() {
        return startLineNo;
    }

    public void setStartLineNo(int startLineNo) {
        this.startLineNo = startLineNo;
    }

    public int getEndLineNo() {
        return endLineNo;
    }

    public void setEndLineNo(int endLineNo) {
        this.endLineNo = endLineNo;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public List<Integer> getReturnLines() {
        return returnLines;
    }

    public void setReturnLines(List<Integer> returnLines) {
        this.returnLines = returnLines;
    }

    @Override
    public String toString() {
        return "PyMethodRaw{" +
                "name='" + name + '\'' +
                ", argumentTypeNames=" + argumentTypeNames +
                ", startLineNo=" + startLineNo +
                ", endLineNo=" + endLineNo +
                ", file='" + file + '\'' +
                ", returnLines=" + returnLines +
                '}';
    }

}
