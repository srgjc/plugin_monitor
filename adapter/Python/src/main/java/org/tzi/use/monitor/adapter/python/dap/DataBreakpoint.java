
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
 * Properties of a data breakpoint passed to the `setDataBreakpoints` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataId",
    "accessType",
    "condition",
    "hitCondition"
})
@Generated("jsonschema2pojo")
public class DataBreakpoint {

    /**
     * An id representing the data. This id is returned from the `dataBreakpointInfo` request.
     * (Required)
     * 
     */
    @JsonProperty("dataId")
    @JsonPropertyDescription("An id representing the data. This id is returned from the `dataBreakpointInfo` request.")
    private String dataId;
    /**
     * This enumeration defines all possible access types for data breakpoints.
     * 
     */
    @JsonProperty("accessType")
    @JsonPropertyDescription("This enumeration defines all possible access types for data breakpoints.")
    private DataBreakpointAccessType accessType;
    /**
     * An expression for conditional breakpoints.
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("An expression for conditional breakpoints.")
    private String condition;
    /**
     * An expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * 
     */
    @JsonProperty("hitCondition")
    @JsonPropertyDescription("An expression that controls how many hits of the breakpoint are ignored.\nThe debug adapter is expected to interpret the expression as needed.")
    private String hitCondition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * An id representing the data. This id is returned from the `dataBreakpointInfo` request.
     * (Required)
     * 
     */
    @JsonProperty("dataId")
    public String getDataId() {
        return dataId;
    }

    /**
     * An id representing the data. This id is returned from the `dataBreakpointInfo` request.
     * (Required)
     * 
     */
    @JsonProperty("dataId")
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * This enumeration defines all possible access types for data breakpoints.
     * 
     */
    @JsonProperty("accessType")
    public DataBreakpointAccessType getAccessType() {
        return accessType;
    }

    /**
     * This enumeration defines all possible access types for data breakpoints.
     * 
     */
    @JsonProperty("accessType")
    public void setAccessType(DataBreakpointAccessType accessType) {
        this.accessType = accessType;
    }

    /**
     * An expression for conditional breakpoints.
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * An expression for conditional breakpoints.
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * An expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * 
     */
    @JsonProperty("hitCondition")
    public String getHitCondition() {
        return hitCondition;
    }

    /**
     * An expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     * 
     */
    @JsonProperty("hitCondition")
    public void setHitCondition(String hitCondition) {
        this.hitCondition = hitCondition;
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
        sb.append(DataBreakpoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataId");
        sb.append('=');
        sb.append(((this.dataId == null)?"<null>":this.dataId));
        sb.append(',');
        sb.append("accessType");
        sb.append('=');
        sb.append(((this.accessType == null)?"<null>":this.accessType));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("hitCondition");
        sb.append('=');
        sb.append(((this.hitCondition == null)?"<null>":this.hitCondition));
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
        result = ((result* 31)+((this.accessType == null)? 0 :this.accessType.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.hitCondition == null)? 0 :this.hitCondition.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dataId == null)? 0 :this.dataId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataBreakpoint) == false) {
            return false;
        }
        DataBreakpoint rhs = ((DataBreakpoint) other);
        return ((((((this.accessType == rhs.accessType)||((this.accessType!= null)&&this.accessType.equals(rhs.accessType)))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.hitCondition == rhs.hitCondition)||((this.hitCondition!= null)&&this.hitCondition.equals(rhs.hitCondition))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dataId == rhs.dataId)||((this.dataId!= null)&&this.dataId.equals(rhs.dataId))));
    }


    /**
     * This enumeration defines all possible access types for data breakpoints.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DataBreakpointAccessType {

        READ("read"),
        WRITE("write"),
        READ_WRITE("readWrite");
        private final String value;
        private final static Map<String, DataBreakpointAccessType> CONSTANTS = new HashMap<String, DataBreakpointAccessType>();

        static {
            for (DataBreakpointAccessType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataBreakpointAccessType(String value) {
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
        public static DataBreakpointAccessType fromValue(String value) {
            DataBreakpointAccessType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
