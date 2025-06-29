package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ThreadEventEvent {
    THREAD;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THREAD: return "thread";
        }
        return null;
    }

    @JsonCreator
    public static ThreadEventEvent forValue(String value) throws IOException {
        if (value.equals("thread")) return THREAD;
        throw new IOException("Cannot deserialize ThreadEventEvent");
    }
}
