package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `setExceptionBreakpoints` request.
 */
public class SetExceptionBreakpointsArgumentsClass {
    private ExceptionOptions[] exceptionOptions;
    private ExceptionFilterOptions[] filterOptions;
    private String[] filters;

    /**
     * Configuration options for selected exceptions.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportsExceptionOptions` is true.
     */
    @JsonProperty("exceptionOptions")
    public ExceptionOptions[] getExceptionOptions() { return exceptionOptions; }
    @JsonProperty("exceptionOptions")
    public void setExceptionOptions(ExceptionOptions[] value) { this.exceptionOptions = value; }

    /**
     * Set of exception filters and their options. The set of all possible exception filters is
     * defined by the `exceptionBreakpointFilters` capability. This attribute is only honored by
     * a debug adapter if the corresponding capability `supportsExceptionFilterOptions` is true.
     * The `filter` and `filterOptions` sets are additive.
     */
    @JsonProperty("filterOptions")
    public ExceptionFilterOptions[] getFilterOptions() { return filterOptions; }
    @JsonProperty("filterOptions")
    public void setFilterOptions(ExceptionFilterOptions[] value) { this.filterOptions = value; }

    /**
     * Set of exception filters specified by their ID. The set of all possible exception filters
     * is defined by the `exceptionBreakpointFilters` capability. The `filter` and
     * `filterOptions` sets are additive.
     */
    @JsonProperty("filters")
    public String[] getFilters() { return filters; }
    @JsonProperty("filters")
    public void setFilters(String[] value) { this.filters = value; }
}
