
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
 * Arguments for `disassemble` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "memoryReference",
    "offset",
    "instructionOffset",
    "instructionCount",
    "resolveSymbols"
})
@Generated("jsonschema2pojo")
public class DisassembleArguments {

    /**
     * Memory reference to the base location containing the instructions to disassemble.
     * (Required)
     * 
     */
    @JsonProperty("memoryReference")
    @JsonPropertyDescription("Memory reference to the base location containing the instructions to disassemble.")
    private String memoryReference;
    /**
     * Offset (in bytes) to be applied to the reference location before disassembling. Can be negative.
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("Offset (in bytes) to be applied to the reference location before disassembling. Can be negative.")
    private Integer offset;
    /**
     * Offset (in instructions) to be applied after the byte offset (if any) before disassembling. Can be negative.
     * 
     */
    @JsonProperty("instructionOffset")
    @JsonPropertyDescription("Offset (in instructions) to be applied after the byte offset (if any) before disassembling. Can be negative.")
    private Integer instructionOffset;
    /**
     * Number of instructions to disassemble starting at the specified location and offset.
     * An adapter must return exactly this number of instructions - any unavailable instructions should be replaced with an implementation-defined 'invalid instruction' value.
     * (Required)
     * 
     */
    @JsonProperty("instructionCount")
    @JsonPropertyDescription("Number of instructions to disassemble starting at the specified location and offset.\nAn adapter must return exactly this number of instructions - any unavailable instructions should be replaced with an implementation-defined 'invalid instruction' value.")
    private Integer instructionCount;
    /**
     * If true, the adapter should attempt to resolve memory addresses and other values to symbolic names.
     * 
     */
    @JsonProperty("resolveSymbols")
    @JsonPropertyDescription("If true, the adapter should attempt to resolve memory addresses and other values to symbolic names.")
    private Boolean resolveSymbols;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Memory reference to the base location containing the instructions to disassemble.
     * (Required)
     * 
     */
    @JsonProperty("memoryReference")
    public String getMemoryReference() {
        return memoryReference;
    }

    /**
     * Memory reference to the base location containing the instructions to disassemble.
     * (Required)
     * 
     */
    @JsonProperty("memoryReference")
    public void setMemoryReference(String memoryReference) {
        this.memoryReference = memoryReference;
    }

    /**
     * Offset (in bytes) to be applied to the reference location before disassembling. Can be negative.
     * 
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * Offset (in bytes) to be applied to the reference location before disassembling. Can be negative.
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Offset (in instructions) to be applied after the byte offset (if any) before disassembling. Can be negative.
     * 
     */
    @JsonProperty("instructionOffset")
    public Integer getInstructionOffset() {
        return instructionOffset;
    }

    /**
     * Offset (in instructions) to be applied after the byte offset (if any) before disassembling. Can be negative.
     * 
     */
    @JsonProperty("instructionOffset")
    public void setInstructionOffset(Integer instructionOffset) {
        this.instructionOffset = instructionOffset;
    }

    /**
     * Number of instructions to disassemble starting at the specified location and offset.
     * An adapter must return exactly this number of instructions - any unavailable instructions should be replaced with an implementation-defined 'invalid instruction' value.
     * (Required)
     * 
     */
    @JsonProperty("instructionCount")
    public Integer getInstructionCount() {
        return instructionCount;
    }

    /**
     * Number of instructions to disassemble starting at the specified location and offset.
     * An adapter must return exactly this number of instructions - any unavailable instructions should be replaced with an implementation-defined 'invalid instruction' value.
     * (Required)
     * 
     */
    @JsonProperty("instructionCount")
    public void setInstructionCount(Integer instructionCount) {
        this.instructionCount = instructionCount;
    }

    /**
     * If true, the adapter should attempt to resolve memory addresses and other values to symbolic names.
     * 
     */
    @JsonProperty("resolveSymbols")
    public Boolean getResolveSymbols() {
        return resolveSymbols;
    }

    /**
     * If true, the adapter should attempt to resolve memory addresses and other values to symbolic names.
     * 
     */
    @JsonProperty("resolveSymbols")
    public void setResolveSymbols(Boolean resolveSymbols) {
        this.resolveSymbols = resolveSymbols;
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
        sb.append(DisassembleArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("memoryReference");
        sb.append('=');
        sb.append(((this.memoryReference == null)?"<null>":this.memoryReference));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("instructionOffset");
        sb.append('=');
        sb.append(((this.instructionOffset == null)?"<null>":this.instructionOffset));
        sb.append(',');
        sb.append("instructionCount");
        sb.append('=');
        sb.append(((this.instructionCount == null)?"<null>":this.instructionCount));
        sb.append(',');
        sb.append("resolveSymbols");
        sb.append('=');
        sb.append(((this.resolveSymbols == null)?"<null>":this.resolveSymbols));
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
        result = ((result* 31)+((this.instructionOffset == null)? 0 :this.instructionOffset.hashCode()));
        result = ((result* 31)+((this.resolveSymbols == null)? 0 :this.resolveSymbols.hashCode()));
        result = ((result* 31)+((this.memoryReference == null)? 0 :this.memoryReference.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.instructionCount == null)? 0 :this.instructionCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DisassembleArguments) == false) {
            return false;
        }
        DisassembleArguments rhs = ((DisassembleArguments) other);
        return (((((((this.instructionOffset == rhs.instructionOffset)||((this.instructionOffset!= null)&&this.instructionOffset.equals(rhs.instructionOffset)))&&((this.resolveSymbols == rhs.resolveSymbols)||((this.resolveSymbols!= null)&&this.resolveSymbols.equals(rhs.resolveSymbols))))&&((this.memoryReference == rhs.memoryReference)||((this.memoryReference!= null)&&this.memoryReference.equals(rhs.memoryReference))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.instructionCount == rhs.instructionCount)||((this.instructionCount!= null)&&this.instructionCount.equals(rhs.instructionCount))));
    }

}
