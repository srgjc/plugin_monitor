package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `restart` request.
 */
public class RestartArgumentsClass {
    private ChRequestArguments arguments;

    /**
     * The latest version of the `launch` or `attach` configuration.
     */
    @JsonProperty("arguments")
    public ChRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(ChRequestArguments value) { this.arguments = value; }
}
