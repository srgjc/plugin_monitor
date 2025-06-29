package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * The Debug Adapter Protocol defines the protocol used between an editor or IDE and a
 * debugger or runtime.
 */
public class WrapperRoot {
    private AttachRequestClass attachRequest;
    private AttachRequestArgumentsClass attachRequestArguments;
    private AttachResponseClass attachResponse;
    private Breakpoint breakpoint;
    private BreakpointEventClass breakpointEvent;
    private BreakpointLocation breakpointLocation;
    private BreakpointLocationsArgumentsClass breakpointLocationsArguments;
    private BreakpointLocationsRequestClass breakpointLocationsRequest;
    private BreakpointLocationsResponseClass breakpointLocationsResponse;
    private CancelArgumentsClass cancelArguments;
    private CancelRequestClass cancelRequest;
    private CancelResponseClass cancelResponse;
    private CapabilitiesClass capabilities;
    private CapabilitiesEventClass capabilitiesEvent;
    private Checksum checksum;
    private ChecksumAlgorithm checksumAlgorithm;
    private ColumnDescriptor columnDescriptor;
    private CompletionItem completionItem;
    private CompletionItemType completionItemType;
    private CompletionsArgumentsClass completionsArguments;
    private CompletionsRequestClass completionsRequest;
    private CompletionsResponseClass completionsResponse;
    private Map<String, Object> configurationDoneArguments;
    private ConfigurationDoneRequestClass configurationDoneRequest;
    private ConfigurationDoneResponseClass configurationDoneResponse;
    private ContinueArgumentsClass continueArguments;
    private ContinuedEventClass continuedEvent;
    private ContinueRequestClass continueRequest;
    private ContinueResponseClass continueResponse;
    private DataBreakpoint dataBreakpoint;
    private DataBreakpointAccessType dataBreakpointAccessType;
    private DataBreakpointInfoArgumentsClass dataBreakpointInfoArguments;
    private DataBreakpointInfoRequestClass dataBreakpointInfoRequest;
    private DataBreakpointInfoResponseClass dataBreakpointInfoResponse;
    private DisassembleArgumentsClass disassembleArguments;
    private DisassembledInstruction disassembledInstruction;
    private DisassembleRequestClass disassembleRequest;
    private DisassembleResponseClass disassembleResponse;
    private DisconnectArgumentsClass disconnectArguments;
    private DisconnectRequestClass disconnectRequest;
    private DisconnectResponseClass disconnectResponse;
    private ErrorResponseClass errorResponse;
    private EvaluateArgumentsClass evaluateArguments;
    private EvaluateRequestClass evaluateRequest;
    private EvaluateResponseClass evaluateResponse;
    private Event event;
    private ExceptionBreakMode exceptionBreakMode;
    private ExceptionBreakpointsFilter exceptionBreakpointsFilter;
    private ExceptionDetails exceptionDetails;
    private ExceptionFilterOptions exceptionFilterOptions;
    private ExceptionInfoArgumentsClass exceptionInfoArguments;
    private ExceptionInfoRequestClass exceptionInfoRequest;
    private ExceptionInfoResponseClass exceptionInfoResponse;
    private ExceptionOptions exceptionOptions;
    private ExceptionPathSegment exceptionPathSegment;
    private ExitedEventClass exitedEvent;
    private FunctionBreakpoint functionBreakpoint;
    private GotoArgumentsClass gotoArguments;
    private GotoRequestClass gotoRequest;
    private GotoResponseClass gotoResponse;
    private GotoTarget gotoTarget;
    private GotoTargetsArgumentsClass gotoTargetsArguments;
    private GotoTargetsRequestClass gotoTargetsRequest;
    private GotoTargetsResponseClass gotoTargetsResponse;
    private InitializedEventClass initializedEvent;
    private InitializeRequestClass initializeRequest;
    private InitializeRequestArgumentsClass initializeRequestArguments;
    private InitializeResponseClass initializeResponse;
    private InstructionBreakpoint instructionBreakpoint;
    private String invalidatedAreas;
    private InvalidatedEventClass invalidatedEvent;
    private LaunchRequestClass launchRequest;
    private LaunchRequestArgumentsClass launchRequestArguments;
    private LaunchResponseClass launchResponse;
    private LoadedSourceEventClass loadedSourceEvent;
    private Map<String, Object> loadedSourcesArguments;
    private LoadedSourcesRequestClass loadedSourcesRequest;
    private LoadedSourcesResponseClass loadedSourcesResponse;
    private MemoryEventClass memoryEvent;
    private Message message;
    private Module module;
    private ModuleEventClass moduleEvent;
    private ModulesArgumentsClass modulesArguments;
    private ModulesRequestClass modulesRequest;
    private ModulesResponseClass modulesResponse;
    private NextArgumentsClass nextArguments;
    private NextRequestClass nextRequest;
    private NextResponseClass nextResponse;
    private OutputEventClass outputEvent;
    private PauseArgumentsClass pauseArguments;
    private PauseRequestClass pauseRequest;
    private PauseResponseClass pauseResponse;
    private ProcessEventClass processEvent;
    private ProgressEndEventClass progressEndEvent;
    private ProgressStartEventClass progressStartEvent;
    private ProgressUpdateEventClass progressUpdateEvent;
    private BaseProtocol protocolMessage;
    private ReadMemoryArgumentsClass readMemoryArguments;
    private ReadMemoryRequestClass readMemoryRequest;
    private ReadMemoryResponseClass readMemoryResponse;
    private Request request;
    private Response response;
    private RestartArgumentsClass restartArguments;
    private RestartFrameArgumentsClass restartFrameArguments;
    private RestartFrameRequestClass restartFrameRequest;
    private RestartFrameResponseClass restartFrameResponse;
    private RestartRequestClass restartRequest;
    private RestartResponseClass restartResponse;
    private ReverseContinueArgumentsClass reverseContinueArguments;
    private ReverseContinueRequestClass reverseContinueRequest;
    private ReverseContinueResponseClass reverseContinueResponse;
    private RunInTerminalRequestClass runInTerminalRequest;
    private RunInTerminalRequestArgumentsClass runInTerminalRequestArguments;
    private RunInTerminalResponseClass runInTerminalResponse;
    private Scope scope;
    private ScopesArgumentsClass scopesArguments;
    private ScopesRequestClass scopesRequest;
    private ScopesResponseClass scopesResponse;
    private SetBreakpointsArgumentsClass setBreakpointsArguments;
    private SetBreakpointsRequestClass setBreakpointsRequest;
    private SetBreakpointsResponseClass setBreakpointsResponse;
    private SetDataBreakpointsArgumentsClass setDataBreakpointsArguments;
    private SetDataBreakpointsRequestClass setDataBreakpointsRequest;
    private SetDataBreakpointsResponseClass setDataBreakpointsResponse;
    private SetExceptionBreakpointsArgumentsClass setExceptionBreakpointsArguments;
    private SetExceptionBreakpointsRequestClass setExceptionBreakpointsRequest;
    private SetExceptionBreakpointsResponseClass setExceptionBreakpointsResponse;
    private SetExpressionArgumentsClass setExpressionArguments;
    private SetExpressionRequestClass setExpressionRequest;
    private SetExpressionResponseClass setExpressionResponse;
    private SetFunctionBreakpointsArgumentsClass setFunctionBreakpointsArguments;
    private SetFunctionBreakpointsRequestClass setFunctionBreakpointsRequest;
    private SetFunctionBreakpointsResponseClass setFunctionBreakpointsResponse;
    private SetInstructionBreakpointsArgumentsClass setInstructionBreakpointsArguments;
    private SetInstructionBreakpointsRequestClass setInstructionBreakpointsRequest;
    private SetInstructionBreakpointsResponseClass setInstructionBreakpointsResponse;
    private SetVariableArgumentsClass setVariableArguments;
    private SetVariableRequestClass setVariableRequest;
    private SetVariableResponseClass setVariableResponse;
    private Source source;
    private SourceArgumentsClass sourceArguments;
    private SourceBreakpoint sourceBreakpoint;
    private SourceRequestClass sourceRequest;
    private SourceResponseClass sourceResponse;
    private StackFrame stackFrame;
    private StackFrameFormat stackFrameFormat;
    private StackTraceArgumentsClass stackTraceArguments;
    private StackTraceRequestClass stackTraceRequest;
    private StackTraceResponseClass stackTraceResponse;
    private StartDebuggingRequestClass startDebuggingRequest;
    private StartDebuggingRequestArgumentsClass startDebuggingRequestArguments;
    private StartDebuggingResponseClass startDebuggingResponse;
    private StepBackArgumentsClass stepBackArguments;
    private StepBackRequestClass stepBackRequest;
    private StepBackResponseClass stepBackResponse;
    private StepInArgumentsClass stepInArguments;
    private StepInRequestClass stepInRequest;
    private StepInResponseClass stepInResponse;
    private StepInTarget stepInTarget;
    private StepInTargetsArgumentsClass stepInTargetsArguments;
    private StepInTargetsRequestClass stepInTargetsRequest;
    private StepInTargetsResponseClass stepInTargetsResponse;
    private StepOutArgumentsClass stepOutArguments;
    private StepOutRequestClass stepOutRequest;
    private StepOutResponseClass stepOutResponse;
    private SteppingGranularity steppingGranularity;
    private StoppedEventClass stoppedEvent;
    private TerminateArgumentsClass terminateArguments;
    private TerminatedEventClass terminatedEvent;
    private TerminateRequestClass terminateRequest;
    private TerminateResponseClass terminateResponse;
    private TerminateThreadsArgumentsClass terminateThreadsArguments;
    private TerminateThreadsRequestClass terminateThreadsRequest;
    private TerminateThreadsResponseClass terminateThreadsResponse;
    private Thread thread;
    private ThreadEventClass threadEvent;
    private ThreadsRequestClass threadsRequest;
    private ThreadsResponseClass threadsResponse;
    private ValueFormat valueFormat;
    private Variable variable;
    private VariablePresentationHint variablePresentationHint;
    private VariablesArgumentsClass variablesArguments;
    private VariablesRequestClass variablesRequest;
    private VariablesResponseClass variablesResponse;
    private WriteMemoryArgumentsClass writeMemoryArguments;
    private WriteMemoryRequestClass writeMemoryRequest;
    private WriteMemoryResponseClass writeMemoryResponse;

