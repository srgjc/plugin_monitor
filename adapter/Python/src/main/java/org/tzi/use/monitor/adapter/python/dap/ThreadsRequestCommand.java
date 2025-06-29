package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ThreadsRequestCommand {
    THREADS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case THREADS: return "threads";
        }
        return null;
    }

    @JsonCreator
    public static ThreadsRequestCommand forValue(String value) throws IOException {
        if (value.equals("threads")) return THREADS;
        throw new IOException("Cannot deserialize ThreadsRequestCommand");
    }
}
