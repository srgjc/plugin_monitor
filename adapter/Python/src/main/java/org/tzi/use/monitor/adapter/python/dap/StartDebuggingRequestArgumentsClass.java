package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Arguments for `startDebugging` request.
 */
public class StartDebuggingRequestArgumentsClass {
    private Map<String, Object> configuration;
    private RequestEnum request;

    /**
     * Arguments passed to the new debug session. The arguments must only contain properties
     * understood by the `launch` or `attach` requests of the debug adapter and they must not
     * contain any client-specific properties (e.g. `type`) or client-specific features (e.g.
     * substitutable 'variables').
     */
    @JsonProperty("configuration")
    public Map<String, Object> getConfiguration() { return configuration; }
    @JsonProperty("configuration")
    public void setConfiguration(Map<String, Object> value) { this.configuration = value; }

    /**
     * Indicates whether the new debug session should be started with a `launch` or `attach`
     * request.
     */
    @JsonProperty("request")
    public RequestEnum getRequest() { return request; }
    @JsonProperty("request")
    public void setRequest(RequestEnum value) { this.request = value; }
}