    @JsonProperty("AttachRequest")
    public AttachRequestClass getAttachRequest() { return attachRequest; }
    @JsonProperty("AttachRequest")
    public void setAttachRequest(AttachRequestClass value) { this.attachRequest = value; }

    @JsonProperty("AttachRequestArguments")
    public AttachRequestArgumentsClass getAttachRequestArguments() { return attachRequestArguments; }
    @JsonProperty("AttachRequestArguments")
    public void setAttachRequestArguments(AttachRequestArgumentsClass value) { this.attachRequestArguments = value; }

    @JsonProperty("AttachResponse")
    public AttachResponseClass getAttachResponse() { return attachResponse; }
    @JsonProperty("AttachResponse")
    public void setAttachResponse(AttachResponseClass value) { this.attachResponse = value; }

    @JsonProperty("Breakpoint")
    public Breakpoint getBreakpoint() { return breakpoint; }
    @JsonProperty("Breakpoint")
    public void setBreakpoint(Breakpoint value) { this.breakpoint = value; }

    @JsonProperty("BreakpointEvent")
    public BreakpointEventClass getBreakpointEvent() { return breakpointEvent; }
    @JsonProperty("BreakpointEvent")
    public void setBreakpointEvent(BreakpointEventClass value) { this.breakpointEvent = value; }

    @JsonProperty("BreakpointLocation")
    public BreakpointLocation getBreakpointLocation() { return breakpointLocation; }
    @JsonProperty("BreakpointLocation")
    public void setBreakpointLocation(BreakpointLocation value) { this.breakpointLocation = value; }

    @JsonProperty("BreakpointLocationsArguments")
    public BreakpointLocationsArgumentsClass getBreakpointLocationsArguments() { return breakpointLocationsArguments; }
    @JsonProperty("BreakpointLocationsArguments")
    public void setBreakpointLocationsArguments(BreakpointLocationsArgumentsClass value) { this.breakpointLocationsArguments = value; }

    @JsonProperty("BreakpointLocationsRequest")
    public BreakpointLocationsRequestClass getBreakpointLocationsRequest() { return breakpointLocationsRequest; }
    @JsonProperty("BreakpointLocationsRequest")
    public void setBreakpointLocationsRequest(BreakpointLocationsRequestClass value) { this.breakpointLocationsRequest = value; }

    @JsonProperty("BreakpointLocationsResponse")
    public BreakpointLocationsResponseClass getBreakpointLocationsResponse() { return breakpointLocationsResponse; }
    @JsonProperty("BreakpointLocationsResponse")
    public void setBreakpointLocationsResponse(BreakpointLocationsResponseClass value) { this.breakpointLocationsResponse = value; }

    @JsonProperty("CancelArguments")
    public CancelArgumentsClass getCancelArguments() { return cancelArguments; }
    @JsonProperty("CancelArguments")
    public void setCancelArguments(CancelArgumentsClass value) { this.cancelArguments = value; }

    @JsonProperty("CancelRequest")
    public CancelRequestClass getCancelRequest() { return cancelRequest; }
    @JsonProperty("CancelRequest")
    public void setCancelRequest(CancelRequestClass value) { this.cancelRequest = value; }

    @JsonProperty("CancelResponse")
    public CancelResponseClass getCancelResponse() { return cancelResponse; }
    @JsonProperty("CancelResponse")
    public void setCancelResponse(CancelResponseClass value) { this.cancelResponse = value; }

    @JsonProperty("Capabilities")
    public CapabilitiesClass getCapabilities() { return capabilities; }
    @JsonProperty("Capabilities")
    public void setCapabilities(CapabilitiesClass value) { this.capabilities = value; }

    @JsonProperty("CapabilitiesEvent")
    public CapabilitiesEventClass getCapabilitiesEvent() { return capabilitiesEvent; }
    @JsonProperty("CapabilitiesEvent")
    public void setCapabilitiesEvent(CapabilitiesEventClass value) { this.capabilitiesEvent = value; }

    @JsonProperty("Checksum")
    public Checksum getChecksum() { return checksum; }
    @JsonProperty("Checksum")
    public void setChecksum(Checksum value) { this.checksum = value; }

    @JsonProperty("ChecksumAlgorithm")
    public ChecksumAlgorithm getChecksumAlgorithm() { return checksumAlgorithm; }
    @JsonProperty("ChecksumAlgorithm")
    public void setChecksumAlgorithm(ChecksumAlgorithm value) { this.checksumAlgorithm = value; }

    @JsonProperty("ColumnDescriptor")
    public ColumnDescriptor getColumnDescriptor() { return columnDescriptor; }
    @JsonProperty("ColumnDescriptor")
    public void setColumnDescriptor(ColumnDescriptor value) { this.columnDescriptor = value; }

    @JsonProperty("CompletionItem")
    public CompletionItem getCompletionItem() { return completionItem; }
    @JsonProperty("CompletionItem")
    public void setCompletionItem(CompletionItem value) { this.completionItem = value; }

    @JsonProperty("CompletionItemType")
    public CompletionItemType getCompletionItemType() { return completionItemType; }
    @JsonProperty("CompletionItemType")
    public void setCompletionItemType(CompletionItemType value) { this.completionItemType = value; }

    @JsonProperty("CompletionsArguments")
    public CompletionsArgumentsClass getCompletionsArguments() { return completionsArguments; }
    @JsonProperty("CompletionsArguments")
    public void setCompletionsArguments(CompletionsArgumentsClass value) { this.completionsArguments = value; }

    @JsonProperty("CompletionsRequest")
    public CompletionsRequestClass getCompletionsRequest() { return completionsRequest; }
    @JsonProperty("CompletionsRequest")
    public void setCompletionsRequest(CompletionsRequestClass value) { this.completionsRequest = value; }

