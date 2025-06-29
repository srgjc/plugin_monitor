package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Information about a breakpoint created in `setBreakpoints`, `setFunctionBreakpoints`,
 * `setInstructionBreakpoints`, or `setDataBreakpoints` requests.
 *
 * The `id` attribute is used to find the target breakpoint, the other attributes are used
 * as the new values.
 */
public class Breakpoint {
    private Long column;
    private Long endColumn;
    private Long endLine;
    private Long id;
    private String instructionReference;
    private Long line;
    private String message;
    private Long offset;
    private BreakpointReason reason;
    private Source source;
    private boolean verified;

    /**
     * Start position of the source range covered by the breakpoint. It is measured in UTF-16
     * code units and the client capability `columnsStartAt1` determines whether it is 0- or
     * 1-based.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * End position of the source range covered by the breakpoint. It is measured in UTF-16 code
     * units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * If no end line is given, then the end column is assumed to be in the start line.
     */
    @JsonProperty("endColumn")
    public Long getEndColumn() { return endColumn; }
    @JsonProperty("endColumn")
    public void setEndColumn(Long value) { this.endColumn = value; }

    /**
     * The end line of the actual range covered by the breakpoint.
     */
    @JsonProperty("endLine")
    public Long getEndLine() { return endLine; }
    @JsonProperty("endLine")
    public void setEndLine(Long value) { this.endLine = value; }

    /**
     * The identifier for the breakpoint. It is needed if breakpoint events are used to update
     * or remove breakpoints.
     */
    @JsonProperty("id")
    public Long getID() { return id; }
    @JsonProperty("id")
    public void setID(Long value) { this.id = value; }

    /**
     * A memory reference to where the breakpoint is set.
     */
    @JsonProperty("instructionReference")
    public String getInstructionReference() { return instructionReference; }
    @JsonProperty("instructionReference")
    public void setInstructionReference(String value) { this.instructionReference = value; }

    /**
     * The start line of the actual range covered by the breakpoint.
     */
    @JsonProperty("line")
    public Long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(Long value) { this.line = value; }

    /**
     * A message about the state of the breakpoint.
     * This is shown to the user and can be used to explain why a breakpoint could not be
     * verified.
     */
    @JsonProperty("message")
    public String getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(String value) { this.message = value; }

    /**
     * The offset from the instruction reference.
     * This can be negative.
     */
    @JsonProperty("offset")
    public Long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(Long value) { this.offset = value; }

    /**
     * A machine-readable explanation of why a breakpoint may not be verified. If a breakpoint
     * is verified or a specific reason is not known, the adapter should omit this property.
     * Possible values include:
     *
     * - `pending`: Indicates a breakpoint might be verified in the future, but the adapter
     * cannot verify it in the current state.
     * - `failed`: Indicates a breakpoint was not able to be verified, and the adapter does not
     * believe it can be verified without intervention.
     */
    @JsonProperty("reason")
    public BreakpointReason getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(BreakpointReason value) { this.reason = value; }

    /**
     * The source where the breakpoint is located.
     */
    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }

    /**
     * If true, the breakpoint could be set (but not necessarily at the desired location).
     */
    @JsonProperty("verified")
    public boolean getVerified() { return verified; }
    @JsonProperty("verified")
    public void setVerified(boolean value) { this.verified = value; }
}
