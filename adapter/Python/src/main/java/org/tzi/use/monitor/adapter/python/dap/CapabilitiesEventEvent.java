package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum CapabilitiesEventEvent {
    CAPABILITIES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CAPABILITIES: return "capabilities";
        }
        return null;
    }

    @JsonCreator
    public static CapabilitiesEventEvent forValue(String value) throws IOException {
        if (value.equals("capabilities")) return CAPABILITIES;
        throw new IOException("Cannot deserialize CapabilitiesEventEvent");
    }
}
