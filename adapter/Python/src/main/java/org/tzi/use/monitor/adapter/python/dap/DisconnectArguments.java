
package org.tzi.use.monitor.adapter.python.dap;

import java.util.LinkedHashMap;
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
 * Arguments for `disconnect` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "restart",
    "terminateDebuggee",
    "suspendDebuggee"
})
@Generated("jsonschema2pojo")
public class DisconnectArguments {

    /**
     * A value of true indicates that this `disconnect` request is part of a restart sequence.
     * 
     */
    @JsonProperty("restart")
    @JsonPropertyDescription("A value of true indicates that this `disconnect` request is part of a restart sequence.")
    private Boolean restart;
    /**
     * Indicates whether the debuggee should be terminated when the debugger is disconnected.
     * If unspecified, the debug adapter is free to do whatever it thinks is best.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportTerminateDebuggee` is true.
     * 
     */
    @JsonProperty("terminateDebuggee")
    @JsonPropertyDescription("Indicates whether the debuggee should be terminated when the debugger is disconnected.\nIf unspecified, the debug adapter is free to do whatever it thinks is best.\nThe attribute is only honored by a debug adapter if the corresponding capability `supportTerminateDebuggee` is true.")
    private Boolean terminateDebuggee;
    /**
     * Indicates whether the debuggee should stay suspended when the debugger is disconnected.
     * If unspecified, the debuggee should resume execution.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportSuspendDebuggee` is true.
     * 
     */
    @JsonProperty("suspendDebuggee")
    @JsonPropertyDescription("Indicates whether the debuggee should stay suspended when the debugger is disconnected.\nIf unspecified, the debuggee should resume execution.\nThe attribute is only honored by a debug adapter if the corresponding capability `supportSuspendDebuggee` is true.")
    private Boolean suspendDebuggee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * A value of true indicates that this `disconnect` request is part of a restart sequence.
     * 
     */
    @JsonProperty("restart")
    public Boolean getRestart() {
        return restart;
    }

    /**
     * A value of true indicates that this `disconnect` request is part of a restart sequence.
     * 
     */
    @JsonProperty("restart")
    public void setRestart(Boolean restart) {
        this.restart = restart;
    }

    /**
     * Indicates whether the debuggee should be terminated when the debugger is disconnected.
     * If unspecified, the debug adapter is free to do whatever it thinks is best.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportTerminateDebuggee` is true.
     * 
     */
    @JsonProperty("terminateDebuggee")
    public Boolean getTerminateDebuggee() {
        return terminateDebuggee;
    }

    /**
     * Indicates whether the debuggee should be terminated when the debugger is disconnected.
     * If unspecified, the debug adapter is free to do whatever it thinks is best.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportTerminateDebuggee` is true.
     * 
     */
    @JsonProperty("terminateDebuggee")
    public void setTerminateDebuggee(Boolean terminateDebuggee) {
        this.terminateDebuggee = terminateDebuggee;
    }

    /**
     * Indicates whether the debuggee should stay suspended when the debugger is disconnected.
     * If unspecified, the debuggee should resume execution.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportSuspendDebuggee` is true.
     * 
     */
    @JsonProperty("suspendDebuggee")
    public Boolean getSuspendDebuggee() {
        return suspendDebuggee;
    }

    /**
     * Indicates whether the debuggee should stay suspended when the debugger is disconnected.
     * If unspecified, the debuggee should resume execution.
     * The attribute is only honored by a debug adapter if the corresponding capability `supportSuspendDebuggee` is true.
     * 
     */
    @JsonProperty("suspendDebuggee")
    public void setSuspendDebuggee(Boolean suspendDebuggee) {
        this.suspendDebuggee = suspendDebuggee;
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
        sb.append(DisconnectArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("restart");
        sb.append('=');
        sb.append(((this.restart == null)?"<null>":this.restart));
        sb.append(',');
        sb.append("terminateDebuggee");
        sb.append('=');
        sb.append(((this.terminateDebuggee == null)?"<null>":this.terminateDebuggee));
        sb.append(',');
        sb.append("suspendDebuggee");
        sb.append('=');
        sb.append(((this.suspendDebuggee == null)?"<null>":this.suspendDebuggee));
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
        result = ((result* 31)+((this.terminateDebuggee == null)? 0 :this.terminateDebuggee.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.restart == null)? 0 :this.restart.hashCode()));
        result = ((result* 31)+((this.suspendDebuggee == null)? 0 :this.suspendDebuggee.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DisconnectArguments) == false) {
            return false;
        }
        DisconnectArguments rhs = ((DisconnectArguments) other);
        return (((((this.terminateDebuggee == rhs.terminateDebuggee)||((this.terminateDebuggee!= null)&&this.terminateDebuggee.equals(rhs.terminateDebuggee)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.restart == rhs.restart)||((this.restart!= null)&&this.restart.equals(rhs.restart))))&&((this.suspendDebuggee == rhs.suspendDebuggee)||((this.suspendDebuggee!= null)&&this.suspendDebuggee.equals(rhs.suspendDebuggee))));
    }

}
