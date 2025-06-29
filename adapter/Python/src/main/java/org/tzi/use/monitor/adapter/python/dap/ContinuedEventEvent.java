package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ContinuedEventEvent {
    CONTINUED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONTINUED: return "continued";
        }
        return null;
    }

    @JsonCreator
    public static ContinuedEventEvent forValue(String value) throws IOException {
        if (value.equals("continued")) return CONTINUED;
        throw new IOException("Cannot deserialize ContinuedEventEvent");
    }
}
