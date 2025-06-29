package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ModuleEventEvent {
    MODULE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MODULE: return "module";
        }
        return null;
    }

    @JsonCreator
    public static ModuleEventEvent forValue(String value) throws IOException {
        if (value.equals("module")) return MODULE;
        throw new IOException("Cannot deserialize ModuleEventEvent");
    }
}
