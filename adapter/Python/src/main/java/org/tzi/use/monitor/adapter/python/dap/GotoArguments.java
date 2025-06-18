
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
 * Arguments for `goto` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "threadId",
    "targetId"
})
@Generated("jsonschema2pojo")
public class GotoArguments {

    /**
     * Set the goto target for this thread.
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    @JsonPropertyDescription("Set the goto target for this thread.")
    private Integer threadId;
    /**
     * The location where the debuggee will continue to run.
     * (Required)
     * 
     */
    @JsonProperty("targetId")
    @JsonPropertyDescription("The location where the debuggee will continue to run.")
    private Integer targetId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Set the goto target for this thread.
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    public Integer getThreadId() {
        return threadId;
    }

    /**
     * Set the goto target for this thread.
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    /**
     * The location where the debuggee will continue to run.
     * (Required)
     * 
     */
    @JsonProperty("targetId")
    public Integer getTargetId() {
        return targetId;
    }

    /**
     * The location where the debuggee will continue to run.
     * (Required)
     * 
     */
    @JsonProperty("targetId")
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
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
        sb.append(GotoArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("threadId");
        sb.append('=');
        sb.append(((this.threadId == null)?"<null>":this.threadId));
        sb.append(',');
        sb.append("targetId");
        sb.append('=');
        sb.append(((this.targetId == null)?"<null>":this.targetId));
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
        result = ((result* 31)+((this.threadId == null)? 0 :this.threadId.hashCode()));
        result = ((result* 31)+((this.targetId == null)? 0 :this.targetId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GotoArguments) == false) {
            return false;
        }
        GotoArguments rhs = ((GotoArguments) other);
        return ((((this.threadId == rhs.threadId)||((this.threadId!= null)&&this.threadId.equals(rhs.threadId)))&&((this.targetId == rhs.targetId)||((this.targetId!= null)&&this.targetId.equals(rhs.targetId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
