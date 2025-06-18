
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
 * Arguments for `writeMemory` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "memoryReference",
    "offset",
    "allowPartial",
    "data"
})
@Generated("jsonschema2pojo")
public class WriteMemoryArguments {

    /**
     * Memory reference to the base location to which data should be written.
     * (Required)
     * 
     */
    @JsonProperty("memoryReference")
    @JsonPropertyDescription("Memory reference to the base location to which data should be written.")
    private String memoryReference;
    /**
     * Offset (in bytes) to be applied to the reference location before writing data. Can be negative.
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("Offset (in bytes) to be applied to the reference location before writing data. Can be negative.")
    private Integer offset;
    /**
     * Property to control partial writes. If true, the debug adapter should attempt to write memory even if the entire memory region is not writable. In such a case the debug adapter should stop after hitting the first byte of memory that cannot be written and return the number of bytes written in the response via the `offset` and `bytesWritten` properties.
     * If false or missing, a debug adapter should attempt to verify the region is writable before writing, and fail the response if it is not.
     * 
     */
    @JsonProperty("allowPartial")
    @JsonPropertyDescription("Property to control partial writes. If true, the debug adapter should attempt to write memory even if the entire memory region is not writable. In such a case the debug adapter should stop after hitting the first byte of memory that cannot be written and return the number of bytes written in the response via the `offset` and `bytesWritten` properties.\nIf false or missing, a debug adapter should attempt to verify the region is writable before writing, and fail the response if it is not.")
    private Boolean allowPartial;
    /**
     * Bytes to write, encoded using base64.
     * (Required)
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Bytes to write, encoded using base64.")
    private String data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Memory reference to the base location to which data should be written.
     * (Required)
     * 
     */
    @JsonProperty("memoryReference")
    public String getMemoryReference() {
        return memoryReference;
    }

    /**
     * Memory reference to the base location to which data should be written.
     * (Required)
     * 
     */
    @JsonProperty("memoryReference")
    public void setMemoryReference(String memoryReference) {
        this.memoryReference = memoryReference;
    }

    /**
     * Offset (in bytes) to be applied to the reference location before writing data. Can be negative.
     * 
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * Offset (in bytes) to be applied to the reference location before writing data. Can be negative.
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Property to control partial writes. If true, the debug adapter should attempt to write memory even if the entire memory region is not writable. In such a case the debug adapter should stop after hitting the first byte of memory that cannot be written and return the number of bytes written in the response via the `offset` and `bytesWritten` properties.
     * If false or missing, a debug adapter should attempt to verify the region is writable before writing, and fail the response if it is not.
     * 
     */
    @JsonProperty("allowPartial")
    public Boolean getAllowPartial() {
        return allowPartial;
    }

    /**
     * Property to control partial writes. If true, the debug adapter should attempt to write memory even if the entire memory region is not writable. In such a case the debug adapter should stop after hitting the first byte of memory that cannot be written and return the number of bytes written in the response via the `offset` and `bytesWritten` properties.
     * If false or missing, a debug adapter should attempt to verify the region is writable before writing, and fail the response if it is not.
     * 
     */
    @JsonProperty("allowPartial")
    public void setAllowPartial(Boolean allowPartial) {
        this.allowPartial = allowPartial;
    }

    /**
     * Bytes to write, encoded using base64.
     * (Required)
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * Bytes to write, encoded using base64.
     * (Required)
     * 
     */
    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
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
        sb.append(WriteMemoryArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("memoryReference");
        sb.append('=');
        sb.append(((this.memoryReference == null)?"<null>":this.memoryReference));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("allowPartial");
        sb.append('=');
        sb.append(((this.allowPartial == null)?"<null>":this.allowPartial));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.memoryReference == null)? 0 :this.memoryReference.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.allowPartial == null)? 0 :this.allowPartial.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WriteMemoryArguments) == false) {
            return false;
        }
        WriteMemoryArguments rhs = ((WriteMemoryArguments) other);
        return ((((((this.memoryReference == rhs.memoryReference)||((this.memoryReference!= null)&&this.memoryReference.equals(rhs.memoryReference)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.allowPartial == rhs.allowPartial)||((this.allowPartial!= null)&&this.allowPartial.equals(rhs.allowPartial))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))));
    }

}
