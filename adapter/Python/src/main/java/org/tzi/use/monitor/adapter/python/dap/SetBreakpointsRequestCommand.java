package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum SetBreakpointsRequestCommand {
    SET_BREAKPOINTS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SET_BREAKPOINTS: return "setBreakpoints";
        }
        return null;
    }

    @JsonCreator
    public static SetBreakpointsRequestCommand forValue(String value) throws IOException {
        if (value.equals("setBreakpoints")) return SET_BREAKPOINTS;
        throw new IOException("Cannot deserialize SetBreakpointsRequestCommand");
    }
}
