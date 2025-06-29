package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Detailed information about an exception that has occurred.
 *
 * Detailed information about the exception.
 */
public class ExceptionDetails {
    private String evaluateName;
    private String fullTypeName;
    private ExceptionDetails[] innerException;
    private String message;
    private String stackTrace;
    private String typeName;

    /**
     * An expression that can be evaluated in the current scope to obtain the exception object.
     */
    @JsonProperty("evaluateName")
    public String getEvaluateName() { return evaluateName; }
    @JsonProperty("evaluateName")
    public void setEvaluateName(String value) { this.evaluateName = value; }

    /**
     * Fully-qualified type name of the exception object.
     */
    @JsonProperty("fullTypeName")
    public String getFullTypeName() { return fullTypeName; }
    @JsonProperty("fullTypeName")
    public void setFullTypeName(String value) { this.fullTypeName = value; }

    /**
     * Details of the exception contained by this exception, if any.
     */
    @JsonProperty("innerException")
    public ExceptionDetails[] getInnerException() { return innerException; }
    @JsonProperty("innerException")
    public void setInnerException(ExceptionDetails[] value) { this.innerException = value; }

    /**
     * Message contained in the exception.
     */
    @JsonProperty("message")
    public String getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(String value) { this.message = value; }

    /**
     * Stack trace at the time the exception was thrown.
     */
    @JsonProperty("stackTrace")
    public String getStackTrace() { return stackTrace; }
    @JsonProperty("stackTrace")
    public void setStackTrace(String value) { this.stackTrace = value; }

    /**
     * Short type name of the exception object.
     */
    @JsonProperty("typeName")
    public String getTypeName() { return typeName; }
    @JsonProperty("typeName")
    public void setTypeName(String value) { this.typeName = value; }
}
