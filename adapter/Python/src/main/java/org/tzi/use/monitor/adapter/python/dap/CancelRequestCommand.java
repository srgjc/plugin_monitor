package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum CancelRequestCommand {
    CANCEL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CANCEL: return "cancel";
        }
        return null;
    }

    @JsonCreator
    public static CancelRequestCommand forValue(String value) throws IOException {
        if (value.equals("cancel")) return CANCEL;
        throw new IOException("Cannot deserialize CancelRequestCommand");
    }
}
