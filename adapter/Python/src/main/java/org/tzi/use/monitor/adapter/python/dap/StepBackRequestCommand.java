package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum StepBackRequestCommand {
    STEP_BACK;

    @JsonValue
    public String toValue() {
        switch (this) {
            case STEP_BACK: return "stepBack";
        }
        return null;
    }

    @JsonCreator
    public static StepBackRequestCommand forValue(String value) throws IOException {
        if (value.equals("stepBack")) return STEP_BACK;
        throw new IOException("Cannot deserialize StepBackRequestCommand");
    }
}
