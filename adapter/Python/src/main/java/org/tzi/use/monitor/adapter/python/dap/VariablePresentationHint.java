
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
 * Properties of a variable that can be used to determine how to render the variable in the UI.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "attributes",
    "visibility",
    "lazy"
})
@Generated("jsonschema2pojo")
public class VariablePresentationHint {

    /**
     * The kind of variable. Before introducing additional values, try to use the listed values.
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("The kind of variable. Before introducing additional values, try to use the listed values.")
    private String kind;
    /**
     * Set of attributes represented as an array of strings. Before introducing additional values, try to use the listed values.
     * 
     */
    @JsonProperty("attributes")
    @JsonPropertyDescription("Set of attributes represented as an array of strings. Before introducing additional values, try to use the listed values.")
    private List<String> attributes = new ArrayList<String>();
    /**
     * Visibility of variable. Before introducing additional values, try to use the listed values.
     * 
     */
    @JsonProperty("visibility")
    @JsonPropertyDescription("Visibility of variable. Before introducing additional values, try to use the listed values.")
    private String visibility;
    /**
     * If true, clients can present the variable with a UI that supports a specific gesture to trigger its evaluation.
     * This mechanism can be used for properties that require executing code when retrieving their value and where the code execution can be expensive and/or produce side-effects. A typical example are properties based on a getter function.
     * Please note that in addition to the `lazy` flag, the variable's `variablesReference` is expected to refer to a variable that will provide the value through another `variable` request.
     * 
     */
    @JsonProperty("lazy")
    @JsonPropertyDescription("If true, clients can present the variable with a UI that supports a specific gesture to trigger its evaluation.\nThis mechanism can be used for properties that require executing code when retrieving their value and where the code execution can be expensive and/or produce side-effects. A typical example are properties based on a getter function.\nPlease note that in addition to the `lazy` flag, the variable's `variablesReference` is expected to refer to a variable that will provide the value through another `variable` request.")
    private Boolean lazy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The kind of variable. Before introducing additional values, try to use the listed values.
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * The kind of variable. Before introducing additional values, try to use the listed values.
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Set of attributes represented as an array of strings. Before introducing additional values, try to use the listed values.
     * 
     */
    @JsonProperty("attributes")
    public List<String> getAttributes() {
        return attributes;
    }

    /**
     * Set of attributes represented as an array of strings. Before introducing additional values, try to use the listed values.
     * 
     */
    @JsonProperty("attributes")
    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    /**
     * Visibility of variable. Before introducing additional values, try to use the listed values.
     * 
     */
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    /**
     * Visibility of variable. Before introducing additional values, try to use the listed values.
     * 
     */
    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * If true, clients can present the variable with a UI that supports a specific gesture to trigger its evaluation.
     * This mechanism can be used for properties that require executing code when retrieving their value and where the code execution can be expensive and/or produce side-effects. A typical example are properties based on a getter function.
     * Please note that in addition to the `lazy` flag, the variable's `variablesReference` is expected to refer to a variable that will provide the value through another `variable` request.
     * 
     */
    @JsonProperty("lazy")
    public Boolean getLazy() {
        return lazy;
    }

    /**
     * If true, clients can present the variable with a UI that supports a specific gesture to trigger its evaluation.
     * This mechanism can be used for properties that require executing code when retrieving their value and where the code execution can be expensive and/or produce side-effects. A typical example are properties based on a getter function.
     * Please note that in addition to the `lazy` flag, the variable's `variablesReference` is expected to refer to a variable that will provide the value through another `variable` request.
     * 
     */
    @JsonProperty("lazy")
    public void setLazy(Boolean lazy) {
        this.lazy = lazy;
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
        sb.append(VariablePresentationHint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null)?"<null>":this.attributes));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("lazy");
        sb.append('=');
        sb.append(((this.lazy == null)?"<null>":this.lazy));
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
        result = ((result* 31)+((this.attributes == null)? 0 :this.attributes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.lazy == null)? 0 :this.lazy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VariablePresentationHint) == false) {
            return false;
        }
        VariablePresentationHint rhs = ((VariablePresentationHint) other);
        return ((((((this.attributes == rhs.attributes)||((this.attributes!= null)&&this.attributes.equals(rhs.attributes)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.lazy == rhs.lazy)||((this.lazy!= null)&&this.lazy.equals(rhs.lazy))));
    }

}
