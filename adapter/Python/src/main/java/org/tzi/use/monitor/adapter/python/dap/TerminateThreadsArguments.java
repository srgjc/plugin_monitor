
package org.tzi.use.monitor.adapter.python.dap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
 * Arguments for `terminateThreads` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "threadIds"
})
@Generated("jsonschema2pojo")
public class TerminateThreadsArguments {

    /**
     * Ids of threads to be terminated.
     * 
     */
    @JsonProperty("threadIds")
    @JsonPropertyDescription("Ids of threads to be terminated.")
    private List<Integer> threadIds = new ArrayList<Integer>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Ids of threads to be terminated.
     * 
     */
    @JsonProperty("threadIds")
    public List<Integer> getThreadIds() {
        return threadIds;
    }

    /**
     * Ids of threads to be terminated.
     * 
     */
    @JsonProperty("threadIds")
    public void setThreadIds(List<Integer> threadIds) {
        this.threadIds = threadIds;
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
        sb.append(TerminateThreadsArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("threadIds");
        sb.append('=');
        sb.append(((this.threadIds == null)?"<null>":this.threadIds));
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
        result = ((result* 31)+((this.threadIds == null)? 0 :this.threadIds.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TerminateThreadsArguments) == false) {
            return false;
        }
        TerminateThreadsArguments rhs = ((TerminateThreadsArguments) other);
        return (((this.threadIds == rhs.threadIds)||((this.threadIds!= null)&&this.threadIds.equals(rhs.threadIds)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
