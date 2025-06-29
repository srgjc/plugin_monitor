package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class GotoTargetsResponseBody {
    private GotoTarget[] targets;

    /**
     * The possible goto targets of the specified location.
     */
    @JsonProperty("targets")
    public GotoTarget[] getTargets() { return targets; }
    @JsonProperty("targets")
    public void setTargets(GotoTarget[] value) { this.targets = value; }
}
