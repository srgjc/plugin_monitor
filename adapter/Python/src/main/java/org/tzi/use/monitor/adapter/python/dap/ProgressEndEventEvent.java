package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ProgressEndEventEvent {
    PROGRESS_END;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PROGRESS_END: return "progressEnd";
        }
        return null;
    }

    @JsonCreator
    public static ProgressEndEventEvent forValue(String value) throws IOException {
        if (value.equals("progressEnd")) return PROGRESS_END;
        throw new IOException("Cannot deserialize ProgressEndEventEvent");
    }
}
