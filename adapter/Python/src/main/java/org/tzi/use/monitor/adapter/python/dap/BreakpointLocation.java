
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
 * Properties of a breakpoint location returned from the `breakpointLocations` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "line",
    "column",
    "endLine",
    "endColumn"
})
@Generated("jsonschema2pojo")
public class BreakpointLocation {

    /**
     * Start line of breakpoint location.
     * (Required)
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("Start line of breakpoint location.")
    private Integer line;
    /**
     * The start position of a breakpoint location. Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("The start position of a breakpoint location. Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.")
    private Integer column;
    /**
     * The end line of breakpoint location if the location covers a range.
     * 
     */
    @JsonProperty("endLine")
    @JsonPropertyDescription("The end line of breakpoint location if the location covers a range.")
    private Integer endLine;
    /**
     * The end position of a breakpoint location (if the location covers a range). Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("endColumn")
    @JsonPropertyDescription("The end position of a breakpoint location (if the location covers a range). Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.")
    private Integer endColumn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Start line of breakpoint location.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * Start line of breakpoint location.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * The start position of a breakpoint location. Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * The start position of a breakpoint location. Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * The end line of breakpoint location if the location covers a range.
     * 
     */
    @JsonProperty("endLine")
    public Integer getEndLine() {
        return endLine;
    }

    /**
     * The end line of breakpoint location if the location covers a range.
     * 
     */
    @JsonProperty("endLine")
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * The end position of a breakpoint location (if the location covers a range). Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("endColumn")
    public Integer getEndColumn() {
        return endColumn;
    }

    /**
     * The end position of a breakpoint location (if the location covers a range). Position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
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
        sb.append(BreakpointLocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BreakpointLocation) == false) {
            return false;
        }
        BreakpointLocation rhs = ((BreakpointLocation) other);
        return ((((((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column)))&&((this.endLine == rhs.endLine)||((this.endLine!= null)&&this.endLine.equals(rhs.endLine))))&&((this.endColumn == rhs.endColumn)||((this.endColumn!= null)&&this.endColumn.equals(rhs.endColumn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))));
    }

}
