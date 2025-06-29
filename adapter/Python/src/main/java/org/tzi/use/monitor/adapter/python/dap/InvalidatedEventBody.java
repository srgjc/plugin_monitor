package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class InvalidatedEventBody {
    private String[] areas;
    private Long stackFrameID;
    private Long threadID;

    /**
     * Set of logical areas that got invalidated. This property has a hint characteristic: a
     * client can only be expected to make a 'best effort' in honoring the areas but there are
     * no guarantees. If this property is missing, empty, or if values are not understood, the
     * client should assume a single value `all`.
     */
    @JsonProperty("areas")
    public String[] getAreas() { return areas; }
    @JsonProperty("areas")
    public void setAreas(String[] value) { this.areas = value; }

    /**
     * If specified, the client only needs to refetch data related to this stack frame (and the
     * `threadId` is ignored).
     */
    @JsonProperty("stackFrameId")
    public Long getStackFrameID() { return stackFrameID; }
    @JsonProperty("stackFrameId")
    public void setStackFrameID(Long value) { this.stackFrameID = value; }

    /**
     * If specified, the client only needs to refetch data related to this thread.
     */
    @JsonProperty("threadId")
    public Long getThreadID() { return threadID; }
    @JsonProperty("threadId")
    public void setThreadID(Long value) { this.threadID = value; }
}
