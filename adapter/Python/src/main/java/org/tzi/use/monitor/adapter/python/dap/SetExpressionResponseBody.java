package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class SetExpressionResponseBody {
    private Long indexedVariables;
    private String memoryReference;
    private Long namedVariables;
    private VariablePresentationHint presentationHint;
    private String type;
    private String value;
    private Long variablesReference;

    /**
     * The number of indexed child variables.
     * The client can use this information to present the variables in a paged UI and fetch them
     * in chunks.
     * The value should be less than or equal to 2147483647 (2^31-1).
     */
    @JsonProperty("indexedVariables")
    public Long getIndexedVariables() { return indexedVariables; }
    @JsonProperty("indexedVariables")
    public void setIndexedVariables(Long value) { this.indexedVariables = value; }

    /**
     * A memory reference to a location appropriate for this result.
     * For pointer type eval results, this is generally a reference to the memory address
     * contained in the pointer.
     * This attribute may be returned by a debug adapter if corresponding capability
     * `supportsMemoryReferences` is true.
     */
    @JsonProperty("memoryReference")
    public String getMemoryReference() { return memoryReference; }
    @JsonProperty("memoryReference")
    public void setMemoryReference(String value) { this.memoryReference = value; }

    /**
     * The number of named child variables.
     * The client can use this information to present the variables in a paged UI and fetch them
     * in chunks.
     * The value should be less than or equal to 2147483647 (2^31-1).
     */
    @JsonProperty("namedVariables")
    public Long getNamedVariables() { return namedVariables; }
    @JsonProperty("namedVariables")
    public void setNamedVariables(Long value) { this.namedVariables = value; }

    /**
     * Properties of a value that can be used to determine how to render the result in the UI.
     */
    @JsonProperty("presentationHint")
    public VariablePresentationHint getPresentationHint() { return presentationHint; }
    @JsonProperty("presentationHint")
    public void setPresentationHint(VariablePresentationHint value) { this.presentationHint = value; }

    /**
     * The type of the value.
     * This attribute should only be returned by a debug adapter if the corresponding capability
     * `supportsVariableType` is true.
     */
    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    /**
     * The new value of the expression.
     */
    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }

    /**
     * If `variablesReference` is > 0, the evaluate result is structured and its children can be
     * retrieved by passing `variablesReference` to the `variables` request as long as execution
     * remains suspended. See 'Lifetime of Object References' in the Overview section for
     * details.
     */
    @JsonProperty("variablesReference")
    public Long getVariablesReference() { return variablesReference; }
    @JsonProperty("variablesReference")
    public void setVariablesReference(Long value) { this.variablesReference = value; }
}
