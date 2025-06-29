package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum NextRequestCommand {
    NEXT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NEXT: return "next";
        }
        return null;
    }

    @JsonCreator
    public static NextRequestCommand forValue(String value) throws IOException {
        if (value.equals("next")) return NEXT;
        throw new IOException("Cannot deserialize NextRequestCommand");
    }
}
