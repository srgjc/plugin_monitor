package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `stackTrace` request.
 */
public class StackTraceArgumentsClass {
    private StackFrameFormat format;
    private Long levels;
    private Long startFrame;
    private long threadID;

    /**
     * Specifies details on how to format the stack frames.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportsValueFormattingOptions` is true.
     */
    @JsonProperty("format")
    public StackFrameFormat getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(StackFrameFormat value) { this.format = value; }

    /**
     * The maximum number of frames to return. If levels is not specified or 0, all frames are
     * returned.
     */
    @JsonProperty("levels")
    public Long getLevels() { return levels; }
    @JsonProperty("levels")
    public void setLevels(Long value) { this.levels = value; }

    /**
     * The index of the first frame to return; if omitted frames start at 0.
     */
    @JsonProperty("startFrame")
    public Long getStartFrame() { return startFrame; }
    @JsonProperty("startFrame")
    public void setStartFrame(Long value) { this.startFrame = value; }

    /**
     * Retrieve the stacktrace for this thread.
     */
    @JsonProperty("threadId")
    public long getThreadID() { return threadID; }
    @JsonProperty("threadId")
    public void setThreadID(long value) { this.threadID = value; }
}
