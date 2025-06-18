
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
 * Information about a breakpoint created in `setBreakpoints`, `setFunctionBreakpoints`, `setInstructionBreakpoints`, or `setDataBreakpoints` requests.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "verified",
    "message",
    "source",
    "line",
    "column",
    "endLine",
    "endColumn",
    "instructionReference",
    "offset",
    "reason"
})
@Generated("jsonschema2pojo")
public class Breakpoint {

    /**
     * The identifier for the breakpoint. It is needed if breakpoint events are used to update or remove breakpoints.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The identifier for the breakpoint. It is needed if breakpoint events are used to update or remove breakpoints.")
    private Integer id;
    /**
     * If true, the breakpoint could be set (but not necessarily at the desired location).
     * (Required)
     * 
     */
    @JsonProperty("verified")
    @JsonPropertyDescription("If true, the breakpoint could be set (but not necessarily at the desired location).")
    private Boolean verified;
    /**
     * A message about the state of the breakpoint.
     * This is shown to the user and can be used to explain why a breakpoint could not be verified.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("A message about the state of the breakpoint.\nThis is shown to the user and can be used to explain why a breakpoint could not be verified.")
    private String message;
    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A `Source` is a descriptor for source code.\nIt is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.")
    private Source source;
    /**
     * The start line of the actual range covered by the breakpoint.
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("The start line of the actual range covered by the breakpoint.")
    private Integer line;
    /**
     * Start position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("Start position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.")
    private Integer column;
    /**
     * The end line of the actual range covered by the breakpoint.
     * 
     */
    @JsonProperty("endLine")
    @JsonPropertyDescription("The end line of the actual range covered by the breakpoint.")
    private Integer endLine;
    /**
     * End position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * If no end line is given, then the end column is assumed to be in the start line.
     * 
     */
    @JsonProperty("endColumn")
    @JsonPropertyDescription("End position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.\nIf no end line is given, then the end column is assumed to be in the start line.")
    private Integer endColumn;
    /**
     * A memory reference to where the breakpoint is set.
     * 
     */
    @JsonProperty("instructionReference")
    @JsonPropertyDescription("A memory reference to where the breakpoint is set.")
    private String instructionReference;
    /**
     * The offset from the instruction reference.
     * This can be negative.
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("The offset from the instruction reference.\nThis can be negative.")
    private Integer offset;
    /**
     * A machine-readable explanation of why a breakpoint may not be verified. If a breakpoint is verified or a specific reason is not known, the adapter should omit this property. Possible values include:
     * 
     * - `pending`: Indicates a breakpoint might be verified in the future, but the adapter cannot verify it in the current state.
     *  - `failed`: Indicates a breakpoint was not able to be verified, and the adapter does not believe it can be verified without intervention.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("A machine-readable explanation of why a breakpoint may not be verified. If a breakpoint is verified or a specific reason is not known, the adapter should omit this property. Possible values include:\n\n- `pending`: Indicates a breakpoint might be verified in the future, but the adapter cannot verify it in the current state.\n - `failed`: Indicates a breakpoint was not able to be verified, and the adapter does not believe it can be verified without intervention.")
    private Reason reason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The identifier for the breakpoint. It is needed if breakpoint events are used to update or remove breakpoints.
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * The identifier for the breakpoint. It is needed if breakpoint events are used to update or remove breakpoints.
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * If true, the breakpoint could be set (but not necessarily at the desired location).
     * (Required)
     * 
     */
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    /**
     * If true, the breakpoint could be set (but not necessarily at the desired location).
     * (Required)
     * 
     */
    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * A message about the state of the breakpoint.
     * This is shown to the user and can be used to explain why a breakpoint could not be verified.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * A message about the state of the breakpoint.
     * This is shown to the user and can be used to explain why a breakpoint could not be verified.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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
     * The start line of the actual range covered by the breakpoint.
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * The start line of the actual range covered by the breakpoint.
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * Start position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * Start position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * The end line of the actual range covered by the breakpoint.
     * 
     */
    @JsonProperty("endLine")
    public Integer getEndLine() {
        return endLine;
    }

