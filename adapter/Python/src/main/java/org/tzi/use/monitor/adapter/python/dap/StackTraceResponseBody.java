package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class StackTraceResponseBody {
    private StackFrame[] stackFrames;
    private Long totalFrames;

    /**
     * The frames of the stack frame. If the array has length zero, there are no stack frames
     * available.
     * This means that there is no location information available.
     */
    @JsonProperty("stackFrames")
    public StackFrame[] getStackFrames() { return stackFrames; }
    @JsonProperty("stackFrames")
    public void setStackFrames(StackFrame[] value) { this.stackFrames = value; }

    /**
     * The total number of frames available in the stack. If omitted or if `totalFrames` is
     * larger than the available frames, a client is expected to request frames until a request
     * returns less frames than requested (which indicates the end of the stack). Returning
     * monotonically increasing `totalFrames` values for subsequent requests can be used to
     * enforce paging in the client.
     */
    @JsonProperty("totalFrames")
    public Long getTotalFrames() { return totalFrames; }
    @JsonProperty("totalFrames")
    public void setTotalFrames(Long value) { this.totalFrames = value; }
}
