
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
 * Arguments for `exceptionInfo` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "threadId"
})
@Generated("jsonschema2pojo")
public class ExceptionInfoArguments {

    /**
     * Thread for which exception information should be retrieved.
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    @JsonPropertyDescription("Thread for which exception information should be retrieved.")
    private Integer threadId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Thread for which exception information should be retrieved.
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    public Integer getThreadId() {
        return threadId;
    }

    /**
     * Thread for which exception information should be retrieved.
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
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
        sb.append(ExceptionInfoArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("threadId");
        sb.append('=');
        sb.append(((this.threadId == null)?"<null>":this.threadId));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExceptionInfoArguments) == false) {
            return false;
        }
        ExceptionInfoArguments rhs = ((ExceptionInfoArguments) other);
        return (((this.threadId == rhs.threadId)||((this.threadId!= null)&&this.threadId.equals(rhs.threadId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
