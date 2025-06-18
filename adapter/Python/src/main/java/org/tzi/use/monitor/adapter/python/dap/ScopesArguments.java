
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
 * Arguments for `scopes` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frameId"
})
@Generated("jsonschema2pojo")
public class ScopesArguments {

    /**
     * Retrieve the scopes for the stack frame identified by `frameId`. The `frameId` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("frameId")
    @JsonPropertyDescription("Retrieve the scopes for the stack frame identified by `frameId`. The `frameId` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.")
    private Integer frameId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Retrieve the scopes for the stack frame identified by `frameId`. The `frameId` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("frameId")
    public Integer getFrameId() {
        return frameId;
    }

    /**
     * Retrieve the scopes for the stack frame identified by `frameId`. The `frameId` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("frameId")
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
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
        sb.append(ScopesArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frameId");
        sb.append('=');
        sb.append(((this.frameId == null)?"<null>":this.frameId));
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
        result = ((result* 31)+((this.frameId == null)? 0 :this.frameId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScopesArguments) == false) {
            return false;
        }
        ScopesArguments rhs = ((ScopesArguments) other);
        return (((this.frameId == rhs.frameId)||((this.frameId!= null)&&this.frameId.equals(rhs.frameId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
