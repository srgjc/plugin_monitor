package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum RunInTerminalRequestCommand {
    RUN_IN_TERMINAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RUN_IN_TERMINAL: return "runInTerminal";
        }
        return null;
    }

    @JsonCreator
    public static RunInTerminalRequestCommand forValue(String value) throws IOException {
        if (value.equals("runInTerminal")) return RUN_IN_TERMINAL;
        throw new IOException("Cannot deserialize RunInTerminalRequestCommand");
    }
}
