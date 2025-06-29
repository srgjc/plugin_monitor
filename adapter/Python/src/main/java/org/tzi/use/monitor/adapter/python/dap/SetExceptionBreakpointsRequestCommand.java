package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum SetExceptionBreakpointsRequestCommand {
    SET_EXCEPTION_BREAKPOINTS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SET_EXCEPTION_BREAKPOINTS: return "setExceptionBreakpoints";
        }
        return null;
    }

    @JsonCreator
    public static SetExceptionBreakpointsRequestCommand forValue(String value) throws IOException {
        if (value.equals("setExceptionBreakpoints")) return SET_EXCEPTION_BREAKPOINTS;
        throw new IOException("Cannot deserialize SetExceptionBreakpointsRequestCommand");
    }
}
