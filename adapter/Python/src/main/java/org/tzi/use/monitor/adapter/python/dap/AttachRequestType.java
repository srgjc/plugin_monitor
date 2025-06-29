package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum AttachRequestType {
    REQUEST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case REQUEST: return "request";
        }
        return null;
    }

    @JsonCreator
    public static AttachRequestType forValue(String value) throws IOException {
        if (value.equals("request")) return REQUEST;
        throw new IOException("Cannot deserialize AttachRequestType");
    }
}
