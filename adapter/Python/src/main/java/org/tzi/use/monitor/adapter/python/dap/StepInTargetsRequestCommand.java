package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum StepInTargetsRequestCommand {
    STEP_IN_TARGETS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case STEP_IN_TARGETS: return "stepInTargets";
        }
        return null;
    }

    @JsonCreator
    public static StepInTargetsRequestCommand forValue(String value) throws IOException {
        if (value.equals("stepInTargets")) return STEP_IN_TARGETS;
        throw new IOException("Cannot deserialize StepInTargetsRequestCommand");
    }
}
