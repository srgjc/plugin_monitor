package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * What kind of terminal to launch. Defaults to `integrated` if not specified.
 */
public enum Kind {
    EXTERNAL, INTEGRATED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXTERNAL: return "external";
            case INTEGRATED: return "integrated";
        }
        return null;
    }

    @JsonCreator
    public static Kind forValue(String value) throws IOException {
        if (value.equals("external")) return EXTERNAL;
        if (value.equals("integrated")) return INTEGRATED;
        throw new IOException("Cannot deserialize Kind");
    }
}
