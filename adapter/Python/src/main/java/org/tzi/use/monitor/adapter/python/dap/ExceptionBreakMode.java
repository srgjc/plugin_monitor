package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * This enumeration defines all possible conditions when a thrown exception should result in
 * a break.
 * never: never breaks,
 * always: always breaks,
 * unhandled: breaks when exception unhandled,
 * userUnhandled: breaks if the exception is not handled by user code.
 *
 * Mode that caused the exception notification to be raised.
 *
 * Condition when a thrown exception should result in a break.
 */
public enum ExceptionBreakMode {
    ALWAYS, NEVER, UNHANDLED, USER_UNHANDLED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ALWAYS: return "always";
            case NEVER: return "never";
            case UNHANDLED: return "unhandled";
            case USER_UNHANDLED: return "userUnhandled";
        }
        return null;
    }

    @JsonCreator
    public static ExceptionBreakMode forValue(String value) throws IOException {
        if (value.equals("always")) return ALWAYS;
        if (value.equals("never")) return NEVER;
        if (value.equals("unhandled")) return UNHANDLED;
        if (value.equals("userUnhandled")) return USER_UNHANDLED;
        throw new IOException("Cannot deserialize ExceptionBreakMode");
    }
}
