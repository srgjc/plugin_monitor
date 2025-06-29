package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * A Variable is a name/value pair.
 * The `type` attribute is shown if space permits or when hovering over the variable's name.
 * The `kind` attribute is used to render additional properties of the variable, e.g.
 * different icons can be used to indicate that a variable is public or private.
 * If the value is structured (has children), a handle is provided to retrieve the children
 * with the `variables` request.
 * If the number of named or indexed children is large, the numbers should be returned via
 * the `namedVariables` and `indexedVariables` attributes.
 * The client can use this information to present the children in a paged UI and fetch them
 * in chunks.
 */
public class Variable {
    private String evaluateName;
    private Long indexedVariables;
    private String memoryReference;
    private String name;
    private Long namedVariables;
    private VariablePresentationHint presentationHint;
    private String type;
    private String value;
    private long variablesReference;

    /**
     * The evaluatable name of this variable which can be passed to the `evaluate` request to
     * fetch the variable's value.
     */
    @JsonProperty("evaluateName")
    public String getEvaluateName() { return evaluateName; }
    @JsonProperty("evaluateName")
    public void setEvaluateName(String value) { this.evaluateName = value; }

    /**
     * The number of indexed child variables.
     * The client can use this information to present the children in a paged UI and fetch them
     * in chunks.
     */
    @JsonProperty("indexedVariables")
    public Long getIndexedVariables() { return indexedVariables; }
    @JsonProperty("indexedVariables")
    public void setIndexedVariables(Long value) { this.indexedVariables = value; }

    /**
     * A memory reference associated with this variable.
     * For pointer type variables, this is generally a reference to the memory address contained
     * in the pointer.
     * For executable data, this reference may later be used in a `disassemble` request.
     * This attribute may be returned by a debug adapter if corresponding capability
     * `supportsMemoryReferences` is true.
     */
    @JsonProperty("memoryReference")
    public String getMemoryReference() { return memoryReference; }
    @JsonProperty("memoryReference")
    public void setMemoryReference(String value) { this.memoryReference = value; }

    /**
     * The variable's name.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The number of named child variables.
     * The client can use this information to present the children in a paged UI and fetch them
     * in chunks.
     */
    @JsonProperty("namedVariables")
    public Long getNamedVariables() { return namedVariables; }
    @JsonProperty("namedVariables")
    public void setNamedVariables(Long value) { this.namedVariables = value; }

    /**
     * Properties of a variable that can be used to determine how to render the variable in the
     * UI.
     */
    @JsonProperty("presentationHint")
    public VariablePresentationHint getPresentationHint() { return presentationHint; }
    @JsonProperty("presentationHint")
    public void setPresentationHint(VariablePresentationHint value) { this.presentationHint = value; }

    /**
     * The type of the variable's value. Typically shown in the UI when hovering over the value.
     * This attribute should only be returned by a debug adapter if the corresponding capability
     * `supportsVariableType` is true.
     */
    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    /**
     * The variable's value.
     * This can be a multi-line text, e.g. for a function the body of a function.
     * For structured variables (which do not have a simple value), it is recommended to provide
     * a one-line representation of the structured object. This helps to identify the structured
     * object in the collapsed state when its children are not yet visible.
     * An empty string can be used if no value should be shown in the UI.
     */
    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }

    /**
     * If `variablesReference` is > 0, the variable is structured and its children can be
     * retrieved by passing `variablesReference` to the `variables` request as long as execution
     * remains suspended. See 'Lifetime of Object References' in the Overview section for
     * details.
     */
    @JsonProperty("variablesReference")
    public long getVariablesReference() { return variablesReference; }
    @JsonProperty("variablesReference")
    public void setVariablesReference(long value) { this.variablesReference = value; }
}
