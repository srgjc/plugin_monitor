package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ProgressStartEventEvent {
    PROGRESS_START;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PROGRESS_START: return "progressStart";
        }
        return null;
    }

    @JsonCreator
    public static ProgressStartEventEvent forValue(String value) throws IOException {
        if (value.equals("progressStart")) return PROGRESS_START;
        throw new IOException("Cannot deserialize ProgressStartEventEvent");
    }
}
