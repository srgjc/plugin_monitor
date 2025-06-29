package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Support for keeping an output log organized by grouping related messages.
 */
public enum Group {
    END, START, START_COLLAPSED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case END: return "end";
            case START: return "start";
            case START_COLLAPSED: return "startCollapsed";
        }
        return null;
    }

    @JsonCreator
    public static Group forValue(String value) throws IOException {
        if (value.equals("end")) return END;
        if (value.equals("start")) return START;
        if (value.equals("startCollapsed")) return START_COLLAPSED;
        throw new IOException("Cannot deserialize Group");
    }
}
