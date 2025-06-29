package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum BreakpointLocationsRequestCommand {
    BREAKPOINT_LOCATIONS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BREAKPOINT_LOCATIONS: return "breakpointLocations";
        }
        return null;
    }

    @JsonCreator
    public static BreakpointLocationsRequestCommand forValue(String value) throws IOException {
        if (value.equals("breakpointLocations")) return BREAKPOINT_LOCATIONS;
        throw new IOException("Cannot deserialize BreakpointLocationsRequestCommand");
    }
}
