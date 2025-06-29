package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * The access type of the data.
 *
 * This enumeration defines all possible access types for data breakpoints.
 */
public enum DataBreakpointAccessType {
    READ, READ_WRITE, WRITE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case READ: return "read";
            case READ_WRITE: return "readWrite";
            case WRITE: return "write";
        }
        return null;
    }

    @JsonCreator
    public static DataBreakpointAccessType forValue(String value) throws IOException {
        if (value.equals("read")) return READ;
        if (value.equals("readWrite")) return READ_WRITE;
        if (value.equals("write")) return WRITE;
        throw new IOException("Cannot deserialize DataBreakpointAccessType");
    }
}
