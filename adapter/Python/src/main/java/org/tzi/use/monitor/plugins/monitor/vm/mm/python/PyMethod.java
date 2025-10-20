package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMMethod;
import org.tzi.use.plugins.monitor.vm.mm.VMType;
import org.tzi.use.uml.mm.MOperation;

import java.util.ArrayList;
import java.util.List;

public class PyMethod implements VMMethod {

    private final String id;
    private final String name;
    private final String className;
    private final PythonAdapter adapter;

    private List<String> argumentNames;
    private List<String> argumentTypes;
    private String file;
    private int startLineNo;
    private int endLineNo;
    private List<Integer> returnLines;
    private MOperation useOperation;

    public PyMethod(PythonAdapter adapter, String methodName, String className) {
        this.adapter = adapter;
        this.id = String.format("%s:%s", className, methodName);
        this.name = methodName;
        this.className = className;
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<VMType> getArgumentTypes() {
        List<VMType> types = new ArrayList<>();
        for (String typeName : argumentTypes) {
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

    public String getClassName() {
        return className;
    }

    public List<String> getArgumentNames() {
        return argumentNames;
    }

    public void setArgumentNames(List<String> argumentNames) {
        this.argumentNames = argumentNames;
    }

    public void setArgumentTypes(List<String> argumentTypes) {
        this.argumentTypes = argumentTypes;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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

    public List<Integer> getReturnLines() {
        return returnLines;
    }

    public void setReturnLines(List<Integer> returnLines) {
        this.returnLines = returnLines;
    }

    @Override
    public String toString() {
        return id;
    }

}
