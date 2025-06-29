package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum InitializedEventEvent {
    INITIALIZED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INITIALIZED: return "initialized";
        }
        return null;
    }

    @JsonCreator
    public static InitializedEventEvent forValue(String value) throws IOException {
        if (value.equals("initialized")) return INITIALIZED;
        throw new IOException("Cannot deserialize InitializedEventEvent");
    }
}
