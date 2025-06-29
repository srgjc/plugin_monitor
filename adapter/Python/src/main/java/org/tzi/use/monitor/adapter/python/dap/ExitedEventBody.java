package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ExitedEventBody {
    private long exitCode;

    /**
     * The exit code returned from the debuggee.
     */
    @JsonProperty("exitCode")
    public long getExitCode() { return exitCode; }
    @JsonProperty("exitCode")
    public void setExitCode(long value) { this.exitCode = value; }
}
