package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ProgressEndEventBody {
    private String message;
    private String progressID;

    /**
     * More detailed progress message. If omitted, the previous message (if any) is used.
     */
    @JsonProperty("message")
    public String getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(String value) { this.message = value; }

    /**
     * The ID that was introduced in the initial `ProgressStartEvent`.
     */
    @JsonProperty("progressId")
    public String getProgressID() { return progressID; }
    @JsonProperty("progressId")
    public void setProgressID(String value) { this.progressID = value; }
}
