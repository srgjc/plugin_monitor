package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `disassemble` request.
 */
public class DisassembleRequestArguments {
    private long instructionCount;
    private Long instructionOffset;
    private String memoryReference;
    private Long offset;
    private Boolean resolveSymbols;

    /**
     * Number of instructions to disassemble starting at the specified location and offset.
     * An adapter must return exactly this number of instructions - any unavailable instructions
     * should be replaced with an implementation-defined 'invalid instruction' value.
     */
    @JsonProperty("instructionCount")
    public long getInstructionCount() { return instructionCount; }
    @JsonProperty("instructionCount")
    public void setInstructionCount(long value) { this.instructionCount = value; }

    /**
     * Offset (in instructions) to be applied after the byte offset (if any) before
     * disassembling. Can be negative.
     */
    @JsonProperty("instructionOffset")
    public Long getInstructionOffset() { return instructionOffset; }
    @JsonProperty("instructionOffset")
    public void setInstructionOffset(Long value) { this.instructionOffset = value; }

    /**
     * Memory reference to the base location containing the instructions to disassemble.
     */
    @JsonProperty("memoryReference")
    public String getMemoryReference() { return memoryReference; }
    @JsonProperty("memoryReference")
    public void setMemoryReference(String value) { this.memoryReference = value; }

    /**
     * Offset (in bytes) to be applied to the reference location before disassembling. Can be
     * negative.
     */
    @JsonProperty("offset")
    public Long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(Long value) { this.offset = value; }

    /**
     * If true, the adapter should attempt to resolve memory addresses and other values to
     * symbolic names.
     */
    @JsonProperty("resolveSymbols")
    public Boolean getResolveSymbols() { return resolveSymbols; }
    @JsonProperty("resolveSymbols")
    public void setResolveSymbols(Boolean value) { this.resolveSymbols = value; }
}
