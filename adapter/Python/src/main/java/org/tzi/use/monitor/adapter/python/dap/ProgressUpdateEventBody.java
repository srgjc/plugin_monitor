package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ProgressUpdateEventBody {
    private String message;
    private Double percentage;
    private String progressID;

    /**
     * More detailed progress message. If omitted, the previous message (if any) is used.
     */
    @JsonProperty("message")
    public String getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(String value) { this.message = value; }

    /**
     * Progress percentage to display (value range: 0 to 100). If omitted no percentage is shown.
     */
    @JsonProperty("percentage")
    public Double getPercentage() { return percentage; }
    @JsonProperty("percentage")
    public void setPercentage(Double value) { this.percentage = value; }

    /**
     * The ID that was introduced in the initial `progressStart` event.
     */
    @JsonProperty("progressId")
    public String getProgressID() { return progressID; }
    @JsonProperty("progressId")
    public void setProgressID(String value) { this.progressID = value; }
}
