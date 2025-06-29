package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `initialize` request.
 */
public class InitializeRequestArgumentsClass {
    private String adapterID;
    private String clientID;
    private String clientName;
    private Boolean columnsStartAt1;
    private Boolean linesStartAt1;
    private String locale;
    private String pathFormat;
    private Boolean supportsArgsCanBeInterpretedByShell;
    private Boolean supportsInvalidatedEvent;
    private Boolean supportsMemoryEvent;
    private Boolean supportsMemoryReferences;
    private Boolean supportsProgressReporting;
    private Boolean supportsRunInTerminalRequest;
    private Boolean supportsStartDebuggingRequest;
    private Boolean supportsVariablePaging;
    private Boolean supportsVariableType;

    /**
     * The ID of the debug adapter.
     */
    @JsonProperty("adapterID")
    public String getAdapterID() { return adapterID; }
    @JsonProperty("adapterID")
    public void setAdapterID(String value) { this.adapterID = value; }

    /**
     * The ID of the client using this adapter.
     */
    @JsonProperty("clientID")
    public String getClientID() { return clientID; }
    @JsonProperty("clientID")
    public void setClientID(String value) { this.clientID = value; }

    /**
     * The human-readable name of the client using this adapter.
     */
    @JsonProperty("clientName")
    public String getClientName() { return clientName; }
    @JsonProperty("clientName")
    public void setClientName(String value) { this.clientName = value; }

    /**
     * If true all column numbers are 1-based (default).
     */
    @JsonProperty("columnsStartAt1")
    public Boolean getColumnsStartAt1() { return columnsStartAt1; }
    @JsonProperty("columnsStartAt1")
    public void setColumnsStartAt1(Boolean value) { this.columnsStartAt1 = value; }

    /**
     * If true all line numbers are 1-based (default).
     */
    @JsonProperty("linesStartAt1")
    public Boolean getLinesStartAt1() { return linesStartAt1; }
    @JsonProperty("linesStartAt1")
    public void setLinesStartAt1(Boolean value) { this.linesStartAt1 = value; }

    /**
     * The ISO-639 locale of the client using this adapter, e.g. en-US or de-CH.
     */
    @JsonProperty("locale")
    public String getLocale() { return locale; }
    @JsonProperty("locale")
    public void setLocale(String value) { this.locale = value; }

    /**
     * Determines in what format paths are specified. The default is `path`, which is the native
     * format.
     */
    @JsonProperty("pathFormat")
    public String getPathFormat() { return pathFormat; }
    @JsonProperty("pathFormat")
    public void setPathFormat(String value) { this.pathFormat = value; }

    /**
     * Client supports the `argsCanBeInterpretedByShell` attribute on the `runInTerminal`
     * request.
     */
    @JsonProperty("supportsArgsCanBeInterpretedByShell")
    public Boolean getSupportsArgsCanBeInterpretedByShell() { return supportsArgsCanBeInterpretedByShell; }
    @JsonProperty("supportsArgsCanBeInterpretedByShell")
    public void setSupportsArgsCanBeInterpretedByShell(Boolean value) { this.supportsArgsCanBeInterpretedByShell = value; }

    /**
     * Client supports the `invalidated` event.
     */
    @JsonProperty("supportsInvalidatedEvent")
    public Boolean getSupportsInvalidatedEvent() { return supportsInvalidatedEvent; }
    @JsonProperty("supportsInvalidatedEvent")
    public void setSupportsInvalidatedEvent(Boolean value) { this.supportsInvalidatedEvent = value; }

    /**
     * Client supports the `memory` event.
     */
    @JsonProperty("supportsMemoryEvent")
    public Boolean getSupportsMemoryEvent() { return supportsMemoryEvent; }
    @JsonProperty("supportsMemoryEvent")
    public void setSupportsMemoryEvent(Boolean value) { this.supportsMemoryEvent = value; }

    /**
     * Client supports memory references.
     */
    @JsonProperty("supportsMemoryReferences")
    public Boolean getSupportsMemoryReferences() { return supportsMemoryReferences; }
    @JsonProperty("supportsMemoryReferences")
    public void setSupportsMemoryReferences(Boolean value) { this.supportsMemoryReferences = value; }

    /**
     * Client supports progress reporting.
     */
    @JsonProperty("supportsProgressReporting")
    public Boolean getSupportsProgressReporting() { return supportsProgressReporting; }
    @JsonProperty("supportsProgressReporting")
    public void setSupportsProgressReporting(Boolean value) { this.supportsProgressReporting = value; }

    /**
     * Client supports the `runInTerminal` request.
     */
    @JsonProperty("supportsRunInTerminalRequest")
    public Boolean getSupportsRunInTerminalRequest() { return supportsRunInTerminalRequest; }
    @JsonProperty("supportsRunInTerminalRequest")
    public void setSupportsRunInTerminalRequest(Boolean value) { this.supportsRunInTerminalRequest = value; }

    /**
     * Client supports the `startDebugging` request.
     */
    @JsonProperty("supportsStartDebuggingRequest")
    public Boolean getSupportsStartDebuggingRequest() { return supportsStartDebuggingRequest; }
    @JsonProperty("supportsStartDebuggingRequest")
    public void setSupportsStartDebuggingRequest(Boolean value) { this.supportsStartDebuggingRequest = value; }

    /**
     * Client supports the paging of variables.
     */
    @JsonProperty("supportsVariablePaging")
    public Boolean getSupportsVariablePaging() { return supportsVariablePaging; }
    @JsonProperty("supportsVariablePaging")
    public void setSupportsVariablePaging(Boolean value) { this.supportsVariablePaging = value; }

    /**
     * Client supports the `type` attribute for variables.
     */
    @JsonProperty("supportsVariableType")
    public Boolean getSupportsVariableType() { return supportsVariableType; }
    @JsonProperty("supportsVariableType")
    public void setSupportsVariableType(Boolean value) { this.supportsVariableType = value; }
}
