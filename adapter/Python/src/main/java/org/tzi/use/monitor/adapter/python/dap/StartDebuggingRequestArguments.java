
package org.tzi.use.monitor.adapter.python.dap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Arguments for `startDebugging` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configuration",
    "request"
})
@Generated("jsonschema2pojo")
public class StartDebuggingRequestArguments {

    /**
     * Arguments passed to the new debug session. The arguments must only contain properties understood by the `launch` or `attach` requests of the debug adapter and they must not contain any client-specific properties (e.g. `type`) or client-specific features (e.g. substitutable 'variables').
     * (Required)
     * 
     */
    @JsonProperty("configuration")
    @JsonPropertyDescription("Arguments passed to the new debug session. The arguments must only contain properties understood by the `launch` or `attach` requests of the debug adapter and they must not contain any client-specific properties (e.g. `type`) or client-specific features (e.g. substitutable 'variables').")
    private Configuration configuration;
    /**
     * Indicates whether the new debug session should be started with a `launch` or `attach` request.
     * (Required)
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("Indicates whether the new debug session should be started with a `launch` or `attach` request.")
    private Request request;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Arguments passed to the new debug session. The arguments must only contain properties understood by the `launch` or `attach` requests of the debug adapter and they must not contain any client-specific properties (e.g. `type`) or client-specific features (e.g. substitutable 'variables').
     * (Required)
     * 
     */
    @JsonProperty("configuration")
    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Arguments passed to the new debug session. The arguments must only contain properties understood by the `launch` or `attach` requests of the debug adapter and they must not contain any client-specific properties (e.g. `type`) or client-specific features (e.g. substitutable 'variables').
     * (Required)
     * 
     */
    @JsonProperty("configuration")
    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * Indicates whether the new debug session should be started with a `launch` or `attach` request.
     * (Required)
     * 
     */
    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    /**
     * Indicates whether the new debug session should be started with a `launch` or `attach` request.
     * (Required)
     * 
     */
    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StartDebuggingRequestArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configuration");
        sb.append('=');
        sb.append(((this.configuration == null)?"<null>":this.configuration));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.configuration == null)? 0 :this.configuration.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StartDebuggingRequestArguments) == false) {
            return false;
        }
        StartDebuggingRequestArguments rhs = ((StartDebuggingRequestArguments) other);
        return ((((this.configuration == rhs.configuration)||((this.configuration!= null)&&this.configuration.equals(rhs.configuration)))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }


    /**
     * Indicates whether the new debug session should be started with a `launch` or `attach` request.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Request {

        LAUNCH("launch"),
        ATTACH("attach");
        private final String value;
        private final static Map<String, Request> CONSTANTS = new HashMap<String, Request>();

        static {
            for (Request c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Request(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Request fromValue(String value) {
            Request constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
