
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
 * Arguments for `setVariable` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "variablesReference",
    "name",
    "value",
    "format"
})
@Generated("jsonschema2pojo")
public class SetVariableArguments {

    /**
     * The reference of the variable container. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    @JsonPropertyDescription("The reference of the variable container. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.")
    private Integer variablesReference;
    /**
     * The name of the variable in the container.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the variable in the container.")
    private String name;
    /**
     * The value of the variable.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The value of the variable.")
    private String value;
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
     * The reference of the variable container. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    public Integer getVariablesReference() {
        return variablesReference;
    }

    /**
     * The reference of the variable container. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    public void setVariablesReference(Integer variablesReference) {
        this.variablesReference = variablesReference;
    }

    /**
     * The name of the variable in the container.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the variable in the container.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The value of the variable.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * The value of the variable.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
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
        sb.append(SetVariableArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("variablesReference");
        sb.append('=');
        sb.append(((this.variablesReference == null)?"<null>":this.variablesReference));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.variablesReference == null)? 0 :this.variablesReference.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetVariableArguments) == false) {
            return false;
        }
        SetVariableArguments rhs = ((SetVariableArguments) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.variablesReference == rhs.variablesReference)||((this.variablesReference!= null)&&this.variablesReference.equals(rhs.variablesReference))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
