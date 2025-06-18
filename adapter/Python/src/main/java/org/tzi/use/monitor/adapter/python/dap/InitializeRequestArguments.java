
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
 * Arguments for `initialize` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientID",
    "clientName",
    "adapterID",
    "locale",
    "linesStartAt1",
    "columnsStartAt1",
    "pathFormat",
    "supportsVariableType",
    "supportsVariablePaging",
    "supportsRunInTerminalRequest",
    "supportsMemoryReferences",
    "supportsProgressReporting",
    "supportsInvalidatedEvent",
    "supportsMemoryEvent",
    "supportsArgsCanBeInterpretedByShell",
    "supportsStartDebuggingRequest"
})
@Generated("jsonschema2pojo")
public class InitializeRequestArguments {

    /**
     * The ID of the client using this adapter.
     * 
     */
    @JsonProperty("clientID")
    @JsonPropertyDescription("The ID of the client using this adapter.")
    private String clientID;
    /**
     * The human-readable name of the client using this adapter.
     * 
     */
    @JsonProperty("clientName")
    @JsonPropertyDescription("The human-readable name of the client using this adapter.")
    private String clientName;
    /**
     * The ID of the debug adapter.
     * (Required)
     * 
     */
    @JsonProperty("adapterID")
    @JsonPropertyDescription("The ID of the debug adapter.")
    private String adapterID;
    /**
     * The ISO-639 locale of the client using this adapter, e.g. en-US or de-CH.
     * 
     */
    @JsonProperty("locale")
    @JsonPropertyDescription("The ISO-639 locale of the client using this adapter, e.g. en-US or de-CH.")
    private String locale;
    /**
     * If true all line numbers are 1-based (default).
     * 
     */
    @JsonProperty("linesStartAt1")
    @JsonPropertyDescription("If true all line numbers are 1-based (default).")
    private Boolean linesStartAt1;
    /**
     * If true all column numbers are 1-based (default).
     * 
     */
    @JsonProperty("columnsStartAt1")
    @JsonPropertyDescription("If true all column numbers are 1-based (default).")
    private Boolean columnsStartAt1;
    /**
     * Determines in what format paths are specified. The default is `path`, which is the native format.
     * 
     */
    @JsonProperty("pathFormat")
    @JsonPropertyDescription("Determines in what format paths are specified. The default is `path`, which is the native format.")
    private String pathFormat;
    /**
     * Client supports the `type` attribute for variables.
     * 
     */
    @JsonProperty("supportsVariableType")
    @JsonPropertyDescription("Client supports the `type` attribute for variables.")
    private Boolean supportsVariableType;
    /**
     * Client supports the paging of variables.
     * 
     */
    @JsonProperty("supportsVariablePaging")
    @JsonPropertyDescription("Client supports the paging of variables.")
    private Boolean supportsVariablePaging;
    /**
     * Client supports the `runInTerminal` request.
     * 
     */
    @JsonProperty("supportsRunInTerminalRequest")
    @JsonPropertyDescription("Client supports the `runInTerminal` request.")
    private Boolean supportsRunInTerminalRequest;
    /**
     * Client supports memory references.
     * 
     */
    @JsonProperty("supportsMemoryReferences")
    @JsonPropertyDescription("Client supports memory references.")
    private Boolean supportsMemoryReferences;
    /**
     * Client supports progress reporting.
     * 
     */
    @JsonProperty("supportsProgressReporting")
    @JsonPropertyDescription("Client supports progress reporting.")
    private Boolean supportsProgressReporting;
    /**
     * Client supports the `invalidated` event.
     * 
     */
    @JsonProperty("supportsInvalidatedEvent")
    @JsonPropertyDescription("Client supports the `invalidated` event.")
    private Boolean supportsInvalidatedEvent;
    /**
     * Client supports the `memory` event.
     * 
     */
    @JsonProperty("supportsMemoryEvent")
    @JsonPropertyDescription("Client supports the `memory` event.")
    private Boolean supportsMemoryEvent;
    /**
     * Client supports the `argsCanBeInterpretedByShell` attribute on the `runInTerminal` request.
     * 
     */
    @JsonProperty("supportsArgsCanBeInterpretedByShell")
    @JsonPropertyDescription("Client supports the `argsCanBeInterpretedByShell` attribute on the `runInTerminal` request.")
    private Boolean supportsArgsCanBeInterpretedByShell;
    /**
     * Client supports the `startDebugging` request.
     * 
     */
    @JsonProperty("supportsStartDebuggingRequest")
    @JsonPropertyDescription("Client supports the `startDebugging` request.")
    private Boolean supportsStartDebuggingRequest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The ID of the client using this adapter.
     * 
     */
    @JsonProperty("clientID")
    public String getClientID() {
        return clientID;
    }

