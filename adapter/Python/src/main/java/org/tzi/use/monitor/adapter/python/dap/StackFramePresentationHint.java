package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * A hint for how to present this frame in the UI.
 * A value of `label` can be used to indicate that the frame is an artificial frame that is
 * used as a visual label or separator. A value of `subtle` can be used to change the
 * appearance of a frame in a 'subtle' way.
 */
public enum StackFramePresentationHint {
    LABEL, NORMAL, SUBTLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LABEL: return "label";
            case NORMAL: return "normal";
            case SUBTLE: return "subtle";
        }
        return null;
    }

    @JsonCreator
    public static StackFramePresentationHint forValue(String value) throws IOException {
        if (value.equals("label")) return LABEL;
        if (value.equals("normal")) return NORMAL;
        if (value.equals("subtle")) return SUBTLE;
        throw new IOException("Cannot deserialize StackFramePresentationHint");
    }
}
