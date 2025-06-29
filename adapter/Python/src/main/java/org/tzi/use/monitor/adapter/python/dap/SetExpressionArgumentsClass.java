package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `setExpression` request.
 */
public class SetExpressionArgumentsClass {
    private String expression;
    private ValueFormat format;
    private Long frameID;
    private String value;

    /**
     * The l-value expression to assign to.
     */
    @JsonProperty("expression")
    public String getExpression() { return expression; }
    @JsonProperty("expression")
    public void setExpression(String value) { this.expression = value; }

    /**
     * Specifies how the resulting value should be formatted.
     */
    @JsonProperty("format")
    public ValueFormat getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(ValueFormat value) { this.format = value; }

    /**
     * Evaluate the expressions in the scope of this stack frame. If not specified, the
     * expressions are evaluated in the global scope.
     */
    @JsonProperty("frameId")
    public Long getFrameID() { return frameID; }
    @JsonProperty("frameId")
    public void setFrameID(Long value) { this.frameID = value; }

    /**
     * The value expression to assign to the l-value expression.
     */
    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}
