package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum OutputEventEvent {
    OUTPUT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OUTPUT: return "output";
        }
        return null;
    }

    @JsonCreator
    public static OutputEventEvent forValue(String value) throws IOException {
        if (value.equals("output")) return OUTPUT;
        throw new IOException("Cannot deserialize OutputEventEvent");
    }
}