    /**
     * The ID of the client using this adapter.
     * 
     */
    @JsonProperty("clientID")
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * The human-readable name of the client using this adapter.
     * 
     */
    @JsonProperty("clientName")
    public String getClientName() {
        return clientName;
    }

    /**
     * The human-readable name of the client using this adapter.
     * 
     */
    @JsonProperty("clientName")
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * The ID of the debug adapter.
     * (Required)
     * 
     */
    @JsonProperty("adapterID")
    public String getAdapterID() {
        return adapterID;
    }

    /**
     * The ID of the debug adapter.
     * (Required)
     * 
     */
    @JsonProperty("adapterID")
    public void setAdapterID(String adapterID) {
        this.adapterID = adapterID;
    }

    /**
     * The ISO-639 locale of the client using this adapter, e.g. en-US or de-CH.
     * 
     */
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * The ISO-639 locale of the client using this adapter, e.g. en-US or de-CH.
     * 
     */
    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * If true all line numbers are 1-based (default).
     * 
     */
    @JsonProperty("linesStartAt1")
    public Boolean getLinesStartAt1() {
        return linesStartAt1;
    }

    /**
     * If true all line numbers are 1-based (default).
     * 
     */
    @JsonProperty("linesStartAt1")
    public void setLinesStartAt1(Boolean linesStartAt1) {
        this.linesStartAt1 = linesStartAt1;
    }

    /**
     * If true all column numbers are 1-based (default).
     * 
     */
    @JsonProperty("columnsStartAt1")
    public Boolean getColumnsStartAt1() {
        return columnsStartAt1;
    }

    /**
     * If true all column numbers are 1-based (default).
     * 
     */
    @JsonProperty("columnsStartAt1")
    public void setColumnsStartAt1(Boolean columnsStartAt1) {
        this.columnsStartAt1 = columnsStartAt1;
    }

    /**
     * Determines in what format paths are specified. The default is `path`, which is the native format.
     * 
     */
    @JsonProperty("pathFormat")
    public String getPathFormat() {
        return pathFormat;
    }

    /**
     * Determines in what format paths are specified. The default is `path`, which is the native format.
     * 
     */
    @JsonProperty("pathFormat")
    public void setPathFormat(String pathFormat) {
        this.pathFormat = pathFormat;
    }

    /**
     * Client supports the `type` attribute for variables.
     * 
     */
    @JsonProperty("supportsVariableType")
    public Boolean getSupportsVariableType() {
        return supportsVariableType;
    }

    /**
     * Client supports the `type` attribute for variables.
     * 
     */
    @JsonProperty("supportsVariableType")
    public void setSupportsVariableType(Boolean supportsVariableType) {
        this.supportsVariableType = supportsVariableType;
    }

    /**
     * Client supports the paging of variables.
     * 
     */
    @JsonProperty("supportsVariablePaging")
    public Boolean getSupportsVariablePaging() {
        return supportsVariablePaging;
    }

    /**
     * Client supports the paging of variables.
     * 
     */
    @JsonProperty("supportsVariablePaging")
    public void setSupportsVariablePaging(Boolean supportsVariablePaging) {
        this.supportsVariablePaging = supportsVariablePaging;
    }

