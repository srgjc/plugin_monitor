package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `variables` request.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariablesRequestArguments {
    private Long count;
    private Filter filter;
    private ValueFormat format;
    private Long start;
    private long variablesReference;

    /**
     * The number of variables to return. If count is missing or 0, all variables are returned.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportsVariablePaging` is true.
     */
    @JsonProperty("count")
    public Long getCount() { return count; }
    @JsonProperty("count")
    public void setCount(Long value) { this.count = value; }

    /**
     * Filter to limit the child variables to either named or indexed. If omitted, both types
     * are fetched.
     */
    @JsonProperty("filter")
    public Filter getFilter() { return filter; }
    @JsonProperty("filter")
    public void setFilter(Filter value) { this.filter = value; }

    /**
     * Specifies details on how to format the Variable values.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportsValueFormattingOptions` is true.
     */
    @JsonProperty("format")
    public ValueFormat getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(ValueFormat value) { this.format = value; }

    /**
     * The index of the first variable to return; if omitted children start at 0.
     * The attribute is only honored by a debug adapter if the corresponding capability
     * `supportsVariablePaging` is true.
     */
    @JsonProperty("start")
    public Long getStart() { return start; }
    @JsonProperty("start")
    public void setStart(Long value) { this.start = value; }

    /**
     * The variable for which to retrieve its children. The `variablesReference` must have been
     * obtained in the current suspended state. See 'Lifetime of Object References' in the
     * Overview section for details.
     */
    @JsonProperty("variablesReference")
    public long getVariablesReference() { return variablesReference; }
    @JsonProperty("variablesReference")
    public void setVariablesReference(long value) { this.variablesReference = value; }
}
