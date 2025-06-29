package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum CompletionsRequestCommand {
    COMPLETIONS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMPLETIONS: return "completions";
        }
        return null;
    }

    @JsonCreator
    public static CompletionsRequestCommand forValue(String value) throws IOException {
        if (value.equals("completions")) return COMPLETIONS;
        throw new IOException("Cannot deserialize CompletionsRequestCommand");
    }
}
