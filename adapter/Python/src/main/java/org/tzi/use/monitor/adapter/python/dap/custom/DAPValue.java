package org.tzi.use.monitor.adapter.python.dap.custom;

public final class DAPValue {
    private final String result;
    private final String type;
    private final long variablesReference;
    private String name;

    public DAPValue(String result, String type, long variablesReference) {
        this.result = result;
        this.type = type;
        this.variablesReference = variablesReference;
    }

    public String getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public long getVariablesReference() {
        return variablesReference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DAPValue{" +
                "result='" + result + '\'' +
                ", type='" + type + '\'' +
                ", variablesReference=" + variablesReference +
                ", name='" + name + '\'' +
                '}';
    }

}
