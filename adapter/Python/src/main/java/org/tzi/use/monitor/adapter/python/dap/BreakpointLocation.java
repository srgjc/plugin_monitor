package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Properties of a breakpoint location returned from the `breakpointLocations` request.
 */
public class BreakpointLocation {
    private Long column;
    private Long endColumn;
    private Long endLine;
    private long line;

    /**
     * The start position of a breakpoint location. Position is measured in UTF-16 code units
     * and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * The end position of a breakpoint location (if the location covers a range). Position is
     * measured in UTF-16 code units and the client capability `columnsStartAt1` determines
     * whether it is 0- or 1-based.
     */
    @JsonProperty("endColumn")
    public Long getEndColumn() { return endColumn; }
    @JsonProperty("endColumn")
    public void setEndColumn(Long value) { this.endColumn = value; }

    /**
     * The end line of breakpoint location if the location covers a range.
     */
    @JsonProperty("endLine")
    public Long getEndLine() { return endLine; }
    @JsonProperty("endLine")
    public void setEndLine(Long value) { this.endLine = value; }

    /**
     * Start line of breakpoint location.
     */
    @JsonProperty("line")
    public long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(long value) { this.line = value; }
}
