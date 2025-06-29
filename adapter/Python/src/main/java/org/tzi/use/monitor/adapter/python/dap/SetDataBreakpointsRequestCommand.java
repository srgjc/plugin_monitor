package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum SetDataBreakpointsRequestCommand {
    SET_DATA_BREAKPOINTS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SET_DATA_BREAKPOINTS: return "setDataBreakpoints";
        }
        return null;
    }

    @JsonCreator
    public static SetDataBreakpointsRequestCommand forValue(String value) throws IOException {
        if (value.equals("setDataBreakpoints")) return SET_DATA_BREAKPOINTS;
        throw new IOException("Cannot deserialize SetDataBreakpointsRequestCommand");
    }
}
