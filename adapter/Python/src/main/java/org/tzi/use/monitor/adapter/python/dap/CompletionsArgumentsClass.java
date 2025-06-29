package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `completions` request.
 */
public class CompletionsArgumentsClass {
    private long column;
    private Long frameID;
    private Long line;
    private String text;

    /**
     * The position within `text` for which to determine the completion proposals. It is
     * measured in UTF-16 code units and the client capability `columnsStartAt1` determines
     * whether it is 0- or 1-based.
     */
    @JsonProperty("column")
    public long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(long value) { this.column = value; }

    /**
     * Returns completions in the scope of this stack frame. If not specified, the completions
     * are returned for the global scope.
     */
    @JsonProperty("frameId")
    public Long getFrameID() { return frameID; }
    @JsonProperty("frameId")
    public void setFrameID(Long value) { this.frameID = value; }

    /**
     * A line for which to determine the completion proposals. If missing the first line of the
     * text is assumed.
     */
    @JsonProperty("line")
    public Long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(Long value) { this.line = value; }

    /**
     * One or more source lines. Typically this is the text users have typed into the debug
     * console before they asked for completion.
     */
    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }
}
