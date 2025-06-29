package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum TerminatedEventEvent {
    TERMINATED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TERMINATED: return "terminated";
        }
        return null;
    }

    @JsonCreator
    public static TerminatedEventEvent forValue(String value) throws IOException {
        if (value.equals("terminated")) return TERMINATED;
        throw new IOException("Cannot deserialize TerminatedEventEvent");
    }
}
