package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ErrorResponseBody {
    private Message error;

    /**
     * A structured error message.
     */
    @JsonProperty("error")
    public Message getError() { return error; }
    @JsonProperty("error")
    public void setError(Message value) { this.error = value; }
}
