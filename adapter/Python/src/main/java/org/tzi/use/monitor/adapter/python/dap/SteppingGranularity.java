package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Stepping granularity. If no granularity is specified, a granularity of `statement` is
 * assumed.
 *
 * The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and
 * `stepBack`.
 *
 * Stepping granularity to step. If no granularity is specified, a granularity of
 * `statement` is assumed.
 */
public enum SteppingGranularity {
    INSTRUCTION, LINE, STATEMENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INSTRUCTION: return "instruction";
            case LINE: return "line";
            case STATEMENT: return "statement";
        }
        return null;
    }

    @JsonCreator
    public static SteppingGranularity forValue(String value) throws IOException {
        if (value.equals("instruction")) return INSTRUCTION;
        if (value.equals("line")) return LINE;
        if (value.equals("statement")) return STATEMENT;
        throw new IOException("Cannot deserialize SteppingGranularity");
    }
}