    /**
     * The end line of the actual range covered by the breakpoint.
     * 
     */
    @JsonProperty("endLine")
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * End position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * If no end line is given, then the end column is assumed to be in the start line.
     * 
     */
    @JsonProperty("endColumn")
    public Integer getEndColumn() {
        return endColumn;
    }

    /**
     * End position of the source range covered by the breakpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * If no end line is given, then the end column is assumed to be in the start line.
     * 
     */
    @JsonProperty("endColumn")
    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    /**
     * A memory reference to where the breakpoint is set.
     * 
     */
    @JsonProperty("instructionReference")
    public String getInstructionReference() {
        return instructionReference;
    }

    /**
     * A memory reference to where the breakpoint is set.
     * 
     */
    @JsonProperty("instructionReference")
    public void setInstructionReference(String instructionReference) {
        this.instructionReference = instructionReference;
    }

    /**
     * The offset from the instruction reference.
     * This can be negative.
     * 
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * The offset from the instruction reference.
     * This can be negative.
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * A machine-readable explanation of why a breakpoint may not be verified. If a breakpoint is verified or a specific reason is not known, the adapter should omit this property. Possible values include:
     * 
     * - `pending`: Indicates a breakpoint might be verified in the future, but the adapter cannot verify it in the current state.
     *  - `failed`: Indicates a breakpoint was not able to be verified, and the adapter does not believe it can be verified without intervention.
     * 
     */
    @JsonProperty("reason")
    public Reason getReason() {
        return reason;
    }

    /**
     * A machine-readable explanation of why a breakpoint may not be verified. If a breakpoint is verified or a specific reason is not known, the adapter should omit this property. Possible values include:
     * 
     * - `pending`: Indicates a breakpoint might be verified in the future, but the adapter cannot verify it in the current state.
     *  - `failed`: Indicates a breakpoint was not able to be verified, and the adapter does not believe it can be verified without intervention.
     * 
     */
    @JsonProperty("reason")
    public void setReason(Reason reason) {
        this.reason = reason;
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
        sb.append(Breakpoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("verified");
        sb.append('=');
        sb.append(((this.verified == null)?"<null>":this.verified));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        sb.append("instructionReference");
        sb.append('=');
        sb.append(((this.instructionReference == null)?"<null>":this.instructionReference));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.endColumn == null)? 0 :this.endColumn.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.instructionReference == null)? 0 :this.instructionReference.hashCode()));
        result = ((result* 31)+((this.verified == null)? 0 :this.verified.hashCode()));
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Breakpoint) == false) {
            return false;
        }
        Breakpoint rhs = ((Breakpoint) other);
        return (((((((((((((this.endLine == rhs.endLine)||((this.endLine!= null)&&this.endLine.equals(rhs.endLine)))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.endColumn == rhs.endColumn)||((this.endColumn!= null)&&this.endColumn.equals(rhs.endColumn))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.instructionReference == rhs.instructionReference)||((this.instructionReference!= null)&&this.instructionReference.equals(rhs.instructionReference))))&&((this.verified == rhs.verified)||((this.verified!= null)&&this.verified.equals(rhs.verified))))&&((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))));
    }


    /**
     * A machine-readable explanation of why a breakpoint may not be verified. If a breakpoint is verified or a specific reason is not known, the adapter should omit this property. Possible values include:
     * 
     * - `pending`: Indicates a breakpoint might be verified in the future, but the adapter cannot verify it in the current state.
     *  - `failed`: Indicates a breakpoint was not able to be verified, and the adapter does not believe it can be verified without intervention.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Reason {

        PENDING("pending"),
        FAILED("failed");
        private final String value;
        private final static Map<String, Reason> CONSTANTS = new HashMap<String, Reason>();

        static {
            for (Reason c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Reason(String value) {
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
        public static Reason fromValue(String value) {
            Reason constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
