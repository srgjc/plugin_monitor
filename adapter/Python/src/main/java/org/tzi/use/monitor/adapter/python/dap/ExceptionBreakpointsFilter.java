package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * An `ExceptionBreakpointsFilter` is shown in the UI as an filter option for configuring
 * how exceptions are dealt with.
 */
public class ExceptionBreakpointsFilter {
    private String conditionDescription;
    private Boolean exceptionBreakpointsFilterDefault;
    private String description;
    private String filter;
    private String label;
    private Boolean supportsCondition;

    /**
     * A help text providing information about the condition. This string is shown as the
     * placeholder text for a text box and can be translated.
     */
    @JsonProperty("conditionDescription")
    public String getConditionDescription() { return conditionDescription; }
    @JsonProperty("conditionDescription")
    public void setConditionDescription(String value) { this.conditionDescription = value; }

    /**
     * Initial value of the filter option. If not specified a value false is assumed.
     */
    @JsonProperty("default")
    public Boolean getExceptionBreakpointsFilterDefault() { return exceptionBreakpointsFilterDefault; }
    @JsonProperty("default")
    public void setExceptionBreakpointsFilterDefault(Boolean value) { this.exceptionBreakpointsFilterDefault = value; }

    /**
     * A help text providing additional information about the exception filter. This string is
     * typically shown as a hover and can be translated.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    /**
     * The internal ID of the filter option. This value is passed to the
     * `setExceptionBreakpoints` request.
     */
    @JsonProperty("filter")
    public String getFilter() { return filter; }
    @JsonProperty("filter")
    public void setFilter(String value) { this.filter = value; }

    /**
     * The name of the filter option. This is shown in the UI.
     */
    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    /**
     * Controls whether a condition can be specified for this filter option. If false or
     * missing, a condition can not be set.
     */
    @JsonProperty("supportsCondition")
    public Boolean getSupportsCondition() { return supportsCondition; }
    @JsonProperty("supportsCondition")
    public void setSupportsCondition(Boolean value) { this.supportsCondition = value; }
}
