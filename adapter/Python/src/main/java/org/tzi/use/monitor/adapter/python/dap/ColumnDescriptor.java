package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * A `ColumnDescriptor` specifies what module attribute to show in a column of the modules
 * view, how to format it,
 * and what the column's label should be.
 * It is only used if the underlying UI actually supports this level of customization.
 */
public class ColumnDescriptor {
    private String attributeName;
    private String format;
    private String label;
    private Type type;
    private Long width;

    /**
     * Name of the attribute rendered in this column.
     */
    @JsonProperty("attributeName")
    public String getAttributeName() { return attributeName; }
    @JsonProperty("attributeName")
    public void setAttributeName(String value) { this.attributeName = value; }

    /**
     * Format to use for the rendered values in this column. TBD how the format strings looks
     * like.
     */
    @JsonProperty("format")
    public String getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(String value) { this.format = value; }

    /**
     * Header UI label of column.
     */
    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    /**
     * Datatype of values in this column. Defaults to `string` if not specified.
     */
    @JsonProperty("type")
    public Type getType() { return type; }
    @JsonProperty("type")
    public void setType(Type value) { this.type = value; }

    /**
     * Width of this column in characters (hint only).
     */
    @JsonProperty("width")
    public Long getWidth() { return width; }
    @JsonProperty("width")
    public void setWidth(Long value) { this.width = value; }
}
