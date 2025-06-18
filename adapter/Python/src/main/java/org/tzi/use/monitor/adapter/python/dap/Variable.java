
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
 * A Variable is a name/value pair.
 * The `type` attribute is shown if space permits or when hovering over the variable's name.
 * The `kind` attribute is used to render additional properties of the variable, e.g. different icons can be used to indicate that a variable is public or private.
 * If the value is structured (has children), a handle is provided to retrieve the children with the `variables` request.
 * If the number of named or indexed children is large, the numbers should be returned via the `namedVariables` and `indexedVariables` attributes.
 * The client can use this information to present the children in a paged UI and fetch them in chunks.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "value",
    "type",
    "presentationHint",
    "evaluateName",
    "variablesReference",
    "namedVariables",
    "indexedVariables",
    "memoryReference"
})
@Generated("jsonschema2pojo")
public class Variable {

    /**
     * The variable's name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The variable's name.")
    private String name;
    /**
     * The variable's value.
     * This can be a multi-line text, e.g. for a function the body of a function.
     * For structured variables (which do not have a simple value), it is recommended to provide a one-line representation of the structured object. This helps to identify the structured object in the collapsed state when its children are not yet visible.
     * An empty string can be used if no value should be shown in the UI.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The variable's value.\nThis can be a multi-line text, e.g. for a function the body of a function.\nFor structured variables (which do not have a simple value), it is recommended to provide a one-line representation of the structured object. This helps to identify the structured object in the collapsed state when its children are not yet visible.\nAn empty string can be used if no value should be shown in the UI.")
    private String value;
    /**
     * The type of the variable's value. Typically shown in the UI when hovering over the value.
     * This attribute should only be returned by a debug adapter if the corresponding capability `supportsVariableType` is true.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the variable's value. Typically shown in the UI when hovering over the value.\nThis attribute should only be returned by a debug adapter if the corresponding capability `supportsVariableType` is true.")
    private String type;
    /**
     * Properties of a variable that can be used to determine how to render the variable in the UI.
     * 
     */
    @JsonProperty("presentationHint")
    @JsonPropertyDescription("Properties of a variable that can be used to determine how to render the variable in the UI.")
    private VariablePresentationHint presentationHint;
    /**
     * The evaluatable name of this variable which can be passed to the `evaluate` request to fetch the variable's value.
     * 
     */
    @JsonProperty("evaluateName")
    @JsonPropertyDescription("The evaluatable name of this variable which can be passed to the `evaluate` request to fetch the variable's value.")
    private String evaluateName;
    /**
     * If `variablesReference` is > 0, the variable is structured and its children can be retrieved by passing `variablesReference` to the `variables` request as long as execution remains suspended. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    @JsonPropertyDescription("If `variablesReference` is > 0, the variable is structured and its children can be retrieved by passing `variablesReference` to the `variables` request as long as execution remains suspended. See 'Lifetime of Object References' in the Overview section for details.")
    private Integer variablesReference;
    /**
     * The number of named child variables.
     * The client can use this information to present the children in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("namedVariables")
    @JsonPropertyDescription("The number of named child variables.\nThe client can use this information to present the children in a paged UI and fetch them in chunks.")
    private Integer namedVariables;
    /**
     * The number of indexed child variables.
     * The client can use this information to present the children in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("indexedVariables")
    @JsonPropertyDescription("The number of indexed child variables.\nThe client can use this information to present the children in a paged UI and fetch them in chunks.")
    private Integer indexedVariables;
    /**
     * A memory reference associated with this variable.
     * For pointer type variables, this is generally a reference to the memory address contained in the pointer.
     * For executable data, this reference may later be used in a `disassemble` request.
     * This attribute may be returned by a debug adapter if corresponding capability `supportsMemoryReferences` is true.
     * 
     */
    @JsonProperty("memoryReference")
    @JsonPropertyDescription("A memory reference associated with this variable.\nFor pointer type variables, this is generally a reference to the memory address contained in the pointer.\nFor executable data, this reference may later be used in a `disassemble` request.\nThis attribute may be returned by a debug adapter if corresponding capability `supportsMemoryReferences` is true.")
    private String memoryReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The variable's name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The variable's name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The variable's value.
     * This can be a multi-line text, e.g. for a function the body of a function.
     * For structured variables (which do not have a simple value), it is recommended to provide a one-line representation of the structured object. This helps to identify the structured object in the collapsed state when its children are not yet visible.
     * An empty string can be used if no value should be shown in the UI.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * The variable's value.
     * This can be a multi-line text, e.g. for a function the body of a function.
     * For structured variables (which do not have a simple value), it is recommended to provide a one-line representation of the structured object. This helps to identify the structured object in the collapsed state when its children are not yet visible.
     * An empty string can be used if no value should be shown in the UI.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The type of the variable's value. Typically shown in the UI when hovering over the value.
     * This attribute should only be returned by a debug adapter if the corresponding capability `supportsVariableType` is true.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of the variable's value. Typically shown in the UI when hovering over the value.
     * This attribute should only be returned by a debug adapter if the corresponding capability `supportsVariableType` is true.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Properties of a variable that can be used to determine how to render the variable in the UI.
     * 
     */
    @JsonProperty("presentationHint")
    public VariablePresentationHint getPresentationHint() {
        return presentationHint;
    }

