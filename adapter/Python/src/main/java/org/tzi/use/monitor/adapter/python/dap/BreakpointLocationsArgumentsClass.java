package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `breakpointLocations` request.
 */
public class BreakpointLocationsArgumentsClass {
    private Long column;
    private Long endColumn;
    private Long endLine;
    private long line;
    private Source source;

    /**
     * Start position within `line` to search possible breakpoint locations in. It is measured
     * in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is
     * 0- or 1-based. If no column is given, the first position in the start line is assumed.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * End position within `endLine` to search possible breakpoint locations in. It is measured
     * in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is
     * 0- or 1-based. If no end column is given, the last position in the end line is assumed.
     */
    @JsonProperty("endColumn")
    public Long getEndColumn() { return endColumn; }
    @JsonProperty("endColumn")
    public void setEndColumn(Long value) { this.endColumn = value; }

    /**
     * End line of range to search possible breakpoint locations in. If no end line is given,
     * then the end line is assumed to be the start line.
     */
    @JsonProperty("endLine")
    public Long getEndLine() { return endLine; }
    @JsonProperty("endLine")
    public void setEndLine(Long value) { this.endLine = value; }

    /**
     * Start line of range to search possible breakpoint locations in. If only the line is
     * specified, the request returns all possible locations in that line.
     */
    @JsonProperty("line")
    public long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(long value) { this.line = value; }

    /**
     * The source location of the breakpoints; either `source.path` or `source.sourceReference`
     * must be specified.
     */
    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }
}
