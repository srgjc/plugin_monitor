package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum VariablesRequestCommand {
    VARIABLES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case VARIABLES: return "variables";
        }
        return null;
    }

    @JsonCreator
    public static VariablesRequestCommand forValue(String value) throws IOException {
        if (value.equals("variables")) return VARIABLES;
        throw new IOException("Cannot deserialize VariablesRequestCommand");
    }
}
