package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `evaluate` request.
 */
public class EvaluateRequestArguments {
    private String context;
    private String expression;
    private ValueFormat format;
    private Long frameID;

    /**
     * The context in which the evaluate request is used.
     */
    @JsonProperty("context")
    public String getContext() { return context; }
    @JsonProperty("context")
    public void setContext(String value) { this.context = value; }

    /**
     * The expression to evaluate.
     */
    @JsonProperty("expression")
    public String getExpression() { return expression; }
    @JsonProperty("expression")
    public void setExpression(String value) { this.expression = value; }

    /**
     * Specifies details on how to format the result.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportsValueFormattingOptions` is true.
     */
    @JsonProperty("format")
    public ValueFormat getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(ValueFormat value) { this.format = value; }

    /**
     * Evaluate the expression in the scope of this stack frame. If not specified, the
     * expression is evaluated in the global scope.
     */
    @JsonProperty("frameId")
    public Long getFrameID() { return frameID; }
    @JsonProperty("frameId")
    public void setFrameID(Long value) { this.frameID = value; }
}
