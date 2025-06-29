package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * A `GotoTarget` describes a code location that can be used as a target in the `goto`
 * request.
 * The possible goto targets can be determined via the `gotoTargets` request.
 */
public class GotoTarget {
    private Long column;
    private Long endColumn;
    private Long endLine;
    private long id;
    private String instructionPointerReference;
    private String label;
    private long line;

    /**
     * The column of the goto target.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * The end column of the range covered by the goto target.
     */
    @JsonProperty("endColumn")
    public Long getEndColumn() { return endColumn; }
    @JsonProperty("endColumn")
    public void setEndColumn(Long value) { this.endColumn = value; }

    /**
     * The end line of the range covered by the goto target.
     */
    @JsonProperty("endLine")
    public Long getEndLine() { return endLine; }
    @JsonProperty("endLine")
    public void setEndLine(Long value) { this.endLine = value; }

    /**
     * Unique identifier for a goto target. This is used in the `goto` request.
     */
    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    /**
     * A memory reference for the instruction pointer value represented by this target.
     */
    @JsonProperty("instructionPointerReference")
    public String getInstructionPointerReference() { return instructionPointerReference; }
    @JsonProperty("instructionPointerReference")
    public void setInstructionPointerReference(String value) { this.instructionPointerReference = value; }

    /**
     * The name of the goto target (shown in the UI).
     */
    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    /**
     * The line of the goto target.
     */
    @JsonProperty("line")
    public long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(long value) { this.line = value; }
}
