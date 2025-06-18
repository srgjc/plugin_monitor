
package org.tzi.use.monitor.adapter.python.dap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Detailed information about an exception that has occurred.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "typeName",
    "fullTypeName",
    "evaluateName",
    "stackTrace",
    "innerException"
})
@Generated("jsonschema2pojo")
public class ExceptionDetails {

    /**
     * Message contained in the exception.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Message contained in the exception.")
    private String message;
    /**
     * Short type name of the exception object.
     * 
     */
    @JsonProperty("typeName")
    @JsonPropertyDescription("Short type name of the exception object.")
    private String typeName;
    /**
     * Fully-qualified type name of the exception object.
     * 
     */
    @JsonProperty("fullTypeName")
    @JsonPropertyDescription("Fully-qualified type name of the exception object.")
    private String fullTypeName;
    /**
     * An expression that can be evaluated in the current scope to obtain the exception object.
     * 
     */
    @JsonProperty("evaluateName")
    @JsonPropertyDescription("An expression that can be evaluated in the current scope to obtain the exception object.")
    private String evaluateName;
    /**
     * Stack trace at the time the exception was thrown.
     * 
     */
    @JsonProperty("stackTrace")
    @JsonPropertyDescription("Stack trace at the time the exception was thrown.")
    private String stackTrace;
    /**
     * Details of the exception contained by this exception, if any.
     * 
     */
    @JsonProperty("innerException")
    @JsonPropertyDescription("Details of the exception contained by this exception, if any.")
    private List<ExceptionDetails> innerException = new ArrayList<ExceptionDetails>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Message contained in the exception.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message contained in the exception.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Short type name of the exception object.
     * 
     */
    @JsonProperty("typeName")
    public String getTypeName() {
        return typeName;
    }

    /**
     * Short type name of the exception object.
     * 
     */
    @JsonProperty("typeName")
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * Fully-qualified type name of the exception object.
     * 
     */
    @JsonProperty("fullTypeName")
    public String getFullTypeName() {
        return fullTypeName;
    }

    /**
     * Fully-qualified type name of the exception object.
     * 
     */
    @JsonProperty("fullTypeName")
    public void setFullTypeName(String fullTypeName) {
        this.fullTypeName = fullTypeName;
    }

    /**
     * An expression that can be evaluated in the current scope to obtain the exception object.
     * 
     */
    @JsonProperty("evaluateName")
    public String getEvaluateName() {
        return evaluateName;
    }

    /**
     * An expression that can be evaluated in the current scope to obtain the exception object.
     * 
     */
    @JsonProperty("evaluateName")
    public void setEvaluateName(String evaluateName) {
        this.evaluateName = evaluateName;
    }

    /**
     * Stack trace at the time the exception was thrown.
     * 
     */
    @JsonProperty("stackTrace")
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Stack trace at the time the exception was thrown.
     * 
     */
    @JsonProperty("stackTrace")
    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    /**
     * Details of the exception contained by this exception, if any.
     * 
     */
    @JsonProperty("innerException")
    public List<ExceptionDetails> getInnerException() {
        return innerException;
    }

    /**
     * Details of the exception contained by this exception, if any.
     * 
     */
    @JsonProperty("innerException")
    public void setInnerException(List<ExceptionDetails> innerException) {
        this.innerException = innerException;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExceptionDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("typeName");
        sb.append('=');
        sb.append(((this.typeName == null)?"<null>":this.typeName));
        sb.append(',');
        sb.append("fullTypeName");
        sb.append('=');
        sb.append(((this.fullTypeName == null)?"<null>":this.fullTypeName));
        sb.append(',');
        sb.append("evaluateName");
        sb.append('=');
        sb.append(((this.evaluateName == null)?"<null>":this.evaluateName));
        sb.append(',');
        sb.append("stackTrace");
        sb.append('=');
        sb.append(((this.stackTrace == null)?"<null>":this.stackTrace));
        sb.append(',');
        sb.append("innerException");
        sb.append('=');
        sb.append(((this.innerException == null)?"<null>":this.innerException));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.innerException == null)? 0 :this.innerException.hashCode()));
        result = ((result* 31)+((this.typeName == null)? 0 :this.typeName.hashCode()));
        result = ((result* 31)+((this.fullTypeName == null)? 0 :this.fullTypeName.hashCode()));
        result = ((result* 31)+((this.evaluateName == null)? 0 :this.evaluateName.hashCode()));
        result = ((result* 31)+((this.stackTrace == null)? 0 :this.stackTrace.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExceptionDetails) == false) {
            return false;
        }
        ExceptionDetails rhs = ((ExceptionDetails) other);
        return ((((((((this.innerException == rhs.innerException)||((this.innerException!= null)&&this.innerException.equals(rhs.innerException)))&&((this.typeName == rhs.typeName)||((this.typeName!= null)&&this.typeName.equals(rhs.typeName))))&&((this.fullTypeName == rhs.fullTypeName)||((this.fullTypeName!= null)&&this.fullTypeName.equals(rhs.fullTypeName))))&&((this.evaluateName == rhs.evaluateName)||((this.evaluateName!= null)&&this.evaluateName.equals(rhs.evaluateName))))&&((this.stackTrace == rhs.stackTrace)||((this.stackTrace!= null)&&this.stackTrace.equals(rhs.stackTrace))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))));
    }

}