    /**
     * Properties of a variable that can be used to determine how to render the variable in the UI.
     * 
     */
    @JsonProperty("presentationHint")
    public void setPresentationHint(VariablePresentationHint presentationHint) {
        this.presentationHint = presentationHint;
    }

    /**
     * The evaluatable name of this variable which can be passed to the `evaluate` request to fetch the variable's value.
     * 
     */
    @JsonProperty("evaluateName")
    public String getEvaluateName() {
        return evaluateName;
    }

    /**
     * The evaluatable name of this variable which can be passed to the `evaluate` request to fetch the variable's value.
     * 
     */
    @JsonProperty("evaluateName")
    public void setEvaluateName(String evaluateName) {
        this.evaluateName = evaluateName;
    }

    /**
     * If `variablesReference` is > 0, the variable is structured and its children can be retrieved by passing `variablesReference` to the `variables` request as long as execution remains suspended. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    public Integer getVariablesReference() {
        return variablesReference;
    }

    /**
     * If `variablesReference` is > 0, the variable is structured and its children can be retrieved by passing `variablesReference` to the `variables` request as long as execution remains suspended. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    public void setVariablesReference(Integer variablesReference) {
        this.variablesReference = variablesReference;
    }

    /**
     * The number of named child variables.
     * The client can use this information to present the children in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("namedVariables")
    public Integer getNamedVariables() {
        return namedVariables;
    }

    /**
     * The number of named child variables.
     * The client can use this information to present the children in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("namedVariables")
    public void setNamedVariables(Integer namedVariables) {
        this.namedVariables = namedVariables;
    }

    /**
     * The number of indexed child variables.
     * The client can use this information to present the children in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("indexedVariables")
    public Integer getIndexedVariables() {
        return indexedVariables;
    }

    /**
     * The number of indexed child variables.
     * The client can use this information to present the children in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("indexedVariables")
    public void setIndexedVariables(Integer indexedVariables) {
        this.indexedVariables = indexedVariables;
    }

    /**
     * A memory reference associated with this variable.
     * For pointer type variables, this is generally a reference to the memory address contained in the pointer.
     * For executable data, this reference may later be used in a `disassemble` request.
     * This attribute may be returned by a debug adapter if corresponding capability `supportsMemoryReferences` is true.
     * 
     */
    @JsonProperty("memoryReference")
    public String getMemoryReference() {
        return memoryReference;
    }

    /**
     * A memory reference associated with this variable.
     * For pointer type variables, this is generally a reference to the memory address contained in the pointer.
     * For executable data, this reference may later be used in a `disassemble` request.
     * This attribute may be returned by a debug adapter if corresponding capability `supportsMemoryReferences` is true.
     * 
     */
    @JsonProperty("memoryReference")
    public void setMemoryReference(String memoryReference) {
        this.memoryReference = memoryReference;
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
        sb.append(Variable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("presentationHint");
        sb.append('=');
        sb.append(((this.presentationHint == null)?"<null>":this.presentationHint));
        sb.append(',');
        sb.append("evaluateName");
        sb.append('=');
        sb.append(((this.evaluateName == null)?"<null>":this.evaluateName));
        sb.append(',');
        sb.append("variablesReference");
        sb.append('=');
        sb.append(((this.variablesReference == null)?"<null>":this.variablesReference));
        sb.append(',');
        sb.append("namedVariables");
        sb.append('=');
        sb.append(((this.namedVariables == null)?"<null>":this.namedVariables));
        sb.append(',');
        sb.append("indexedVariables");
        sb.append('=');
        sb.append(((this.indexedVariables == null)?"<null>":this.indexedVariables));
        sb.append(',');
        sb.append("memoryReference");
        sb.append('=');
        sb.append(((this.memoryReference == null)?"<null>":this.memoryReference));
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
        result = ((result* 31)+((this.indexedVariables == null)? 0 :this.indexedVariables.hashCode()));
        result = ((result* 31)+((this.memoryReference == null)? 0 :this.memoryReference.hashCode()));
        result = ((result* 31)+((this.presentationHint == null)? 0 :this.presentationHint.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.namedVariables == null)? 0 :this.namedVariables.hashCode()));
        result = ((result* 31)+((this.evaluateName == null)? 0 :this.evaluateName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.variablesReference == null)? 0 :this.variablesReference.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Variable) == false) {
            return false;
        }
        Variable rhs = ((Variable) other);
        return (((((((((((this.indexedVariables == rhs.indexedVariables)||((this.indexedVariables!= null)&&this.indexedVariables.equals(rhs.indexedVariables)))&&((this.memoryReference == rhs.memoryReference)||((this.memoryReference!= null)&&this.memoryReference.equals(rhs.memoryReference))))&&((this.presentationHint == rhs.presentationHint)||((this.presentationHint!= null)&&this.presentationHint.equals(rhs.presentationHint))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.namedVariables == rhs.namedVariables)||((this.namedVariables!= null)&&this.namedVariables.equals(rhs.namedVariables))))&&((this.evaluateName == rhs.evaluateName)||((this.evaluateName!= null)&&this.evaluateName.equals(rhs.evaluateName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.variablesReference == rhs.variablesReference)||((this.variablesReference!= null)&&this.variablesReference.equals(rhs.variablesReference))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
