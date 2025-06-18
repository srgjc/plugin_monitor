
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
 * Arguments for `attach` request. Additional attributes are implementation specific.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "__restart"
})
@Generated("jsonschema2pojo")
public class AttachRequestArguments {

    /**
     * Arbitrary data from the previous, restarted session.
     * The data is sent as the `restart` attribute of the `terminated` event.
     * The client should leave the data intact.
     * 
     */
    @JsonProperty("__restart")
    @JsonPropertyDescription("Arbitrary data from the previous, restarted session.\nThe data is sent as the `restart` attribute of the `terminated` event.\nThe client should leave the data intact.")
    private Object restart;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Arbitrary data from the previous, restarted session.
     * The data is sent as the `restart` attribute of the `terminated` event.
     * The client should leave the data intact.
     * 
     */
    @JsonProperty("__restart")
    public Object getRestart() {
        return restart;
    }

    /**
     * Arbitrary data from the previous, restarted session.
     * The data is sent as the `restart` attribute of the `terminated` event.
     * The client should leave the data intact.
     * 
     */
    @JsonProperty("__restart")
    public void setRestart(Object restart) {
        this.restart = restart;
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
        sb.append(AttachRequestArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("restart");
        sb.append('=');
        sb.append(((this.restart == null)?"<null>":this.restart));
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
        result = ((result* 31)+((this.restart == null)? 0 :this.restart.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttachRequestArguments) == false) {
            return false;
        }
        AttachRequestArguments rhs = ((AttachRequestArguments) other);
        return (((this.restart == rhs.restart)||((this.restart!= null)&&this.restart.equals(rhs.restart)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
