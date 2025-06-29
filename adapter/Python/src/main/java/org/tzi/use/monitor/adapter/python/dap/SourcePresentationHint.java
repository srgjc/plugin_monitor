package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * A hint for how to present the source in the UI.
 * A value of `deemphasize` can be used to indicate that the source is not available or that
 * it is skipped on stepping.
 */
public enum SourcePresentationHint {
    DEEMPHASIZE, EMPHASIZE, NORMAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DEEMPHASIZE: return "deemphasize";
            case EMPHASIZE: return "emphasize";
            case NORMAL: return "normal";
        }
        return null;
    }

    @JsonCreator
    public static SourcePresentationHint forValue(String value) throws IOException {
        if (value.equals("deemphasize")) return DEEMPHASIZE;
        if (value.equals("emphasize")) return EMPHASIZE;
        if (value.equals("normal")) return NORMAL;
        throw new IOException("Cannot deserialize SourcePresentationHint");
    }
}
