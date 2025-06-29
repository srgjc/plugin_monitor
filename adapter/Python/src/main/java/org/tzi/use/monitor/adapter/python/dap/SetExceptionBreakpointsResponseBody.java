package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class SetExceptionBreakpointsResponseBody {
    private Breakpoint[] breakpoints;

    /**
     * Information about the exception breakpoints or filters.
     * The breakpoints returned are in the same order as the elements of the `filters`,
     * `filterOptions`, `exceptionOptions` arrays in the arguments. If both `filters` and
     * `filterOptions` are given, the returned array must start with `filters` information
     * first, followed by `filterOptions` information.
     */
    @JsonProperty("breakpoints")
    public Breakpoint[] getBreakpoints() { return breakpoints; }
    @JsonProperty("breakpoints")
    public void setBreakpoints(Breakpoint[] value) { this.breakpoints = value; }
}