    @JsonProperty("CompletionsResponse")
    public CompletionsResponseClass getCompletionsResponse() { return completionsResponse; }
    @JsonProperty("CompletionsResponse")
    public void setCompletionsResponse(CompletionsResponseClass value) { this.completionsResponse = value; }

    @JsonProperty("ConfigurationDoneArguments")
    public Map<String, Object> getConfigurationDoneArguments() { return configurationDoneArguments; }
    @JsonProperty("ConfigurationDoneArguments")
    public void setConfigurationDoneArguments(Map<String, Object> value) { this.configurationDoneArguments = value; }

    @JsonProperty("ConfigurationDoneRequest")
    public ConfigurationDoneRequestClass getConfigurationDoneRequest() { return configurationDoneRequest; }
    @JsonProperty("ConfigurationDoneRequest")
    public void setConfigurationDoneRequest(ConfigurationDoneRequestClass value) { this.configurationDoneRequest = value; }

    @JsonProperty("ConfigurationDoneResponse")
    public ConfigurationDoneResponseClass getConfigurationDoneResponse() { return configurationDoneResponse; }
    @JsonProperty("ConfigurationDoneResponse")
    public void setConfigurationDoneResponse(ConfigurationDoneResponseClass value) { this.configurationDoneResponse = value; }

    @JsonProperty("ContinueArguments")
    public ContinueArgumentsClass getContinueArguments() { return continueArguments; }
    @JsonProperty("ContinueArguments")
    public void setContinueArguments(ContinueArgumentsClass value) { this.continueArguments = value; }

    @JsonProperty("ContinuedEvent")
    public ContinuedEventClass getContinuedEvent() { return continuedEvent; }
    @JsonProperty("ContinuedEvent")
    public void setContinuedEvent(ContinuedEventClass value) { this.continuedEvent = value; }

    @JsonProperty("ContinueRequest")
    public ContinueRequestClass getContinueRequest() { return continueRequest; }
    @JsonProperty("ContinueRequest")
    public void setContinueRequest(ContinueRequestClass value) { this.continueRequest = value; }

    @JsonProperty("ContinueResponse")
    public ContinueResponseClass getContinueResponse() { return continueResponse; }
    @JsonProperty("ContinueResponse")
    public void setContinueResponse(ContinueResponseClass value) { this.continueResponse = value; }

    @JsonProperty("DataBreakpoint")
    public DataBreakpoint getDataBreakpoint() { return dataBreakpoint; }
    @JsonProperty("DataBreakpoint")
    public void setDataBreakpoint(DataBreakpoint value) { this.dataBreakpoint = value; }

    @JsonProperty("DataBreakpointAccessType")
    public DataBreakpointAccessType getDataBreakpointAccessType() { return dataBreakpointAccessType; }
    @JsonProperty("DataBreakpointAccessType")
    public void setDataBreakpointAccessType(DataBreakpointAccessType value) { this.dataBreakpointAccessType = value; }

    @JsonProperty("DataBreakpointInfoArguments")
    public DataBreakpointInfoArgumentsClass getDataBreakpointInfoArguments() { return dataBreakpointInfoArguments; }
    @JsonProperty("DataBreakpointInfoArguments")
    public void setDataBreakpointInfoArguments(DataBreakpointInfoArgumentsClass value) { this.dataBreakpointInfoArguments = value; }

    @JsonProperty("DataBreakpointInfoRequest")
    public DataBreakpointInfoRequestClass getDataBreakpointInfoRequest() { return dataBreakpointInfoRequest; }
    @JsonProperty("DataBreakpointInfoRequest")
    public void setDataBreakpointInfoRequest(DataBreakpointInfoRequestClass value) { this.dataBreakpointInfoRequest = value; }

    @JsonProperty("DataBreakpointInfoResponse")
    public DataBreakpointInfoResponseClass getDataBreakpointInfoResponse() { return dataBreakpointInfoResponse; }
    @JsonProperty("DataBreakpointInfoResponse")
    public void setDataBreakpointInfoResponse(DataBreakpointInfoResponseClass value) { this.dataBreakpointInfoResponse = value; }

    @JsonProperty("DisassembleArguments")
    public DisassembleArgumentsClass getDisassembleArguments() { return disassembleArguments; }
    @JsonProperty("DisassembleArguments")
    public void setDisassembleArguments(DisassembleArgumentsClass value) { this.disassembleArguments = value; }

    @JsonProperty("DisassembledInstruction")
    public DisassembledInstruction getDisassembledInstruction() { return disassembledInstruction; }
    @JsonProperty("DisassembledInstruction")
    public void setDisassembledInstruction(DisassembledInstruction value) { this.disassembledInstruction = value; }

    @JsonProperty("DisassembleRequest")
    public DisassembleRequestClass getDisassembleRequest() { return disassembleRequest; }
    @JsonProperty("DisassembleRequest")
    public void setDisassembleRequest(DisassembleRequestClass value) { this.disassembleRequest = value; }

    @JsonProperty("DisassembleResponse")
    public DisassembleResponseClass getDisassembleResponse() { return disassembleResponse; }
    @JsonProperty("DisassembleResponse")
    public void setDisassembleResponse(DisassembleResponseClass value) { this.disassembleResponse = value; }

    @JsonProperty("DisconnectArguments")
    public DisconnectArgumentsClass getDisconnectArguments() { return disconnectArguments; }
    @JsonProperty("DisconnectArguments")
    public void setDisconnectArguments(DisconnectArgumentsClass value) { this.disconnectArguments = value; }

    @JsonProperty("DisconnectRequest")
    public DisconnectRequestClass getDisconnectRequest() { return disconnectRequest; }
    @JsonProperty("DisconnectRequest")
    public void setDisconnectRequest(DisconnectRequestClass value) { this.disconnectRequest = value; }

    @JsonProperty("DisconnectResponse")
    public DisconnectResponseClass getDisconnectResponse() { return disconnectResponse; }
    @JsonProperty("DisconnectResponse")
    public void setDisconnectResponse(DisconnectResponseClass value) { this.disconnectResponse = value; }

    @JsonProperty("ErrorResponse")
    public ErrorResponseClass getErrorResponse() { return errorResponse; }
    @JsonProperty("ErrorResponse")
    public void setErrorResponse(ErrorResponseClass value) { this.errorResponse = value; }

    @JsonProperty("EvaluateArguments")
    public EvaluateArgumentsClass getEvaluateArguments() { return evaluateArguments; }
    @JsonProperty("EvaluateArguments")
    public void setEvaluateArguments(EvaluateArgumentsClass value) { this.evaluateArguments = value; }

    @JsonProperty("EvaluateRequest")
    public EvaluateRequestClass getEvaluateRequest() { return evaluateRequest; }
    @JsonProperty("EvaluateRequest")
    public void setEvaluateRequest(EvaluateRequestClass value) { this.evaluateRequest = value; }

    @JsonProperty("EvaluateResponse")
    public EvaluateResponseClass getEvaluateResponse() { return evaluateResponse; }
    @JsonProperty("EvaluateResponse")
    public void setEvaluateResponse(EvaluateResponseClass value) { this.evaluateResponse = value; }

    @JsonProperty("Event")
    public Event getEvent() { return event; }
    @JsonProperty("Event")
    public void setEvent(Event value) { this.event = value; }

    @JsonProperty("ExceptionBreakMode")
    public ExceptionBreakMode getExceptionBreakMode() { return exceptionBreakMode; }
    @JsonProperty("ExceptionBreakMode")
    public void setExceptionBreakMode(ExceptionBreakMode value) { this.exceptionBreakMode = value; }

    @JsonProperty("ExceptionBreakpointsFilter")
    public ExceptionBreakpointsFilter getExceptionBreakpointsFilter() { return exceptionBreakpointsFilter; }
    @JsonProperty("ExceptionBreakpointsFilter")
    public void setExceptionBreakpointsFilter(ExceptionBreakpointsFilter value) { this.exceptionBreakpointsFilter = value; }

