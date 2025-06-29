package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Properties of a breakpoint passed to the `setInstructionBreakpoints` request
 */
public class InstructionBreakpoint {
    private String condition;
    private String hitCondition;
    private String instructionReference;
    private Long offset;

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
     * The instruction reference of the breakpoint.
     * This should be a memory or instruction pointer reference from an `EvaluateResponse`,
     * `Variable`, `StackFrame`, `GotoTarget`, or `Breakpoint`.
     */
    @JsonProperty("instructionReference")
    public String getInstructionReference() { return instructionReference; }
    @JsonProperty("instructionReference")
    public void setInstructionReference(String value) { this.instructionReference = value; }

    /**
     * The offset from the instruction reference in bytes.
     * This can be negative.
     */
    @JsonProperty("offset")
    public Long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(Long value) { this.offset = value; }
}
