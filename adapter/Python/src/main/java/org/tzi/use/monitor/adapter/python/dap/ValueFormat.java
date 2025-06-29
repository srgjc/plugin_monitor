package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Specifies details on how to format the result.
 * The attribute is only honored by a debug adapter if the corresponding capability
 * `supportsValueFormattingOptions` is true.
 *
 * Provides formatting information for a value.
 *
 * Specifies how the resulting value should be formatted.
 *
 * Specifies details on how to format the response value.
 *
 * Specifies details on how to format the Variable values.
 * The attribute is only honored by a debug adapter if the corresponding capability
 * `supportsValueFormattingOptions` is true.
 */
public class ValueFormat {
    private Boolean hex;

    /**
     * Display the value in hex.
     */
    @JsonProperty("hex")
    public Boolean getHex() { return hex; }
    @JsonProperty("hex")
    public void setHex(Boolean value) { this.hex = value; }
}
