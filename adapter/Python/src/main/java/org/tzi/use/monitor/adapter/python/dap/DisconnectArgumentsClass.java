package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `disconnect` request.
 */
public class DisconnectArgumentsClass {
    private Boolean restart;
    private Boolean suspendDebuggee;
    private Boolean terminateDebuggee;

    /**
     * A value of true indicates that this `disconnect` request is part of a restart sequence.
     */
    @JsonProperty("restart")
    public Boolean getRestart() { return restart; }
    @JsonProperty("restart")
    public void setRestart(Boolean value) { this.restart = value; }

    /**
     * Indicates whether the debuggee should stay suspended when the debugger is disconnected.
     * If unspecified, the debuggee should resume execution.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportSuspendDebuggee` is true.
     */
    @JsonProperty("suspendDebuggee")
    public Boolean getSuspendDebuggee() { return suspendDebuggee; }
    @JsonProperty("suspendDebuggee")
    public void setSuspendDebuggee(Boolean value) { this.suspendDebuggee = value; }

    /**
     * Indicates whether the debuggee should be terminated when the debugger is disconnected.
     * If unspecified, the debug adapter is free to do whatever it thinks is best.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportTerminateDebuggee` is true.
     */
    @JsonProperty("terminateDebuggee")
    public Boolean getTerminateDebuggee() { return terminateDebuggee; }
    @JsonProperty("terminateDebuggee")
    public void setTerminateDebuggee(Boolean value) { this.terminateDebuggee = value; }
}
