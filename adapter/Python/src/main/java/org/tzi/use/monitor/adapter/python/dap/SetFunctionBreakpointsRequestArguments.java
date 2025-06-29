package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `setFunctionBreakpoints` request.
 */
public class SetFunctionBreakpointsRequestArguments {
    private FunctionBreakpoint[] breakpoints;

    /**
     * The function names of the breakpoints.
     */
    @JsonProperty("breakpoints")
    public FunctionBreakpoint[] getBreakpoints() { return breakpoints; }
    @JsonProperty("breakpoints")
    public void setBreakpoints(FunctionBreakpoint[] value) { this.breakpoints = value; }
}
