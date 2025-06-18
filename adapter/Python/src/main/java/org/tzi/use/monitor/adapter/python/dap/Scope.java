
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
 * A `Scope` is a named container for variables. Optionally a scope can map to a source or a range within a source.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "presentationHint",
    "variablesReference",
    "namedVariables",
    "indexedVariables",
    "expensive",
    "source",
    "line",
    "column",
    "endLine",
    "endColumn"
})
@Generated("jsonschema2pojo")
public class Scope {

    /**
     * Name of the scope such as 'Arguments', 'Locals', or 'Registers'. This string is shown in the UI as is and can be translated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the scope such as 'Arguments', 'Locals', or 'Registers'. This string is shown in the UI as is and can be translated.")
    private String name;
    /**
     * A hint for how to present this scope in the UI. If this attribute is missing, the scope is shown with a generic UI.
     * 
     */
    @JsonProperty("presentationHint")
    @JsonPropertyDescription("A hint for how to present this scope in the UI. If this attribute is missing, the scope is shown with a generic UI.")
    private String presentationHint;
    /**
     * The variables of this scope can be retrieved by passing the value of `variablesReference` to the `variables` request as long as execution remains suspended. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    @JsonPropertyDescription("The variables of this scope can be retrieved by passing the value of `variablesReference` to the `variables` request as long as execution remains suspended. See 'Lifetime of Object References' in the Overview section for details.")
    private Integer variablesReference;
    /**
     * The number of named variables in this scope.
     * The client can use this information to present the variables in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("namedVariables")
    @JsonPropertyDescription("The number of named variables in this scope.\nThe client can use this information to present the variables in a paged UI and fetch them in chunks.")
    private Integer namedVariables;
    /**
     * The number of indexed variables in this scope.
     * The client can use this information to present the variables in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("indexedVariables")
    @JsonPropertyDescription("The number of indexed variables in this scope.\nThe client can use this information to present the variables in a paged UI and fetch them in chunks.")
    private Integer indexedVariables;
    /**
     * If true, the number of variables in this scope is large or expensive to retrieve.
     * (Required)
     * 
     */
    @JsonProperty("expensive")
    @JsonPropertyDescription("If true, the number of variables in this scope is large or expensive to retrieve.")
    private Boolean expensive;
    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A `Source` is a descriptor for source code.\nIt is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.")
    private Source source;
    /**
     * The start line of the range covered by this scope.
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("The start line of the range covered by this scope.")
    private Integer line;
    /**
     * Start position of the range covered by the scope. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("Start position of the range covered by the scope. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.")
    private Integer column;
    /**
     * The end line of the range covered by this scope.
     * 
     */
    @JsonProperty("endLine")
    @JsonPropertyDescription("The end line of the range covered by this scope.")
    private Integer endLine;
    /**
     * End position of the range covered by the scope. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("endColumn")
    @JsonPropertyDescription("End position of the range covered by the scope. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.")
    private Integer endColumn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name of the scope such as 'Arguments', 'Locals', or 'Registers'. This string is shown in the UI as is and can be translated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the scope such as 'Arguments', 'Locals', or 'Registers'. This string is shown in the UI as is and can be translated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A hint for how to present this scope in the UI. If this attribute is missing, the scope is shown with a generic UI.
     * 
     */
    @JsonProperty("presentationHint")
    public String getPresentationHint() {
        return presentationHint;
    }

    /**
     * A hint for how to present this scope in the UI. If this attribute is missing, the scope is shown with a generic UI.
     * 
     */
    @JsonProperty("presentationHint")
    public void setPresentationHint(String presentationHint) {
        this.presentationHint = presentationHint;
    }

