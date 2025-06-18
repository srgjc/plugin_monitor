
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
 * Arguments for `source` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source",
    "sourceReference"
})
@Generated("jsonschema2pojo")
public class SourceArguments {

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A `Source` is a descriptor for source code.\nIt is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.")
    private Source source;
    /**
     * The reference to the source. This is the same as `source.sourceReference`.
     * This is provided for backward compatibility since old clients do not understand the `source` attribute.
     * (Required)
     * 
     */
    @JsonProperty("sourceReference")
    @JsonPropertyDescription("The reference to the source. This is the same as `source.sourceReference`.\nThis is provided for backward compatibility since old clients do not understand the `source` attribute.")
    private Integer sourceReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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
     * The reference to the source. This is the same as `source.sourceReference`.
     * This is provided for backward compatibility since old clients do not understand the `source` attribute.
     * (Required)
     * 
     */
    @JsonProperty("sourceReference")
    public Integer getSourceReference() {
        return sourceReference;
    }

    /**
     * The reference to the source. This is the same as `source.sourceReference`.
     * This is provided for backward compatibility since old clients do not understand the `source` attribute.
     * (Required)
     * 
     */
    @JsonProperty("sourceReference")
    public void setSourceReference(Integer sourceReference) {
        this.sourceReference = sourceReference;
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
        sb.append(SourceArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("sourceReference");
        sb.append('=');
        sb.append(((this.sourceReference == null)?"<null>":this.sourceReference));
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
        result = ((result* 31)+((this.sourceReference == null)? 0 :this.sourceReference.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceArguments) == false) {
            return false;
        }
        SourceArguments rhs = ((SourceArguments) other);
        return ((((this.sourceReference == rhs.sourceReference)||((this.sourceReference!= null)&&this.sourceReference.equals(rhs.sourceReference)))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
