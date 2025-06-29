package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * An `ExceptionFilterOptions` is used to specify an exception filter together with a
 * condition for the `setExceptionBreakpoints` request.
 */
public class ExceptionFilterOptions {
    private String condition;
    private String filterID;

    /**
     * An expression for conditional exceptions.
     * The exception breaks into the debugger if the result of the condition is true.
     */
    @JsonProperty("condition")
    public String getCondition() { return condition; }
    @JsonProperty("condition")
    public void setCondition(String value) { this.condition = value; }

    /**
     * ID of an exception filter returned by the `exceptionBreakpointFilters` capability.
     */
    @JsonProperty("filterId")
    public String getFilterID() { return filterID; }
    @JsonProperty("filterId")
    public void setFilterID(String value) { this.filterID = value; }
}