    /**
     * The variables of this scope can be retrieved by passing the value of `variablesReference` to the `variables` request as long as execution remains suspended. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    public Integer getVariablesReference() {
        return variablesReference;
    }

    /**
     * The variables of this scope can be retrieved by passing the value of `variablesReference` to the `variables` request as long as execution remains suspended. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    public void setVariablesReference(Integer variablesReference) {
        this.variablesReference = variablesReference;
    }

    /**
     * The number of named variables in this scope.
     * The client can use this information to present the variables in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("namedVariables")
    public Integer getNamedVariables() {
        return namedVariables;
    }

    /**
     * The number of named variables in this scope.
     * The client can use this information to present the variables in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("namedVariables")
    public void setNamedVariables(Integer namedVariables) {
        this.namedVariables = namedVariables;
    }

    /**
     * The number of indexed variables in this scope.
     * The client can use this information to present the variables in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("indexedVariables")
    public Integer getIndexedVariables() {
        return indexedVariables;
    }

    /**
     * The number of indexed variables in this scope.
     * The client can use this information to present the variables in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("indexedVariables")
    public void setIndexedVariables(Integer indexedVariables) {
        this.indexedVariables = indexedVariables;
    }

    /**
     * If true, the number of variables in this scope is large or expensive to retrieve.
     * (Required)
     * 
     */
    @JsonProperty("expensive")
    public Boolean getExpensive() {
        return expensive;
    }

    /**
     * If true, the number of variables in this scope is large or expensive to retrieve.
     * (Required)
     * 
     */
    @JsonProperty("expensive")
    public void setExpensive(Boolean expensive) {
        this.expensive = expensive;
    }

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * The start line of the range covered by this scope.
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * The start line of the range covered by this scope.
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * Start position of the range covered by the scope. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * Start position of the range covered by the scope. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * The end line of the range covered by this scope.
     * 
     */
    @JsonProperty("endLine")
    public Integer getEndLine() {
        return endLine;
    }

    /**
     * The end line of the range covered by this scope.
     * 
     */
    @JsonProperty("endLine")
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * End position of the range covered by the scope. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("endColumn")
    public Integer getEndColumn() {
        return endColumn;
    }

    /**
     * End position of the range covered by the scope. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("endColumn")
    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
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
        sb.append(Scope.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("presentationHint");
        sb.append('=');
        sb.append(((this.presentationHint == null)?"<null>":this.presentationHint));
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
        sb.append("expensive");
        sb.append('=');
        sb.append(((this.expensive == null)?"<null>":this.expensive));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
        sb.append(',');
        sb.append("column");
        sb.append('=');
        sb.append(((this.column == null)?"<null>":this.column));
        sb.append(',');
        sb.append("endLine");
        sb.append('=');
        sb.append(((this.endLine == null)?"<null>":this.endLine));
        sb.append(',');
        sb.append("endColumn");
        sb.append('=');
        sb.append(((this.endColumn == null)?"<null>":this.endColumn));
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
        result = ((result* 31)+((this.endLine == null)? 0 :this.endLine.hashCode()));
        result = ((result* 31)+((this.indexedVariables == null)? 0 :this.indexedVariables.hashCode()));
        result = ((result* 31)+((this.endColumn == null)? 0 :this.endColumn.hashCode()));
        result = ((result* 31)+((this.presentationHint == null)? 0 :this.presentationHint.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.namedVariables == null)? 0 :this.namedVariables.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.variablesReference == null)? 0 :this.variablesReference.hashCode()));
        result = ((result* 31)+((this.expensive == null)? 0 :this.expensive.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scope) == false) {
            return false;
        }
        Scope rhs = ((Scope) other);
        return (((((((((((((this.endLine == rhs.endLine)||((this.endLine!= null)&&this.endLine.equals(rhs.endLine)))&&((this.indexedVariables == rhs.indexedVariables)||((this.indexedVariables!= null)&&this.indexedVariables.equals(rhs.indexedVariables))))&&((this.endColumn == rhs.endColumn)||((this.endColumn!= null)&&this.endColumn.equals(rhs.endColumn))))&&((this.presentationHint == rhs.presentationHint)||((this.presentationHint!= null)&&this.presentationHint.equals(rhs.presentationHint))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column))))&&((this.namedVariables == rhs.namedVariables)||((this.namedVariables!= null)&&this.namedVariables.equals(rhs.namedVariables))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.variablesReference == rhs.variablesReference)||((this.variablesReference!= null)&&this.variablesReference.equals(rhs.variablesReference))))&&((this.expensive == rhs.expensive)||((this.expensive!= null)&&this.expensive.equals(rhs.expensive))));
    }

}
