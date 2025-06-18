
package org.tzi.use.monitor.adapter.python.dap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Arguments for `variables` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "variablesReference",
    "filter",
    "start",
    "count",
    "format"
})
@Generated("jsonschema2pojo")
public class VariablesArguments {

    /**
     * The variable for which to retrieve its children. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    @JsonPropertyDescription("The variable for which to retrieve its children. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.")
    private Integer variablesReference;
    /**
     * Filter to limit the child variables to either named or indexed. If omitted, both types are fetched.
     * 
     */
    @JsonProperty("filter")
    @JsonPropertyDescription("Filter to limit the child variables to either named or indexed. If omitted, both types are fetched.")
    private Filter filter;
    /**
     * The index of the first variable to return; if omitted children start at 0.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsVariablePaging` is true.
     * 
     */
    @JsonProperty("start")
    @JsonPropertyDescription("The index of the first variable to return; if omitted children start at 0.\nThe attribute is only honored by a debug adapter if the corresponding capability `supportsVariablePaging` is true.")
    private Integer start;
    /**
     * The number of variables to return. If count is missing or 0, all variables are returned.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsVariablePaging` is true.
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("The number of variables to return. If count is missing or 0, all variables are returned.\nThe attribute is only honored by a debug adapter if the corresponding capability `supportsVariablePaging` is true.")
    private Integer count;
    /**
     * Provides formatting information for a value.
     * 
     */
    @JsonProperty("format")
    @JsonPropertyDescription("Provides formatting information for a value.")
    private ValueFormat format;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The variable for which to retrieve its children. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    public Integer getVariablesReference() {
        return variablesReference;
    }

    /**
     * The variable for which to retrieve its children. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details.
     * (Required)
     * 
     */
    @JsonProperty("variablesReference")
    public void setVariablesReference(Integer variablesReference) {
        this.variablesReference = variablesReference;
    }

    /**
     * Filter to limit the child variables to either named or indexed. If omitted, both types are fetched.
     * 
     */
    @JsonProperty("filter")
    public Filter getFilter() {
        return filter;
    }

    /**
     * Filter to limit the child variables to either named or indexed. If omitted, both types are fetched.
     * 
     */
    @JsonProperty("filter")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * The index of the first variable to return; if omitted children start at 0.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsVariablePaging` is true.
     * 
     */
    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    /**
     * The index of the first variable to return; if omitted children start at 0.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsVariablePaging` is true.
     * 
     */
    @JsonProperty("start")
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * The number of variables to return. If count is missing or 0, all variables are returned.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsVariablePaging` is true.
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * The number of variables to return. If count is missing or 0, all variables are returned.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportsVariablePaging` is true.
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Provides formatting information for a value.
     * 
     */
    @JsonProperty("format")
    public ValueFormat getFormat() {
        return format;
    }

    /**
     * Provides formatting information for a value.
     * 
     */
    @JsonProperty("format")
    public void setFormat(ValueFormat format) {
        this.format = format;
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
        sb.append(VariablesArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("variablesReference");
        sb.append('=');
        sb.append(((this.variablesReference == null)?"<null>":this.variablesReference));
        sb.append(',');
        sb.append("filter");
        sb.append('=');
        sb.append(((this.filter == null)?"<null>":this.filter));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
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
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.variablesReference == null)? 0 :this.variablesReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VariablesArguments) == false) {
            return false;
        }
        VariablesArguments rhs = ((VariablesArguments) other);
        return (((((((this.filter == rhs.filter)||((this.filter!= null)&&this.filter.equals(rhs.filter)))&&((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start))))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.variablesReference == rhs.variablesReference)||((this.variablesReference!= null)&&this.variablesReference.equals(rhs.variablesReference))));
    }


    /**
     * Filter to limit the child variables to either named or indexed. If omitted, both types are fetched.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Filter {

        INDEXED("indexed"),
        NAMED("named");
        private final String value;
        private final static Map<String, Filter> CONSTANTS = new HashMap<String, Filter>();

        static {
            for (Filter c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Filter(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Filter fromValue(String value) {
            Filter constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
