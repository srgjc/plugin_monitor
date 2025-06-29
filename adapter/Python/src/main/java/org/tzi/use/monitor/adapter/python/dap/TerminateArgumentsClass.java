package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `terminate` request.
 */
public class TerminateArgumentsClass {
    private Boolean restart;

    /**
     * A value of true indicates that this `terminate` request is part of a restart sequence.
     */
    @JsonProperty("restart")
    public Boolean getRestart() { return restart; }
    @JsonProperty("restart")
    public void setRestart(Boolean value) { this.restart = value; }
}
