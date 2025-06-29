package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum SetInstructionBreakpointsRequestCommand {
    SET_INSTRUCTION_BREAKPOINTS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SET_INSTRUCTION_BREAKPOINTS: return "setInstructionBreakpoints";
        }
        return null;
    }

    @JsonCreator
    public static SetInstructionBreakpointsRequestCommand forValue(String value) throws IOException {
        if (value.equals("setInstructionBreakpoints")) return SET_INSTRUCTION_BREAKPOINTS;
        throw new IOException("Cannot deserialize SetInstructionBreakpointsRequestCommand");
    }
}
