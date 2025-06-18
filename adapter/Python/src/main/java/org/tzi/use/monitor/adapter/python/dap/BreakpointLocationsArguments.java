
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
 * Arguments for `breakpointLocations` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source",
    "line",
    "column",
    "endLine",
    "endColumn"
})
@Generated("jsonschema2pojo")
public class BreakpointLocationsArguments {

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A `Source` is a descriptor for source code.\nIt is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.")
    private Source source;
    /**
     * Start line of range to search possible breakpoint locations in. If only the line is specified, the request returns all possible locations in that line.
     * (Required)
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("Start line of range to search possible breakpoint locations in. If only the line is specified, the request returns all possible locations in that line.")
    private Integer line;
    /**
     * Start position within `line` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no column is given, the first position in the start line is assumed.
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("Start position within `line` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no column is given, the first position in the start line is assumed.")
    private Integer column;
    /**
     * End line of range to search possible breakpoint locations in. If no end line is given, then the end line is assumed to be the start line.
     * 
     */
    @JsonProperty("endLine")
    @JsonPropertyDescription("End line of range to search possible breakpoint locations in. If no end line is given, then the end line is assumed to be the start line.")
    private Integer endLine;
    /**
     * End position within `endLine` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no end column is given, the last position in the end line is assumed.
     * 
     */
    @JsonProperty("endColumn")
    @JsonPropertyDescription("End position within `endLine` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no end column is given, the last position in the end line is assumed.")
    private Integer endColumn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * Start line of range to search possible breakpoint locations in. If only the line is specified, the request returns all possible locations in that line.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * Start line of range to search possible breakpoint locations in. If only the line is specified, the request returns all possible locations in that line.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * Start position within `line` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no column is given, the first position in the start line is assumed.
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * Start position within `line` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no column is given, the first position in the start line is assumed.
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * End line of range to search possible breakpoint locations in. If no end line is given, then the end line is assumed to be the start line.
     * 
     */
    @JsonProperty("endLine")
    public Integer getEndLine() {
        return endLine;
    }

    /**
     * End line of range to search possible breakpoint locations in. If no end line is given, then the end line is assumed to be the start line.
     * 
     */
    @JsonProperty("endLine")
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * End position within `endLine` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no end column is given, the last position in the end line is assumed.
     * 
     */
    @JsonProperty("endColumn")
    public Integer getEndColumn() {
        return endColumn;
    }

    /**
     * End position within `endLine` to search possible breakpoint locations in. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If no end column is given, the last position in the end line is assumed.
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
        sb.append(BreakpointLocationsArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.endLine == null)? 0 :this.endLine.hashCode()));
        result = ((result* 31)+((this.endColumn == null)? 0 :this.endColumn.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BreakpointLocationsArguments) == false) {
            return false;
        }
        BreakpointLocationsArguments rhs = ((BreakpointLocationsArguments) other);
        return (((((((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column)))&&((this.endLine == rhs.endLine)||((this.endLine!= null)&&this.endLine.equals(rhs.endLine))))&&((this.endColumn == rhs.endColumn)||((this.endColumn!= null)&&this.endColumn.equals(rhs.endColumn))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))));
    }

}
