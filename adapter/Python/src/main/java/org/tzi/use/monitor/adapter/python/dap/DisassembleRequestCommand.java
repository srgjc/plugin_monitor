package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum DisassembleRequestCommand {
    DISASSEMBLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DISASSEMBLE: return "disassemble";
        }
        return null;
    }

    @JsonCreator
    public static DisassembleRequestCommand forValue(String value) throws IOException {
        if (value.equals("disassemble")) return DISASSEMBLE;
        throw new IOException("Cannot deserialize DisassembleRequestCommand");
    }
}
