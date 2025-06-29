package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class BreakpointLocationsResponseBody {
    private BreakpointLocation[] breakpoints;

    /**
     * Sorted set of possible breakpoint locations.
     */
    @JsonProperty("breakpoints")
    public BreakpointLocation[] getBreakpoints() { return breakpoints; }
    @JsonProperty("breakpoints")
    public void setBreakpoints(BreakpointLocation[] value) { this.breakpoints = value; }
}
