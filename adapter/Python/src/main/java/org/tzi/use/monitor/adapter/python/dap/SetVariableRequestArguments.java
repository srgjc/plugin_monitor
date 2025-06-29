package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `setVariable` request.
 */
public class SetVariableRequestArguments {
    private ValueFormat format;
    private String name;
    private String value;
    private long variablesReference;

    /**
     * Specifies details on how to format the response value.
     */
    @JsonProperty("format")
    public ValueFormat getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(ValueFormat value) { this.format = value; }

    /**
     * The name of the variable in the container.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The value of the variable.
     */
    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }

    /**
     * The reference of the variable container. The `variablesReference` must have been obtained
     * in the current suspended state. See 'Lifetime of Object References' in the Overview
     * section for details.
     */
    @JsonProperty("variablesReference")
    public long getVariablesReference() { return variablesReference; }
    @JsonProperty("variablesReference")
    public void setVariablesReference(long value) { this.variablesReference = value; }
}
