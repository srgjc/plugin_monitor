package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Represents a single disassembled instruction.
 */
public class DisassembledInstruction {
    private String address;
    private Long column;
    private Long endColumn;
    private Long endLine;
    private String instruction;
    private String instructionBytes;
    private Long line;
    private Source location;
    private DisassembledInstructionPresentationHint presentationHint;
    private String symbol;

    /**
     * The address of the instruction. Treated as a hex value if prefixed with `0x`, or as a
     * decimal value otherwise.
     */
    @JsonProperty("address")
    public String getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(String value) { this.address = value; }

    /**
     * The column within the line that corresponds to this instruction, if any.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * The end column of the range that corresponds to this instruction, if any.
     */
    @JsonProperty("endColumn")
    public Long getEndColumn() { return endColumn; }
    @JsonProperty("endColumn")
    public void setEndColumn(Long value) { this.endColumn = value; }

    /**
     * The end line of the range that corresponds to this instruction, if any.
     */
    @JsonProperty("endLine")
    public Long getEndLine() { return endLine; }
    @JsonProperty("endLine")
    public void setEndLine(Long value) { this.endLine = value; }

    /**
     * Text representing the instruction and its operands, in an implementation-defined format.
     */
    @JsonProperty("instruction")
    public String getInstruction() { return instruction; }
    @JsonProperty("instruction")
    public void setInstruction(String value) { this.instruction = value; }

    /**
     * Raw bytes representing the instruction and its operands, in an implementation-defined
     * format.
     */
    @JsonProperty("instructionBytes")
    public String getInstructionBytes() { return instructionBytes; }
    @JsonProperty("instructionBytes")
    public void setInstructionBytes(String value) { this.instructionBytes = value; }

    /**
     * The line within the source location that corresponds to this instruction, if any.
     */
    @JsonProperty("line")
    public Long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(Long value) { this.line = value; }

    /**
     * Source location that corresponds to this instruction, if any.
     * Should always be set (if available) on the first instruction returned,
     * but can be omitted afterwards if this instruction maps to the same source file as the
     * previous instruction.
     */
    @JsonProperty("location")
    public Source getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(Source value) { this.location = value; }

    /**
     * A hint for how to present the instruction in the UI.
     *
     * A value of `invalid` may be used to indicate this instruction is 'filler' and cannot be
     * reached by the program. For example, unreadable memory addresses may be presented is
     * 'invalid.'
     */
    @JsonProperty("presentationHint")
    public DisassembledInstructionPresentationHint getPresentationHint() { return presentationHint; }
    @JsonProperty("presentationHint")
    public void setPresentationHint(DisassembledInstructionPresentationHint value) { this.presentationHint = value; }

    /**
     * Name of the symbol that corresponds with the location of this instruction, if any.
     */
    @JsonProperty("symbol")
    public String getSymbol() { return symbol; }
    @JsonProperty("symbol")
    public void setSymbol(String value) { this.symbol = value; }
}
