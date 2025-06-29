package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ProgressStartEventBody {
    private Boolean cancellable;
    private String message;
    private Double percentage;
    private String progressID;
    private Long requestID;
    private String title;

    /**
     * If true, the request that reports progress may be cancelled with a `cancel` request.
     * So this property basically controls whether the client should use UX that supports
     * cancellation.
     * Clients that don't support cancellation are allowed to ignore the setting.
     */
    @JsonProperty("cancellable")
    public Boolean getCancellable() { return cancellable; }
    @JsonProperty("cancellable")
    public void setCancellable(Boolean value) { this.cancellable = value; }

    /**
     * More detailed progress message.
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
     * An ID that can be used in subsequent `progressUpdate` and `progressEnd` events to make
     * them refer to the same progress reporting.
     * IDs must be unique within a debug session.
     */
    @JsonProperty("progressId")
    public String getProgressID() { return progressID; }
    @JsonProperty("progressId")
    public void setProgressID(String value) { this.progressID = value; }

    /**
     * The request ID that this progress report is related to. If specified a debug adapter is
     * expected to emit progress events for the long running request until the request has been
     * either completed or cancelled.
     * If the request ID is omitted, the progress report is assumed to be related to some
     * general activity of the debug adapter.
     */
    @JsonProperty("requestId")
    public Long getRequestID() { return requestID; }
    @JsonProperty("requestId")
    public void setRequestID(Long value) { this.requestID = value; }

    /**
     * Short title of the progress reporting. Shown in the UI to describe the long running
     * operation.
     */
    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }
}
