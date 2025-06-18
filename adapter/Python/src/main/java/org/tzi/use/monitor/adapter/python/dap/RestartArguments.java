
package org.tzi.use.monitor.adapter.python.dap;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Arguments for `restart` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "arguments"
})
@Generated("jsonschema2pojo")
public class RestartArguments {

    /**
     * The latest version of the `launch` or `attach` configuration.
     * 
     */
    @JsonProperty("arguments")
    @JsonPropertyDescription("The latest version of the `launch` or `attach` configuration.")
    private Object arguments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The latest version of the `launch` or `attach` configuration.
     * 
     */
    @JsonProperty("arguments")
    public Object getArguments() {
        return arguments;
    }

    /**
     * The latest version of the `launch` or `attach` configuration.
     * 
     */
    @JsonProperty("arguments")
    public void setArguments(Object arguments) {
        this.arguments = arguments;
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
        sb.append(RestartArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("arguments");
        sb.append('=');
        sb.append(((this.arguments == null)?"<null>":this.arguments));
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
        result = ((result* 31)+((this.arguments == null)? 0 :this.arguments.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RestartArguments) == false) {
            return false;
        }
        RestartArguments rhs = ((RestartArguments) other);
        return (((this.arguments == rhs.arguments)||((this.arguments!= null)&&this.arguments.equals(rhs.arguments)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
