
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
 * Arguments for `setDataBreakpoints` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "breakpoints"
})
@Generated("jsonschema2pojo")
public class SetDataBreakpointsArguments {

    /**
     * The contents of this array replaces all existing data breakpoints. An empty array clears all data breakpoints.
     * (Required)
     * 
     */
    @JsonProperty("breakpoints")
    @JsonPropertyDescription("The contents of this array replaces all existing data breakpoints. An empty array clears all data breakpoints.")
    private List<DataBreakpoint> breakpoints = new ArrayList<DataBreakpoint>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The contents of this array replaces all existing data breakpoints. An empty array clears all data breakpoints.
     * (Required)
     * 
     */
    @JsonProperty("breakpoints")
    public List<DataBreakpoint> getBreakpoints() {
        return breakpoints;
    }

    /**
     * The contents of this array replaces all existing data breakpoints. An empty array clears all data breakpoints.
     * (Required)
     * 
     */
    @JsonProperty("breakpoints")
    public void setBreakpoints(List<DataBreakpoint> breakpoints) {
        this.breakpoints = breakpoints;
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
        sb.append(SetDataBreakpointsArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("breakpoints");
        sb.append('=');
        sb.append(((this.breakpoints == null)?"<null>":this.breakpoints));
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
        result = ((result* 31)+((this.breakpoints == null)? 0 :this.breakpoints.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetDataBreakpointsArguments) == false) {
            return false;
        }
        SetDataBreakpointsArguments rhs = ((SetDataBreakpointsArguments) other);
        return (((this.breakpoints == rhs.breakpoints)||((this.breakpoints!= null)&&this.breakpoints.equals(rhs.breakpoints)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
