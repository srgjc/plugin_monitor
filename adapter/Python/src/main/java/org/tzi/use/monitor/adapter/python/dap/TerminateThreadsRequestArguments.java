package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `terminateThreads` request.
 */
public class TerminateThreadsRequestArguments {
    private long[] threadIDS;

    /**
     * Ids of threads to be terminated.
     */
    @JsonProperty("threadIds")
    public long[] getThreadIDS() { return threadIDS; }
    @JsonProperty("threadIds")
    public void setThreadIDS(long[] value) { this.threadIDS = value; }
}
