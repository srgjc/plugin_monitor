package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ExceptionInfoResponseBody {
    private ExceptionBreakMode breakMode;
    private String description;
    private ExceptionDetails details;
    private String exceptionID;

    /**
     * Mode that caused the exception notification to be raised.
     */
    @JsonProperty("breakMode")
    public ExceptionBreakMode getBreakMode() { return breakMode; }
    @JsonProperty("breakMode")
    public void setBreakMode(ExceptionBreakMode value) { this.breakMode = value; }

    /**
     * Descriptive text for the exception.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    /**
     * Detailed information about the exception.
     */
    @JsonProperty("details")
    public ExceptionDetails getDetails() { return details; }
    @JsonProperty("details")
    public void setDetails(ExceptionDetails value) { this.details = value; }

    /**
     * ID of the exception that was thrown.
     */
    @JsonProperty("exceptionId")
    public String getExceptionID() { return exceptionID; }
    @JsonProperty("exceptionId")
    public void setExceptionID(String value) { this.exceptionID = value; }
}
