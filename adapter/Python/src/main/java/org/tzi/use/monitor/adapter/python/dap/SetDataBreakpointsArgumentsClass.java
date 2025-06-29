package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `setDataBreakpoints` request.
 */
public class SetDataBreakpointsArgumentsClass {
    private DataBreakpoint[] breakpoints;

    /**
     * The contents of this array replaces all existing data breakpoints. An empty array clears
     * all data breakpoints.
     */
    @JsonProperty("breakpoints")
    public DataBreakpoint[] getBreakpoints() { return breakpoints; }
    @JsonProperty("breakpoints")
    public void setBreakpoints(DataBreakpoint[] value) { this.breakpoints = value; }
}