    @JsonProperty("ExceptionDetails")
    public ExceptionDetails getExceptionDetails() { return exceptionDetails; }
    @JsonProperty("ExceptionDetails")
    public void setExceptionDetails(ExceptionDetails value) { this.exceptionDetails = value; }

    @JsonProperty("ExceptionFilterOptions")
    public ExceptionFilterOptions getExceptionFilterOptions() { return exceptionFilterOptions; }
    @JsonProperty("ExceptionFilterOptions")
    public void setExceptionFilterOptions(ExceptionFilterOptions value) { this.exceptionFilterOptions = value; }

    @JsonProperty("ExceptionInfoArguments")
    public ExceptionInfoArgumentsClass getExceptionInfoArguments() { return exceptionInfoArguments; }
    @JsonProperty("ExceptionInfoArguments")
    public void setExceptionInfoArguments(ExceptionInfoArgumentsClass value) { this.exceptionInfoArguments = value; }

    @JsonProperty("ExceptionInfoRequest")
    public ExceptionInfoRequestClass getExceptionInfoRequest() { return exceptionInfoRequest; }
    @JsonProperty("ExceptionInfoRequest")
    public void setExceptionInfoRequest(ExceptionInfoRequestClass value) { this.exceptionInfoRequest = value; }

    @JsonProperty("ExceptionInfoResponse")
    public ExceptionInfoResponseClass getExceptionInfoResponse() { return exceptionInfoResponse; }
    @JsonProperty("ExceptionInfoResponse")
    public void setExceptionInfoResponse(ExceptionInfoResponseClass value) { this.exceptionInfoResponse = value; }

    @JsonProperty("ExceptionOptions")
    public ExceptionOptions getExceptionOptions() { return exceptionOptions; }
    @JsonProperty("ExceptionOptions")
    public void setExceptionOptions(ExceptionOptions value) { this.exceptionOptions = value; }

    @JsonProperty("ExceptionPathSegment")
    public ExceptionPathSegment getExceptionPathSegment() { return exceptionPathSegment; }
    @JsonProperty("ExceptionPathSegment")
    public void setExceptionPathSegment(ExceptionPathSegment value) { this.exceptionPathSegment = value; }

    @JsonProperty("ExitedEvent")
    public ExitedEventClass getExitedEvent() { return exitedEvent; }
    @JsonProperty("ExitedEvent")
    public void setExitedEvent(ExitedEventClass value) { this.exitedEvent = value; }

    @JsonProperty("FunctionBreakpoint")
    public FunctionBreakpoint getFunctionBreakpoint() { return functionBreakpoint; }
    @JsonProperty("FunctionBreakpoint")
    public void setFunctionBreakpoint(FunctionBreakpoint value) { this.functionBreakpoint = value; }

    @JsonProperty("GotoArguments")
    public GotoArgumentsClass getGotoArguments() { return gotoArguments; }
    @JsonProperty("GotoArguments")
    public void setGotoArguments(GotoArgumentsClass value) { this.gotoArguments = value; }

    @JsonProperty("GotoRequest")
    public GotoRequestClass getGotoRequest() { return gotoRequest; }
    @JsonProperty("GotoRequest")
    public void setGotoRequest(GotoRequestClass value) { this.gotoRequest = value; }

    @JsonProperty("GotoResponse")
    public GotoResponseClass getGotoResponse() { return gotoResponse; }
    @JsonProperty("GotoResponse")
    public void setGotoResponse(GotoResponseClass value) { this.gotoResponse = value; }

    @JsonProperty("GotoTarget")
    public GotoTarget getGotoTarget() { return gotoTarget; }
    @JsonProperty("GotoTarget")
    public void setGotoTarget(GotoTarget value) { this.gotoTarget = value; }

    @JsonProperty("GotoTargetsArguments")
    public GotoTargetsArgumentsClass getGotoTargetsArguments() { return gotoTargetsArguments; }
    @JsonProperty("GotoTargetsArguments")
    public void setGotoTargetsArguments(GotoTargetsArgumentsClass value) { this.gotoTargetsArguments = value; }

    @JsonProperty("GotoTargetsRequest")
    public GotoTargetsRequestClass getGotoTargetsRequest() { return gotoTargetsRequest; }
    @JsonProperty("GotoTargetsRequest")
    public void setGotoTargetsRequest(GotoTargetsRequestClass value) { this.gotoTargetsRequest = value; }

    @JsonProperty("GotoTargetsResponse")
    public GotoTargetsResponseClass getGotoTargetsResponse() { return gotoTargetsResponse; }
    @JsonProperty("GotoTargetsResponse")
    public void setGotoTargetsResponse(GotoTargetsResponseClass value) { this.gotoTargetsResponse = value; }

    @JsonProperty("InitializedEvent")
    public InitializedEventClass getInitializedEvent() { return initializedEvent; }
    @JsonProperty("InitializedEvent")
    public void setInitializedEvent(InitializedEventClass value) { this.initializedEvent = value; }

    @JsonProperty("InitializeRequest")
    public InitializeRequestClass getInitializeRequest() { return initializeRequest; }
    @JsonProperty("InitializeRequest")
    public void setInitializeRequest(InitializeRequestClass value) { this.initializeRequest = value; }

    @JsonProperty("InitializeRequestArguments")
    public InitializeRequestArgumentsClass getInitializeRequestArguments() { return initializeRequestArguments; }
    @JsonProperty("InitializeRequestArguments")
    public void setInitializeRequestArguments(InitializeRequestArgumentsClass value) { this.initializeRequestArguments = value; }

    @JsonProperty("InitializeResponse")
    public InitializeResponseClass getInitializeResponse() { return initializeResponse; }
    @JsonProperty("InitializeResponse")
    public void setInitializeResponse(InitializeResponseClass value) { this.initializeResponse = value; }

    @JsonProperty("InstructionBreakpoint")
    public InstructionBreakpoint getInstructionBreakpoint() { return instructionBreakpoint; }
    @JsonProperty("InstructionBreakpoint")
    public void setInstructionBreakpoint(InstructionBreakpoint value) { this.instructionBreakpoint = value; }

    @JsonProperty("InvalidatedAreas")
    public String getInvalidatedAreas() { return invalidatedAreas; }
    @JsonProperty("InvalidatedAreas")
    public void setInvalidatedAreas(String value) { this.invalidatedAreas = value; }

    @JsonProperty("InvalidatedEvent")
    public InvalidatedEventClass getInvalidatedEvent() { return invalidatedEvent; }
    @JsonProperty("InvalidatedEvent")
    public void setInvalidatedEvent(InvalidatedEventClass value) { this.invalidatedEvent = value; }

    @JsonProperty("LaunchRequest")
    public LaunchRequestClass getLaunchRequest() { return launchRequest; }
    @JsonProperty("LaunchRequest")
    public void setLaunchRequest(LaunchRequestClass value) { this.launchRequest = value; }

    @JsonProperty("LaunchRequestArguments")
    public LaunchRequestArgumentsClass getLaunchRequestArguments() { return launchRequestArguments; }
    @JsonProperty("LaunchRequestArguments")
    public void setLaunchRequestArguments(LaunchRequestArgumentsClass value) { this.launchRequestArguments = value; }

    @JsonProperty("LaunchResponse")
    public LaunchResponseClass getLaunchResponse() { return launchResponse; }
    @JsonProperty("LaunchResponse")
    public void setLaunchResponse(LaunchResponseClass value) { this.launchResponse = value; }

    @JsonProperty("LoadedSourceEvent")
    public LoadedSourceEventClass getLoadedSourceEvent() { return loadedSourceEvent; }
    @JsonProperty("LoadedSourceEvent")
    public void setLoadedSourceEvent(LoadedSourceEventClass value) { this.loadedSourceEvent = value; }

    @JsonProperty("LoadedSourcesArguments")
    public Map<String, Object> getLoadedSourcesArguments() { return loadedSourcesArguments; }
    @JsonProperty("LoadedSourcesArguments")
    public void setLoadedSourcesArguments(Map<String, Object> value) { this.loadedSourcesArguments = value; }