    /**
     * Client supports the `runInTerminal` request.
     * 
     */
    @JsonProperty("supportsRunInTerminalRequest")
    public Boolean getSupportsRunInTerminalRequest() {
        return supportsRunInTerminalRequest;
    }

    /**
     * Client supports the `runInTerminal` request.
     * 
     */
    @JsonProperty("supportsRunInTerminalRequest")
    public void setSupportsRunInTerminalRequest(Boolean supportsRunInTerminalRequest) {
        this.supportsRunInTerminalRequest = supportsRunInTerminalRequest;
    }

    /**
     * Client supports memory references.
     * 
     */
    @JsonProperty("supportsMemoryReferences")
    public Boolean getSupportsMemoryReferences() {
        return supportsMemoryReferences;
    }

    /**
     * Client supports memory references.
     * 
     */
    @JsonProperty("supportsMemoryReferences")
    public void setSupportsMemoryReferences(Boolean supportsMemoryReferences) {
        this.supportsMemoryReferences = supportsMemoryReferences;
    }

    /**
     * Client supports progress reporting.
     * 
     */
    @JsonProperty("supportsProgressReporting")
    public Boolean getSupportsProgressReporting() {
        return supportsProgressReporting;
    }

    /**
     * Client supports progress reporting.
     * 
     */
    @JsonProperty("supportsProgressReporting")
    public void setSupportsProgressReporting(Boolean supportsProgressReporting) {
        this.supportsProgressReporting = supportsProgressReporting;
    }

    /**
     * Client supports the `invalidated` event.
     * 
     */
    @JsonProperty("supportsInvalidatedEvent")
    public Boolean getSupportsInvalidatedEvent() {
        return supportsInvalidatedEvent;
    }

    /**
     * Client supports the `invalidated` event.
     * 
     */
    @JsonProperty("supportsInvalidatedEvent")
    public void setSupportsInvalidatedEvent(Boolean supportsInvalidatedEvent) {
        this.supportsInvalidatedEvent = supportsInvalidatedEvent;
    }

    /**
     * Client supports the `memory` event.
     * 
     */
    @JsonProperty("supportsMemoryEvent")
    public Boolean getSupportsMemoryEvent() {
        return supportsMemoryEvent;
    }

    /**
     * Client supports the `memory` event.
     * 
     */
    @JsonProperty("supportsMemoryEvent")
    public void setSupportsMemoryEvent(Boolean supportsMemoryEvent) {
        this.supportsMemoryEvent = supportsMemoryEvent;
    }

    /**
     * Client supports the `argsCanBeInterpretedByShell` attribute on the `runInTerminal` request.
     * 
     */
    @JsonProperty("supportsArgsCanBeInterpretedByShell")
    public Boolean getSupportsArgsCanBeInterpretedByShell() {
        return supportsArgsCanBeInterpretedByShell;
    }

    /**
     * Client supports the `argsCanBeInterpretedByShell` attribute on the `runInTerminal` request.
     * 
     */
    @JsonProperty("supportsArgsCanBeInterpretedByShell")
    public void setSupportsArgsCanBeInterpretedByShell(Boolean supportsArgsCanBeInterpretedByShell) {
        this.supportsArgsCanBeInterpretedByShell = supportsArgsCanBeInterpretedByShell;
    }

    /**
     * Client supports the `startDebugging` request.
     * 
     */
    @JsonProperty("supportsStartDebuggingRequest")
    public Boolean getSupportsStartDebuggingRequest() {
        return supportsStartDebuggingRequest;
    }

