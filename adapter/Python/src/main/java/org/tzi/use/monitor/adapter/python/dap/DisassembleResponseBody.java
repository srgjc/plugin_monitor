package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class DisassembleResponseBody {
    private DisassembledInstruction[] instructions;

    /**
     * The list of disassembled instructions.
     */
    @JsonProperty("instructions")
    public DisassembledInstruction[] getInstructions() { return instructions; }
    @JsonProperty("instructions")
    public void setInstructions(DisassembledInstruction[] value) { this.instructions = value; }
}