    @JsonProperty("LoadedSourcesRequest")
    public LoadedSourcesRequestClass getLoadedSourcesRequest() { return loadedSourcesRequest; }
    @JsonProperty("LoadedSourcesRequest")
    public void setLoadedSourcesRequest(LoadedSourcesRequestClass value) { this.loadedSourcesRequest = value; }

    @JsonProperty("LoadedSourcesResponse")
    public LoadedSourcesResponseClass getLoadedSourcesResponse() { return loadedSourcesResponse; }
    @JsonProperty("LoadedSourcesResponse")
    public void setLoadedSourcesResponse(LoadedSourcesResponseClass value) { this.loadedSourcesResponse = value; }

    @JsonProperty("MemoryEvent")
    public MemoryEventClass getMemoryEvent() { return memoryEvent; }
    @JsonProperty("MemoryEvent")
    public void setMemoryEvent(MemoryEventClass value) { this.memoryEvent = value; }

    @JsonProperty("Message")
    public Message getMessage() { return message; }
    @JsonProperty("Message")
    public void setMessage(Message value) { this.message = value; }

    @JsonProperty("Module")
    public Module getModule() { return module; }
    @JsonProperty("Module")
    public void setModule(Module value) { this.module = value; }

    @JsonProperty("ModuleEvent")
    public ModuleEventClass getModuleEvent() { return moduleEvent; }
    @JsonProperty("ModuleEvent")
    public void setModuleEvent(ModuleEventClass value) { this.moduleEvent = value; }

    @JsonProperty("ModulesArguments")
    public ModulesArgumentsClass getModulesArguments() { return modulesArguments; }
    @JsonProperty("ModulesArguments")
    public void setModulesArguments(ModulesArgumentsClass value) { this.modulesArguments = value; }

    @JsonProperty("ModulesRequest")
    public ModulesRequestClass getModulesRequest() { return modulesRequest; }
    @JsonProperty("ModulesRequest")
    public void setModulesRequest(ModulesRequestClass value) { this.modulesRequest = value; }

    @JsonProperty("ModulesResponse")
    public ModulesResponseClass getModulesResponse() { return modulesResponse; }
    @JsonProperty("ModulesResponse")
    public void setModulesResponse(ModulesResponseClass value) { this.modulesResponse = value; }

    @JsonProperty("NextArguments")
    public NextArgumentsClass getNextArguments() { return nextArguments; }
    @JsonProperty("NextArguments")
    public void setNextArguments(NextArgumentsClass value) { this.nextArguments = value; }

    @JsonProperty("NextRequest")
    public NextRequestClass getNextRequest() { return nextRequest; }
    @JsonProperty("NextRequest")
    public void setNextRequest(NextRequestClass value) { this.nextRequest = value; }

    @JsonProperty("NextResponse")
    public NextResponseClass getNextResponse() { return nextResponse; }
    @JsonProperty("NextResponse")
    public void setNextResponse(NextResponseClass value) { this.nextResponse = value; }

    @JsonProperty("OutputEvent")
    public OutputEventClass getOutputEvent() { return outputEvent; }
    @JsonProperty("OutputEvent")
    public void setOutputEvent(OutputEventClass value) { this.outputEvent = value; }

    @JsonProperty("PauseArguments")
    public PauseArgumentsClass getPauseArguments() { return pauseArguments; }
    @JsonProperty("PauseArguments")
    public void setPauseArguments(PauseArgumentsClass value) { this.pauseArguments = value; }

    @JsonProperty("PauseRequest")
    public PauseRequestClass getPauseRequest() { return pauseRequest; }
    @JsonProperty("PauseRequest")
    public void setPauseRequest(PauseRequestClass value) { this.pauseRequest = value; }

    @JsonProperty("PauseResponse")
    public PauseResponseClass getPauseResponse() { return pauseResponse; }
    @JsonProperty("PauseResponse")
    public void setPauseResponse(PauseResponseClass value) { this.pauseResponse = value; }

    @JsonProperty("ProcessEvent")
    public ProcessEventClass getProcessEvent() { return processEvent; }
    @JsonProperty("ProcessEvent")
    public void setProcessEvent(ProcessEventClass value) { this.processEvent = value; }

    @JsonProperty("ProgressEndEvent")
    public ProgressEndEventClass getProgressEndEvent() { return progressEndEvent; }
    @JsonProperty("ProgressEndEvent")
    public void setProgressEndEvent(ProgressEndEventClass value) { this.progressEndEvent = value; }

    @JsonProperty("ProgressStartEvent")
    public ProgressStartEventClass getProgressStartEvent() { return progressStartEvent; }
    @JsonProperty("ProgressStartEvent")
    public void setProgressStartEvent(ProgressStartEventClass value) { this.progressStartEvent = value; }

    @JsonProperty("ProgressUpdateEvent")
    public ProgressUpdateEventClass getProgressUpdateEvent() { return progressUpdateEvent; }
    @JsonProperty("ProgressUpdateEvent")
    public void setProgressUpdateEvent(ProgressUpdateEventClass value) { this.progressUpdateEvent = value; }

    @JsonProperty("ProtocolMessage")
    public BaseProtocol getProtocolMessage() { return protocolMessage; }
    @JsonProperty("ProtocolMessage")
    public void setProtocolMessage(BaseProtocol value) { this.protocolMessage = value; }

    @JsonProperty("ReadMemoryArguments")
    public ReadMemoryArgumentsClass getReadMemoryArguments() { return readMemoryArguments; }
    @JsonProperty("ReadMemoryArguments")
    public void setReadMemoryArguments(ReadMemoryArgumentsClass value) { this.readMemoryArguments = value; }

    @JsonProperty("ReadMemoryRequest")
    public ReadMemoryRequestClass getReadMemoryRequest() { return readMemoryRequest; }
    @JsonProperty("ReadMemoryRequest")
    public void setReadMemoryRequest(ReadMemoryRequestClass value) { this.readMemoryRequest = value; }

    @JsonProperty("ReadMemoryResponse")
    public ReadMemoryResponseClass getReadMemoryResponse() { return readMemoryResponse; }
    @JsonProperty("ReadMemoryResponse")
    public void setReadMemoryResponse(ReadMemoryResponseClass value) { this.readMemoryResponse = value; }

    @JsonProperty("Request")
    public Request getRequest() { return request; }
    @JsonProperty("Request")
    public void setRequest(Request value) { this.request = value; }

    @JsonProperty("Response")
    public Response getResponse() { return response; }
    @JsonProperty("Response")
    public void setResponse(Response value) { this.response = value; }

    @JsonProperty("RestartArguments")
    public RestartArgumentsClass getRestartArguments() { return restartArguments; }
    @JsonProperty("RestartArguments")
    public void setRestartArguments(RestartArgumentsClass value) { this.restartArguments = value; }

    @JsonProperty("RestartFrameArguments")
    public RestartFrameArgumentsClass getRestartFrameArguments() { return restartFrameArguments; }
    @JsonProperty("RestartFrameArguments")
    public void setRestartFrameArguments(RestartFrameArgumentsClass value) { this.restartFrameArguments = value; }

    @JsonProperty("RestartFrameRequest")
    public RestartFrameRequestClass getRestartFrameRequest() { return restartFrameRequest; }
    @JsonProperty("RestartFrameRequest")
    public void setRestartFrameRequest(RestartFrameRequestClass value) { this.restartFrameRequest = value; }

    @JsonProperty("RestartFrameResponse")
    public RestartFrameResponseClass getRestartFrameResponse() { return restartFrameResponse; }
    @JsonProperty("RestartFrameResponse")
    public void setRestartFrameResponse(RestartFrameResponseClass value) { this.restartFrameResponse = value; }

    @JsonProperty("RestartRequest")
    public RestartRequestClass getRestartRequest() { return restartRequest; }
    @JsonProperty("RestartRequest")
    public void setRestartRequest(RestartRequestClass value) { this.restartRequest = value; }

