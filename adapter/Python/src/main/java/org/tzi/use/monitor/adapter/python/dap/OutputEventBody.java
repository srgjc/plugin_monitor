package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class OutputEventBody {
    private String category;
    private Long column;
    private Restart data;
    private Group group;
    private Long line;
    private String output;
    private Source source;
    private Long variablesReference;

    /**
     * The output category. If not specified or if the category is not understood by the client,
     * `console` is assumed.
     */
    @JsonProperty("category")
    public String getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(String value) { this.category = value; }

    /**
     * The position in `line` where the output was produced. It is measured in UTF-16 code units
     * and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     */
    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    /**
     * Additional data to report. For the `telemetry` category the data is sent to telemetry,
     * for the other categories the data is shown in JSON format.
     */
    @JsonProperty("data")
    public Restart getData() { return data; }
    @JsonProperty("data")
    public void setData(Restart value) { this.data = value; }

    /**
     * Support for keeping an output log organized by grouping related messages.
     */
    @JsonProperty("group")
    public Group getGroup() { return group; }
    @JsonProperty("group")
    public void setGroup(Group value) { this.group = value; }

    /**
     * The source location's line where the output was produced.
     */
    @JsonProperty("line")
    public Long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(Long value) { this.line = value; }

    /**
     * The output to report.
     */
    @JsonProperty("output")
    public String getOutput() { return output; }
    @JsonProperty("output")
    public void setOutput(String value) { this.output = value; }

    /**
     * The source location where the output was produced.
     */
    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }

    /**
     * If an attribute `variablesReference` exists and its value is > 0, the output contains
     * objects which can be retrieved by passing `variablesReference` to the `variables` request
     * as long as execution remains suspended. See 'Lifetime of Object References' in the
     * Overview section for details.
     */
    @JsonProperty("variablesReference")
    public Long getVariablesReference() { return variablesReference; }
    @JsonProperty("variablesReference")
    public void setVariablesReference(Long value) { this.variablesReference = value; }
}
