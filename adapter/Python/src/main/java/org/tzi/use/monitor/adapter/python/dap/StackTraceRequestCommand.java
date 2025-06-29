package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum StackTraceRequestCommand {
    STACK_TRACE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case STACK_TRACE: return "stackTrace";
        }
        return null;
    }

    @JsonCreator
    public static StackTraceRequestCommand forValue(String value) throws IOException {
        if (value.equals("stackTrace")) return STACK_TRACE;
        throw new IOException("Cannot deserialize StackTraceRequestCommand");
    }
}
