package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * The reason for the event.
 */
public enum BodyReason {
    CHANGED, NEW, REMOVED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHANGED: return "changed";
            case NEW: return "new";
            case REMOVED: return "removed";
        }
        return null;
    }

    @JsonCreator
    public static BodyReason forValue(String value) throws IOException {
        if (value.equals("changed")) return CHANGED;
        if (value.equals("new")) return NEW;
        if (value.equals("removed")) return REMOVED;
        throw new IOException("Cannot deserialize BodyReason");
    }
}
