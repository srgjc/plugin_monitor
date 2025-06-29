package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum SetFunctionBreakpointsRequestCommand {
    SET_FUNCTION_BREAKPOINTS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SET_FUNCTION_BREAKPOINTS: return "setFunctionBreakpoints";
        }
        return null;
    }

    @JsonCreator
    public static SetFunctionBreakpointsRequestCommand forValue(String value) throws IOException {
        if (value.equals("setFunctionBreakpoints")) return SET_FUNCTION_BREAKPOINTS;
        throw new IOException("Cannot deserialize SetFunctionBreakpointsRequestCommand");
    }
}
