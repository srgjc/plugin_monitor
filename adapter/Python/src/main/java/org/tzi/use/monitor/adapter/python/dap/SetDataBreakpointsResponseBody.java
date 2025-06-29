package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class SetDataBreakpointsResponseBody {
    private Breakpoint[] breakpoints;

    /**
     * Information about the data breakpoints. The array elements correspond to the elements of
     * the input argument `breakpoints` array.
     */
    @JsonProperty("breakpoints")
    public Breakpoint[] getBreakpoints() { return breakpoints; }
    @JsonProperty("breakpoints")
    public void setBreakpoints(Breakpoint[] value) { this.breakpoints = value; }
}
