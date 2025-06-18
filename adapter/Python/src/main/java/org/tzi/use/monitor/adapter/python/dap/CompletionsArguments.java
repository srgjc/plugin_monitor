
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
 * Arguments for `completions` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frameId",
    "text",
    "column",
    "line"
})
@Generated("jsonschema2pojo")
public class CompletionsArguments {

    /**
     * Returns completions in the scope of this stack frame. If not specified, the completions are returned for the global scope.
     * 
     */
    @JsonProperty("frameId")
    @JsonPropertyDescription("Returns completions in the scope of this stack frame. If not specified, the completions are returned for the global scope.")
    private Integer frameId;
    /**
     * One or more source lines. Typically this is the text users have typed into the debug console before they asked for completion.
     * (Required)
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("One or more source lines. Typically this is the text users have typed into the debug console before they asked for completion.")
    private String text;
    /**
     * The position within `text` for which to determine the completion proposals. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * (Required)
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("The position within `text` for which to determine the completion proposals. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.")
    private Integer column;
    /**
     * A line for which to determine the completion proposals. If missing the first line of the text is assumed.
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("A line for which to determine the completion proposals. If missing the first line of the text is assumed.")
    private Integer line;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Returns completions in the scope of this stack frame. If not specified, the completions are returned for the global scope.
     * 
     */
    @JsonProperty("frameId")
    public Integer getFrameId() {
        return frameId;
    }

    /**
     * Returns completions in the scope of this stack frame. If not specified, the completions are returned for the global scope.
     * 
     */
    @JsonProperty("frameId")
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
    }

    /**
     * One or more source lines. Typically this is the text users have typed into the debug console before they asked for completion.
     * (Required)
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * One or more source lines. Typically this is the text users have typed into the debug console before they asked for completion.
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * The position within `text` for which to determine the completion proposals. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * (Required)
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * The position within `text` for which to determine the completion proposals. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * (Required)
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * A line for which to determine the completion proposals. If missing the first line of the text is assumed.
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * A line for which to determine the completion proposals. If missing the first line of the text is assumed.
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
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
        sb.append(CompletionsArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frameId");
        sb.append('=');
        sb.append(((this.frameId == null)?"<null>":this.frameId));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("column");
        sb.append('=');
        sb.append(((this.column == null)?"<null>":this.column));
        sb.append(',');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
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
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.frameId == null)? 0 :this.frameId.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CompletionsArguments) == false) {
            return false;
        }
        CompletionsArguments rhs = ((CompletionsArguments) other);
        return ((((((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column)))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.frameId == rhs.frameId)||((this.frameId!= null)&&this.frameId.equals(rhs.frameId))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))));
    }

}
