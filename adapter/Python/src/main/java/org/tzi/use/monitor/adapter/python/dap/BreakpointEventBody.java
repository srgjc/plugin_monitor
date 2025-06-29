package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class BreakpointEventBody {
    private Breakpoint breakpoint;
    private String reason;

    /**
     * The `id` attribute is used to find the target breakpoint, the other attributes are used
     * as the new values.
     */
    @JsonProperty("breakpoint")
    public Breakpoint getBreakpoint() { return breakpoint; }
    @JsonProperty("breakpoint")
    public void setBreakpoint(Breakpoint value) { this.breakpoint = value; }

    /**
     * The reason for the event.
     */
    @JsonProperty("reason")
    public String getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(String value) { this.reason = value; }
}