    @JsonProperty("RestartResponse")
    public RestartResponseClass getRestartResponse() { return restartResponse; }
    @JsonProperty("RestartResponse")
    public void setRestartResponse(RestartResponseClass value) { this.restartResponse = value; }

    @JsonProperty("ReverseContinueArguments")
    public ReverseContinueArgumentsClass getReverseContinueArguments() { return reverseContinueArguments; }
    @JsonProperty("ReverseContinueArguments")
    public void setReverseContinueArguments(ReverseContinueArgumentsClass value) { this.reverseContinueArguments = value; }

    @JsonProperty("ReverseContinueRequest")
    public ReverseContinueRequestClass getReverseContinueRequest() { return reverseContinueRequest; }
    @JsonProperty("ReverseContinueRequest")
    public void setReverseContinueRequest(ReverseContinueRequestClass value) { this.reverseContinueRequest = value; }

    @JsonProperty("ReverseContinueResponse")
    public ReverseContinueResponseClass getReverseContinueResponse() { return reverseContinueResponse; }
    @JsonProperty("ReverseContinueResponse")
    public void setReverseContinueResponse(ReverseContinueResponseClass value) { this.reverseContinueResponse = value; }

    @JsonProperty("RunInTerminalRequest")
    public RunInTerminalRequestClass getRunInTerminalRequest() { return runInTerminalRequest; }
    @JsonProperty("RunInTerminalRequest")
    public void setRunInTerminalRequest(RunInTerminalRequestClass value) { this.runInTerminalRequest = value; }

    @JsonProperty("RunInTerminalRequestArguments")
    public RunInTerminalRequestArgumentsClass getRunInTerminalRequestArguments() { return runInTerminalRequestArguments; }
    @JsonProperty("RunInTerminalRequestArguments")
    public void setRunInTerminalRequestArguments(RunInTerminalRequestArgumentsClass value) { this.runInTerminalRequestArguments = value; }

    @JsonProperty("RunInTerminalResponse")
    public RunInTerminalResponseClass getRunInTerminalResponse() { return runInTerminalResponse; }
    @JsonProperty("RunInTerminalResponse")
    public void setRunInTerminalResponse(RunInTerminalResponseClass value) { this.runInTerminalResponse = value; }

    @JsonProperty("Scope")
    public Scope getScope() { return scope; }
    @JsonProperty("Scope")
    public void setScope(Scope value) { this.scope = value; }

    @JsonProperty("ScopesArguments")
    public ScopesArgumentsClass getScopesArguments() { return scopesArguments; }
    @JsonProperty("ScopesArguments")
    public void setScopesArguments(ScopesArgumentsClass value) { this.scopesArguments = value; }

    @JsonProperty("ScopesRequest")
    public ScopesRequestClass getScopesRequest() { return scopesRequest; }
    @JsonProperty("ScopesRequest")
    public void setScopesRequest(ScopesRequestClass value) { this.scopesRequest = value; }

    @JsonProperty("ScopesResponse")
    public ScopesResponseClass getScopesResponse() { return scopesResponse; }
    @JsonProperty("ScopesResponse")
    public void setScopesResponse(ScopesResponseClass value) { this.scopesResponse = value; }

    @JsonProperty("SetBreakpointsArguments")
    public SetBreakpointsArgumentsClass getSetBreakpointsArguments() { return setBreakpointsArguments; }
    @JsonProperty("SetBreakpointsArguments")
    public void setSetBreakpointsArguments(SetBreakpointsArgumentsClass value) { this.setBreakpointsArguments = value; }

    @JsonProperty("SetBreakpointsRequest")
    public SetBreakpointsRequestClass getSetBreakpointsRequest() { return setBreakpointsRequest; }
    @JsonProperty("SetBreakpointsRequest")
    public void setSetBreakpointsRequest(SetBreakpointsRequestClass value) { this.setBreakpointsRequest = value; }

    @JsonProperty("SetBreakpointsResponse")
    public SetBreakpointsResponseClass getSetBreakpointsResponse() { return setBreakpointsResponse; }
    @JsonProperty("SetBreakpointsResponse")
    public void setSetBreakpointsResponse(SetBreakpointsResponseClass value) { this.setBreakpointsResponse = value; }

    @JsonProperty("SetDataBreakpointsArguments")
    public SetDataBreakpointsArgumentsClass getSetDataBreakpointsArguments() { return setDataBreakpointsArguments; }
    @JsonProperty("SetDataBreakpointsArguments")
    public void setSetDataBreakpointsArguments(SetDataBreakpointsArgumentsClass value) { this.setDataBreakpointsArguments = value; }

    @JsonProperty("SetDataBreakpointsRequest")
    public SetDataBreakpointsRequestClass getSetDataBreakpointsRequest() { return setDataBreakpointsRequest; }
    @JsonProperty("SetDataBreakpointsRequest")
    public void setSetDataBreakpointsRequest(SetDataBreakpointsRequestClass value) { this.setDataBreakpointsRequest = value; }

    @JsonProperty("SetDataBreakpointsResponse")
    public SetDataBreakpointsResponseClass getSetDataBreakpointsResponse() { return setDataBreakpointsResponse; }
    @JsonProperty("SetDataBreakpointsResponse")
    public void setSetDataBreakpointsResponse(SetDataBreakpointsResponseClass value) { this.setDataBreakpointsResponse = value; }

    @JsonProperty("SetExceptionBreakpointsArguments")
    public SetExceptionBreakpointsArgumentsClass getSetExceptionBreakpointsArguments() { return setExceptionBreakpointsArguments; }
    @JsonProperty("SetExceptionBreakpointsArguments")
    public void setSetExceptionBreakpointsArguments(SetExceptionBreakpointsArgumentsClass value) { this.setExceptionBreakpointsArguments = value; }

    @JsonProperty("SetExceptionBreakpointsRequest")
    public SetExceptionBreakpointsRequestClass getSetExceptionBreakpointsRequest() { return setExceptionBreakpointsRequest; }
    @JsonProperty("SetExceptionBreakpointsRequest")
    public void setSetExceptionBreakpointsRequest(SetExceptionBreakpointsRequestClass value) { this.setExceptionBreakpointsRequest = value; }

    @JsonProperty("SetExceptionBreakpointsResponse")
    public SetExceptionBreakpointsResponseClass getSetExceptionBreakpointsResponse() { return setExceptionBreakpointsResponse; }
    @JsonProperty("SetExceptionBreakpointsResponse")
    public void setSetExceptionBreakpointsResponse(SetExceptionBreakpointsResponseClass value) { this.setExceptionBreakpointsResponse = value; }

    @JsonProperty("SetExpressionArguments")
    public SetExpressionArgumentsClass getSetExpressionArguments() { return setExpressionArguments; }
    @JsonProperty("SetExpressionArguments")
    public void setSetExpressionArguments(SetExpressionArgumentsClass value) { this.setExpressionArguments = value; }

    @JsonProperty("SetExpressionRequest")
    public SetExpressionRequestClass getSetExpressionRequest() { return setExpressionRequest; }
    @JsonProperty("SetExpressionRequest")
    public void setSetExpressionRequest(SetExpressionRequestClass value) { this.setExpressionRequest = value; }

    @JsonProperty("SetExpressionResponse")
    public SetExpressionResponseClass getSetExpressionResponse() { return setExpressionResponse; }
    @JsonProperty("SetExpressionResponse")
    public void setSetExpressionResponse(SetExpressionResponseClass value) { this.setExpressionResponse = value; }

    @JsonProperty("SetFunctionBreakpointsArguments")
    public SetFunctionBreakpointsArgumentsClass getSetFunctionBreakpointsArguments() { return setFunctionBreakpointsArguments; }
    @JsonProperty("SetFunctionBreakpointsArguments")
    public void setSetFunctionBreakpointsArguments(SetFunctionBreakpointsArgumentsClass value) { this.setFunctionBreakpointsArguments = value; }

