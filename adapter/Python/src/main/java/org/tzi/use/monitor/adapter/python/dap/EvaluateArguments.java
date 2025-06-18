
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
 * Arguments for `evaluate` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expression",
    "frameId",
    "context",
    "format"
})
@Generated("jsonschema2pojo")
public class EvaluateArguments {

    /**
     * The expression to evaluate.
     * (Required)
     * 
     */
    @JsonProperty("expression")
    @JsonPropertyDescription("The expression to evaluate.")
    private String expression;
    /**
     * Evaluate the expression in the scope of this stack frame. If not specified, the expression is evaluated in the global scope.
     * 
     */
    @JsonProperty("frameId")
    @JsonPropertyDescription("Evaluate the expression in the scope of this stack frame. If not specified, the expression is evaluated in the global scope.")
    private Integer frameId;
    /**
     * The context in which the evaluate request is used.
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("The context in which the evaluate request is used.")
    private String context;
    /**
     * Provides formatting information for a value.
     * 
     */
    @JsonProperty("format")
    @JsonPropertyDescription("Provides formatting information for a value.")
    private ValueFormat format;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The expression to evaluate.
     * (Required)
     * 
     */
    @JsonProperty("expression")
    public String getExpression() {
        return expression;
    }

    /**
     * The expression to evaluate.
     * (Required)
     * 
     */
    @JsonProperty("expression")
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * Evaluate the expression in the scope of this stack frame. If not specified, the expression is evaluated in the global scope.
     * 
     */
    @JsonProperty("frameId")
    public Integer getFrameId() {
        return frameId;
    }

    /**
     * Evaluate the expression in the scope of this stack frame. If not specified, the expression is evaluated in the global scope.
     * 
     */
    @JsonProperty("frameId")
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
    }

    /**
     * The context in which the evaluate request is used.
     * 
     */
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    /**
     * The context in which the evaluate request is used.
     * 
     */
    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * Provides formatting information for a value.
     * 
     */
    @JsonProperty("format")
    public ValueFormat getFormat() {
        return format;
    }

    /**
     * Provides formatting information for a value.
     * 
     */
    @JsonProperty("format")
    public void setFormat(ValueFormat format) {
        this.format = format;
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
        sb.append(EvaluateArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("expression");
        sb.append('=');
        sb.append(((this.expression == null)?"<null>":this.expression));
        sb.append(',');
        sb.append("frameId");
        sb.append('=');
        sb.append(((this.frameId == null)?"<null>":this.frameId));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
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
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.expression == null)? 0 :this.expression.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.frameId == null)? 0 :this.frameId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EvaluateArguments) == false) {
            return false;
        }
        EvaluateArguments rhs = ((EvaluateArguments) other);
        return ((((((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context)))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.expression == rhs.expression)||((this.expression!= null)&&this.expression.equals(rhs.expression))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.frameId == rhs.frameId)||((this.frameId!= null)&&this.frameId.equals(rhs.frameId))));
    }

}
