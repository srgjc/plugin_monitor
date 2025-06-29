package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum EvaluateRequestCommand {
    EVALUATE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EVALUATE: return "evaluate";
        }
        return null;
    }

    @JsonCreator
    public static EvaluateRequestCommand forValue(String value) throws IOException {
        if (value.equals("evaluate")) return EVALUATE;
        throw new IOException("Cannot deserialize EvaluateRequestCommand");
    }
}
