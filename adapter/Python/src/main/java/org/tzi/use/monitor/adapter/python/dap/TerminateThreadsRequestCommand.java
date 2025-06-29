package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum TerminateThreadsRequestCommand {
    TERMINATE_THREADS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TERMINATE_THREADS: return "terminateThreads";
        }
        return null;
    }

    @JsonCreator
    public static TerminateThreadsRequestCommand forValue(String value) throws IOException {
        if (value.equals("terminateThreads")) return TERMINATE_THREADS;
        throw new IOException("Cannot deserialize TerminateThreadsRequestCommand");
    }
}
