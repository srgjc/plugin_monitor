package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `goto` request.
 */
public class GotoArgumentsClass {
    private long targetID;
    private long threadID;

    /**
     * The location where the debuggee will continue to run.
     */
    @JsonProperty("targetId")
    public long getTargetID() { return targetID; }
    @JsonProperty("targetId")
    public void setTargetID(long value) { this.targetID = value; }

    /**
     * Set the goto target for this thread.
     */
    @JsonProperty("threadId")
    public long getThreadID() { return threadID; }
    @JsonProperty("threadId")
    public void setThreadID(long value) { this.threadID = value; }
}
