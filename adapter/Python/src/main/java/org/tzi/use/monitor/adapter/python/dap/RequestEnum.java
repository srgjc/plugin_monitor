package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Indicates whether the new debug session should be started with a `launch` or `attach`
 * request.
 */
public enum RequestEnum {
    ATTACH, LAUNCH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ATTACH: return "attach";
            case LAUNCH: return "launch";
        }
        return null;
    }

    @JsonCreator
    public static RequestEnum forValue(String value) throws IOException {
        if (value.equals("attach")) return ATTACH;
        if (value.equals("launch")) return LAUNCH;
        throw new IOException("Cannot deserialize RequestEnum");
    }
}
