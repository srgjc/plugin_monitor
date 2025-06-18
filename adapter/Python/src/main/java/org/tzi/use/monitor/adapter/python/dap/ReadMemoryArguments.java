
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
 * Arguments for `readMemory` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "memoryReference",
    "offset",
    "count"
})
@Generated("jsonschema2pojo")
public class ReadMemoryArguments {

    /**
     * Memory reference to the base location from which data should be read.
     * (Required)
     * 
     */
    @JsonProperty("memoryReference")
    @JsonPropertyDescription("Memory reference to the base location from which data should be read.")
    private String memoryReference;
    /**
     * Offset (in bytes) to be applied to the reference location before reading data. Can be negative.
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("Offset (in bytes) to be applied to the reference location before reading data. Can be negative.")
    private Integer offset;
    /**
     * Number of bytes to read at the specified location and offset.
     * (Required)
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Number of bytes to read at the specified location and offset.")
    private Integer count;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Memory reference to the base location from which data should be read.
     * (Required)
     * 
     */
    @JsonProperty("memoryReference")
    public String getMemoryReference() {
        return memoryReference;
    }

    /**
     * Memory reference to the base location from which data should be read.
     * (Required)
     * 
     */
    @JsonProperty("memoryReference")
    public void setMemoryReference(String memoryReference) {
        this.memoryReference = memoryReference;
    }

    /**
     * Offset (in bytes) to be applied to the reference location before reading data. Can be negative.
     * 
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * Offset (in bytes) to be applied to the reference location before reading data. Can be negative.
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Number of bytes to read at the specified location and offset.
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Number of bytes to read at the specified location and offset.
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
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
        sb.append(ReadMemoryArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("memoryReference");
        sb.append('=');
        sb.append(((this.memoryReference == null)?"<null>":this.memoryReference));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.memoryReference == null)? 0 :this.memoryReference.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReadMemoryArguments) == false) {
            return false;
        }
        ReadMemoryArguments rhs = ((ReadMemoryArguments) other);
        return (((((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.memoryReference == rhs.memoryReference)||((this.memoryReference!= null)&&this.memoryReference.equals(rhs.memoryReference))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))));
    }

}
