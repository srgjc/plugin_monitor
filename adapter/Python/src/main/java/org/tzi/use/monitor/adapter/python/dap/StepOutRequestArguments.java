package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `stepOut` request.
 */
public class StepOutRequestArguments {
    private SteppingGranularity granularity;
    private Boolean singleThread;
    private long threadID;

    /**
     * Stepping granularity. If no granularity is specified, a granularity of `statement` is
     * assumed.
     */
    @JsonProperty("granularity")
    public SteppingGranularity getGranularity() { return granularity; }
    @JsonProperty("granularity")
    public void setGranularity(SteppingGranularity value) { this.granularity = value; }

    /**
     * If this flag is true, all other suspended threads are not resumed.
     */
    @JsonProperty("singleThread")
    public Boolean getSingleThread() { return singleThread; }
    @JsonProperty("singleThread")
    public void setSingleThread(Boolean value) { this.singleThread = value; }

    /**
     * Specifies the thread for which to resume execution for one step-out (of the given
     * granularity).
     */
    @JsonProperty("threadId")
    public long getThreadID() { return threadID; }
    @JsonProperty("threadId")
    public void setThreadID(long value) { this.threadID = value; }
}
