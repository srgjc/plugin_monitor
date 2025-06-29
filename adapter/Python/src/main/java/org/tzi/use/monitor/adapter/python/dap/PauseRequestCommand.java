package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum PauseRequestCommand {
    PAUSE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PAUSE: return "pause";
        }
        return null;
    }

    @JsonCreator
    public static PauseRequestCommand forValue(String value) throws IOException {
        if (value.equals("pause")) return PAUSE;
        throw new IOException("Cannot deserialize PauseRequestCommand");
    }
}
