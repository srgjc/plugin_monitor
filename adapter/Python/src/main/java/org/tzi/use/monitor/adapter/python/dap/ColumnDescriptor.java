
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
 * A `ColumnDescriptor` specifies what module attribute to show in a column of the modules view, how to format it,
 * and what the column's label should be.
 * It is only used if the underlying UI actually supports this level of customization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attributeName",
    "label",
    "format",
    "type",
    "width"
})
@Generated("jsonschema2pojo")
public class ColumnDescriptor {

    /**
     * Name of the attribute rendered in this column.
     * (Required)
     * 
     */
    @JsonProperty("attributeName")
    @JsonPropertyDescription("Name of the attribute rendered in this column.")
    private String attributeName;
    /**
     * Header UI label of column.
     * (Required)
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("Header UI label of column.")
    private String label;
    /**
     * Format to use for the rendered values in this column. TBD how the format strings looks like.
     * 
     */
    @JsonProperty("format")
    @JsonPropertyDescription("Format to use for the rendered values in this column. TBD how the format strings looks like.")
    private String format;
    /**
     * Datatype of values in this column. Defaults to `string` if not specified.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Datatype of values in this column. Defaults to `string` if not specified.")
    private Type type;
    /**
     * Width of this column in characters (hint only).
     * 
     */
    @JsonProperty("width")
    @JsonPropertyDescription("Width of this column in characters (hint only).")
    private Integer width;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name of the attribute rendered in this column.
     * (Required)
     * 
     */
    @JsonProperty("attributeName")
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Name of the attribute rendered in this column.
     * (Required)
     * 
     */
    @JsonProperty("attributeName")
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * Header UI label of column.
     * (Required)
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * Header UI label of column.
     * (Required)
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Format to use for the rendered values in this column. TBD how the format strings looks like.
     * 
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * Format to use for the rendered values in this column. TBD how the format strings looks like.
     * 
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Datatype of values in this column. Defaults to `string` if not specified.
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Datatype of values in this column. Defaults to `string` if not specified.
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Width of this column in characters (hint only).
     * 
     */
    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    /**
     * Width of this column in characters (hint only).
     * 
     */
    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
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
        sb.append(ColumnDescriptor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attributeName");
        sb.append('=');
        sb.append(((this.attributeName == null)?"<null>":this.attributeName));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
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
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.attributeName == null)? 0 :this.attributeName.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ColumnDescriptor) == false) {
            return false;
        }
        ColumnDescriptor rhs = ((ColumnDescriptor) other);
        return (((((((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format)))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.attributeName == rhs.attributeName)||((this.attributeName!= null)&&this.attributeName.equals(rhs.attributeName))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Datatype of values in this column. Defaults to `string` if not specified.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        STRING("string"),
        NUMBER("number"),
        BOOLEAN("boolean"),
        UNIX_TIMESTAMP_UTC("unixTimestampUTC");
        private final String value;
        private final static Map<String, Type> CONSTANTS = new HashMap<String, Type>();

        static {
            for (Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Type fromValue(String value) {
            Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
