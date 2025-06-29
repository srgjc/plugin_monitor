package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum SetVariableRequestCommand {
    SET_VARIABLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SET_VARIABLE: return "setVariable";
        }
        return null;
    }

    @JsonCreator
    public static SetVariableRequestCommand forValue(String value) throws IOException {
        if (value.equals("setVariable")) return SET_VARIABLE;
        throw new IOException("Cannot deserialize SetVariableRequestCommand");
    }
}
