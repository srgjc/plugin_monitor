package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Properties of a breakpoint passed to the `setFunctionBreakpoints` request.
 */
public class FunctionBreakpoint {
    private String condition;
    private String hitCondition;
    private String name;

    /**
     * An expression for conditional breakpoints.
     * It is only honored by a debug adapter if the corresponding capability
     * `supportsConditionalBreakpoints` is true.
     */
    @JsonProperty("condition")
    public String getCondition() { return condition; }
    @JsonProperty("condition")
    public void setCondition(String value) { this.condition = value; }

    /**
     * An expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportsHitConditionalBreakpoints` is true.
     */
    @JsonProperty("hitCondition")
    public String getHitCondition() { return hitCondition; }
    @JsonProperty("hitCondition")
    public void setHitCondition(String value) { this.hitCondition = value; }

    /**
     * The name of the function.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
}
