package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Describes how the debug engine started debugging this process.
 */
public enum StartMethod {
    ATTACH, ATTACH_FOR_SUSPENDED_LAUNCH, LAUNCH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ATTACH: return "attach";
            case ATTACH_FOR_SUSPENDED_LAUNCH: return "attachForSuspendedLaunch";
            case LAUNCH: return "launch";
        }
        return null;
    }

    @JsonCreator
    public static StartMethod forValue(String value) throws IOException {
        if (value.equals("attach")) return ATTACH;
        if (value.equals("attachForSuspendedLaunch")) return ATTACH_FOR_SUSPENDED_LAUNCH;
        if (value.equals("launch")) return LAUNCH;
        throw new IOException("Cannot deserialize StartMethod");
    }
}
