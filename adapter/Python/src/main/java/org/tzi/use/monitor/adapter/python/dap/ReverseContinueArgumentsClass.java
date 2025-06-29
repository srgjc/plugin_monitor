package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `reverseContinue` request.
 */
public class ReverseContinueArgumentsClass {
    private Boolean singleThread;
    private long threadID;

    /**
     * If this flag is true, backward execution is resumed only for the thread with given
     * `threadId`.
     */
    @JsonProperty("singleThread")
    public Boolean getSingleThread() { return singleThread; }
    @JsonProperty("singleThread")
    public void setSingleThread(Boolean value) { this.singleThread = value; }

    /**
     * Specifies the active thread. If the debug adapter supports single thread execution (see
     * `supportsSingleThreadExecutionRequests`) and the `singleThread` argument is true, only
     * the thread with this ID is resumed.
     */
    @JsonProperty("threadId")
    public long getThreadID() { return threadID; }
    @JsonProperty("threadId")
    public void setThreadID(long value) { this.threadID = value; }
}
