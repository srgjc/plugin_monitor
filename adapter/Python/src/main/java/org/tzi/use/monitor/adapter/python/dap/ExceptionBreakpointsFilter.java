
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
 * An `ExceptionBreakpointsFilter` is shown in the UI as an filter option for configuring how exceptions are dealt with.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "filter",
    "label",
    "description",
    "default",
    "supportsCondition",
    "conditionDescription"
})
@Generated("jsonschema2pojo")
public class ExceptionBreakpointsFilter {

    /**
     * The internal ID of the filter option. This value is passed to the `setExceptionBreakpoints` request.
     * (Required)
     * 
     */
    @JsonProperty("filter")
    @JsonPropertyDescription("The internal ID of the filter option. This value is passed to the `setExceptionBreakpoints` request.")
    private String filter;
    /**
     * The name of the filter option. This is shown in the UI.
     * (Required)
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("The name of the filter option. This is shown in the UI.")
    private String label;
    /**
     * A help text providing additional information about the exception filter. This string is typically shown as a hover and can be translated.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A help text providing additional information about the exception filter. This string is typically shown as a hover and can be translated.")
    private String description;
    /**
     * Initial value of the filter option. If not specified a value false is assumed.
     * 
     */
    @JsonProperty("default")
    @JsonPropertyDescription("Initial value of the filter option. If not specified a value false is assumed.")
    private Boolean _default;
    /**
     * Controls whether a condition can be specified for this filter option. If false or missing, a condition can not be set.
     * 
     */
    @JsonProperty("supportsCondition")
    @JsonPropertyDescription("Controls whether a condition can be specified for this filter option. If false or missing, a condition can not be set.")
    private Boolean supportsCondition;
    /**
     * A help text providing information about the condition. This string is shown as the placeholder text for a text box and can be translated.
     * 
     */
    @JsonProperty("conditionDescription")
    @JsonPropertyDescription("A help text providing information about the condition. This string is shown as the placeholder text for a text box and can be translated.")
    private String conditionDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The internal ID of the filter option. This value is passed to the `setExceptionBreakpoints` request.
     * (Required)
     * 
     */
    @JsonProperty("filter")
    public String getFilter() {
        return filter;
    }

    /**
     * The internal ID of the filter option. This value is passed to the `setExceptionBreakpoints` request.
     * (Required)
     * 
     */
    @JsonProperty("filter")
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * The name of the filter option. This is shown in the UI.
     * (Required)
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * The name of the filter option. This is shown in the UI.
     * (Required)
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * A help text providing additional information about the exception filter. This string is typically shown as a hover and can be translated.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A help text providing additional information about the exception filter. This string is typically shown as a hover and can be translated.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Initial value of the filter option. If not specified a value false is assumed.
     * 
     */
    @JsonProperty("default")
    public Boolean getDefault() {
        return _default;
    }

    /**
     * Initial value of the filter option. If not specified a value false is assumed.
     * 
     */
    @JsonProperty("default")
    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    /**
     * Controls whether a condition can be specified for this filter option. If false or missing, a condition can not be set.
     * 
     */
    @JsonProperty("supportsCondition")
    public Boolean getSupportsCondition() {
        return supportsCondition;
    }

    /**
     * Controls whether a condition can be specified for this filter option. If false or missing, a condition can not be set.
     * 
     */
    @JsonProperty("supportsCondition")
    public void setSupportsCondition(Boolean supportsCondition) {
        this.supportsCondition = supportsCondition;
    }

    /**
     * A help text providing information about the condition. This string is shown as the placeholder text for a text box and can be translated.
     * 
     */
    @JsonProperty("conditionDescription")
    public String getConditionDescription() {
        return conditionDescription;
    }

    /**
     * A help text providing information about the condition. This string is shown as the placeholder text for a text box and can be translated.
     * 
     */
    @JsonProperty("conditionDescription")
    public void setConditionDescription(String conditionDescription) {
        this.conditionDescription = conditionDescription;
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
        sb.append(ExceptionBreakpointsFilter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("filter");
        sb.append('=');
        sb.append(((this.filter == null)?"<null>":this.filter));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_default");
        sb.append('=');
        sb.append(((this._default == null)?"<null>":this._default));
        sb.append(',');
        sb.append("supportsCondition");
        sb.append('=');
        sb.append(((this.supportsCondition == null)?"<null>":this.supportsCondition));
        sb.append(',');
        sb.append("conditionDescription");
        sb.append('=');
        sb.append(((this.conditionDescription == null)?"<null>":this.conditionDescription));
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
        result = ((result* 31)+((this.filter == null)? 0 :this.filter.hashCode()));
        result = ((result* 31)+((this._default == null)? 0 :this._default.hashCode()));
        result = ((result* 31)+((this.supportsCondition == null)? 0 :this.supportsCondition.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.conditionDescription == null)? 0 :this.conditionDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExceptionBreakpointsFilter) == false) {
            return false;
        }
        ExceptionBreakpointsFilter rhs = ((ExceptionBreakpointsFilter) other);
        return ((((((((this.filter == rhs.filter)||((this.filter!= null)&&this.filter.equals(rhs.filter)))&&((this._default == rhs._default)||((this._default!= null)&&this._default.equals(rhs._default))))&&((this.supportsCondition == rhs.supportsCondition)||((this.supportsCondition!= null)&&this.supportsCondition.equals(rhs.supportsCondition))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.conditionDescription == rhs.conditionDescription)||((this.conditionDescription!= null)&&this.conditionDescription.equals(rhs.conditionDescription))));
    }

}
