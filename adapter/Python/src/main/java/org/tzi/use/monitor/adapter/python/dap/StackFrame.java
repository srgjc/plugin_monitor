
package org.tzi.use.monitor.adapter.python.dap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A Stackframe contains the source location.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "source",
    "line",
    "column",
    "endLine",
    "endColumn",
    "canRestart",
    "instructionPointerReference",
    "moduleId",
    "presentationHint"
})
@Generated("jsonschema2pojo")
public class StackFrame {

    /**
     * An identifier for the stack frame. It must be unique across all threads.
     * This id can be used to retrieve the scopes of the frame with the `scopes` request or to restart the execution of a stack frame.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("An identifier for the stack frame. It must be unique across all threads.\nThis id can be used to retrieve the scopes of the frame with the `scopes` request or to restart the execution of a stack frame.")
    private Integer id;
    /**
     * The name of the stack frame, typically a method name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the stack frame, typically a method name.")
    private String name;
    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A `Source` is a descriptor for source code.\nIt is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.")
    private Source source;
    /**
     * The line within the source of the frame. If the source attribute is missing or doesn't exist, `line` is 0 and should be ignored by the client.
     * (Required)
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("The line within the source of the frame. If the source attribute is missing or doesn't exist, `line` is 0 and should be ignored by the client.")
    private Integer line;
    /**
     * Start position of the range covered by the stack frame. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If attribute `source` is missing or doesn't exist, `column` is 0 and should be ignored by the client.
     * (Required)
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("Start position of the range covered by the stack frame. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If attribute `source` is missing or doesn't exist, `column` is 0 and should be ignored by the client.")
    private Integer column;
    /**
     * The end line of the range covered by the stack frame.
     * 
     */
    @JsonProperty("endLine")
    @JsonPropertyDescription("The end line of the range covered by the stack frame.")
    private Integer endLine;
    /**
     * End position of the range covered by the stack frame. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("endColumn")
    @JsonPropertyDescription("End position of the range covered by the stack frame. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.")
    private Integer endColumn;
    /**
     * Indicates whether this frame can be restarted with the `restart` request. Clients should only use this if the debug adapter supports the `restart` request and the corresponding capability `supportsRestartRequest` is true. If a debug adapter has this capability, then `canRestart` defaults to `true` if the property is absent.
     * 
     */
    @JsonProperty("canRestart")
    @JsonPropertyDescription("Indicates whether this frame can be restarted with the `restart` request. Clients should only use this if the debug adapter supports the `restart` request and the corresponding capability `supportsRestartRequest` is true. If a debug adapter has this capability, then `canRestart` defaults to `true` if the property is absent.")
    private Boolean canRestart;
    /**
     * A memory reference for the current instruction pointer in this frame.
     * 
     */
    @JsonProperty("instructionPointerReference")
    @JsonPropertyDescription("A memory reference for the current instruction pointer in this frame.")
    private String instructionPointerReference;
    /**
     * The module associated with this frame, if any.
     * 
     */
    @JsonProperty("moduleId")
    @JsonPropertyDescription("The module associated with this frame, if any.")
    private Object moduleId;
    /**
     * A hint for how to present this frame in the UI.
     * A value of `label` can be used to indicate that the frame is an artificial frame that is used as a visual label or separator. A value of `subtle` can be used to change the appearance of a frame in a 'subtle' way.
     * 
     */
    @JsonProperty("presentationHint")
    @JsonPropertyDescription("A hint for how to present this frame in the UI.\nA value of `label` can be used to indicate that the frame is an artificial frame that is used as a visual label or separator. A value of `subtle` can be used to change the appearance of a frame in a 'subtle' way.")
    private PresentationHint presentationHint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * An identifier for the stack frame. It must be unique across all threads.
     * This id can be used to retrieve the scopes of the frame with the `scopes` request or to restart the execution of a stack frame.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * An identifier for the stack frame. It must be unique across all threads.
     * This id can be used to retrieve the scopes of the frame with the `scopes` request or to restart the execution of a stack frame.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name of the stack frame, typically a method name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the stack frame, typically a method name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
     * The line within the source of the frame. If the source attribute is missing or doesn't exist, `line` is 0 and should be ignored by the client.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * The line within the source of the frame. If the source attribute is missing or doesn't exist, `line` is 0 and should be ignored by the client.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * Start position of the range covered by the stack frame. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If attribute `source` is missing or doesn't exist, `column` is 0 and should be ignored by the client.
     * (Required)
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * Start position of the range covered by the stack frame. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If attribute `source` is missing or doesn't exist, `column` is 0 and should be ignored by the client.
     * (Required)
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * The end line of the range covered by the stack frame.
     * 
     */
    @JsonProperty("endLine")
    public Integer getEndLine() {
        return endLine;
    }

    /**
     * The end line of the range covered by the stack frame.
     * 
     */
    @JsonProperty("endLine")
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * End position of the range covered by the stack frame. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("endColumn")
    public Integer getEndColumn() {
        return endColumn;
    }

