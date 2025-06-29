package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ContinuedEventBody {
    private Boolean allThreadsContinued;
    private long threadID;

    /**
     * If `allThreadsContinued` is true, a debug adapter can announce that all threads have
     * continued.
     */
    @JsonProperty("allThreadsContinued")
    public Boolean getAllThreadsContinued() { return allThreadsContinued; }
    @JsonProperty("allThreadsContinued")
    public void setAllThreadsContinued(Boolean value) { this.allThreadsContinued = value; }

    /**
     * The thread which was continued.
     */
    @JsonProperty("threadId")
    public long getThreadID() { return threadID; }
    @JsonProperty("threadId")
    public void setThreadID(long value) { this.threadID = value; }
}
