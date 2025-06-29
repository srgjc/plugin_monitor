package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ReadMemoryRequestCommand {
    READ_MEMORY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case READ_MEMORY: return "readMemory";
        }
        return null;
    }

    @JsonCreator
    public static ReadMemoryRequestCommand forValue(String value) throws IOException {
        if (value.equals("readMemory")) return READ_MEMORY;
        throw new IOException("Cannot deserialize ReadMemoryRequestCommand");
    }
}
