package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `dataBreakpointInfo` request.
 */
public class DataBreakpointInfoArgumentsClass {
    private Long frameID;
    private String name;
    private Long variablesReference;

    /**
     * When `name` is an expression, evaluate it in the scope of this stack frame. If not
     * specified, the expression is evaluated in the global scope. When `variablesReference` is
     * specified, this property has no effect.
     */
    @JsonProperty("frameId")
    public Long getFrameID() { return frameID; }
    @JsonProperty("frameId")
    public void setFrameID(Long value) { this.frameID = value; }

    /**
     * The name of the variable's child to obtain data breakpoint information for.
     * If `variablesReference` isn't specified, this can be an expression.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * Reference to the variable container if the data breakpoint is requested for a child of
     * the container. The `variablesReference` must have been obtained in the current suspended
     * state. See 'Lifetime of Object References' in the Overview section for details.
     */
    @JsonProperty("variablesReference")
    public Long getVariablesReference() { return variablesReference; }
    @JsonProperty("variablesReference")
    public void setVariablesReference(Long value) { this.variablesReference = value; }
}
