
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
 * Properties of a breakpoint passed to the `setInstructionBreakpoints` request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instructionReference",
    "offset",
    "condition",
    "hitCondition"
})
@Generated("jsonschema2pojo")
public class InstructionBreakpoint {

    /**
     * The instruction reference of the breakpoint.
     * This should be a memory or instruction pointer reference from an `EvaluateResponse`, `Variable`, `StackFrame`, `GotoTarget`, or `Breakpoint`.
     * (Required)
     * 
     */
    @JsonProperty("instructionReference")
    @JsonPropertyDescription("The instruction reference of the breakpoint.\nThis should be a memory or instruction pointer reference from an `EvaluateResponse`, `Variable`, `StackFrame`, `GotoTarget`, or `Breakpoint`.")
    private String instructionReference;
    /**
     * The offset from the instruction reference in bytes.
     * This can be negative.
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("The offset from the instruction reference in bytes.\nThis can be negative.")
    private Integer offset;
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
     * The instruction reference of the breakpoint.
     * This should be a memory or instruction pointer reference from an `EvaluateResponse`, `Variable`, `StackFrame`, `GotoTarget`, or `Breakpoint`.
     * (Required)
     * 
     */
    @JsonProperty("instructionReference")
    public String getInstructionReference() {
        return instructionReference;
    }

    /**
     * The instruction reference of the breakpoint.
     * This should be a memory or instruction pointer reference from an `EvaluateResponse`, `Variable`, `StackFrame`, `GotoTarget`, or `Breakpoint`.
     * (Required)
     * 
     */
    @JsonProperty("instructionReference")
    public void setInstructionReference(String instructionReference) {
        this.instructionReference = instructionReference;
    }

    /**
     * The offset from the instruction reference in bytes.
     * This can be negative.
     * 
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * The offset from the instruction reference in bytes.
     * This can be negative.
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
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
        sb.append(InstructionBreakpoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instructionReference");
        sb.append('=');
        sb.append(((this.instructionReference == null)?"<null>":this.instructionReference));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
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
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.hitCondition == null)? 0 :this.hitCondition.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.instructionReference == null)? 0 :this.instructionReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstructionBreakpoint) == false) {
            return false;
        }
        InstructionBreakpoint rhs = ((InstructionBreakpoint) other);
        return ((((((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition)))&&((this.hitCondition == rhs.hitCondition)||((this.hitCondition!= null)&&this.hitCondition.equals(rhs.hitCondition))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.instructionReference == rhs.instructionReference)||((this.instructionReference!= null)&&this.instructionReference.equals(rhs.instructionReference))));
    }

}
