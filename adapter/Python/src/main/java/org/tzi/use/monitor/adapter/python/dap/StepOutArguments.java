
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
 * Arguments for `stepOut` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "threadId",
    "singleThread",
    "granularity"
})
@Generated("jsonschema2pojo")
public class StepOutArguments {

    /**
     * Specifies the thread for which to resume execution for one step-out (of the given granularity).
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    @JsonPropertyDescription("Specifies the thread for which to resume execution for one step-out (of the given granularity).")
    private Integer threadId;
    /**
     * If this flag is true, all other suspended threads are not resumed.
     * 
     */
    @JsonProperty("singleThread")
    @JsonPropertyDescription("If this flag is true, all other suspended threads are not resumed.")
    private Boolean singleThread;
    /**
     * The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.
     * 
     */
    @JsonProperty("granularity")
    @JsonPropertyDescription("The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.")
    private NextArguments.SteppingGranularity granularity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Specifies the thread for which to resume execution for one step-out (of the given granularity).
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    public Integer getThreadId() {
        return threadId;
    }

    /**
     * Specifies the thread for which to resume execution for one step-out (of the given granularity).
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    /**
     * If this flag is true, all other suspended threads are not resumed.
     * 
     */
    @JsonProperty("singleThread")
    public Boolean getSingleThread() {
        return singleThread;
    }

    /**
     * If this flag is true, all other suspended threads are not resumed.
     * 
     */
    @JsonProperty("singleThread")
    public void setSingleThread(Boolean singleThread) {
        this.singleThread = singleThread;
    }

    /**
     * The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.
     * 
     */
    @JsonProperty("granularity")
    public NextArguments.SteppingGranularity getGranularity() {
        return granularity;
    }

    /**
     * The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.
     * 
     */
    @JsonProperty("granularity")
    public void setGranularity(NextArguments.SteppingGranularity granularity) {
        this.granularity = granularity;
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
        sb.append(StepOutArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("threadId");
        sb.append('=');
        sb.append(((this.threadId == null)?"<null>":this.threadId));
        sb.append(',');
        sb.append("singleThread");
        sb.append('=');
        sb.append(((this.singleThread == null)?"<null>":this.singleThread));
        sb.append(',');
        sb.append("granularity");
        sb.append('=');
        sb.append(((this.granularity == null)?"<null>":this.granularity));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.singleThread == null)? 0 :this.singleThread.hashCode()));
        result = ((result* 31)+((this.granularity == null)? 0 :this.granularity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StepOutArguments) == false) {
            return false;
        }
        StepOutArguments rhs = ((StepOutArguments) other);
        return (((((this.threadId == rhs.threadId)||((this.threadId!= null)&&this.threadId.equals(rhs.threadId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.singleThread == rhs.singleThread)||((this.singleThread!= null)&&this.singleThread.equals(rhs.singleThread))))&&((this.granularity == rhs.granularity)||((this.granularity!= null)&&this.granularity.equals(rhs.granularity))));
    }

}
