package org.tzi.use.monitor.adapter.python.tmp;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeName("initialize")
public class InitializeRequest extends Request {

    protected InitializeRequestArguments arguments;

    public InitializeRequest(Integer seq, InitializeRequestArguments arguments) {
        super(seq, "request", "initialize");
        this.arguments = arguments;
    }

    public InitializeRequestArguments getArguments() {
        return arguments;
    }

    public void setArguments(InitializeRequestArguments arguments) {
        this.arguments = arguments;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class InitializeRequestArguments {

        @JsonProperty("clientID")
        private String clientID;

        @JsonProperty("clientName")
        private String clientName;

        @JsonProperty("adapterID")
        private String adapterID;

        @JsonProperty("locale")
        private String locale;

        @JsonProperty("linesStartAt1")
        private Boolean linesStartAt1;

        @JsonProperty("columnsStartAt1")
        private Boolean columnsStartAt1;

        @JsonProperty("pathFormat")
        private String pathFormat;

        @JsonProperty("supportsVariableType")
        private Boolean supportsVariableType;

        @JsonProperty("supportsVariablePaging")
        private Boolean supportsVariablePaging;

        @JsonProperty("supportsRunInTerminalRequest")
        private Boolean supportsRunInTerminalRequest;

        @JsonProperty("supportsMemoryReferences")
        private Boolean supportsMemoryReferences;

        @JsonProperty("supportsProgressReporting")
        private Boolean supportsProgressReporting;

        @JsonProperty("supportsInvalidatedEvent")
        private Boolean supportsInvalidatedEvent;

        @JsonProperty("supportsMemoryEvent")
        private Boolean supportsMemoryEvent;

        @JsonProperty("supportsArgsCanBeInterpretedByShell")
        private Boolean supportsArgsCanBeInterpretedByShell;

        @JsonProperty("supportsStartDebuggingRequest")
        private Boolean supportsStartDebuggingRequest;

        public String getClientID() {
            return clientID;
        }

        public String getClientName() {
            return clientName;
        }

        public String getAdapterID() {
            return adapterID;
        }

        public String getLocale() {
            return locale;
        }

        public Boolean isLinesStartAt1() {
            return linesStartAt1;
        }

        public Boolean isColumnsStartAt1() {
            return columnsStartAt1;
        }

        public String getPathFormat() {
            return pathFormat;
        }

        public Boolean isSupportsVariableType() {
            return supportsVariableType;
        }

        public Boolean isSupportsVariablePaging() {
            return supportsVariablePaging;
        }

        public Boolean isSupportsRunInTerminalRequest() {
            return supportsRunInTerminalRequest;
        }

        public Boolean isSupportsMemoryReferences() {
            return supportsMemoryReferences;
        }

        public Boolean isSupportsProgressReporting() {
            return supportsProgressReporting;
        }

        public Boolean isSupportsInvalidatedEvent() {
            return supportsInvalidatedEvent;
        }

        public Boolean isSupportsMemoryEvent() {
            return supportsMemoryEvent;
        }

        public Boolean isSupportsArgsCanBeInterpretedByShell() {
            return supportsArgsCanBeInterpretedByShell;
        }

        public Boolean isSupportsStartDebuggingRequest() {
            return supportsStartDebuggingRequest;
        }

        public void setClientID(String clientID) {
            this.clientID = clientID;
        }

        public void setClientName(String clientName) {
            this.clientName = clientName;
        }

        public void setAdapterID(String adapterID) {
            this.adapterID = adapterID;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public void setLinesStartAt1(Boolean linesStartAt1) {
            this.linesStartAt1 = linesStartAt1;
        }

        public void setColumnsStartAt1(Boolean columnsStartAt1) {
            this.columnsStartAt1 = columnsStartAt1;
        }

        public void setPathFormat(String pathFormat) {
            this.pathFormat = pathFormat;
        }

        public void setSupportsVariableType(Boolean supportsVariableType) {
            this.supportsVariableType = supportsVariableType;
        }

        public void setSupportsVariablePaging(Boolean supportsVariablePaging) {
            this.supportsVariablePaging = supportsVariablePaging;
        }

        public void setSupportsRunInTerminalRequest(Boolean supportsRunInTerminalRequest) {
            this.supportsRunInTerminalRequest = supportsRunInTerminalRequest;
        }

        public void setSupportsMemoryReferences(Boolean supportsMemoryReferences) {
            this.supportsMemoryReferences = supportsMemoryReferences;
        }

        public void setSupportsProgressReporting(Boolean supportsProgressReporting) {
            this.supportsProgressReporting = supportsProgressReporting;
        }

        public void setSupportsInvalidatedEvent(Boolean supportsInvalidatedEvent) {
            this.supportsInvalidatedEvent = supportsInvalidatedEvent;
        }

        public void setSupportsMemoryEvent(Boolean supportsMemoryEvent) {
            this.supportsMemoryEvent = supportsMemoryEvent;
        }

        public void setSupportsArgsCanBeInterpretedByShell(Boolean supportsArgsCanBeInterpretedByShell) {
            this.supportsArgsCanBeInterpretedByShell = supportsArgsCanBeInterpretedByShell;
        }

        public void setSupportsStartDebuggingRequest(Boolean supportsStartDebuggingRequest) {
            this.supportsStartDebuggingRequest = supportsStartDebuggingRequest;
        }
    }

}
