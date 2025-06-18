
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
 * A `GotoTarget` describes a code location that can be used as a target in the `goto` request.
 * The possible goto targets can be determined via the `gotoTargets` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "label",
    "line",
    "column",
    "endLine",
    "endColumn",
    "instructionPointerReference"
})
@Generated("jsonschema2pojo")
public class GotoTarget {

    /**
     * Unique identifier for a goto target. This is used in the `goto` request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique identifier for a goto target. This is used in the `goto` request.")
    private Integer id;
    /**
     * The name of the goto target (shown in the UI).
     * (Required)
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("The name of the goto target (shown in the UI).")
    private String label;
    /**
     * The line of the goto target.
     * (Required)
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("The line of the goto target.")
    private Integer line;
    /**
     * The column of the goto target.
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("The column of the goto target.")
    private Integer column;
    /**
     * The end line of the range covered by the goto target.
     * 
     */
    @JsonProperty("endLine")
    @JsonPropertyDescription("The end line of the range covered by the goto target.")
    private Integer endLine;
    /**
     * The end column of the range covered by the goto target.
     * 
     */
    @JsonProperty("endColumn")
    @JsonPropertyDescription("The end column of the range covered by the goto target.")
    private Integer endColumn;
    /**
     * A memory reference for the instruction pointer value represented by this target.
     * 
     */
    @JsonProperty("instructionPointerReference")
    @JsonPropertyDescription("A memory reference for the instruction pointer value represented by this target.")
    private String instructionPointerReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Unique identifier for a goto target. This is used in the `goto` request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Unique identifier for a goto target. This is used in the `goto` request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name of the goto target (shown in the UI).
     * (Required)
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * The name of the goto target (shown in the UI).
     * (Required)
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * The line of the goto target.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * The line of the goto target.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * The column of the goto target.
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * The column of the goto target.
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * The end line of the range covered by the goto target.
     * 
     */
    @JsonProperty("endLine")
    public Integer getEndLine() {
        return endLine;
    }

    /**
     * The end line of the range covered by the goto target.
     * 
     */
    @JsonProperty("endLine")
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * The end column of the range covered by the goto target.
     * 
     */
    @JsonProperty("endColumn")
    public Integer getEndColumn() {
        return endColumn;
    }

    /**
     * The end column of the range covered by the goto target.
     * 
     */
    @JsonProperty("endColumn")
    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    /**
     * A memory reference for the instruction pointer value represented by this target.
     * 
     */
    @JsonProperty("instructionPointerReference")
    public String getInstructionPointerReference() {
        return instructionPointerReference;
    }

    /**
     * A memory reference for the instruction pointer value represented by this target.
     * 
     */
    @JsonProperty("instructionPointerReference")
    public void setInstructionPointerReference(String instructionPointerReference) {
        this.instructionPointerReference = instructionPointerReference;
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
        sb.append(GotoTarget.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
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
        sb.append("instructionPointerReference");
        sb.append('=');
        sb.append(((this.instructionPointerReference == null)?"<null>":this.instructionPointerReference));
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
        result = ((result* 31)+((this.endColumn == null)? 0 :this.endColumn.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.instructionPointerReference == null)? 0 :this.instructionPointerReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GotoTarget) == false) {
            return false;
        }
        GotoTarget rhs = ((GotoTarget) other);
        return (((((((((this.endLine == rhs.endLine)||((this.endLine!= null)&&this.endLine.equals(rhs.endLine)))&&((this.endColumn == rhs.endColumn)||((this.endColumn!= null)&&this.endColumn.equals(rhs.endColumn))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.instructionPointerReference == rhs.instructionPointerReference)||((this.instructionPointerReference!= null)&&this.instructionPointerReference.equals(rhs.instructionPointerReference))));
    }

}
