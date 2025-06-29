package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum DisconnectRequestCommand {
    DISCONNECT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DISCONNECT: return "disconnect";
        }
        return null;
    }

    @JsonCreator
    public static DisconnectRequestCommand forValue(String value) throws IOException {
        if (value.equals("disconnect")) return DISCONNECT;
        throw new IOException("Cannot deserialize DisconnectRequestCommand");
    }
}
