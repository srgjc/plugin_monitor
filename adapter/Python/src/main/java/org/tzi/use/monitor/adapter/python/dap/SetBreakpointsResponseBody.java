package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class SetBreakpointsResponseBody {
    private Breakpoint[] breakpoints;

    /**
     * Information about the breakpoints.
     * The array elements are in the same order as the elements of the `breakpoints` (or the
     * deprecated `lines`) array in the arguments.
     */
    @JsonProperty("breakpoints")
    public Breakpoint[] getBreakpoints() { return breakpoints; }
    @JsonProperty("breakpoints")
    public void setBreakpoints(Breakpoint[] value) { this.breakpoints = value; }
}
