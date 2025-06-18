
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
 * Arguments for `cancel` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requestId",
    "progressId"
})
@Generated("jsonschema2pojo")
public class CancelArguments {

    /**
     * The ID (attribute `seq`) of the request to cancel. If missing no request is cancelled.
     * Both a `requestId` and a `progressId` can be specified in one request.
     * 
     */
    @JsonProperty("requestId")
    @JsonPropertyDescription("The ID (attribute `seq`) of the request to cancel. If missing no request is cancelled.\nBoth a `requestId` and a `progressId` can be specified in one request.")
    private Integer requestId;
    /**
     * The ID (attribute `progressId`) of the progress to cancel. If missing no progress is cancelled.
     * Both a `requestId` and a `progressId` can be specified in one request.
     * 
     */
    @JsonProperty("progressId")
    @JsonPropertyDescription("The ID (attribute `progressId`) of the progress to cancel. If missing no progress is cancelled.\nBoth a `requestId` and a `progressId` can be specified in one request.")
    private String progressId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The ID (attribute `seq`) of the request to cancel. If missing no request is cancelled.
     * Both a `requestId` and a `progressId` can be specified in one request.
     * 
     */
    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The ID (attribute `seq`) of the request to cancel. If missing no request is cancelled.
     * Both a `requestId` and a `progressId` can be specified in one request.
     * 
     */
    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * The ID (attribute `progressId`) of the progress to cancel. If missing no progress is cancelled.
     * Both a `requestId` and a `progressId` can be specified in one request.
     * 
     */
    @JsonProperty("progressId")
    public String getProgressId() {
        return progressId;
    }

    /**
     * The ID (attribute `progressId`) of the progress to cancel. If missing no progress is cancelled.
     * Both a `requestId` and a `progressId` can be specified in one request.
     * 
     */
    @JsonProperty("progressId")
    public void setProgressId(String progressId) {
        this.progressId = progressId;
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
        sb.append(CancelArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null)?"<null>":this.requestId));
        sb.append(',');
        sb.append("progressId");
        sb.append('=');
        sb.append(((this.progressId == null)?"<null>":this.progressId));
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
        result = ((result* 31)+((this.progressId == null)? 0 :this.progressId.hashCode()));
        result = ((result* 31)+((this.requestId == null)? 0 :this.requestId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CancelArguments) == false) {
            return false;
        }
        CancelArguments rhs = ((CancelArguments) other);
        return ((((this.progressId == rhs.progressId)||((this.progressId!= null)&&this.progressId.equals(rhs.progressId)))&&((this.requestId == rhs.requestId)||((this.requestId!= null)&&this.requestId.equals(rhs.requestId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
