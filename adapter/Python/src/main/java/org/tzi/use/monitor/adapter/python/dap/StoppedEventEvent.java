package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum StoppedEventEvent {
    STOPPED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case STOPPED: return "stopped";
        }
        return null;
    }

    @JsonCreator
    public static StoppedEventEvent forValue(String value) throws IOException {
        if (value.equals("stopped")) return STOPPED;
        throw new IOException("Cannot deserialize StoppedEventEvent");
    }
}
