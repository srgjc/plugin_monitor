
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
 * Arguments for `setExceptionBreakpoints` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "filters",
    "filterOptions",
    "exceptionOptions"
})
@Generated("jsonschema2pojo")
public class SetExceptionBreakpointsArguments {

    /**
     * Set of exception filters specified by their ID. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. The `filter` and `filterOptions` sets are additive.
     * (Required)
     * 
     */
    @JsonProperty("filters")
    @JsonPropertyDescription("Set of exception filters specified by their ID. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. The `filter` and `filterOptions` sets are additive.")
    private List<String> filters = new ArrayList<String>();
    /**
     * Set of exception filters and their options. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. This attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionFilterOptions` is true. The `filter` and `filterOptions` sets are additive.
     * 
     */
    @JsonProperty("filterOptions")
    @JsonPropertyDescription("Set of exception filters and their options. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. This attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionFilterOptions` is true. The `filter` and `filterOptions` sets are additive.")
    private List<ExceptionFilterOptions> filterOptions = new ArrayList<ExceptionFilterOptions>();
    /**
     * Configuration options for selected exceptions.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionOptions` is true.
     * 
     */
    @JsonProperty("exceptionOptions")
    @JsonPropertyDescription("Configuration options for selected exceptions.\nThe attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionOptions` is true.")
    private List<ExceptionOptions> exceptionOptions = new ArrayList<ExceptionOptions>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Set of exception filters specified by their ID. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. The `filter` and `filterOptions` sets are additive.
     * (Required)
     * 
     */
    @JsonProperty("filters")
    public List<String> getFilters() {
        return filters;
    }

    /**
     * Set of exception filters specified by their ID. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. The `filter` and `filterOptions` sets are additive.
     * (Required)
     * 
     */
    @JsonProperty("filters")
    public void setFilters(List<String> filters) {
        this.filters = filters;
    }

    /**
     * Set of exception filters and their options. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. This attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionFilterOptions` is true. The `filter` and `filterOptions` sets are additive.
     * 
     */
    @JsonProperty("filterOptions")
    public List<ExceptionFilterOptions> getFilterOptions() {
        return filterOptions;
    }

    /**
     * Set of exception filters and their options. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. This attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionFilterOptions` is true. The `filter` and `filterOptions` sets are additive.
     * 
     */
    @JsonProperty("filterOptions")
    public void setFilterOptions(List<ExceptionFilterOptions> filterOptions) {
        this.filterOptions = filterOptions;
    }

    /**
     * Configuration options for selected exceptions.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionOptions` is true.
     * 
     */
    @JsonProperty("exceptionOptions")
    public List<ExceptionOptions> getExceptionOptions() {
        return exceptionOptions;
    }

    /**
     * Configuration options for selected exceptions.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionOptions` is true.
     * 
     */
    @JsonProperty("exceptionOptions")
    public void setExceptionOptions(List<ExceptionOptions> exceptionOptions) {
        this.exceptionOptions = exceptionOptions;
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
        sb.append(SetExceptionBreakpointsArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("filters");
        sb.append('=');
        sb.append(((this.filters == null)?"<null>":this.filters));
        sb.append(',');
        sb.append("filterOptions");
        sb.append('=');
        sb.append(((this.filterOptions == null)?"<null>":this.filterOptions));
        sb.append(',');
        sb.append("exceptionOptions");
        sb.append('=');
        sb.append(((this.exceptionOptions == null)?"<null>":this.exceptionOptions));
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
        result = ((result* 31)+((this.filters == null)? 0 :this.filters.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.exceptionOptions == null)? 0 :this.exceptionOptions.hashCode()));
        result = ((result* 31)+((this.filterOptions == null)? 0 :this.filterOptions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetExceptionBreakpointsArguments) == false) {
            return false;
        }
        SetExceptionBreakpointsArguments rhs = ((SetExceptionBreakpointsArguments) other);
        return (((((this.filters == rhs.filters)||((this.filters!= null)&&this.filters.equals(rhs.filters)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.exceptionOptions == rhs.exceptionOptions)||((this.exceptionOptions!= null)&&this.exceptionOptions.equals(rhs.exceptionOptions))))&&((this.filterOptions == rhs.filterOptions)||((this.filterOptions!= null)&&this.filterOptions.equals(rhs.filterOptions))));
    }

}
