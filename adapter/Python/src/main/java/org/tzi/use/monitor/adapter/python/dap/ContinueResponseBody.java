package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ContinueResponseBody {
    private Boolean allThreadsContinued;

    /**
     * The value true (or a missing property) signals to the client that all threads have been
     * resumed. The value false indicates that not all threads were resumed.
     */
    @JsonProperty("allThreadsContinued")
    public Boolean getAllThreadsContinued() { return allThreadsContinued; }
    @JsonProperty("allThreadsContinued")
    public void setAllThreadsContinued(Boolean value) { this.allThreadsContinued = value; }
}
