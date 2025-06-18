
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
 * Properties of a breakpoint or logpoint passed to the `setBreakpoints` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "line",
    "column",
    "condition",
    "hitCondition",
    "logMessage"
})
@Generated("jsonschema2pojo")
public class SourceBreakpoint {

    /**
     * The source line of the breakpoint or logpoint.
     * (Required)
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("The source line of the breakpoint or logpoint.")
    private Integer line;
    /**
     * Start position within source line of the breakpoint or logpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("Start position within source line of the breakpoint or logpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.")
    private Integer column;
    /**
     * The expression for conditional breakpoints.
     * It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("The expression for conditional breakpoints.\nIt is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.")
    private String condition;
    /**
     * The expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
     * If both this property and `condition` are specified, `hitCondition` should be evaluated only if the `condition` is met, and the debug adapter should stop only if both conditions are met.
     * 
     */
    @JsonProperty("hitCondition")
    @JsonPropertyDescription("The expression that controls how many hits of the breakpoint are ignored.\nThe debug adapter is expected to interpret the expression as needed.\nThe attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.\nIf both this property and `condition` are specified, `hitCondition` should be evaluated only if the `condition` is met, and the debug adapter should stop only if both conditions are met.")
    private String hitCondition;
    /**
     * If this attribute exists and is non-empty, the debug adapter must not 'break' (stop)
     * but log the message instead. Expressions within `{}` are interpolated.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsLogPoints` is true.
     * If either `hitCondition` or `condition` is specified, then the message should only be logged if those conditions are met.
     * 
     */
    @JsonProperty("logMessage")
    @JsonPropertyDescription("If this attribute exists and is non-empty, the debug adapter must not 'break' (stop)\nbut log the message instead. Expressions within `{}` are interpolated.\nThe attribute is only honored by a debug adapter if the corresponding capability `supportsLogPoints` is true.\nIf either `hitCondition` or `condition` is specified, then the message should only be logged if those conditions are met.")
    private String logMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The source line of the breakpoint or logpoint.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * The source line of the breakpoint or logpoint.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * Start position within source line of the breakpoint or logpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * Start position within source line of the breakpoint or logpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * The expression for conditional breakpoints.
     * It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * The expression for conditional breakpoints.
     * It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * The expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
     * If both this property and `condition` are specified, `hitCondition` should be evaluated only if the `condition` is met, and the debug adapter should stop only if both conditions are met.
     * 
     */
    @JsonProperty("hitCondition")
    public String getHitCondition() {
        return hitCondition;
    }

    /**
     * The expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
     * If both this property and `condition` are specified, `hitCondition` should be evaluated only if the `condition` is met, and the debug adapter should stop only if both conditions are met.
     * 
     */
    @JsonProperty("hitCondition")
    public void setHitCondition(String hitCondition) {
        this.hitCondition = hitCondition;
    }

    /**
     * If this attribute exists and is non-empty, the debug adapter must not 'break' (stop)
     * but log the message instead. Expressions within `{}` are interpolated.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsLogPoints` is true.
     * If either `hitCondition` or `condition` is specified, then the message should only be logged if those conditions are met.
     * 
     */
    @JsonProperty("logMessage")
    public String getLogMessage() {
        return logMessage;
    }

    /**
     * If this attribute exists and is non-empty, the debug adapter must not 'break' (stop)
     * but log the message instead. Expressions within `{}` are interpolated.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsLogPoints` is true.
     * If either `hitCondition` or `condition` is specified, then the message should only be logged if those conditions are met.
     * 
     */
    @JsonProperty("logMessage")
    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
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
        sb.append(SourceBreakpoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
        sb.append(',');
        sb.append("column");
        sb.append('=');
        sb.append(((this.column == null)?"<null>":this.column));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("hitCondition");
        sb.append('=');
        sb.append(((this.hitCondition == null)?"<null>":this.hitCondition));
        sb.append(',');
        sb.append("logMessage");
        sb.append('=');
        sb.append(((this.logMessage == null)?"<null>":this.logMessage));
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
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.hitCondition == null)? 0 :this.hitCondition.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.logMessage == null)? 0 :this.logMessage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceBreakpoint) == false) {
            return false;
        }
        SourceBreakpoint rhs = ((SourceBreakpoint) other);
        return (((((((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column)))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.hitCondition == rhs.hitCondition)||((this.hitCondition!= null)&&this.hitCondition.equals(rhs.hitCondition))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.logMessage == rhs.logMessage)||((this.logMessage!= null)&&this.logMessage.equals(rhs.logMessage))));
    }

}
