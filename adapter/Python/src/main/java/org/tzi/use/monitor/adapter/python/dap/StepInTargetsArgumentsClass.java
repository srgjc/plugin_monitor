package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `stepInTargets` request.
 */
public class StepInTargetsArgumentsClass {
    private long frameID;

    /**
     * The stack frame for which to retrieve the possible step-in targets.
     */
    @JsonProperty("frameId")
    public long getFrameID() { return frameID; }
    @JsonProperty("frameId")
    public void setFrameID(long value) { this.frameID = value; }
}
