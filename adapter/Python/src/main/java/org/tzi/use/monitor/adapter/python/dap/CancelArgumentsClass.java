package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `cancel` request.
 */
public class CancelArgumentsClass {
    private String progressID;
    private Long requestID;

    /**
     * The ID (attribute `progressId`) of the progress to cancel. If missing no progress is
     * cancelled.
     * Both a `requestId` and a `progressId` can be specified in one request.
     */
    @JsonProperty("progressId")
    public String getProgressID() { return progressID; }
    @JsonProperty("progressId")
    public void setProgressID(String value) { this.progressID = value; }

    /**
     * The ID (attribute `seq`) of the request to cancel. If missing no request is cancelled.
     * Both a `requestId` and a `progressId` can be specified in one request.
     */
    @JsonProperty("requestId")
    public Long getRequestID() { return requestID; }
    @JsonProperty("requestId")
    public void setRequestID(Long value) { this.requestID = value; }
}
