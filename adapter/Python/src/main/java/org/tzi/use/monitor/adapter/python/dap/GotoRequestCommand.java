package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum GotoRequestCommand {
    GOTO;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GOTO: return "goto";
        }
        return null;
    }

    @JsonCreator
    public static GotoRequestCommand forValue(String value) throws IOException {
        if (value.equals("goto")) return GOTO;
        throw new IOException("Cannot deserialize GotoRequestCommand");
    }
}
