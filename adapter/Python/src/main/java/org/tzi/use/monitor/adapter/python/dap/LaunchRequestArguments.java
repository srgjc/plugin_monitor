
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
 * Arguments for `launch` request. Additional attributes are implementation specific.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "noDebug",
    "__restart"
})
@Generated("jsonschema2pojo")
public class LaunchRequestArguments {

    /**
     * If true, the launch request should launch the program without enabling debugging.
     * 
     */
    @JsonProperty("noDebug")
    @JsonPropertyDescription("If true, the launch request should launch the program without enabling debugging.")
    private Boolean noDebug;
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
     * If true, the launch request should launch the program without enabling debugging.
     * 
     */
    @JsonProperty("noDebug")
    public Boolean getNoDebug() {
        return noDebug;
    }

    /**
     * If true, the launch request should launch the program without enabling debugging.
     * 
     */
    @JsonProperty("noDebug")
    public void setNoDebug(Boolean noDebug) {
        this.noDebug = noDebug;
    }

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
        sb.append(LaunchRequestArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("noDebug");
        sb.append('=');
        sb.append(((this.noDebug == null)?"<null>":this.noDebug));
        sb.append(',');
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
        result = ((result* 31)+((this.noDebug == null)? 0 :this.noDebug.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchRequestArguments) == false) {
            return false;
        }
        LaunchRequestArguments rhs = ((LaunchRequestArguments) other);
        return ((((this.restart == rhs.restart)||((this.restart!= null)&&this.restart.equals(rhs.restart)))&&((this.noDebug == rhs.noDebug)||((this.noDebug!= null)&&this.noDebug.equals(rhs.noDebug))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
