
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
 * An `ExceptionFilterOptions` is used to specify an exception filter together with a condition for the `setExceptionBreakpoints` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "filterId",
    "condition"
})
@Generated("jsonschema2pojo")
public class ExceptionFilterOptions {

    /**
     * ID of an exception filter returned by the `exceptionBreakpointFilters` capability.
     * (Required)
     * 
     */
    @JsonProperty("filterId")
    @JsonPropertyDescription("ID of an exception filter returned by the `exceptionBreakpointFilters` capability.")
    private String filterId;
    /**
     * An expression for conditional exceptions.
     * The exception breaks into the debugger if the result of the condition is true.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("An expression for conditional exceptions.\nThe exception breaks into the debugger if the result of the condition is true.")
    private String condition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * ID of an exception filter returned by the `exceptionBreakpointFilters` capability.
     * (Required)
     * 
     */
    @JsonProperty("filterId")
    public String getFilterId() {
        return filterId;
    }

    /**
     * ID of an exception filter returned by the `exceptionBreakpointFilters` capability.
     * (Required)
     * 
     */
    @JsonProperty("filterId")
    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    /**
     * An expression for conditional exceptions.
     * The exception breaks into the debugger if the result of the condition is true.
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * An expression for conditional exceptions.
     * The exception breaks into the debugger if the result of the condition is true.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
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
        sb.append(ExceptionFilterOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("filterId");
        sb.append('=');
        sb.append(((this.filterId == null)?"<null>":this.filterId));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
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
        result = ((result* 31)+((this.filterId == null)? 0 :this.filterId.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExceptionFilterOptions) == false) {
            return false;
        }
        ExceptionFilterOptions rhs = ((ExceptionFilterOptions) other);
        return ((((this.filterId == rhs.filterId)||((this.filterId!= null)&&this.filterId.equals(rhs.filterId)))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
