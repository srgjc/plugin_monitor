package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum StepInRequestCommand {
    STEP_IN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case STEP_IN: return "stepIn";
        }
        return null;
    }

    @JsonCreator
    public static StepInRequestCommand forValue(String value) throws IOException {
        if (value.equals("stepIn")) return STEP_IN;
        throw new IOException("Cannot deserialize StepInRequestCommand");
    }
}
