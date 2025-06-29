package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * A hint for how to present the instruction in the UI.
 *
 * A value of `invalid` may be used to indicate this instruction is 'filler' and cannot be
 * reached by the program. For example, unreadable memory addresses may be presented is
 * 'invalid.'
 */
public enum DisassembledInstructionPresentationHint {
    INVALID, NORMAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INVALID: return "invalid";
            case NORMAL: return "normal";
        }
        return null;
    }

    @JsonCreator
    public static DisassembledInstructionPresentationHint forValue(String value) throws IOException {
        if (value.equals("invalid")) return INVALID;
        if (value.equals("normal")) return NORMAL;
        throw new IOException("Cannot deserialize DisassembledInstructionPresentationHint");
    }
}
