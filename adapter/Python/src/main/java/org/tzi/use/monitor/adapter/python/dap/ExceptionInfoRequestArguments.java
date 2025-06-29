package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `exceptionInfo` request.
 */
public class ExceptionInfoRequestArguments {
    private long threadID;

    /**
     * Thread for which exception information should be retrieved.
     */
    @JsonProperty("threadId")
    public long getThreadID() { return threadID; }
    @JsonProperty("threadId")
    public void setThreadID(long value) { this.threadID = value; }
}
