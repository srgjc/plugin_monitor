package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum MemoryEventEvent {
    MEMORY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MEMORY: return "memory";
        }
        return null;
    }

    @JsonCreator
    public static MemoryEventEvent forValue(String value) throws IOException {
        if (value.equals("memory")) return MEMORY;
        throw new IOException("Cannot deserialize MemoryEventEvent");
    }
}
