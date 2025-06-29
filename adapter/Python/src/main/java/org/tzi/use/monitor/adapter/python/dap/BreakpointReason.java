package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * A machine-readable explanation of why a breakpoint may not be verified. If a breakpoint
 * is verified or a specific reason is not known, the adapter should omit this property.
 * Possible values include:
 *
 * - `pending`: Indicates a breakpoint might be verified in the future, but the adapter
 * cannot verify it in the current state.
 * - `failed`: Indicates a breakpoint was not able to be verified, and the adapter does not
 * believe it can be verified without intervention.
 */
public enum BreakpointReason {
    FAILED, PENDING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FAILED: return "failed";
            case PENDING: return "pending";
        }
        return null;
    }

    @JsonCreator
    public static BreakpointReason forValue(String value) throws IOException {
        if (value.equals("failed")) return FAILED;
        if (value.equals("pending")) return PENDING;
        throw new IOException("Cannot deserialize BreakpointReason");
    }
}
