package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum LaunchRequestCommand {
    LAUNCH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LAUNCH: return "launch";
        }
        return null;
    }

    @JsonCreator
    public static LaunchRequestCommand forValue(String value) throws IOException {
        if (value.equals("launch")) return LAUNCH;
        throw new IOException("Cannot deserialize LaunchRequestCommand");
    }
}
