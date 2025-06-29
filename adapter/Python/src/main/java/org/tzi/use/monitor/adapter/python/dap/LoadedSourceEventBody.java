package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class LoadedSourceEventBody {
    private BodyReason reason;
    private Source source;

    /**
     * The reason for the event.
     */
    @JsonProperty("reason")
    public BodyReason getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(BodyReason value) { this.reason = value; }

    /**
     * The new, changed, or removed source.
     */
    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }
}
