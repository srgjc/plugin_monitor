package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Specifies details on how to format the stack frames.
 * The attribute is only honored by a debug adapter if the corresponding capability
 * `supportsValueFormattingOptions` is true.
 *
 * Specifies details on how to format the result.
 * The attribute is only honored by a debug adapter if the corresponding capability
 * `supportsValueFormattingOptions` is true.
 *
 * Provides formatting information for a value.
 *
 * Specifies how the resulting value should be formatted.
 *
 * Specifies details on how to format the response value.
 *
 * Specifies details on how to format the Variable values.
 * The attribute is only honored by a debug adapter if the corresponding capability
 * `supportsValueFormattingOptions` is true.
 *
 * Provides formatting information for a stack frame.
 */
public class StackFrameFormat {
    private Boolean hex;
    private Boolean includeAll;
    private Boolean line;
    private Boolean module;
    private Boolean parameterNames;
    private Boolean parameters;
    private Boolean parameterTypes;
    private Boolean parameterValues;

    /**
     * Display the value in hex.
     */
    @JsonProperty("hex")
    public Boolean getHex() { return hex; }
    @JsonProperty("hex")
    public void setHex(Boolean value) { this.hex = value; }

    /**
     * Includes all stack frames, including those the debug adapter might otherwise hide.
     */
    @JsonProperty("includeAll")
    public Boolean getIncludeAll() { return includeAll; }
    @JsonProperty("includeAll")
    public void setIncludeAll(Boolean value) { this.includeAll = value; }

    /**
     * Displays the line number of the stack frame.
     */
    @JsonProperty("line")
    public Boolean getLine() { return line; }
    @JsonProperty("line")
    public void setLine(Boolean value) { this.line = value; }

    /**
     * Displays the module of the stack frame.
     */
    @JsonProperty("module")
    public Boolean getModule() { return module; }
    @JsonProperty("module")
    public void setModule(Boolean value) { this.module = value; }

    /**
     * Displays the names of parameters for the stack frame.
     */
    @JsonProperty("parameterNames")
    public Boolean getParameterNames() { return parameterNames; }
    @JsonProperty("parameterNames")
    public void setParameterNames(Boolean value) { this.parameterNames = value; }

    /**
     * Displays parameters for the stack frame.
     */
    @JsonProperty("parameters")
    public Boolean getParameters() { return parameters; }
    @JsonProperty("parameters")
    public void setParameters(Boolean value) { this.parameters = value; }

    /**
     * Displays the types of parameters for the stack frame.
     */
    @JsonProperty("parameterTypes")
    public Boolean getParameterTypes() { return parameterTypes; }
    @JsonProperty("parameterTypes")
    public void setParameterTypes(Boolean value) { this.parameterTypes = value; }

    /**
     * Displays the values of parameters for the stack frame.
     */
    @JsonProperty("parameterValues")
    public Boolean getParameterValues() { return parameterValues; }
    @JsonProperty("parameterValues")
    public void setParameterValues(Boolean value) { this.parameterValues = value; }
}
