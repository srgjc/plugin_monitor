package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class TerminatedEventBody {
    private Restart restart;

    /**
     * A debug adapter may set `restart` to true (or to an arbitrary object) to request that the
     * client restarts the session.
     * The value is not interpreted by the client and passed unmodified as an attribute
     * `__restart` to the `launch` and `attach` requests.
     */
    @JsonProperty("restart")
    public Restart getRestart() { return restart; }
    @JsonProperty("restart")
    public void setRestart(Restart value) { this.restart = value; }
}