    @JsonProperty("SetFunctionBreakpointsRequest")
    public SetFunctionBreakpointsRequestClass getSetFunctionBreakpointsRequest() { return setFunctionBreakpointsRequest; }
    @JsonProperty("SetFunctionBreakpointsRequest")
    public void setSetFunctionBreakpointsRequest(SetFunctionBreakpointsRequestClass value) { this.setFunctionBreakpointsRequest = value; }

    @JsonProperty("SetFunctionBreakpointsResponse")
    public SetFunctionBreakpointsResponseClass getSetFunctionBreakpointsResponse() { return setFunctionBreakpointsResponse; }
    @JsonProperty("SetFunctionBreakpointsResponse")
    public void setSetFunctionBreakpointsResponse(SetFunctionBreakpointsResponseClass value) { this.setFunctionBreakpointsResponse = value; }

    @JsonProperty("SetInstructionBreakpointsArguments")
    public SetInstructionBreakpointsArgumentsClass getSetInstructionBreakpointsArguments() { return setInstructionBreakpointsArguments; }
    @JsonProperty("SetInstructionBreakpointsArguments")
    public void setSetInstructionBreakpointsArguments(SetInstructionBreakpointsArgumentsClass value) { this.setInstructionBreakpointsArguments = value; }

    @JsonProperty("SetInstructionBreakpointsRequest")
    public SetInstructionBreakpointsRequestClass getSetInstructionBreakpointsRequest() { return setInstructionBreakpointsRequest; }
    @JsonProperty("SetInstructionBreakpointsRequest")
    public void setSetInstructionBreakpointsRequest(SetInstructionBreakpointsRequestClass value) { this.setInstructionBreakpointsRequest = value; }

    @JsonProperty("SetInstructionBreakpointsResponse")
    public SetInstructionBreakpointsResponseClass getSetInstructionBreakpointsResponse() { return setInstructionBreakpointsResponse; }
    @JsonProperty("SetInstructionBreakpointsResponse")
    public void setSetInstructionBreakpointsResponse(SetInstructionBreakpointsResponseClass value) { this.setInstructionBreakpointsResponse = value; }

    @JsonProperty("SetVariableArguments")
    public SetVariableArgumentsClass getSetVariableArguments() { return setVariableArguments; }
    @JsonProperty("SetVariableArguments")
    public void setSetVariableArguments(SetVariableArgumentsClass value) { this.setVariableArguments = value; }

    @JsonProperty("SetVariableRequest")
    public SetVariableRequestClass getSetVariableRequest() { return setVariableRequest; }
    @JsonProperty("SetVariableRequest")
    public void setSetVariableRequest(SetVariableRequestClass value) { this.setVariableRequest = value; }

    @JsonProperty("SetVariableResponse")
    public SetVariableResponseClass getSetVariableResponse() { return setVariableResponse; }
    @JsonProperty("SetVariableResponse")
    public void setSetVariableResponse(SetVariableResponseClass value) { this.setVariableResponse = value; }

    @JsonProperty("Source")
    public Source getSource() { return source; }
    @JsonProperty("Source")
    public void setSource(Source value) { this.source = value; }

    @JsonProperty("SourceArguments")
    public SourceArgumentsClass getSourceArguments() { return sourceArguments; }
    @JsonProperty("SourceArguments")
    public void setSourceArguments(SourceArgumentsClass value) { this.sourceArguments = value; }

    @JsonProperty("SourceBreakpoint")
    public SourceBreakpoint getSourceBreakpoint() { return sourceBreakpoint; }
    @JsonProperty("SourceBreakpoint")
    public void setSourceBreakpoint(SourceBreakpoint value) { this.sourceBreakpoint = value; }

    @JsonProperty("SourceRequest")
    public SourceRequestClass getSourceRequest() { return sourceRequest; }
    @JsonProperty("SourceRequest")
    public void setSourceRequest(SourceRequestClass value) { this.sourceRequest = value; }

    @JsonProperty("SourceResponse")
    public SourceResponseClass getSourceResponse() { return sourceResponse; }
    @JsonProperty("SourceResponse")
    public void setSourceResponse(SourceResponseClass value) { this.sourceResponse = value; }

    @JsonProperty("StackFrame")
    public StackFrame getStackFrame() { return stackFrame; }
    @JsonProperty("StackFrame")
    public void setStackFrame(StackFrame value) { this.stackFrame = value; }

    @JsonProperty("StackFrameFormat")
    public StackFrameFormat getStackFrameFormat() { return stackFrameFormat; }
    @JsonProperty("StackFrameFormat")
    public void setStackFrameFormat(StackFrameFormat value) { this.stackFrameFormat = value; }

    @JsonProperty("StackTraceArguments")
    public StackTraceArgumentsClass getStackTraceArguments() { return stackTraceArguments; }
    @JsonProperty("StackTraceArguments")
    public void setStackTraceArguments(StackTraceArgumentsClass value) { this.stackTraceArguments = value; }

    @JsonProperty("StackTraceRequest")
    public StackTraceRequestClass getStackTraceRequest() { return stackTraceRequest; }
    @JsonProperty("StackTraceRequest")
    public void setStackTraceRequest(StackTraceRequestClass value) { this.stackTraceRequest = value; }

    @JsonProperty("StackTraceResponse")
    public StackTraceResponseClass getStackTraceResponse() { return stackTraceResponse; }
    @JsonProperty("StackTraceResponse")
    public void setStackTraceResponse(StackTraceResponseClass value) { this.stackTraceResponse = value; }

    @JsonProperty("StartDebuggingRequest")
    public StartDebuggingRequestClass getStartDebuggingRequest() { return startDebuggingRequest; }
    @JsonProperty("StartDebuggingRequest")
    public void setStartDebuggingRequest(StartDebuggingRequestClass value) { this.startDebuggingRequest = value; }

    @JsonProperty("StartDebuggingRequestArguments")
    public StartDebuggingRequestArgumentsClass getStartDebuggingRequestArguments() { return startDebuggingRequestArguments; }
    @JsonProperty("StartDebuggingRequestArguments")
    public void setStartDebuggingRequestArguments(StartDebuggingRequestArgumentsClass value) { this.startDebuggingRequestArguments = value; }

    @JsonProperty("StartDebuggingResponse")
    public StartDebuggingResponseClass getStartDebuggingResponse() { return startDebuggingResponse; }
    @JsonProperty("StartDebuggingResponse")
    public void setStartDebuggingResponse(StartDebuggingResponseClass value) { this.startDebuggingResponse = value; }

    @JsonProperty("StepBackArguments")
    public StepBackArgumentsClass getStepBackArguments() { return stepBackArguments; }
    @JsonProperty("StepBackArguments")
    public void setStepBackArguments(StepBackArgumentsClass value) { this.stepBackArguments = value; }

    @JsonProperty("StepBackRequest")
    public StepBackRequestClass getStepBackRequest() { return stepBackRequest; }
    @JsonProperty("StepBackRequest")
    public void setStepBackRequest(StepBackRequestClass value) { this.stepBackRequest = value; }

    @JsonProperty("StepBackResponse")
    public StepBackResponseClass getStepBackResponse() { return stepBackResponse; }
    @JsonProperty("StepBackResponse")
    public void setStepBackResponse(StepBackResponseClass value) { this.stepBackResponse = value; }

    @JsonProperty("StepInArguments")
    public StepInArgumentsClass getStepInArguments() { return stepInArguments; }
    @JsonProperty("StepInArguments")
    public void setStepInArguments(StepInArgumentsClass value) { this.stepInArguments = value; }

    @JsonProperty("StepInRequest")
    public StepInRequestClass getStepInRequest() { return stepInRequest; }
    @JsonProperty("StepInRequest")
    public void setStepInRequest(StepInRequestClass value) { this.stepInRequest = value; }

    @JsonProperty("StepInResponse")
    public StepInResponseClass getStepInResponse() { return stepInResponse; }
    @JsonProperty("StepInResponse")
    public void setStepInResponse(StepInResponseClass value) { this.stepInResponse = value; }

