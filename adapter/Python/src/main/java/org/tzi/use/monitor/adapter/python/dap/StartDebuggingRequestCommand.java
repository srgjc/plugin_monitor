package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum StartDebuggingRequestCommand {
    START_DEBUGGING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case START_DEBUGGING: return "startDebugging";
        }
        return null;
    }

    @JsonCreator
    public static StartDebuggingRequestCommand forValue(String value) throws IOException {
        if (value.equals("startDebugging")) return START_DEBUGGING;
        throw new IOException("Cannot deserialize StartDebuggingRequestCommand");
    }
}
