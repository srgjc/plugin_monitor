
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
 * Represents a single disassembled instruction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "instructionBytes",
    "instruction",
    "symbol",
    "location",
    "line",
    "column",
    "endLine",
    "endColumn",
    "presentationHint"
})
@Generated("jsonschema2pojo")
public class DisassembledInstruction {

    /**
     * The address of the instruction. Treated as a hex value if prefixed with `0x`, or as a decimal value otherwise.
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The address of the instruction. Treated as a hex value if prefixed with `0x`, or as a decimal value otherwise.")
    private String address;
    /**
     * Raw bytes representing the instruction and its operands, in an implementation-defined format.
     * 
     */
    @JsonProperty("instructionBytes")
    @JsonPropertyDescription("Raw bytes representing the instruction and its operands, in an implementation-defined format.")
    private String instructionBytes;
    /**
     * Text representing the instruction and its operands, in an implementation-defined format.
     * (Required)
     * 
     */
    @JsonProperty("instruction")
    @JsonPropertyDescription("Text representing the instruction and its operands, in an implementation-defined format.")
    private String instruction;
    /**
     * Name of the symbol that corresponds with the location of this instruction, if any.
     * 
     */
    @JsonProperty("symbol")
    @JsonPropertyDescription("Name of the symbol that corresponds with the location of this instruction, if any.")
    private String symbol;
    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A `Source` is a descriptor for source code.\nIt is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.")
    private Source location;
    /**
     * The line within the source location that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("The line within the source location that corresponds to this instruction, if any.")
    private Integer line;
    /**
     * The column within the line that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("The column within the line that corresponds to this instruction, if any.")
    private Integer column;
    /**
     * The end line of the range that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("endLine")
    @JsonPropertyDescription("The end line of the range that corresponds to this instruction, if any.")
    private Integer endLine;
    /**
     * The end column of the range that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("endColumn")
    @JsonPropertyDescription("The end column of the range that corresponds to this instruction, if any.")
    private Integer endColumn;
    /**
     * A hint for how to present the instruction in the UI.
     * 
     * A value of `invalid` may be used to indicate this instruction is 'filler' and cannot be reached by the program. For example, unreadable memory addresses may be presented is 'invalid.'
     * 
     */
    @JsonProperty("presentationHint")
    @JsonPropertyDescription("A hint for how to present the instruction in the UI.\n\nA value of `invalid` may be used to indicate this instruction is 'filler' and cannot be reached by the program. For example, unreadable memory addresses may be presented is 'invalid.'")
    private PresentationHint presentationHint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The address of the instruction. Treated as a hex value if prefixed with `0x`, or as a decimal value otherwise.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * The address of the instruction. Treated as a hex value if prefixed with `0x`, or as a decimal value otherwise.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Raw bytes representing the instruction and its operands, in an implementation-defined format.
     * 
     */
    @JsonProperty("instructionBytes")
    public String getInstructionBytes() {
        return instructionBytes;
    }

    /**
     * Raw bytes representing the instruction and its operands, in an implementation-defined format.
     * 
     */
    @JsonProperty("instructionBytes")
    public void setInstructionBytes(String instructionBytes) {
        this.instructionBytes = instructionBytes;
    }

    /**
     * Text representing the instruction and its operands, in an implementation-defined format.
     * (Required)
     * 
     */
    @JsonProperty("instruction")
    public String getInstruction() {
        return instruction;
    }

    /**
     * Text representing the instruction and its operands, in an implementation-defined format.
     * (Required)
     * 
     */
    @JsonProperty("instruction")
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * Name of the symbol that corresponds with the location of this instruction, if any.
     * 
     */
    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    /**
     * Name of the symbol that corresponds with the location of this instruction, if any.
     * 
     */
    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("location")
    public Source getLocation() {
        return location;
    }

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("location")
    public void setLocation(Source location) {
        this.location = location;
    }

    /**
     * The line within the source location that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * The line within the source location that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * The column within the line that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * The column within the line that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * The end line of the range that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("endLine")
    public Integer getEndLine() {
        return endLine;
    }

    /**
     * The end line of the range that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("endLine")
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * The end column of the range that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("endColumn")
    public Integer getEndColumn() {
        return endColumn;
    }

    /**
     * The end column of the range that corresponds to this instruction, if any.
     * 
     */
    @JsonProperty("endColumn")
    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    /**
     * A hint for how to present the instruction in the UI.
     * 
     * A value of `invalid` may be used to indicate this instruction is 'filler' and cannot be reached by the program. For example, unreadable memory addresses may be presented is 'invalid.'
     * 
     */
    @JsonProperty("presentationHint")
    public PresentationHint getPresentationHint() {
        return presentationHint;
    }

    /**
     * A hint for how to present the instruction in the UI.
     * 
     * A value of `invalid` may be used to indicate this instruction is 'filler' and cannot be reached by the program. For example, unreadable memory addresses may be presented is 'invalid.'
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
        sb.append(DisassembledInstruction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("instructionBytes");
        sb.append('=');
        sb.append(((this.instructionBytes == null)?"<null>":this.instructionBytes));
        sb.append(',');
        sb.append("instruction");
        sb.append('=');
        sb.append(((this.instruction == null)?"<null>":this.instruction));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.endColumn == null)? 0 :this.endColumn.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.presentationHint == null)? 0 :this.presentationHint.hashCode()));
        result = ((result* 31)+((this.instruction == null)? 0 :this.instruction.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.instructionBytes == null)? 0 :this.instructionBytes.hashCode()));
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DisassembledInstruction) == false) {
            return false;
        }
        DisassembledInstruction rhs = ((DisassembledInstruction) other);
        return ((((((((((((this.endLine == rhs.endLine)||((this.endLine!= null)&&this.endLine.equals(rhs.endLine)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.endColumn == rhs.endColumn)||((this.endColumn!= null)&&this.endColumn.equals(rhs.endColumn))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.presentationHint == rhs.presentationHint)||((this.presentationHint!= null)&&this.presentationHint.equals(rhs.presentationHint))))&&((this.instruction == rhs.instruction)||((this.instruction!= null)&&this.instruction.equals(rhs.instruction))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.instructionBytes == rhs.instructionBytes)||((this.instructionBytes!= null)&&this.instructionBytes.equals(rhs.instructionBytes))))&&((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }


    /**
     * A hint for how to present the instruction in the UI.
     * 
     * A value of `invalid` may be used to indicate this instruction is 'filler' and cannot be reached by the program. For example, unreadable memory addresses may be presented is 'invalid.'
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PresentationHint {

        NORMAL("normal"),
        INVALID("invalid");
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
