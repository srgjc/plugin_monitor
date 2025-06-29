package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `attach` request. Additional attributes are implementation specific.
 */
public class ArgumentsClass {
    private Restart restart;

    /**
     * Arbitrary data from the previous, restarted session.
     * The data is sent as the `restart` attribute of the `terminated` event.
     * The client should leave the data intact.
     */
    @JsonProperty("__restart")
    public Restart getRestart() { return restart; }
    @JsonProperty("__restart")
    public void setRestart(Restart value) { this.restart = value; }
}
