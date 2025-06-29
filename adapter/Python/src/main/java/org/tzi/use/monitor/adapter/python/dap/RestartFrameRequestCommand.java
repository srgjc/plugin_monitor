package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum RestartFrameRequestCommand {
    RESTART_FRAME;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RESTART_FRAME: return "restartFrame";
        }
        return null;
    }

    @JsonCreator
    public static RestartFrameRequestCommand forValue(String value) throws IOException {
        if (value.equals("restartFrame")) return RESTART_FRAME;
        throw new IOException("Cannot deserialize RestartFrameRequestCommand");
    }
}