    /**
     * Client supports the `startDebugging` request.
     * 
     */
    @JsonProperty("supportsStartDebuggingRequest")
    public void setSupportsStartDebuggingRequest(Boolean supportsStartDebuggingRequest) {
        this.supportsStartDebuggingRequest = supportsStartDebuggingRequest;
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
        sb.append(InitializeRequestArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientID");
        sb.append('=');
        sb.append(((this.clientID == null)?"<null>":this.clientID));
        sb.append(',');
        sb.append("clientName");
        sb.append('=');
        sb.append(((this.clientName == null)?"<null>":this.clientName));
        sb.append(',');
        sb.append("adapterID");
        sb.append('=');
        sb.append(((this.adapterID == null)?"<null>":this.adapterID));
        sb.append(',');
        sb.append("locale");
        sb.append('=');
        sb.append(((this.locale == null)?"<null>":this.locale));
        sb.append(',');
        sb.append("linesStartAt1");
        sb.append('=');
        sb.append(((this.linesStartAt1 == null)?"<null>":this.linesStartAt1));
        sb.append(',');
        sb.append("columnsStartAt1");
        sb.append('=');
        sb.append(((this.columnsStartAt1 == null)?"<null>":this.columnsStartAt1));
        sb.append(',');
        sb.append("pathFormat");
        sb.append('=');
        sb.append(((this.pathFormat == null)?"<null>":this.pathFormat));
        sb.append(',');
        sb.append("supportsVariableType");
        sb.append('=');
        sb.append(((this.supportsVariableType == null)?"<null>":this.supportsVariableType));
        sb.append(',');
        sb.append("supportsVariablePaging");
        sb.append('=');
        sb.append(((this.supportsVariablePaging == null)?"<null>":this.supportsVariablePaging));
        sb.append(',');
        sb.append("supportsRunInTerminalRequest");
        sb.append('=');
        sb.append(((this.supportsRunInTerminalRequest == null)?"<null>":this.supportsRunInTerminalRequest));
        sb.append(',');
        sb.append("supportsMemoryReferences");
        sb.append('=');
        sb.append(((this.supportsMemoryReferences == null)?"<null>":this.supportsMemoryReferences));
        sb.append(',');
        sb.append("supportsProgressReporting");
        sb.append('=');
        sb.append(((this.supportsProgressReporting == null)?"<null>":this.supportsProgressReporting));
        sb.append(',');
        sb.append("supportsInvalidatedEvent");
        sb.append('=');
        sb.append(((this.supportsInvalidatedEvent == null)?"<null>":this.supportsInvalidatedEvent));
        sb.append(',');
        sb.append("supportsMemoryEvent");
        sb.append('=');
        sb.append(((this.supportsMemoryEvent == null)?"<null>":this.supportsMemoryEvent));
        sb.append(',');
        sb.append("supportsArgsCanBeInterpretedByShell");
        sb.append('=');
        sb.append(((this.supportsArgsCanBeInterpretedByShell == null)?"<null>":this.supportsArgsCanBeInterpretedByShell));
        sb.append(',');
        sb.append("supportsStartDebuggingRequest");
        sb.append('=');
        sb.append(((this.supportsStartDebuggingRequest == null)?"<null>":this.supportsStartDebuggingRequest));
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
        result = ((result* 31)+((this.supportsVariableType == null)? 0 :this.supportsVariableType.hashCode()));
        result = ((result* 31)+((this.clientID == null)? 0 :this.clientID.hashCode()));
        result = ((result* 31)+((this.clientName == null)? 0 :this.clientName.hashCode()));
        result = ((result* 31)+((this.columnsStartAt1 == null)? 0 :this.columnsStartAt1 .hashCode()));
        result = ((result* 31)+((this.locale == null)? 0 :this.locale.hashCode()));
        result = ((result* 31)+((this.supportsMemoryReferences == null)? 0 :this.supportsMemoryReferences.hashCode()));
        result = ((result* 31)+((this.linesStartAt1 == null)? 0 :this.linesStartAt1 .hashCode()));
        result = ((result* 31)+((this.supportsMemoryEvent == null)? 0 :this.supportsMemoryEvent.hashCode()));
        result = ((result* 31)+((this.supportsRunInTerminalRequest == null)? 0 :this.supportsRunInTerminalRequest.hashCode()));
        result = ((result* 31)+((this.supportsProgressReporting == null)? 0 :this.supportsProgressReporting.hashCode()));
        result = ((result* 31)+((this.supportsStartDebuggingRequest == null)? 0 :this.supportsStartDebuggingRequest.hashCode()));
        result = ((result* 31)+((this.supportsVariablePaging == null)? 0 :this.supportsVariablePaging.hashCode()));
        result = ((result* 31)+((this.supportsInvalidatedEvent == null)? 0 :this.supportsInvalidatedEvent.hashCode()));
        result = ((result* 31)+((this.pathFormat == null)? 0 :this.pathFormat.hashCode()));
        result = ((result* 31)+((this.adapterID == null)? 0 :this.adapterID.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.supportsArgsCanBeInterpretedByShell == null)? 0 :this.supportsArgsCanBeInterpretedByShell.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InitializeRequestArguments) == false) {
            return false;
        }
        InitializeRequestArguments rhs = ((InitializeRequestArguments) other);
        return ((((((((((((((((((this.supportsVariableType == rhs.supportsVariableType)||((this.supportsVariableType!= null)&&this.supportsVariableType.equals(rhs.supportsVariableType)))&&((this.clientID == rhs.clientID)||((this.clientID!= null)&&this.clientID.equals(rhs.clientID))))&&((this.clientName == rhs.clientName)||((this.clientName!= null)&&this.clientName.equals(rhs.clientName))))&&((this.columnsStartAt1 == rhs.columnsStartAt1)||((this.columnsStartAt1 != null)&&this.columnsStartAt1 .equals(rhs.columnsStartAt1))))&&((this.locale == rhs.locale)||((this.locale!= null)&&this.locale.equals(rhs.locale))))&&((this.supportsMemoryReferences == rhs.supportsMemoryReferences)||((this.supportsMemoryReferences!= null)&&this.supportsMemoryReferences.equals(rhs.supportsMemoryReferences))))&&((this.linesStartAt1 == rhs.linesStartAt1)||((this.linesStartAt1 != null)&&this.linesStartAt1 .equals(rhs.linesStartAt1))))&&((this.supportsMemoryEvent == rhs.supportsMemoryEvent)||((this.supportsMemoryEvent!= null)&&this.supportsMemoryEvent.equals(rhs.supportsMemoryEvent))))&&((this.supportsRunInTerminalRequest == rhs.supportsRunInTerminalRequest)||((this.supportsRunInTerminalRequest!= null)&&this.supportsRunInTerminalRequest.equals(rhs.supportsRunInTerminalRequest))))&&((this.supportsProgressReporting == rhs.supportsProgressReporting)||((this.supportsProgressReporting!= null)&&this.supportsProgressReporting.equals(rhs.supportsProgressReporting))))&&((this.supportsStartDebuggingRequest == rhs.supportsStartDebuggingRequest)||((this.supportsStartDebuggingRequest!= null)&&this.supportsStartDebuggingRequest.equals(rhs.supportsStartDebuggingRequest))))&&((this.supportsVariablePaging == rhs.supportsVariablePaging)||((this.supportsVariablePaging!= null)&&this.supportsVariablePaging.equals(rhs.supportsVariablePaging))))&&((this.supportsInvalidatedEvent == rhs.supportsInvalidatedEvent)||((this.supportsInvalidatedEvent!= null)&&this.supportsInvalidatedEvent.equals(rhs.supportsInvalidatedEvent))))&&((this.pathFormat == rhs.pathFormat)||((this.pathFormat!= null)&&this.pathFormat.equals(rhs.pathFormat))))&&((this.adapterID == rhs.adapterID)||((this.adapterID!= null)&&this.adapterID.equals(rhs.adapterID))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.supportsArgsCanBeInterpretedByShell == rhs.supportsArgsCanBeInterpretedByShell)||((this.supportsArgsCanBeInterpretedByShell!= null)&&this.supportsArgsCanBeInterpretedByShell.equals(rhs.supportsArgsCanBeInterpretedByShell))));
    }

}
