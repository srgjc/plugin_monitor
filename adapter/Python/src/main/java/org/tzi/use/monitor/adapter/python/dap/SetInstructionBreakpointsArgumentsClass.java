package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `setInstructionBreakpoints` request
 */
public class SetInstructionBreakpointsArgumentsClass {
    private InstructionBreakpoint[] breakpoints;

    /**
     * The instruction references of the breakpoints
     */
    @JsonProperty("breakpoints")
    public InstructionBreakpoint[] getBreakpoints() { return breakpoints; }
    @JsonProperty("breakpoints")
    public void setBreakpoints(InstructionBreakpoint[] value) { this.breakpoints = value; }
}
