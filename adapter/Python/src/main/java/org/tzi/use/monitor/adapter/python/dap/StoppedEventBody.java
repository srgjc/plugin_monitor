package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoppedEventBody {
    private Boolean allThreadsStopped;
    private String description;
    private long[] hitBreakpointIDS;
    private Boolean preserveFocusHint;
    private String reason;
    private String text;
    private Long threadID;

    /**
     * If `allThreadsStopped` is true, a debug adapter can announce that all threads have
     * stopped.
     * - The client should use this information to enable that all threads can be expanded to
     * access their stacktraces.
     * - If the attribute is missing or false, only the thread with the given `threadId` can be
     * expanded.
     */
    @JsonProperty("allThreadsStopped")
    public Boolean getAllThreadsStopped() { return allThreadsStopped; }
    @JsonProperty("allThreadsStopped")
    public void setAllThreadsStopped(Boolean value) { this.allThreadsStopped = value; }

    /**
     * The full reason for the event, e.g. 'Paused on exception'. This string is shown in the UI
     * as is and can be translated.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    /**
     * Ids of the breakpoints that triggered the event. In most cases there is only a single
     * breakpoint but here are some examples for multiple breakpoints:
     * - Different types of breakpoints map to the same location.
     * - Multiple source breakpoints get collapsed to the same instruction by the
     * compiler/runtime.
     * - Multiple function breakpoints with different function names map to the same location.
     */
    @JsonProperty("hitBreakpointIds")
    public long[] getHitBreakpointIDS() { return hitBreakpointIDS; }
    @JsonProperty("hitBreakpointIds")
    public void setHitBreakpointIDS(long[] value) { this.hitBreakpointIDS = value; }

    /**
     * A value of true hints to the client that this event should not change the focus.
     */
    @JsonProperty("preserveFocusHint")
    public Boolean getPreserveFocusHint() { return preserveFocusHint; }
    @JsonProperty("preserveFocusHint")
    public void setPreserveFocusHint(Boolean value) { this.preserveFocusHint = value; }

    /**
     * The reason for the event.
     * For backward compatibility this string is shown in the UI if the `description` attribute
     * is missing (but it must not be translated).
     */
    @JsonProperty("reason")
    public String getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(String value) { this.reason = value; }

    /**
     * Additional information. E.g. if reason is `exception`, text contains the exception name.
     * This string is shown in the UI.
     */
    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    /**
     * The thread which was stopped.
     */
    @JsonProperty("threadId")
    public Long getThreadID() { return threadID; }
    @JsonProperty("threadId")
    public void setThreadID(Long value) { this.threadID = value; }
}
