package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Properties of an evaluate result that can be used to determine how to render the result
 * in the UI.
 *
 * Properties of a variable that can be used to determine how to render the variable in the
 * UI.
 *
 * Properties of a value that can be used to determine how to render the result in the UI.
 */
public class VariablePresentationHint {
    private String[] attributes;
    private String kind;
    private Boolean lazy;
    private String visibility;

    /**
     * Set of attributes represented as an array of strings. Before introducing additional
     * values, try to use the listed values.
     */
    @JsonProperty("attributes")
    public String[] getAttributes() { return attributes; }
    @JsonProperty("attributes")
    public void setAttributes(String[] value) { this.attributes = value; }

    /**
     * The kind of variable. Before introducing additional values, try to use the listed values.
     */
    @JsonProperty("kind")
    public String getKind() { return kind; }
    @JsonProperty("kind")
    public void setKind(String value) { this.kind = value; }

    /**
     * If true, clients can present the variable with a UI that supports a specific gesture to
     * trigger its evaluation.
     * This mechanism can be used for properties that require executing code when retrieving
     * their value and where the code execution can be expensive and/or produce side-effects. A
     * typical example are properties based on a getter function.
     * Please note that in addition to the `lazy` flag, the variable's `variablesReference` is
     * expected to refer to a variable that will provide the value through another `variable`
     * request.
     */
    @JsonProperty("lazy")
    public Boolean getLazy() { return lazy; }
    @JsonProperty("lazy")
    public void setLazy(Boolean value) { this.lazy = value; }

    /**
     * Visibility of variable. Before introducing additional values, try to use the listed
     * values.
     */
    @JsonProperty("visibility")
    public String getVisibility() { return visibility; }
    @JsonProperty("visibility")
    public void setVisibility(String value) { this.visibility = value; }
}
