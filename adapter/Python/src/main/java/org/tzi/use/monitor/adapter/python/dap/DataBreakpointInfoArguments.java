
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
 * Arguments for `dataBreakpointInfo` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "variablesReference",
    "name",
    "frameId"
})
@Generated("jsonschema2pojo")
public class DataBreakpointInfoArguments {

    /**
     * Reference to the variable container if the data breakpoint is requested for a child of the container. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * 
     */
    @JsonProperty("variablesReference")
    @JsonPropertyDescription("Reference to the variable container if the data breakpoint is requested for a child of the container. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.")
    private Integer variablesReference;
    /**
     * The name of the variable's child to obtain data breakpoint information for.
     * If `variablesReference` isn't specified, this can be an expression.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the variable's child to obtain data breakpoint information for.\nIf `variablesReference` isn't specified, this can be an expression.")
    private String name;
    /**
     * When `name` is an expression, evaluate it in the scope of this stack frame. If not specified, the expression is evaluated in the global scope. When `variablesReference` is specified, this property has no effect.
     * 
     */
    @JsonProperty("frameId")
    @JsonPropertyDescription("When `name` is an expression, evaluate it in the scope of this stack frame. If not specified, the expression is evaluated in the global scope. When `variablesReference` is specified, this property has no effect.")
    private Integer frameId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Reference to the variable container if the data breakpoint is requested for a child of the container. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * 
     */
    @JsonProperty("variablesReference")
    public Integer getVariablesReference() {
        return variablesReference;
    }

    /**
     * Reference to the variable container if the data breakpoint is requested for a child of the container. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * 
     */
    @JsonProperty("variablesReference")
    public void setVariablesReference(Integer variablesReference) {
        this.variablesReference = variablesReference;
    }

    /**
     * The name of the variable's child to obtain data breakpoint information for.
     * If `variablesReference` isn't specified, this can be an expression.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the variable's child to obtain data breakpoint information for.
     * If `variablesReference` isn't specified, this can be an expression.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * When `name` is an expression, evaluate it in the scope of this stack frame. If not specified, the expression is evaluated in the global scope. When `variablesReference` is specified, this property has no effect.
     * 
     */
    @JsonProperty("frameId")
    public Integer getFrameId() {
        return frameId;
    }

    /**
     * When `name` is an expression, evaluate it in the scope of this stack frame. If not specified, the expression is evaluated in the global scope. When `variablesReference` is specified, this property has no effect.
     * 
     */
    @JsonProperty("frameId")
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
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
        sb.append(DataBreakpointInfoArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("variablesReference");
        sb.append('=');
        sb.append(((this.variablesReference == null)?"<null>":this.variablesReference));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("frameId");
        sb.append('=');
        sb.append(((this.frameId == null)?"<null>":this.frameId));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.variablesReference == null)? 0 :this.variablesReference.hashCode()));
        result = ((result* 31)+((this.frameId == null)? 0 :this.frameId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataBreakpointInfoArguments) == false) {
            return false;
        }
        DataBreakpointInfoArguments rhs = ((DataBreakpointInfoArguments) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.variablesReference == rhs.variablesReference)||((this.variablesReference!= null)&&this.variablesReference.equals(rhs.variablesReference))))&&((this.frameId == rhs.frameId)||((this.frameId!= null)&&this.frameId.equals(rhs.frameId))));
    }

}
