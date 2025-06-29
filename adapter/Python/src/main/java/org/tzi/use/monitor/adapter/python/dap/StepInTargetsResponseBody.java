package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class StepInTargetsResponseBody {
    private StepInTarget[] targets;

    /**
     * The possible step-in targets of the specified source location.
     */
    @JsonProperty("targets")
    public StepInTarget[] getTargets() { return targets; }
    @JsonProperty("targets")
    public void setTargets(StepInTarget[] value) { this.targets = value; }
}
