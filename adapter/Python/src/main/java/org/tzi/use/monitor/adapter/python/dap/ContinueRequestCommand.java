package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ContinueRequestCommand {
    CONTINUE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONTINUE: return "continue";
        }
        return null;
    }

    @JsonCreator
    public static ContinueRequestCommand forValue(String value) throws IOException {
        if (value.equals("continue")) return CONTINUE;
        throw new IOException("Cannot deserialize ContinueRequestCommand");
    }
}
