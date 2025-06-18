
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
 * Arguments for `setBreakpoints` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source",
    "breakpoints",
    "lines",
    "sourceModified"
})
@Generated("jsonschema2pojo")
public class SetBreakpointsArguments {

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A `Source` is a descriptor for source code.\nIt is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.")
    private Source source;
    /**
     * The code locations of the breakpoints.
     * 
     */
    @JsonProperty("breakpoints")
    @JsonPropertyDescription("The code locations of the breakpoints.")
    private List<SourceBreakpoint> breakpoints = new ArrayList<SourceBreakpoint>();
    /**
     * Deprecated: The code locations of the breakpoints.
     * 
     */
    @JsonProperty("lines")
    @JsonPropertyDescription("Deprecated: The code locations of the breakpoints.")
    private List<Integer> lines = new ArrayList<Integer>();
    /**
     * A value of true indicates that the underlying source has been modified which results in new breakpoint locations.
     * 
     */
    @JsonProperty("sourceModified")
    @JsonPropertyDescription("A value of true indicates that the underlying source has been modified which results in new breakpoint locations.")
    private Boolean sourceModified;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * The code locations of the breakpoints.
     * 
     */
    @JsonProperty("breakpoints")
    public List<SourceBreakpoint> getBreakpoints() {
        return breakpoints;
    }

    /**
     * The code locations of the breakpoints.
     * 
     */
    @JsonProperty("breakpoints")
    public void setBreakpoints(List<SourceBreakpoint> breakpoints) {
        this.breakpoints = breakpoints;
    }

    /**
     * Deprecated: The code locations of the breakpoints.
     * 
     */
    @JsonProperty("lines")
    public List<Integer> getLines() {
        return lines;
    }

    /**
     * Deprecated: The code locations of the breakpoints.
     * 
     */
    @JsonProperty("lines")
    public void setLines(List<Integer> lines) {
        this.lines = lines;
    }

    /**
     * A value of true indicates that the underlying source has been modified which results in new breakpoint locations.
     * 
     */
    @JsonProperty("sourceModified")
    public Boolean getSourceModified() {
        return sourceModified;
    }

    /**
     * A value of true indicates that the underlying source has been modified which results in new breakpoint locations.
     * 
     */
    @JsonProperty("sourceModified")
    public void setSourceModified(Boolean sourceModified) {
        this.sourceModified = sourceModified;
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
        sb.append(SetBreakpointsArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("breakpoints");
        sb.append('=');
        sb.append(((this.breakpoints == null)?"<null>":this.breakpoints));
        sb.append(',');
        sb.append("lines");
        sb.append('=');
        sb.append(((this.lines == null)?"<null>":this.lines));
        sb.append(',');
        sb.append("sourceModified");
        sb.append('=');
        sb.append(((this.sourceModified == null)?"<null>":this.sourceModified));
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
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.breakpoints == null)? 0 :this.breakpoints.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lines == null)? 0 :this.lines.hashCode()));
        result = ((result* 31)+((this.sourceModified == null)? 0 :this.sourceModified.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetBreakpointsArguments) == false) {
            return false;
        }
        SetBreakpointsArguments rhs = ((SetBreakpointsArguments) other);
        return ((((((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source)))&&((this.breakpoints == rhs.breakpoints)||((this.breakpoints!= null)&&this.breakpoints.equals(rhs.breakpoints))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lines == rhs.lines)||((this.lines!= null)&&this.lines.equals(rhs.lines))))&&((this.sourceModified == rhs.sourceModified)||((this.sourceModified!= null)&&this.sourceModified.equals(rhs.sourceModified))));
    }

}
