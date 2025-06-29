package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Filter to limit the child variables to either named or indexed. If omitted, both types
 * are fetched.
 */
public enum Filter {
    INDEXED, NAMED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INDEXED: return "indexed";
            case NAMED: return "named";
        }
        return null;
    }

    @JsonCreator
    public static Filter forValue(String value) throws IOException {
        if (value.equals("indexed")) return INDEXED;
        if (value.equals("named")) return NAMED;
        throw new IOException("Cannot deserialize Filter");
    }
}
