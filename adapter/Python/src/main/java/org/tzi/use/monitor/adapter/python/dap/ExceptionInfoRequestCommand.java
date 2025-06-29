package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum ExceptionInfoRequestCommand {
    EXCEPTION_INFO;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EXCEPTION_INFO: return "exceptionInfo";
        }
        return null;
    }

    @JsonCreator
    public static ExceptionInfoRequestCommand forValue(String value) throws IOException {
        if (value.equals("exceptionInfo")) return EXCEPTION_INFO;
        throw new IOException("Cannot deserialize ExceptionInfoRequestCommand");
    }
}
