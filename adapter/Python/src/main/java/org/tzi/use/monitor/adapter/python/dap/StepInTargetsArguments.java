
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
 * Arguments for `stepInTargets` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frameId"
})
@Generated("jsonschema2pojo")
public class StepInTargetsArguments {

    /**
     * The stack frame for which to retrieve the possible step-in targets.
     * (Required)
     * 
     */
    @JsonProperty("frameId")
    @JsonPropertyDescription("The stack frame for which to retrieve the possible step-in targets.")
    private Integer frameId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The stack frame for which to retrieve the possible step-in targets.
     * (Required)
     * 
     */
    @JsonProperty("frameId")
    public Integer getFrameId() {
        return frameId;
    }

    /**
     * The stack frame for which to retrieve the possible step-in targets.
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
        sb.append(StepInTargetsArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof StepInTargetsArguments) == false) {
            return false;
        }
        StepInTargetsArguments rhs = ((StepInTargetsArguments) other);
        return (((this.frameId == rhs.frameId)||((this.frameId!= null)&&this.frameId.equals(rhs.frameId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
