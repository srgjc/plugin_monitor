package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * All dictionary values must be strings.
 *
 * Logical areas that can be invalidated by the `invalidated` event.
 */
public enum SetExpressionRequestCommand {
    SET_EXPRESSION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SET_EXPRESSION: return "setExpression";
        }
        return null;
    }

    @JsonCreator
    public static SetExpressionRequestCommand forValue(String value) throws IOException {
        if (value.equals("setExpression")) return SET_EXPRESSION;
        throw new IOException("Cannot deserialize SetExpressionRequestCommand");
    }
}