    @JsonProperty("StepInTarget")
    public StepInTarget getStepInTarget() { return stepInTarget; }
    @JsonProperty("StepInTarget")
    public void setStepInTarget(StepInTarget value) { this.stepInTarget = value; }

    @JsonProperty("StepInTargetsArguments")
    public StepInTargetsArgumentsClass getStepInTargetsArguments() { return stepInTargetsArguments; }
    @JsonProperty("StepInTargetsArguments")
    public void setStepInTargetsArguments(StepInTargetsArgumentsClass value) { this.stepInTargetsArguments = value; }

    @JsonProperty("StepInTargetsRequest")
    public StepInTargetsRequestClass getStepInTargetsRequest() { return stepInTargetsRequest; }
    @JsonProperty("StepInTargetsRequest")
    public void setStepInTargetsRequest(StepInTargetsRequestClass value) { this.stepInTargetsRequest = value; }

    @JsonProperty("StepInTargetsResponse")
    public StepInTargetsResponseClass getStepInTargetsResponse() { return stepInTargetsResponse; }
    @JsonProperty("StepInTargetsResponse")
    public void setStepInTargetsResponse(StepInTargetsResponseClass value) { this.stepInTargetsResponse = value; }

    @JsonProperty("StepOutArguments")
    public StepOutArgumentsClass getStepOutArguments() { return stepOutArguments; }
    @JsonProperty("StepOutArguments")
    public void setStepOutArguments(StepOutArgumentsClass value) { this.stepOutArguments = value; }

    @JsonProperty("StepOutRequest")
    public StepOutRequestClass getStepOutRequest() { return stepOutRequest; }
    @JsonProperty("StepOutRequest")
    public void setStepOutRequest(StepOutRequestClass value) { this.stepOutRequest = value; }

    @JsonProperty("StepOutResponse")
    public StepOutResponseClass getStepOutResponse() { return stepOutResponse; }
    @JsonProperty("StepOutResponse")
    public void setStepOutResponse(StepOutResponseClass value) { this.stepOutResponse = value; }

    @JsonProperty("SteppingGranularity")
    public SteppingGranularity getSteppingGranularity() { return steppingGranularity; }
    @JsonProperty("SteppingGranularity")
    public void setSteppingGranularity(SteppingGranularity value) { this.steppingGranularity = value; }

    @JsonProperty("StoppedEvent")
    public StoppedEventClass getStoppedEvent() { return stoppedEvent; }
    @JsonProperty("StoppedEvent")
    public void setStoppedEvent(StoppedEventClass value) { this.stoppedEvent = value; }

    @JsonProperty("TerminateArguments")
    public TerminateArgumentsClass getTerminateArguments() { return terminateArguments; }
    @JsonProperty("TerminateArguments")
    public void setTerminateArguments(TerminateArgumentsClass value) { this.terminateArguments = value; }

    @JsonProperty("TerminatedEvent")
    public TerminatedEventClass getTerminatedEvent() { return terminatedEvent; }
    @JsonProperty("TerminatedEvent")
    public void setTerminatedEvent(TerminatedEventClass value) { this.terminatedEvent = value; }

    @JsonProperty("TerminateRequest")
    public TerminateRequestClass getTerminateRequest() { return terminateRequest; }
    @JsonProperty("TerminateRequest")
    public void setTerminateRequest(TerminateRequestClass value) { this.terminateRequest = value; }

    @JsonProperty("TerminateResponse")
    public TerminateResponseClass getTerminateResponse() { return terminateResponse; }
    @JsonProperty("TerminateResponse")
    public void setTerminateResponse(TerminateResponseClass value) { this.terminateResponse = value; }

    @JsonProperty("TerminateThreadsArguments")
    public TerminateThreadsArgumentsClass getTerminateThreadsArguments() { return terminateThreadsArguments; }
    @JsonProperty("TerminateThreadsArguments")
    public void setTerminateThreadsArguments(TerminateThreadsArgumentsClass value) { this.terminateThreadsArguments = value; }

    @JsonProperty("TerminateThreadsRequest")
    public TerminateThreadsRequestClass getTerminateThreadsRequest() { return terminateThreadsRequest; }
    @JsonProperty("TerminateThreadsRequest")
    public void setTerminateThreadsRequest(TerminateThreadsRequestClass value) { this.terminateThreadsRequest = value; }

    @JsonProperty("TerminateThreadsResponse")
    public TerminateThreadsResponseClass getTerminateThreadsResponse() { return terminateThreadsResponse; }
    @JsonProperty("TerminateThreadsResponse")
    public void setTerminateThreadsResponse(TerminateThreadsResponseClass value) { this.terminateThreadsResponse = value; }

    @JsonProperty("Thread")
    public Thread getThread() { return thread; }
    @JsonProperty("Thread")
    public void setThread(Thread value) { this.thread = value; }

    @JsonProperty("ThreadEvent")
    public ThreadEventClass getThreadEvent() { return threadEvent; }
    @JsonProperty("ThreadEvent")
    public void setThreadEvent(ThreadEventClass value) { this.threadEvent = value; }

    @JsonProperty("ThreadsRequest")
    public ThreadsRequestClass getThreadsRequest() { return threadsRequest; }
    @JsonProperty("ThreadsRequest")
    public void setThreadsRequest(ThreadsRequestClass value) { this.threadsRequest = value; }

    @JsonProperty("ThreadsResponse")
    public ThreadsResponseClass getThreadsResponse() { return threadsResponse; }
    @JsonProperty("ThreadsResponse")
    public void setThreadsResponse(ThreadsResponseClass value) { this.threadsResponse = value; }

    @JsonProperty("ValueFormat")
    public ValueFormat getValueFormat() { return valueFormat; }
    @JsonProperty("ValueFormat")
    public void setValueFormat(ValueFormat value) { this.valueFormat = value; }

    @JsonProperty("Variable")
    public Variable getVariable() { return variable; }
    @JsonProperty("Variable")
    public void setVariable(Variable value) { this.variable = value; }

    @JsonProperty("VariablePresentationHint")
    public VariablePresentationHint getVariablePresentationHint() { return variablePresentationHint; }
    @JsonProperty("VariablePresentationHint")
    public void setVariablePresentationHint(VariablePresentationHint value) { this.variablePresentationHint = value; }

    @JsonProperty("VariablesArguments")
    public VariablesArgumentsClass getVariablesArguments() { return variablesArguments; }
    @JsonProperty("VariablesArguments")
    public void setVariablesArguments(VariablesArgumentsClass value) { this.variablesArguments = value; }

    @JsonProperty("VariablesRequest")
    public VariablesRequestClass getVariablesRequest() { return variablesRequest; }
    @JsonProperty("VariablesRequest")
    public void setVariablesRequest(VariablesRequestClass value) { this.variablesRequest = value; }

    @JsonProperty("VariablesResponse")
    public VariablesResponseClass getVariablesResponse() { return variablesResponse; }
    @JsonProperty("VariablesResponse")
    public void setVariablesResponse(VariablesResponseClass value) { this.variablesResponse = value; }

    @JsonProperty("WriteMemoryArguments")
    public WriteMemoryArgumentsClass getWriteMemoryArguments() { return writeMemoryArguments; }
    @JsonProperty("WriteMemoryArguments")
    public void setWriteMemoryArguments(WriteMemoryArgumentsClass value) { this.writeMemoryArguments = value; }

    @JsonProperty("WriteMemoryRequest")
    public WriteMemoryRequestClass getWriteMemoryRequest() { return writeMemoryRequest; }
    @JsonProperty("WriteMemoryRequest")
    public void setWriteMemoryRequest(WriteMemoryRequestClass value) { this.writeMemoryRequest = value; }

    @JsonProperty("WriteMemoryResponse")
    public WriteMemoryResponseClass getWriteMemoryResponse() { return writeMemoryResponse; }
    @JsonProperty("WriteMemoryResponse")
    public void setWriteMemoryResponse(WriteMemoryResponseClass value) { this.writeMemoryResponse = value; }
}
