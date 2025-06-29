package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `setBreakpoints` request.
 */
public class SetBreakpointsArgumentsClass {
    private SourceBreakpoint[] breakpoints;
    private long[] lines;
    private Source source;
    private Boolean sourceModified;

    /**
     * The code locations of the breakpoints.
     */
    @JsonProperty("breakpoints")
    public SourceBreakpoint[] getBreakpoints() { return breakpoints; }
    @JsonProperty("breakpoints")
    public void setBreakpoints(SourceBreakpoint[] value) { this.breakpoints = value; }

    /**
     * Deprecated: The code locations of the breakpoints.
     */
    @JsonProperty("lines")
    public long[] getLines() { return lines; }
    @JsonProperty("lines")
    public void setLines(long[] value) { this.lines = value; }

    /**
     * The source location of the breakpoints; either `source.path` or `source.sourceReference`
     * must be specified.
     */
    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }

    /**
     * A value of true indicates that the underlying source has been modified which results in
     * new breakpoint locations.
     */
    @JsonProperty("sourceModified")
    public Boolean getSourceModified() { return sourceModified; }
    @JsonProperty("sourceModified")
    public void setSourceModified(Boolean value) { this.sourceModified = value; }
}
