package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class RunInTerminalResponseBody {
    private Long processID;
    private Long shellProcessID;

    /**
     * The process ID. The value should be less than or equal to 2147483647 (2^31-1).
     */
    @JsonProperty("processId")
    public Long getProcessID() { return processID; }
    @JsonProperty("processId")
    public void setProcessID(Long value) { this.processID = value; }

    /**
     * The process ID of the terminal shell. The value should be less than or equal to
     * 2147483647 (2^31-1).
     */
    @JsonProperty("shellProcessId")
    public Long getShellProcessID() { return shellProcessID; }
    @JsonProperty("shellProcessId")
    public void setShellProcessID(Long value) { this.shellProcessID = value; }
}
