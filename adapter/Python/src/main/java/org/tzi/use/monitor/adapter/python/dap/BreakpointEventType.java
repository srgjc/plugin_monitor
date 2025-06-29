package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum BreakpointEventType {
    EVENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EVENT: return "event";
        }
        return null;
    }

    @JsonCreator
    public static BreakpointEventType forValue(String value) throws IOException {
        if (value.equals("event")) return EVENT;
        throw new IOException("Cannot deserialize BreakpointEventType");
    }
}
