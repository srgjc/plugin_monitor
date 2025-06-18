
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
 * Properties of a breakpoint passed to the `setFunctionBreakpoints` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "condition",
    "hitCondition"
})
@Generated("jsonschema2pojo")
public class FunctionBreakpoint {

    /**
     * The name of the function.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the function.")
    private String name;
    /**
     * An expression for conditional breakpoints.
     * It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("An expression for conditional breakpoints.\nIt is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.")
    private String condition;
    /**
     * An expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
     * 
     */
    @JsonProperty("hitCondition")
    @JsonPropertyDescription("An expression that controls how many hits of the breakpoint are ignored.\nThe debug adapter is expected to interpret the expression as needed.\nThe attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.")
    private String hitCondition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The name of the function.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the function.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An expression for conditional breakpoints.
     * It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * An expression for conditional breakpoints.
     * It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * An expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
     * 
     */
    @JsonProperty("hitCondition")
    public String getHitCondition() {
        return hitCondition;
    }

    /**
     * An expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
     * 
     */
    @JsonProperty("hitCondition")
    public void setHitCondition(String hitCondition) {
        this.hitCondition = hitCondition;
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
        sb.append(FunctionBreakpoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("hitCondition");
        sb.append('=');
        sb.append(((this.hitCondition == null)?"<null>":this.hitCondition));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.hitCondition == null)? 0 :this.hitCondition.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FunctionBreakpoint) == false) {
            return false;
        }
        FunctionBreakpoint rhs = ((FunctionBreakpoint) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.hitCondition == rhs.hitCondition)||((this.hitCondition!= null)&&this.hitCondition.equals(rhs.hitCondition))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
