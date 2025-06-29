package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum BreakpointEventEvent {
    BREAKPOINT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BREAKPOINT: return "breakpoint";
        }
        return null;
    }

    @JsonCreator
    public static BreakpointEventEvent forValue(String value) throws IOException {
        if (value.equals("breakpoint")) return BREAKPOINT;
        throw new IOException("Cannot deserialize BreakpointEventEvent");
    }
}
