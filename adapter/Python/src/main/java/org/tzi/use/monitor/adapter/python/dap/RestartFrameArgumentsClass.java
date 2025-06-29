package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `restartFrame` request.
 */
public class RestartFrameArgumentsClass {
    private long frameID;

    /**
     * Restart the stack frame identified by `frameId`. The `frameId` must have been obtained in
     * the current suspended state. See 'Lifetime of Object References' in the Overview section
     * for details.
     */
    @JsonProperty("frameId")
    public long getFrameID() { return frameID; }
    @JsonProperty("frameId")
    public void setFrameID(long value) { this.frameID = value; }
}
