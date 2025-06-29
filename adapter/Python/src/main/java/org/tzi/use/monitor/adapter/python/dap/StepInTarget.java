package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * A `StepInTarget` can be used in the `stepIn` request and determines into which single
 * target the `stepIn` request should step.
 */
public class StepInTarget {
    private Long column;
    private Long endColumn;
    private Long endLine;
    private long id;
    private String label;
    private Long line;

    /**
     * Start position of the range covered by the step in target. It is measured in UTF-16 code
     * units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * End position of the range covered by the step in target. It is measured in UTF-16 code
     * units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     */
    @JsonProperty("endColumn")
    public Long getEndColumn() { return endColumn; }
    @JsonProperty("endColumn")
    public void setEndColumn(Long value) { this.endColumn = value; }

    /**
     * The end line of the range covered by the step-in target.
     */
    @JsonProperty("endLine")
    public Long getEndLine() { return endLine; }
    @JsonProperty("endLine")
    public void setEndLine(Long value) { this.endLine = value; }

    /**
     * Unique identifier for a step-in target.
     */
    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    /**
     * The name of the step-in target (shown in the UI).
     */
    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    /**
     * The line of the step-in target.
     */
    @JsonProperty("line")
    public Long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(Long value) { this.line = value; }
}
