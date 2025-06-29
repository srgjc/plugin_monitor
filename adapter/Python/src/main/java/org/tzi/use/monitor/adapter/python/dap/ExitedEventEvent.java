package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ExitedEventEvent {
    EXITED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXITED: return "exited";
        }
        return null;
    }

    @JsonCreator
    public static ExitedEventEvent forValue(String value) throws IOException {
        if (value.equals("exited")) return EXITED;
        throw new IOException("Cannot deserialize ExitedEventEvent");
    }
}
