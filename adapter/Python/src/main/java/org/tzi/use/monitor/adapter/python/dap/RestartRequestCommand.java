package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum RestartRequestCommand {
    RESTART;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RESTART: return "restart";
        }
        return null;
    }

    @JsonCreator
    public static RestartRequestCommand forValue(String value) throws IOException {
        if (value.equals("restart")) return RESTART;
        throw new IOException("Cannot deserialize RestartRequestCommand");
    }
}
