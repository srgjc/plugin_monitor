
package org.tzi.use.monitor.adapter.python.dap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
 * An `ExceptionPathSegment` represents a segment in a path that is used to match leafs or nodes in a tree of exceptions.
 * If a segment consists of more than one name, it matches the names provided if `negate` is false or missing, or it matches anything except the names provided if `negate` is true.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "negate",
    "names"
})
@Generated("jsonschema2pojo")
public class ExceptionPathSegment {

    /**
     * If false or missing this segment matches the names provided, otherwise it matches anything except the names provided.
     * 
     */
    @JsonProperty("negate")
    @JsonPropertyDescription("If false or missing this segment matches the names provided, otherwise it matches anything except the names provided.")
    private Boolean negate;
    /**
     * Depending on the value of `negate` the names that should match or not match.
     * (Required)
     * 
     */
    @JsonProperty("names")
    @JsonPropertyDescription("Depending on the value of `negate` the names that should match or not match.")
    private List<String> names = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * If false or missing this segment matches the names provided, otherwise it matches anything except the names provided.
     * 
     */
    @JsonProperty("negate")
    public Boolean getNegate() {
        return negate;
    }

    /**
     * If false or missing this segment matches the names provided, otherwise it matches anything except the names provided.
     * 
     */
    @JsonProperty("negate")
    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * Depending on the value of `negate` the names that should match or not match.
     * (Required)
     * 
     */
    @JsonProperty("names")
    public List<String> getNames() {
        return names;
    }

    /**
     * Depending on the value of `negate` the names that should match or not match.
     * (Required)
     * 
     */
    @JsonProperty("names")
    public void setNames(List<String> names) {
        this.names = names;
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
        sb.append(ExceptionPathSegment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("negate");
        sb.append('=');
        sb.append(((this.negate == null)?"<null>":this.negate));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
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
        result = ((result* 31)+((this.negate == null)? 0 :this.negate.hashCode()));
        result = ((result* 31)+((this.names == null)? 0 :this.names.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExceptionPathSegment) == false) {
            return false;
        }
        ExceptionPathSegment rhs = ((ExceptionPathSegment) other);
        return ((((this.negate == rhs.negate)||((this.negate!= null)&&this.negate.equals(rhs.negate)))&&((this.names == rhs.names)||((this.names!= null)&&this.names.equals(rhs.names))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
