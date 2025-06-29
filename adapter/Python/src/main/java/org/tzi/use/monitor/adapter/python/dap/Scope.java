package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * A `Scope` is a named container for variables. Optionally a scope can map to a source or a
 * range within a source.
 */
public class Scope {
    private Long column;
    private Long endColumn;
    private Long endLine;
    private boolean expensive;
    private Long indexedVariables;
    private Long line;
    private String name;
    private Long namedVariables;
    private String presentationHint;
    private Source source;
    private long variablesReference;

    /**
     * Start position of the range covered by the scope. It is measured in UTF-16 code units and
     * the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * End position of the range covered by the scope. It is measured in UTF-16 code units and
     * the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     */
    @JsonProperty("endColumn")
    public Long getEndColumn() { return endColumn; }
    @JsonProperty("endColumn")
    public void setEndColumn(Long value) { this.endColumn = value; }

    /**
     * The end line of the range covered by this scope.
     */
    @JsonProperty("endLine")
    public Long getEndLine() { return endLine; }
    @JsonProperty("endLine")
    public void setEndLine(Long value) { this.endLine = value; }

    /**
     * If true, the number of variables in this scope is large or expensive to retrieve.
     */
    @JsonProperty("expensive")
    public boolean getExpensive() { return expensive; }
    @JsonProperty("expensive")
    public void setExpensive(boolean value) { this.expensive = value; }

    /**
     * The number of indexed variables in this scope.
     * The client can use this information to present the variables in a paged UI and fetch them
     * in chunks.
     */
    @JsonProperty("indexedVariables")
    public Long getIndexedVariables() { return indexedVariables; }
    @JsonProperty("indexedVariables")
    public void setIndexedVariables(Long value) { this.indexedVariables = value; }

    /**
     * The start line of the range covered by this scope.
     */
    @JsonProperty("line")
    public Long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(Long value) { this.line = value; }

    /**
     * Name of the scope such as 'Arguments', 'Locals', or 'Registers'. This string is shown in
     * the UI as is and can be translated.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The number of named variables in this scope.
     * The client can use this information to present the variables in a paged UI and fetch them
     * in chunks.
     */
    @JsonProperty("namedVariables")
    public Long getNamedVariables() { return namedVariables; }
    @JsonProperty("namedVariables")
    public void setNamedVariables(Long value) { this.namedVariables = value; }

    /**
     * A hint for how to present this scope in the UI. If this attribute is missing, the scope
     * is shown with a generic UI.
     */
    @JsonProperty("presentationHint")
    public String getPresentationHint() { return presentationHint; }
    @JsonProperty("presentationHint")
    public void setPresentationHint(String value) { this.presentationHint = value; }

    /**
     * The source for this scope.
     */
    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }

    /**
     * The variables of this scope can be retrieved by passing the value of `variablesReference`
     * to the `variables` request as long as execution remains suspended. See 'Lifetime of
     * Object References' in the Overview section for details.
     */
    @JsonProperty("variablesReference")
    public long getVariablesReference() { return variablesReference; }
    @JsonProperty("variablesReference")
    public void setVariablesReference(long value) { this.variablesReference = value; }
}
