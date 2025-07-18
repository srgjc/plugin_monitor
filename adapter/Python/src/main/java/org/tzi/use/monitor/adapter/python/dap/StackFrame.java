package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * A Stackframe contains the source location.
 */
public class StackFrame {
    private Boolean canRestart;
    private long column;
    private Long endColumn;
    private Long endLine;
    private long id;
    private String instructionPointerReference;
    private long line;
    private ModuleIDUnion moduleID;
    private String name;
    private StackFramePresentationHint presentationHint;
    private Source source;

    /**
     * Indicates whether this frame can be restarted with the `restart` request. Clients should
     * only use this if the debug adapter supports the `restart` request and the corresponding
     * capability `supportsRestartRequest` is true. If a debug adapter has this capability, then
     * `canRestart` defaults to `true` if the property is absent.
     */
    @JsonProperty("canRestart")
    public Boolean getCanRestart() { return canRestart; }
    @JsonProperty("canRestart")
    public void setCanRestart(Boolean value) { this.canRestart = value; }

    /**
     * Start position of the range covered by the stack frame. It is measured in UTF-16 code
     * units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     * If attribute `source` is missing or doesn't exist, `column` is 0 and should be ignored by
     * the client.
     */
    @JsonProperty("column")
    public long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(long value) { this.column = value; }

    /**
     * End position of the range covered by the stack frame. It is measured in UTF-16 code units
     * and the client capability `columnsStartAt1` determines whether it is 0- or 1-based.
     */
    @JsonProperty("endColumn")
    public Long getEndColumn() { return endColumn; }
    @JsonProperty("endColumn")
    public void setEndColumn(Long value) { this.endColumn = value; }

    /**
     * The end line of the range covered by the stack frame.
     */
    @JsonProperty("endLine")
    public Long getEndLine() { return endLine; }
    @JsonProperty("endLine")
    public void setEndLine(Long value) { this.endLine = value; }

    /**
     * An identifier for the stack frame. It must be unique across all threads.
     * This id can be used to retrieve the scopes of the frame with the `scopes` request or to
     * restart the execution of a stack frame.
     */
    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    /**
     * A memory reference for the current instruction pointer in this frame.
     */
    @JsonProperty("instructionPointerReference")
    public String getInstructionPointerReference() { return instructionPointerReference; }
    @JsonProperty("instructionPointerReference")
    public void setInstructionPointerReference(String value) { this.instructionPointerReference = value; }

    /**
     * The line within the source of the frame. If the source attribute is missing or doesn't
     * exist, `line` is 0 and should be ignored by the client.
     */
    @JsonProperty("line")
    public long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(long value) { this.line = value; }

    /**
     * The module associated with this frame, if any.
     */
    @JsonProperty("moduleId")
    public ModuleIDUnion getModuleID() { return moduleID; }
    @JsonProperty("moduleId")
    public void setModuleID(ModuleIDUnion value) { this.moduleID = value; }

    /**
     * The name of the stack frame, typically a method name.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * A hint for how to present this frame in the UI.
     * A value of `label` can be used to indicate that the frame is an artificial frame that is
     * used as a visual label or separator. A value of `subtle` can be used to change the
     * appearance of a frame in a 'subtle' way.
     */
    @JsonProperty("presentationHint")
    public StackFramePresentationHint getPresentationHint() { return presentationHint; }
    @JsonProperty("presentationHint")
    public void setPresentationHint(StackFramePresentationHint value) { this.presentationHint = value; }

    /**
     * The source of the frame.
     */
    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }

    @Override
    public String toString() {
        return "StackFrame{" +
                "canRestart=" + canRestart +
                ", column=" + column +
                ", endColumn=" + endColumn +
                ", endLine=" + endLine +
                ", id=" + id +
                ", instructionPointerReference='" + instructionPointerReference + '\'' +
                ", line=" + line +
                ", moduleID=" + moduleID +
                ", name='" + name + '\'' +
                ", presentationHint=" + presentationHint +
                ", source=" + source +
                '}';
    }
}
