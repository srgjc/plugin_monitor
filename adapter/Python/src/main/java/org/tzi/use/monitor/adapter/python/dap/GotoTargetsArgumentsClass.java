package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `gotoTargets` request.
 */
public class GotoTargetsArgumentsClass {
    private Long column;
    private long line;
    private Source source;

    /**
     * The position within `line` for which the goto targets are determined. It is measured in
     * UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0-
     * or 1-based.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * The line location for which the goto targets are determined.
     */
    @JsonProperty("line")
    public long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(long value) { this.line = value; }

    /**
     * The source location for which the goto targets are determined.
     */
    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }
}
