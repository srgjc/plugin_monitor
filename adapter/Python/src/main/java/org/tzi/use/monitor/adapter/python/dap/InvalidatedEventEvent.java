package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum InvalidatedEventEvent {
    INVALIDATED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INVALIDATED: return "invalidated";
        }
        return null;
    }

    @JsonCreator
    public static InvalidatedEventEvent forValue(String value) throws IOException {
        if (value.equals("invalidated")) return INVALIDATED;
        throw new IOException("Cannot deserialize InvalidatedEventEvent");
    }
}
