package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ConfigurationDoneRequestCommand {
    CONFIGURATION_DONE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONFIGURATION_DONE: return "configurationDone";
        }
        return null;
    }

    @JsonCreator
    public static ConfigurationDoneRequestCommand forValue(String value) throws IOException {
        if (value.equals("configurationDone")) return CONFIGURATION_DONE;
        throw new IOException("Cannot deserialize ConfigurationDoneRequestCommand");
    }
}