    /**
     * End position of the range covered by the stack frame. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("endColumn")
    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    /**
     * Indicates whether this frame can be restarted with the `restart` request. Clients should only use this if the debug adapter supports the `restart` request and the corresponding capability `supportsRestartRequest` is true. If a debug adapter has this capability, then `canRestart` defaults to `true` if the property is absent.
     * 
     */
    @JsonProperty("canRestart")
    public Boolean getCanRestart() {
        return canRestart;
    }

    /**
     * Indicates whether this frame can be restarted with the `restart` request. Clients should only use this if the debug adapter supports the `restart` request and the corresponding capability `supportsRestartRequest` is true. If a debug adapter has this capability, then `canRestart` defaults to `true` if the property is absent.
     * 
     */
    @JsonProperty("canRestart")
    public void setCanRestart(Boolean canRestart) {
        this.canRestart = canRestart;
    }

    /**
     * A memory reference for the current instruction pointer in this frame.
     * 
     */
    @JsonProperty("instructionPointerReference")
    public String getInstructionPointerReference() {
        return instructionPointerReference;
    }

    /**
     * A memory reference for the current instruction pointer in this frame.
     * 
     */
    @JsonProperty("instructionPointerReference")
    public void setInstructionPointerReference(String instructionPointerReference) {
        this.instructionPointerReference = instructionPointerReference;
    }

    /**
     * The module associated with this frame, if any.
     * 
     */
    @JsonProperty("moduleId")
    public Object getModuleId() {
        return moduleId;
    }

    /**
     * The module associated with this frame, if any.
     * 
     */
    @JsonProperty("moduleId")
    public void setModuleId(Object moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * A hint for how to present this frame in the UI.
     * A value of `label` can be used to indicate that the frame is an artificial frame that is used as a visual label or separator. A value of `subtle` can be used to change the appearance of a frame in a 'subtle' way.
     * 
     */
    @JsonProperty("presentationHint")
    public PresentationHint getPresentationHint() {
        return presentationHint;
    }

    /**
     * A hint for how to present this frame in the UI.
     * A value of `label` can be used to indicate that the frame is an artificial frame that is used as a visual label or separator. A value of `subtle` can be used to change the appearance of a frame in a 'subtle' way.
     * 
     */
    @JsonProperty("presentationHint")
    public void setPresentationHint(PresentationHint presentationHint) {
        this.presentationHint = presentationHint;
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
        sb.append(StackFrame.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        sb.append("canRestart");
        sb.append('=');
        sb.append(((this.canRestart == null)?"<null>":this.canRestart));
        sb.append(',');
        sb.append("instructionPointerReference");
        sb.append('=');
        sb.append(((this.instructionPointerReference == null)?"<null>":this.instructionPointerReference));
        sb.append(',');
        sb.append("moduleId");
        sb.append('=');
        sb.append(((this.moduleId == null)?"<null>":this.moduleId));
        sb.append(',');
        sb.append("presentationHint");
        sb.append('=');
        sb.append(((this.presentationHint == null)?"<null>":this.presentationHint));
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
        result = ((result* 31)+((this.presentationHint == null)? 0 :this.presentationHint.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.canRestart == null)? 0 :this.canRestart.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.moduleId == null)? 0 :this.moduleId.hashCode()));
        result = ((result* 31)+((this.instructionPointerReference == null)? 0 :this.instructionPointerReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StackFrame) == false) {
            return false;
        }
        StackFrame rhs = ((StackFrame) other);
        return (((((((((((((this.endLine == rhs.endLine)||((this.endLine!= null)&&this.endLine.equals(rhs.endLine)))&&((this.endColumn == rhs.endColumn)||((this.endColumn!= null)&&this.endColumn.equals(rhs.endColumn))))&&((this.presentationHint == rhs.presentationHint)||((this.presentationHint!= null)&&this.presentationHint.equals(rhs.presentationHint))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.canRestart == rhs.canRestart)||((this.canRestart!= null)&&this.canRestart.equals(rhs.canRestart))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.moduleId == rhs.moduleId)||((this.moduleId!= null)&&this.moduleId.equals(rhs.moduleId))))&&((this.instructionPointerReference == rhs.instructionPointerReference)||((this.instructionPointerReference!= null)&&this.instructionPointerReference.equals(rhs.instructionPointerReference))));
    }


    /**
     * A hint for how to present this frame in the UI.
     * A value of `label` can be used to indicate that the frame is an artificial frame that is used as a visual label or separator. A value of `subtle` can be used to change the appearance of a frame in a 'subtle' way.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PresentationHint {

        NORMAL("normal"),
        LABEL("label"),
        SUBTLE("subtle");
        private final String value;
        private final static Map<String, PresentationHint> CONSTANTS = new HashMap<String, PresentationHint>();

        static {
            for (PresentationHint c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PresentationHint(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static PresentationHint fromValue(String value) {
            PresentationHint constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
