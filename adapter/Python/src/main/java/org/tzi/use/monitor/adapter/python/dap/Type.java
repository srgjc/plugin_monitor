package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Datatype of values in this column. Defaults to `string` if not specified.
 */
public enum Type {
    BOOLEAN, NUMBER, STRING, UNIX_TIMESTAMP_UTC;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BOOLEAN: return "boolean";
            case NUMBER: return "number";
            case STRING: return "string";
            case UNIX_TIMESTAMP_UTC: return "unixTimestampUTC";
        }
        return null;
    }

    @JsonCreator
    public static Type forValue(String value) throws IOException {
        if (value.equals("boolean")) return BOOLEAN;
        if (value.equals("number")) return NUMBER;
        if (value.equals("string")) return STRING;
        if (value.equals("unixTimestampUTC")) return UNIX_TIMESTAMP_UTC;
        throw new IOException("Cannot deserialize Type");
    }
}
