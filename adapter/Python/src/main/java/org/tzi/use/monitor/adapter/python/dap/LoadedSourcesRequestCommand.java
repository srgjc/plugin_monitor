package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum LoadedSourcesRequestCommand {
    LOADED_SOURCES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LOADED_SOURCES: return "loadedSources";
        }
        return null;
    }

    @JsonCreator
    public static LoadedSourcesRequestCommand forValue(String value) throws IOException {
        if (value.equals("loadedSources")) return LOADED_SOURCES;
        throw new IOException("Cannot deserialize LoadedSourcesRequestCommand");
    }
}
