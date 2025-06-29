package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `launch` request. Additional attributes are implementation specific.
 */
public class LaunchRequestArgumentsClass {
    private Restart restart;
    private Boolean noDebug;

    /**
     * Arbitrary data from the previous, restarted session.
     * The data is sent as the `restart` attribute of the `terminated` event.
     * The client should leave the data intact.
     */
    @JsonProperty("__restart")
    public Restart getRestart() { return restart; }
    @JsonProperty("__restart")
    public void setRestart(Restart value) { this.restart = value; }

    /**
     * If true, the launch request should launch the program without enabling debugging.
     */
    @JsonProperty("noDebug")
    public Boolean getNoDebug() { return noDebug; }
    @JsonProperty("noDebug")
    public void setNoDebug(Boolean value) { this.noDebug = value; }
}
