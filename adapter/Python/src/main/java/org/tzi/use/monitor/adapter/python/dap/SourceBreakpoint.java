package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Properties of a breakpoint or logpoint passed to the `setBreakpoints` request.
 */
public class SourceBreakpoint {
    private Long column;
    private String condition;
    private String hitCondition;
    private long line;
    private String logMessage;

    /**
     * Start position within source line of the breakpoint or logpoint. It is measured in UTF-16
     * code units and the client capability `columnsStartAt1` determines whether it is 0- or
     * 1-based.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * The expression for conditional breakpoints.
     * It is only honored by a debug adapter if the corresponding capability
     * `supportsConditionalBreakpoints` is true.
     */
    @JsonProperty("condition")
    public String getCondition() { return condition; }
    @JsonProperty("condition")
    public void setCondition(String value) { this.condition = value; }

    /**
     * The expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportsHitConditionalBreakpoints` is true.
     * If both this property and `condition` are specified, `hitCondition` should be evaluated
     * only if the `condition` is met, and the debug adapter should stop only if both conditions
     * are met.
     */
    @JsonProperty("hitCondition")
    public String getHitCondition() { return hitCondition; }
    @JsonProperty("hitCondition")
    public void setHitCondition(String value) { this.hitCondition = value; }

    /**
     * The source line of the breakpoint or logpoint.
     */
    @JsonProperty("line")
    public long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(long value) { this.line = value; }

    /**
     * If this attribute exists and is non-empty, the debug adapter must not 'break' (stop)
     * but log the message instead. Expressions within `{}` are interpolated.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportsLogPoints` is true.
     * If either `hitCondition` or `condition` is specified, then the message should only be
     * logged if those conditions are met.
     */
    @JsonProperty("logMessage")
    public String getLogMessage() { return logMessage; }
    @JsonProperty("logMessage")
    public void setLogMessage(String value) { this.logMessage = value; }
}
