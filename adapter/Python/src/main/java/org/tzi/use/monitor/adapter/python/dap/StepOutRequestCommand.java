package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum StepOutRequestCommand {
    STEP_OUT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case STEP_OUT: return "stepOut";
        }
        return null;
    }

    @JsonCreator
    public static StepOutRequestCommand forValue(String value) throws IOException {
        if (value.equals("stepOut")) return STEP_OUT;
        throw new IOException("Cannot deserialize StepOutRequestCommand");
    }
}
