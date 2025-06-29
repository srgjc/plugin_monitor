package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ScopesRequestCommand {
    SCOPES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SCOPES: return "scopes";
        }
        return null;
    }

    @JsonCreator
    public static ScopesRequestCommand forValue(String value) throws IOException {
        if (value.equals("scopes")) return SCOPES;
        throw new IOException("Cannot deserialize ScopesRequestCommand");
    }
}
