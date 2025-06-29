package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ProgressUpdateEventEvent {
    PROGRESS_UPDATE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PROGRESS_UPDATE: return "progressUpdate";
        }
        return null;
    }

    @JsonCreator
    public static ProgressUpdateEventEvent forValue(String value) throws IOException {
        if (value.equals("progressUpdate")) return PROGRESS_UPDATE;
        throw new IOException("Cannot deserialize ProgressUpdateEventEvent");
    }
}
