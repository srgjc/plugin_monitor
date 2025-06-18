
package org.tzi.use.monitor.adapter.python.dap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Debug Adapter Protocol
 * <p>
 * The Debug Adapter Protocol defines the protocol used between an editor or IDE and a debugger or runtime.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AttachRequest",
    "AttachRequestArguments",
    "AttachResponse",
    "Breakpoint",
    "BreakpointEvent",
    "BreakpointLocation",
    "BreakpointLocationsArguments",
    "BreakpointLocationsRequest",
    "BreakpointLocationsResponse",
    "CancelArguments",
    "CancelRequest",
    "CancelResponse",
    "Capabilities",
    "CapabilitiesEvent",
    "Checksum",
    "ChecksumAlgorithm",
    "ColumnDescriptor",
    "CompletionItem",
    "CompletionItemType",
    "CompletionsArguments",
    "CompletionsRequest",
    "CompletionsResponse",
    "ConfigurationDoneArguments",
    "ConfigurationDoneRequest",
    "ConfigurationDoneResponse",
    "ContinueArguments",
    "ContinueRequest",
    "ContinueResponse",
    "ContinuedEvent",
    "DataBreakpoint",
    "DataBreakpointAccessType",
    "DataBreakpointInfoArguments",
    "DataBreakpointInfoRequest",
    "DataBreakpointInfoResponse",
    "DisassembleArguments",
    "DisassembleRequest",
    "DisassembleResponse",
    "DisassembledInstruction",
    "DisconnectArguments",
    "DisconnectRequest",
    "DisconnectResponse",
    "ErrorResponse",
    "EvaluateArguments",
    "EvaluateRequest",
    "EvaluateResponse",
    "Event",
    "ExceptionBreakMode",
    "ExceptionBreakpointsFilter",
    "ExceptionDetails",
    "ExceptionFilterOptions",
    "ExceptionInfoArguments",
    "ExceptionInfoRequest",
    "ExceptionInfoResponse",
    "ExceptionOptions",
    "ExceptionPathSegment",
    "ExitedEvent",
    "FunctionBreakpoint",
    "GotoArguments",
    "GotoRequest",
    "GotoResponse",
    "GotoTarget",
    "GotoTargetsArguments",
    "GotoTargetsRequest",
    "GotoTargetsResponse",
    "InitializeRequest",
    "InitializeRequestArguments",
    "InitializeResponse",
    "InitializedEvent",
    "InstructionBreakpoint",
    "InvalidatedAreas",
    "InvalidatedEvent",
    "LaunchRequest",
    "LaunchRequestArguments",
    "LaunchResponse",
    "LoadedSourceEvent",
    "LoadedSourcesArguments",
    "LoadedSourcesRequest",
    "LoadedSourcesResponse",
    "MemoryEvent",
    "Message",
    "Module",
    "ModuleEvent",
    "ModulesArguments",
    "ModulesRequest",
    "ModulesResponse",
    "NextArguments",
    "NextRequest",
    "NextResponse",
    "OutputEvent",
    "PauseArguments",
    "PauseRequest",
    "PauseResponse",
    "ProcessEvent",
    "ProgressEndEvent",
    "ProgressStartEvent",
    "ProgressUpdateEvent",
    "ProtocolMessage",
    "ReadMemoryArguments",
    "ReadMemoryRequest",
    "ReadMemoryResponse",
    "Request",
    "Response",
    "RestartArguments",
    "RestartFrameArguments",
    "RestartFrameRequest",
    "RestartFrameResponse",
    "RestartRequest",
    "RestartResponse",
    "ReverseContinueArguments",
    "ReverseContinueRequest",
    "ReverseContinueResponse",
    "RunInTerminalRequest",
    "RunInTerminalRequestArguments",
    "RunInTerminalResponse",
    "Scope",
    "ScopesArguments",
    "ScopesRequest",
    "ScopesResponse",
    "SetBreakpointsArguments",
    "SetBreakpointsRequest",
    "SetBreakpointsResponse",
    "SetDataBreakpointsArguments",
    "SetDataBreakpointsRequest",
    "SetDataBreakpointsResponse",
    "SetExceptionBreakpointsArguments",
    "SetExceptionBreakpointsRequest",
    "SetExceptionBreakpointsResponse",
    "SetExpressionArguments",
    "SetExpressionRequest",
    "SetExpressionResponse",
    "SetFunctionBreakpointsArguments",
    "SetFunctionBreakpointsRequest",
    "SetFunctionBreakpointsResponse",
    "SetInstructionBreakpointsArguments",
    "SetInstructionBreakpointsRequest",
    "SetInstructionBreakpointsResponse",
    "SetVariableArguments",
    "SetVariableRequest",
    "SetVariableResponse",
    "Source",
    "SourceArguments",
    "SourceBreakpoint",
    "SourceRequest",
    "SourceResponse",
    "StackFrame",
    "StackFrameFormat",
    "StackTraceArguments",
    "StackTraceRequest",
    "StackTraceResponse",
    "StartDebuggingRequest",
    "StartDebuggingRequestArguments",
    "StartDebuggingResponse",
    "StepBackArguments",
    "StepBackRequest",
    "StepBackResponse",
    "StepInArguments",
    "StepInRequest",
    "StepInResponse",
    "StepInTarget",
    "StepInTargetsArguments",
    "StepInTargetsRequest",
    "StepInTargetsResponse",
    "StepOutArguments",
    "StepOutRequest",
    "StepOutResponse",
    "SteppingGranularity",
    "StoppedEvent",
    "TerminateArguments",
    "TerminateRequest",
    "TerminateResponse",
    "TerminateThreadsArguments",
    "TerminateThreadsRequest",
    "TerminateThreadsResponse",
    "TerminatedEvent",
    "Thread",
    "ThreadEvent",
    "ThreadsRequest",
    "ThreadsResponse",
    "ValueFormat",
    "Variable",
    "VariablePresentationHint",
    "VariablesArguments",
    "VariablesRequest",
    "VariablesResponse",
    "WriteMemoryArguments",
    "WriteMemoryRequest",
    "WriteMemoryResponse"
})
@Generated("jsonschema2pojo")
public class DebugProtocol {

    @JsonProperty("AttachRequest")
    private Object attachRequest;
    /**
     * Arguments for `attach` request. Additional attributes are implementation specific.
     * 
     */
    @JsonProperty("AttachRequestArguments")
    @JsonPropertyDescription("Arguments for `attach` request. Additional attributes are implementation specific.")
    private AttachRequestArguments attachRequestArguments;
    @JsonProperty("AttachResponse")
    private Object attachResponse;
    /**
     * Information about a breakpoint created in `setBreakpoints`, `setFunctionBreakpoints`, `setInstructionBreakpoints`, or `setDataBreakpoints` requests.
     * 
     */
    @JsonProperty("Breakpoint")
    @JsonPropertyDescription("Information about a breakpoint created in `setBreakpoints`, `setFunctionBreakpoints`, `setInstructionBreakpoints`, or `setDataBreakpoints` requests.")
    private Breakpoint breakpoint;
    @JsonProperty("BreakpointEvent")
    private Object breakpointEvent;
    /**
     * Properties of a breakpoint location returned from the `breakpointLocations` request.
     * 
     */
    @JsonProperty("BreakpointLocation")
    @JsonPropertyDescription("Properties of a breakpoint location returned from the `breakpointLocations` request.")
    private BreakpointLocation breakpointLocation;
    /**
     * Arguments for `breakpointLocations` request.
     * 
     */
    @JsonProperty("BreakpointLocationsArguments")
    @JsonPropertyDescription("Arguments for `breakpointLocations` request.")
    private BreakpointLocationsArguments breakpointLocationsArguments;
    @JsonProperty("BreakpointLocationsRequest")
    private Object breakpointLocationsRequest;
    @JsonProperty("BreakpointLocationsResponse")
    private Object breakpointLocationsResponse;
    /**
     * Arguments for `cancel` request.
     * 
     */
    @JsonProperty("CancelArguments")
    @JsonPropertyDescription("Arguments for `cancel` request.")
    private CancelArguments cancelArguments;
    @JsonProperty("CancelRequest")
    private Object cancelRequest;
    @JsonProperty("CancelResponse")
    private Object cancelResponse;
    /**
     * Types
     * <p>
     * Information about the capabilities of a debug adapter.
     * 
     */
    @JsonProperty("Capabilities")
    @JsonPropertyDescription("Information about the capabilities of a debug adapter.")
    private Capabilities capabilities;
    @JsonProperty("CapabilitiesEvent")
    private Object capabilitiesEvent;
    /**
     * The checksum of an item calculated by the specified algorithm.
     * 
     */
    @JsonProperty("Checksum")
    @JsonPropertyDescription("The checksum of an item calculated by the specified algorithm.")
    private Checksum checksum;
    /**
     * Names of checksum algorithms that may be supported by a debug adapter.
     * 
     */
    @JsonProperty("ChecksumAlgorithm")
    @JsonPropertyDescription("Names of checksum algorithms that may be supported by a debug adapter.")
    private Checksum.ChecksumAlgorithm checksumAlgorithm;
    /**
     * A `ColumnDescriptor` specifies what module attribute to show in a column of the modules view, how to format it,
     * and what the column's label should be.
     * It is only used if the underlying UI actually supports this level of customization.
     * 
     */
    @JsonProperty("ColumnDescriptor")
    @JsonPropertyDescription("A `ColumnDescriptor` specifies what module attribute to show in a column of the modules view, how to format it,\nand what the column's label should be.\nIt is only used if the underlying UI actually supports this level of customization.")
    private ColumnDescriptor columnDescriptor;
    /**
     * `CompletionItems` are the suggestions returned from the `completions` request.
     * 
     */
    @JsonProperty("CompletionItem")
    @JsonPropertyDescription("`CompletionItems` are the suggestions returned from the `completions` request.")
    private CompletionItem completionItem;
    /**
     * Some predefined types for the CompletionItem. Please note that not all clients have specific icons for all of them.
     * 
     */
    @JsonProperty("CompletionItemType")
    @JsonPropertyDescription("Some predefined types for the CompletionItem. Please note that not all clients have specific icons for all of them.")
    private CompletionItem.CompletionItemType completionItemType;
    /**
     * Arguments for `completions` request.
     * 
     */
    @JsonProperty("CompletionsArguments")
    @JsonPropertyDescription("Arguments for `completions` request.")
    private CompletionsArguments completionsArguments;
    @JsonProperty("CompletionsRequest")
    private Object completionsRequest;
    @JsonProperty("CompletionsResponse")
    private Object completionsResponse;
    /**
     * Arguments for `configurationDone` request.
     * 
     */
    @JsonProperty("ConfigurationDoneArguments")
    @JsonPropertyDescription("Arguments for `configurationDone` request.")
    private ConfigurationDoneArguments configurationDoneArguments;
    @JsonProperty("ConfigurationDoneRequest")
    private Object configurationDoneRequest;
    @JsonProperty("ConfigurationDoneResponse")
    private Object configurationDoneResponse;
    /**
     * Arguments for `continue` request.
     * 
     */
    @JsonProperty("ContinueArguments")
    @JsonPropertyDescription("Arguments for `continue` request.")
    private ContinueArguments continueArguments;
    @JsonProperty("ContinueRequest")
    private Object continueRequest;
    @JsonProperty("ContinueResponse")
    private Object continueResponse;
    @JsonProperty("ContinuedEvent")
    private Object continuedEvent;
    /**
     * Properties of a data breakpoint passed to the `setDataBreakpoints` request.
     * 
     */
    @JsonProperty("DataBreakpoint")
    @JsonPropertyDescription("Properties of a data breakpoint passed to the `setDataBreakpoints` request.")
    private DataBreakpoint dataBreakpoint;
    /**
     * This enumeration defines all possible access types for data breakpoints.
     * 
     */
    @JsonProperty("DataBreakpointAccessType")
    @JsonPropertyDescription("This enumeration defines all possible access types for data breakpoints.")
    private DataBreakpoint.DataBreakpointAccessType dataBreakpointAccessType;
    /**
     * Arguments for `dataBreakpointInfo` request.
     * 
     */
    @JsonProperty("DataBreakpointInfoArguments")
    @JsonPropertyDescription("Arguments for `dataBreakpointInfo` request.")
    private DataBreakpointInfoArguments dataBreakpointInfoArguments;
    @JsonProperty("DataBreakpointInfoRequest")
    private Object dataBreakpointInfoRequest;
    @JsonProperty("DataBreakpointInfoResponse")
    private Object dataBreakpointInfoResponse;
    /**
     * Arguments for `disassemble` request.
     * 
     */
    @JsonProperty("DisassembleArguments")
    @JsonPropertyDescription("Arguments for `disassemble` request.")
    private DisassembleArguments disassembleArguments;
    @JsonProperty("DisassembleRequest")
    private Object disassembleRequest;
    @JsonProperty("DisassembleResponse")
    private Object disassembleResponse;
    /**
     * Represents a single disassembled instruction.
     * 
     */
    @JsonProperty("DisassembledInstruction")
    @JsonPropertyDescription("Represents a single disassembled instruction.")
    private DisassembledInstruction disassembledInstruction;
    /**
     * Arguments for `disconnect` request.
     * 
     */
    @JsonProperty("DisconnectArguments")
    @JsonPropertyDescription("Arguments for `disconnect` request.")
    private DisconnectArguments disconnectArguments;
    @JsonProperty("DisconnectRequest")
    private Object disconnectRequest;
    @JsonProperty("DisconnectResponse")
    private Object disconnectResponse;
    @JsonProperty("ErrorResponse")
    private Object errorResponse;
    /**
     * Arguments for `evaluate` request.
     * 
     */
    @JsonProperty("EvaluateArguments")
    @JsonPropertyDescription("Arguments for `evaluate` request.")
    private EvaluateArguments evaluateArguments;
    @JsonProperty("EvaluateRequest")
    private Object evaluateRequest;
    @JsonProperty("EvaluateResponse")
    private Object evaluateResponse;
    @JsonProperty("Event")
    private Object event;
    /**
     * This enumeration defines all possible conditions when a thrown exception should result in a break.
     * never: never breaks,
     * always: always breaks,
     * unhandled: breaks when exception unhandled,
     * userUnhandled: breaks if the exception is not handled by user code.
     * 
     */
    @JsonProperty("ExceptionBreakMode")
    @JsonPropertyDescription("This enumeration defines all possible conditions when a thrown exception should result in a break.\nnever: never breaks,\nalways: always breaks,\nunhandled: breaks when exception unhandled,\nuserUnhandled: breaks if the exception is not handled by user code.")
    private ExceptionBreakMode exceptionBreakMode;
    /**
     * An `ExceptionBreakpointsFilter` is shown in the UI as an filter option for configuring how exceptions are dealt with.
     * 
     */
    @JsonProperty("ExceptionBreakpointsFilter")
    @JsonPropertyDescription("An `ExceptionBreakpointsFilter` is shown in the UI as an filter option for configuring how exceptions are dealt with.")
    private ExceptionBreakpointsFilter exceptionBreakpointsFilter;
    /**
     * Detailed information about an exception that has occurred.
     * 
     */
    @JsonProperty("ExceptionDetails")
    @JsonPropertyDescription("Detailed information about an exception that has occurred.")
    private ExceptionDetails exceptionDetails;
    /**
     * An `ExceptionFilterOptions` is used to specify an exception filter together with a condition for the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("ExceptionFilterOptions")
    @JsonPropertyDescription("An `ExceptionFilterOptions` is used to specify an exception filter together with a condition for the `setExceptionBreakpoints` request.")
    private ExceptionFilterOptions exceptionFilterOptions;
    /**
     * Arguments for `exceptionInfo` request.
     * 
     */
    @JsonProperty("ExceptionInfoArguments")
    @JsonPropertyDescription("Arguments for `exceptionInfo` request.")
    private ExceptionInfoArguments exceptionInfoArguments;
    @JsonProperty("ExceptionInfoRequest")
    private Object exceptionInfoRequest;
    @JsonProperty("ExceptionInfoResponse")
    private Object exceptionInfoResponse;
    /**
     * An `ExceptionOptions` assigns configuration options to a set of exceptions.
     * 
     */
    @JsonProperty("ExceptionOptions")
    @JsonPropertyDescription("An `ExceptionOptions` assigns configuration options to a set of exceptions.")
    private ExceptionOptions exceptionOptions;
    /**
     * An `ExceptionPathSegment` represents a segment in a path that is used to match leafs or nodes in a tree of exceptions.
     * If a segment consists of more than one name, it matches the names provided if `negate` is false or missing, or it matches anything except the names provided if `negate` is true.
     * 
     */
    @JsonProperty("ExceptionPathSegment")
    @JsonPropertyDescription("An `ExceptionPathSegment` represents a segment in a path that is used to match leafs or nodes in a tree of exceptions.\nIf a segment consists of more than one name, it matches the names provided if `negate` is false or missing, or it matches anything except the names provided if `negate` is true.")
    private ExceptionPathSegment exceptionPathSegment;
    @JsonProperty("ExitedEvent")
    private Object exitedEvent;
    /**
     * Properties of a breakpoint passed to the `setFunctionBreakpoints` request.
     * 
     */
    @JsonProperty("FunctionBreakpoint")
    @JsonPropertyDescription("Properties of a breakpoint passed to the `setFunctionBreakpoints` request.")
    private FunctionBreakpoint functionBreakpoint;
    /**
     * Arguments for `goto` request.
     * 
     */
    @JsonProperty("GotoArguments")
    @JsonPropertyDescription("Arguments for `goto` request.")
    private GotoArguments gotoArguments;
    @JsonProperty("GotoRequest")
    private Object gotoRequest;
    @JsonProperty("GotoResponse")
    private Object gotoResponse;
    /**
     * A `GotoTarget` describes a code location that can be used as a target in the `goto` request.
     * The possible goto targets can be determined via the `gotoTargets` request.
     * 
     */
    @JsonProperty("GotoTarget")
    @JsonPropertyDescription("A `GotoTarget` describes a code location that can be used as a target in the `goto` request.\nThe possible goto targets can be determined via the `gotoTargets` request.")
    private GotoTarget gotoTarget;
    /**
     * Arguments for `gotoTargets` request.
     * 
     */
    @JsonProperty("GotoTargetsArguments")
    @JsonPropertyDescription("Arguments for `gotoTargets` request.")
    private GotoTargetsArguments gotoTargetsArguments;
    @JsonProperty("GotoTargetsRequest")
    private Object gotoTargetsRequest;
    @JsonProperty("GotoTargetsResponse")
    private Object gotoTargetsResponse;
    @JsonProperty("InitializeRequest")
    private Object initializeRequest;
    /**
     * Arguments for `initialize` request.
     * 
     */
    @JsonProperty("InitializeRequestArguments")
    @JsonPropertyDescription("Arguments for `initialize` request.")
    private InitializeRequestArguments initializeRequestArguments;
    @JsonProperty("InitializeResponse")
    private Object initializeResponse;
    @JsonProperty("InitializedEvent")
    private Object initializedEvent;
    /**
     * Properties of a breakpoint passed to the `setInstructionBreakpoints` request
     * 
     */
    @JsonProperty("InstructionBreakpoint")
    @JsonPropertyDescription("Properties of a breakpoint passed to the `setInstructionBreakpoints` request")
    private InstructionBreakpoint instructionBreakpoint;
    /**
     * Logical areas that can be invalidated by the `invalidated` event.
     * 
     */
    @JsonProperty("InvalidatedAreas")
    @JsonPropertyDescription("Logical areas that can be invalidated by the `invalidated` event.")
    private String invalidatedAreas;
    @JsonProperty("InvalidatedEvent")
    private Object invalidatedEvent;
    @JsonProperty("LaunchRequest")
    private Object launchRequest;
    /**
     * Arguments for `launch` request. Additional attributes are implementation specific.
     * 
     */
    @JsonProperty("LaunchRequestArguments")
    @JsonPropertyDescription("Arguments for `launch` request. Additional attributes are implementation specific.")
    private LaunchRequestArguments launchRequestArguments;
    @JsonProperty("LaunchResponse")
    private Object launchResponse;
    @JsonProperty("LoadedSourceEvent")
    private Object loadedSourceEvent;
    /**
     * Arguments for `loadedSources` request.
     * 
     */
    @JsonProperty("LoadedSourcesArguments")
    @JsonPropertyDescription("Arguments for `loadedSources` request.")
    private LoadedSourcesArguments loadedSourcesArguments;
    @JsonProperty("LoadedSourcesRequest")
    private Object loadedSourcesRequest;
    @JsonProperty("LoadedSourcesResponse")
    private Object loadedSourcesResponse;
    @JsonProperty("MemoryEvent")
    private Object memoryEvent;
    /**
     * A structured message object. Used to return errors from requests.
     * 
     */
    @JsonProperty("Message")
    @JsonPropertyDescription("A structured message object. Used to return errors from requests.")
    private Message message;
    /**
     * A Module object represents a row in the modules view.
     * The `id` attribute identifies a module in the modules view and is used in a `module` event for identifying a module for adding, updating or deleting.
     * The `name` attribute is used to minimally render the module in the UI.
     * 
     * Additional attributes can be added to the module. They show up in the module view if they have a corresponding `ColumnDescriptor`.
     * 
     * To avoid an unnecessary proliferation of additional attributes with similar semantics but different names, we recommend to re-use attributes from the 'recommended' list below first, and only introduce new attributes if nothing appropriate could be found.
     * 
     */
    @JsonProperty("Module")
    @JsonPropertyDescription("A Module object represents a row in the modules view.\nThe `id` attribute identifies a module in the modules view and is used in a `module` event for identifying a module for adding, updating or deleting.\nThe `name` attribute is used to minimally render the module in the UI.\n\nAdditional attributes can be added to the module. They show up in the module view if they have a corresponding `ColumnDescriptor`.\n\nTo avoid an unnecessary proliferation of additional attributes with similar semantics but different names, we recommend to re-use attributes from the 'recommended' list below first, and only introduce new attributes if nothing appropriate could be found.")
    private Module module;
    @JsonProperty("ModuleEvent")
    private Object moduleEvent;
    /**
     * Arguments for `modules` request.
     * 
     */
    @JsonProperty("ModulesArguments")
    @JsonPropertyDescription("Arguments for `modules` request.")
    private ModulesArguments modulesArguments;
    @JsonProperty("ModulesRequest")
    private Object modulesRequest;
    @JsonProperty("ModulesResponse")
    private Object modulesResponse;
    /**
     * Arguments for `next` request.
     * 
     */
    @JsonProperty("NextArguments")
    @JsonPropertyDescription("Arguments for `next` request.")
    private NextArguments nextArguments;
    @JsonProperty("NextRequest")
    private Object nextRequest;
    @JsonProperty("NextResponse")
    private Object nextResponse;
    @JsonProperty("OutputEvent")
    private Object outputEvent;
    /**
     * Arguments for `pause` request.
     * 
     */
    @JsonProperty("PauseArguments")
    @JsonPropertyDescription("Arguments for `pause` request.")
    private PauseArguments pauseArguments;
    @JsonProperty("PauseRequest")
    private Object pauseRequest;
    @JsonProperty("PauseResponse")
    private Object pauseResponse;
    @JsonProperty("ProcessEvent")
    private Object processEvent;
    @JsonProperty("ProgressEndEvent")
    private Object progressEndEvent;
    @JsonProperty("ProgressStartEvent")
    private Object progressStartEvent;
    @JsonProperty("ProgressUpdateEvent")
    private Object progressUpdateEvent;
    /**
     * Base Protocol
     * <p>
     * Base class of requests, responses, and events.
     * 
     */
    @JsonProperty("ProtocolMessage")
    @JsonPropertyDescription("Base class of requests, responses, and events.")
    private ProtocolMessage protocolMessage;
    /**
     * Arguments for `readMemory` request.
     * 
     */
    @JsonProperty("ReadMemoryArguments")
    @JsonPropertyDescription("Arguments for `readMemory` request.")
    private ReadMemoryArguments readMemoryArguments;
    @JsonProperty("ReadMemoryRequest")
    private Object readMemoryRequest;
    @JsonProperty("ReadMemoryResponse")
    private Object readMemoryResponse;
    @JsonProperty("Request")
    private Object request;
    @JsonProperty("Response")
    private Object response;
    /**
     * Arguments for `restart` request.
     * 
     */
    @JsonProperty("RestartArguments")
    @JsonPropertyDescription("Arguments for `restart` request.")
    private RestartArguments restartArguments;
    /**
     * Arguments for `restartFrame` request.
     * 
     */
    @JsonProperty("RestartFrameArguments")
    @JsonPropertyDescription("Arguments for `restartFrame` request.")
    private RestartFrameArguments restartFrameArguments;
    @JsonProperty("RestartFrameRequest")
    private Object restartFrameRequest;
    @JsonProperty("RestartFrameResponse")
    private Object restartFrameResponse;
    @JsonProperty("RestartRequest")
    private Object restartRequest;
    @JsonProperty("RestartResponse")
    private Object restartResponse;
    /**
     * Arguments for `reverseContinue` request.
     * 
     */
    @JsonProperty("ReverseContinueArguments")
    @JsonPropertyDescription("Arguments for `reverseContinue` request.")
    private ReverseContinueArguments reverseContinueArguments;
    @JsonProperty("ReverseContinueRequest")
    private Object reverseContinueRequest;
    @JsonProperty("ReverseContinueResponse")
    private Object reverseContinueResponse;
    @JsonProperty("RunInTerminalRequest")
    private Object runInTerminalRequest;
    /**
     * Arguments for `runInTerminal` request.
     * 
     */
    @JsonProperty("RunInTerminalRequestArguments")
    @JsonPropertyDescription("Arguments for `runInTerminal` request.")
    private RunInTerminalRequestArguments runInTerminalRequestArguments;
    @JsonProperty("RunInTerminalResponse")
    private Object runInTerminalResponse;
    /**
     * A `Scope` is a named container for variables. Optionally a scope can map to a source or a range within a source.
     * 
     */
    @JsonProperty("Scope")
    @JsonPropertyDescription("A `Scope` is a named container for variables. Optionally a scope can map to a source or a range within a source.")
    private Scope scope;
    /**
     * Arguments for `scopes` request.
     * 
     */
    @JsonProperty("ScopesArguments")
    @JsonPropertyDescription("Arguments for `scopes` request.")
    private ScopesArguments scopesArguments;
    @JsonProperty("ScopesRequest")
    private Object scopesRequest;
    @JsonProperty("ScopesResponse")
    private Object scopesResponse;
    /**
     * Arguments for `setBreakpoints` request.
     * 
     */
    @JsonProperty("SetBreakpointsArguments")
    @JsonPropertyDescription("Arguments for `setBreakpoints` request.")
    private SetBreakpointsArguments setBreakpointsArguments;
    @JsonProperty("SetBreakpointsRequest")
    private Object setBreakpointsRequest;
    @JsonProperty("SetBreakpointsResponse")
    private Object setBreakpointsResponse;
    /**
     * Arguments for `setDataBreakpoints` request.
     * 
     */
    @JsonProperty("SetDataBreakpointsArguments")
    @JsonPropertyDescription("Arguments for `setDataBreakpoints` request.")
    private SetDataBreakpointsArguments setDataBreakpointsArguments;
    @JsonProperty("SetDataBreakpointsRequest")
    private Object setDataBreakpointsRequest;
    @JsonProperty("SetDataBreakpointsResponse")
    private Object setDataBreakpointsResponse;
    /**
     * Arguments for `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("SetExceptionBreakpointsArguments")
    @JsonPropertyDescription("Arguments for `setExceptionBreakpoints` request.")
    private SetExceptionBreakpointsArguments setExceptionBreakpointsArguments;
    @JsonProperty("SetExceptionBreakpointsRequest")
    private Object setExceptionBreakpointsRequest;
    @JsonProperty("SetExceptionBreakpointsResponse")
    private Object setExceptionBreakpointsResponse;
    /**
     * Arguments for `setExpression` request.
     * 
     */
    @JsonProperty("SetExpressionArguments")
    @JsonPropertyDescription("Arguments for `setExpression` request.")
    private SetExpressionArguments setExpressionArguments;
    @JsonProperty("SetExpressionRequest")
    private Object setExpressionRequest;
    @JsonProperty("SetExpressionResponse")
    private Object setExpressionResponse;
    /**
     * Arguments for `setFunctionBreakpoints` request.
     * 
     */
    @JsonProperty("SetFunctionBreakpointsArguments")
    @JsonPropertyDescription("Arguments for `setFunctionBreakpoints` request.")
    private SetFunctionBreakpointsArguments setFunctionBreakpointsArguments;
    @JsonProperty("SetFunctionBreakpointsRequest")
    private Object setFunctionBreakpointsRequest;
    @JsonProperty("SetFunctionBreakpointsResponse")
    private Object setFunctionBreakpointsResponse;
    /**
     * Arguments for `setInstructionBreakpoints` request
     * 
     */
    @JsonProperty("SetInstructionBreakpointsArguments")
    @JsonPropertyDescription("Arguments for `setInstructionBreakpoints` request")
    private SetInstructionBreakpointsArguments setInstructionBreakpointsArguments;
    @JsonProperty("SetInstructionBreakpointsRequest")
    private Object setInstructionBreakpointsRequest;
    @JsonProperty("SetInstructionBreakpointsResponse")
    private Object setInstructionBreakpointsResponse;
    /**
     * Arguments for `setVariable` request.
     * 
     */
    @JsonProperty("SetVariableArguments")
    @JsonPropertyDescription("Arguments for `setVariable` request.")
    private SetVariableArguments setVariableArguments;
    @JsonProperty("SetVariableRequest")
    private Object setVariableRequest;
    @JsonProperty("SetVariableResponse")
    private Object setVariableResponse;
    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("Source")
    @JsonPropertyDescription("A `Source` is a descriptor for source code.\nIt is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.")
    private Source source;
    /**
     * Arguments for `source` request.
     * 
     */
    @JsonProperty("SourceArguments")
    @JsonPropertyDescription("Arguments for `source` request.")
    private SourceArguments sourceArguments;
    /**
     * Properties of a breakpoint or logpoint passed to the `setBreakpoints` request.
     * 
     */
    @JsonProperty("SourceBreakpoint")
    @JsonPropertyDescription("Properties of a breakpoint or logpoint passed to the `setBreakpoints` request.")
    private SourceBreakpoint sourceBreakpoint;
    @JsonProperty("SourceRequest")
    private Object sourceRequest;
    @JsonProperty("SourceResponse")
    private Object sourceResponse;
    /**
     * A Stackframe contains the source location.
     * 
     */
    @JsonProperty("StackFrame")
    @JsonPropertyDescription("A Stackframe contains the source location.")
    private StackFrame stackFrame;
    @JsonProperty("StackFrameFormat")
    private Object stackFrameFormat;
    /**
     * Arguments for `stackTrace` request.
     * 
     */
    @JsonProperty("StackTraceArguments")
    @JsonPropertyDescription("Arguments for `stackTrace` request.")
    private StackTraceArguments stackTraceArguments;
    @JsonProperty("StackTraceRequest")
    private Object stackTraceRequest;
    @JsonProperty("StackTraceResponse")
    private Object stackTraceResponse;
    @JsonProperty("StartDebuggingRequest")
    private Object startDebuggingRequest;
    /**
     * Arguments for `startDebugging` request.
     * 
     */
    @JsonProperty("StartDebuggingRequestArguments")
    @JsonPropertyDescription("Arguments for `startDebugging` request.")
    private StartDebuggingRequestArguments startDebuggingRequestArguments;
    @JsonProperty("StartDebuggingResponse")
    private Object startDebuggingResponse;
    /**
     * Arguments for `stepBack` request.
     * 
     */
    @JsonProperty("StepBackArguments")
    @JsonPropertyDescription("Arguments for `stepBack` request.")
    private StepBackArguments stepBackArguments;
    @JsonProperty("StepBackRequest")
    private Object stepBackRequest;
    @JsonProperty("StepBackResponse")
    private Object stepBackResponse;
    /**
     * Arguments for `stepIn` request.
     * 
     */
    @JsonProperty("StepInArguments")
    @JsonPropertyDescription("Arguments for `stepIn` request.")
    private StepInArguments stepInArguments;
    @JsonProperty("StepInRequest")
    private Object stepInRequest;
    @JsonProperty("StepInResponse")
    private Object stepInResponse;
    /**
     * A `StepInTarget` can be used in the `stepIn` request and determines into which single target the `stepIn` request should step.
     * 
     */
    @JsonProperty("StepInTarget")
    @JsonPropertyDescription("A `StepInTarget` can be used in the `stepIn` request and determines into which single target the `stepIn` request should step.")
    private StepInTarget stepInTarget;
    /**
     * Arguments for `stepInTargets` request.
     * 
     */
    @JsonProperty("StepInTargetsArguments")
    @JsonPropertyDescription("Arguments for `stepInTargets` request.")
    private StepInTargetsArguments stepInTargetsArguments;
    @JsonProperty("StepInTargetsRequest")
    private Object stepInTargetsRequest;
    @JsonProperty("StepInTargetsResponse")
    private Object stepInTargetsResponse;
    /**
     * Arguments for `stepOut` request.
     * 
     */
    @JsonProperty("StepOutArguments")
    @JsonPropertyDescription("Arguments for `stepOut` request.")
    private StepOutArguments stepOutArguments;
    @JsonProperty("StepOutRequest")
    private Object stepOutRequest;
    @JsonProperty("StepOutResponse")
    private Object stepOutResponse;
    /**
     * The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.
     * 
     */
    @JsonProperty("SteppingGranularity")
    @JsonPropertyDescription("The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.")
    private NextArguments.SteppingGranularity steppingGranularity;
    @JsonProperty("StoppedEvent")
    private Object stoppedEvent;
    /**
     * Arguments for `terminate` request.
     * 
     */
    @JsonProperty("TerminateArguments")
    @JsonPropertyDescription("Arguments for `terminate` request.")
    private TerminateArguments terminateArguments;
    @JsonProperty("TerminateRequest")
    private Object terminateRequest;
    @JsonProperty("TerminateResponse")
    private Object terminateResponse;
    /**
     * Arguments for `terminateThreads` request.
     * 
     */
    @JsonProperty("TerminateThreadsArguments")
    @JsonPropertyDescription("Arguments for `terminateThreads` request.")
    private TerminateThreadsArguments terminateThreadsArguments;
    @JsonProperty("TerminateThreadsRequest")
    private Object terminateThreadsRequest;
    @JsonProperty("TerminateThreadsResponse")
    private Object terminateThreadsResponse;
    @JsonProperty("TerminatedEvent")
    private Object terminatedEvent;
    /**
     * A Thread
     * 
     */
    @JsonProperty("Thread")
    @JsonPropertyDescription("A Thread")
    private Thread thread;
    @JsonProperty("ThreadEvent")
    private Object threadEvent;
    @JsonProperty("ThreadsRequest")
    private Object threadsRequest;
    @JsonProperty("ThreadsResponse")
    private Object threadsResponse;
    /**
     * Provides formatting information for a value.
     * 
     */
    @JsonProperty("ValueFormat")
    @JsonPropertyDescription("Provides formatting information for a value.")
    private ValueFormat valueFormat;
    /**
     * A Variable is a name/value pair.
     * The `type` attribute is shown if space permits or when hovering over the variable's name.
     * The `kind` attribute is used to render additional properties of the variable, e.g. different icons can be used to indicate that a variable is public or private.
     * If the value is structured (has children), a handle is provided to retrieve the children with the `variables` request.
     * If the number of named or indexed children is large, the numbers should be returned via the `namedVariables` and `indexedVariables` attributes.
     * The client can use this information to present the children in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("Variable")
    @JsonPropertyDescription("A Variable is a name/value pair.\nThe `type` attribute is shown if space permits or when hovering over the variable's name.\nThe `kind` attribute is used to render additional properties of the variable, e.g. different icons can be used to indicate that a variable is public or private.\nIf the value is structured (has children), a handle is provided to retrieve the children with the `variables` request.\nIf the number of named or indexed children is large, the numbers should be returned via the `namedVariables` and `indexedVariables` attributes.\nThe client can use this information to present the children in a paged UI and fetch them in chunks.")
    private Variable variable;
    /**
     * Properties of a variable that can be used to determine how to render the variable in the UI.
     * 
     */
    @JsonProperty("VariablePresentationHint")
    @JsonPropertyDescription("Properties of a variable that can be used to determine how to render the variable in the UI.")
    private VariablePresentationHint variablePresentationHint;
    /**
     * Arguments for `variables` request.
     * 
     */
    @JsonProperty("VariablesArguments")
    @JsonPropertyDescription("Arguments for `variables` request.")
    private VariablesArguments variablesArguments;
    @JsonProperty("VariablesRequest")
    private Object variablesRequest;
    @JsonProperty("VariablesResponse")
    private Object variablesResponse;
    /**
     * Arguments for `writeMemory` request.
     * 
     */
    @JsonProperty("WriteMemoryArguments")
    @JsonPropertyDescription("Arguments for `writeMemory` request.")
    private WriteMemoryArguments writeMemoryArguments;
    @JsonProperty("WriteMemoryRequest")
    private Object writeMemoryRequest;
    @JsonProperty("WriteMemoryResponse")
    private Object writeMemoryResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("AttachRequest")
    public Object getAttachRequest() {
        return attachRequest;
    }

    @JsonProperty("AttachRequest")
    public void setAttachRequest(Object attachRequest) {
        this.attachRequest = attachRequest;
    }

    /**
     * Arguments for `attach` request. Additional attributes are implementation specific.
     * 
     */
    @JsonProperty("AttachRequestArguments")
    public AttachRequestArguments getAttachRequestArguments() {
        return attachRequestArguments;
    }

    /**
     * Arguments for `attach` request. Additional attributes are implementation specific.
     * 
     */
    @JsonProperty("AttachRequestArguments")
    public void setAttachRequestArguments(AttachRequestArguments attachRequestArguments) {
        this.attachRequestArguments = attachRequestArguments;
    }

    @JsonProperty("AttachResponse")
    public Object getAttachResponse() {
        return attachResponse;
    }

    @JsonProperty("AttachResponse")
    public void setAttachResponse(Object attachResponse) {
        this.attachResponse = attachResponse;
    }

    /**
     * Information about a breakpoint created in `setBreakpoints`, `setFunctionBreakpoints`, `setInstructionBreakpoints`, or `setDataBreakpoints` requests.
     * 
     */
    @JsonProperty("Breakpoint")
    public Breakpoint getBreakpoint() {
        return breakpoint;
    }

    /**
     * Information about a breakpoint created in `setBreakpoints`, `setFunctionBreakpoints`, `setInstructionBreakpoints`, or `setDataBreakpoints` requests.
     * 
     */
    @JsonProperty("Breakpoint")
    public void setBreakpoint(Breakpoint breakpoint) {
        this.breakpoint = breakpoint;
    }

    @JsonProperty("BreakpointEvent")
    public Object getBreakpointEvent() {
        return breakpointEvent;
    }

    @JsonProperty("BreakpointEvent")
    public void setBreakpointEvent(Object breakpointEvent) {
        this.breakpointEvent = breakpointEvent;
    }

    /**
     * Properties of a breakpoint location returned from the `breakpointLocations` request.
     * 
     */
    @JsonProperty("BreakpointLocation")
    public BreakpointLocation getBreakpointLocation() {
        return breakpointLocation;
    }

    /**
     * Properties of a breakpoint location returned from the `breakpointLocations` request.
     * 
     */
    @JsonProperty("BreakpointLocation")
    public void setBreakpointLocation(BreakpointLocation breakpointLocation) {
        this.breakpointLocation = breakpointLocation;
    }

    /**
     * Arguments for `breakpointLocations` request.
     * 
     */
    @JsonProperty("BreakpointLocationsArguments")
    public BreakpointLocationsArguments getBreakpointLocationsArguments() {
        return breakpointLocationsArguments;
    }

    /**
     * Arguments for `breakpointLocations` request.
     * 
     */
    @JsonProperty("BreakpointLocationsArguments")
    public void setBreakpointLocationsArguments(BreakpointLocationsArguments breakpointLocationsArguments) {
        this.breakpointLocationsArguments = breakpointLocationsArguments;
    }

    @JsonProperty("BreakpointLocationsRequest")
    public Object getBreakpointLocationsRequest() {
        return breakpointLocationsRequest;
    }

    @JsonProperty("BreakpointLocationsRequest")
    public void setBreakpointLocationsRequest(Object breakpointLocationsRequest) {
        this.breakpointLocationsRequest = breakpointLocationsRequest;
    }

    @JsonProperty("BreakpointLocationsResponse")
    public Object getBreakpointLocationsResponse() {
        return breakpointLocationsResponse;
    }

    @JsonProperty("BreakpointLocationsResponse")
    public void setBreakpointLocationsResponse(Object breakpointLocationsResponse) {
        this.breakpointLocationsResponse = breakpointLocationsResponse;
    }

    /**
     * Arguments for `cancel` request.
     * 
     */
    @JsonProperty("CancelArguments")
    public CancelArguments getCancelArguments() {
        return cancelArguments;
    }

    /**
     * Arguments for `cancel` request.
     * 
     */
    @JsonProperty("CancelArguments")
    public void setCancelArguments(CancelArguments cancelArguments) {
        this.cancelArguments = cancelArguments;
    }

    @JsonProperty("CancelRequest")
    public Object getCancelRequest() {
        return cancelRequest;
    }

    @JsonProperty("CancelRequest")
    public void setCancelRequest(Object cancelRequest) {
        this.cancelRequest = cancelRequest;
    }

    @JsonProperty("CancelResponse")
    public Object getCancelResponse() {
        return cancelResponse;
    }

    @JsonProperty("CancelResponse")
    public void setCancelResponse(Object cancelResponse) {
        this.cancelResponse = cancelResponse;
    }

    /**
     * Types
     * <p>
     * Information about the capabilities of a debug adapter.
     * 
     */
    @JsonProperty("Capabilities")
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Types
     * <p>
     * Information about the capabilities of a debug adapter.
     * 
     */
    @JsonProperty("Capabilities")
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    @JsonProperty("CapabilitiesEvent")
    public Object getCapabilitiesEvent() {
        return capabilitiesEvent;
    }

    @JsonProperty("CapabilitiesEvent")
    public void setCapabilitiesEvent(Object capabilitiesEvent) {
        this.capabilitiesEvent = capabilitiesEvent;
    }

    /**
     * The checksum of an item calculated by the specified algorithm.
     * 
     */
    @JsonProperty("Checksum")
    public Checksum getChecksum() {
        return checksum;
    }

    /**
     * The checksum of an item calculated by the specified algorithm.
     * 
     */
    @JsonProperty("Checksum")
    public void setChecksum(Checksum checksum) {
        this.checksum = checksum;
    }

    /**
     * Names of checksum algorithms that may be supported by a debug adapter.
     * 
     */
    @JsonProperty("ChecksumAlgorithm")
    public Checksum.ChecksumAlgorithm getChecksumAlgorithm() {
        return checksumAlgorithm;
    }

    /**
     * Names of checksum algorithms that may be supported by a debug adapter.
     * 
     */
    @JsonProperty("ChecksumAlgorithm")
    public void setChecksumAlgorithm(Checksum.ChecksumAlgorithm checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm;
    }

    /**
     * A `ColumnDescriptor` specifies what module attribute to show in a column of the modules view, how to format it,
     * and what the column's label should be.
     * It is only used if the underlying UI actually supports this level of customization.
     * 
     */
    @JsonProperty("ColumnDescriptor")
    public ColumnDescriptor getColumnDescriptor() {
        return columnDescriptor;
    }

    /**
     * A `ColumnDescriptor` specifies what module attribute to show in a column of the modules view, how to format it,
     * and what the column's label should be.
     * It is only used if the underlying UI actually supports this level of customization.
     * 
     */
    @JsonProperty("ColumnDescriptor")
    public void setColumnDescriptor(ColumnDescriptor columnDescriptor) {
        this.columnDescriptor = columnDescriptor;
    }

    /**
     * `CompletionItems` are the suggestions returned from the `completions` request.
     * 
     */
    @JsonProperty("CompletionItem")
    public CompletionItem getCompletionItem() {
        return completionItem;
    }

    /**
     * `CompletionItems` are the suggestions returned from the `completions` request.
     * 
     */
    @JsonProperty("CompletionItem")
    public void setCompletionItem(CompletionItem completionItem) {
        this.completionItem = completionItem;
    }

    /**
     * Some predefined types for the CompletionItem. Please note that not all clients have specific icons for all of them.
     * 
     */
    @JsonProperty("CompletionItemType")
    public CompletionItem.CompletionItemType getCompletionItemType() {
        return completionItemType;
    }

    /**
     * Some predefined types for the CompletionItem. Please note that not all clients have specific icons for all of them.
     * 
     */
    @JsonProperty("CompletionItemType")
    public void setCompletionItemType(CompletionItem.CompletionItemType completionItemType) {
        this.completionItemType = completionItemType;
    }

    /**
     * Arguments for `completions` request.
     * 
     */
    @JsonProperty("CompletionsArguments")
    public CompletionsArguments getCompletionsArguments() {
        return completionsArguments;
    }

    /**
     * Arguments for `completions` request.
     * 
     */
    @JsonProperty("CompletionsArguments")
    public void setCompletionsArguments(CompletionsArguments completionsArguments) {
        this.completionsArguments = completionsArguments;
    }

    @JsonProperty("CompletionsRequest")
    public Object getCompletionsRequest() {
        return completionsRequest;
    }

    @JsonProperty("CompletionsRequest")
    public void setCompletionsRequest(Object completionsRequest) {
        this.completionsRequest = completionsRequest;
    }

    @JsonProperty("CompletionsResponse")
    public Object getCompletionsResponse() {
        return completionsResponse;
    }

    @JsonProperty("CompletionsResponse")
    public void setCompletionsResponse(Object completionsResponse) {
        this.completionsResponse = completionsResponse;
    }

    /**
     * Arguments for `configurationDone` request.
     * 
     */
    @JsonProperty("ConfigurationDoneArguments")
    public ConfigurationDoneArguments getConfigurationDoneArguments() {
        return configurationDoneArguments;
    }

    /**
     * Arguments for `configurationDone` request.
     * 
     */
    @JsonProperty("ConfigurationDoneArguments")
    public void setConfigurationDoneArguments(ConfigurationDoneArguments configurationDoneArguments) {
        this.configurationDoneArguments = configurationDoneArguments;
    }

    @JsonProperty("ConfigurationDoneRequest")
    public Object getConfigurationDoneRequest() {
        return configurationDoneRequest;
    }

    @JsonProperty("ConfigurationDoneRequest")
    public void setConfigurationDoneRequest(Object configurationDoneRequest) {
        this.configurationDoneRequest = configurationDoneRequest;
    }

    @JsonProperty("ConfigurationDoneResponse")
    public Object getConfigurationDoneResponse() {
        return configurationDoneResponse;
    }

    @JsonProperty("ConfigurationDoneResponse")
    public void setConfigurationDoneResponse(Object configurationDoneResponse) {
        this.configurationDoneResponse = configurationDoneResponse;
    }

    /**
     * Arguments for `continue` request.
     * 
     */
    @JsonProperty("ContinueArguments")
    public ContinueArguments getContinueArguments() {
        return continueArguments;
    }

    /**
     * Arguments for `continue` request.
     * 
     */
    @JsonProperty("ContinueArguments")
    public void setContinueArguments(ContinueArguments continueArguments) {
        this.continueArguments = continueArguments;
    }

    @JsonProperty("ContinueRequest")
    public Object getContinueRequest() {
        return continueRequest;
    }

    @JsonProperty("ContinueRequest")
    public void setContinueRequest(Object continueRequest) {
        this.continueRequest = continueRequest;
    }

    @JsonProperty("ContinueResponse")
    public Object getContinueResponse() {
        return continueResponse;
    }

    @JsonProperty("ContinueResponse")
    public void setContinueResponse(Object continueResponse) {
        this.continueResponse = continueResponse;
    }

    @JsonProperty("ContinuedEvent")
    public Object getContinuedEvent() {
        return continuedEvent;
    }

    @JsonProperty("ContinuedEvent")
    public void setContinuedEvent(Object continuedEvent) {
        this.continuedEvent = continuedEvent;
    }

    /**
     * Properties of a data breakpoint passed to the `setDataBreakpoints` request.
     * 
     */
    @JsonProperty("DataBreakpoint")
    public DataBreakpoint getDataBreakpoint() {
        return dataBreakpoint;
    }

    /**
     * Properties of a data breakpoint passed to the `setDataBreakpoints` request.
     * 
     */
    @JsonProperty("DataBreakpoint")
    public void setDataBreakpoint(DataBreakpoint dataBreakpoint) {
        this.dataBreakpoint = dataBreakpoint;
    }

    /**
     * This enumeration defines all possible access types for data breakpoints.
     * 
     */
    @JsonProperty("DataBreakpointAccessType")
    public DataBreakpoint.DataBreakpointAccessType getDataBreakpointAccessType() {
        return dataBreakpointAccessType;
    }

    /**
     * This enumeration defines all possible access types for data breakpoints.
     * 
     */
    @JsonProperty("DataBreakpointAccessType")
    public void setDataBreakpointAccessType(DataBreakpoint.DataBreakpointAccessType dataBreakpointAccessType) {
        this.dataBreakpointAccessType = dataBreakpointAccessType;
    }

    /**
     * Arguments for `dataBreakpointInfo` request.
     * 
     */
    @JsonProperty("DataBreakpointInfoArguments")
    public DataBreakpointInfoArguments getDataBreakpointInfoArguments() {
        return dataBreakpointInfoArguments;
    }

    /**
     * Arguments for `dataBreakpointInfo` request.
     * 
     */
    @JsonProperty("DataBreakpointInfoArguments")
    public void setDataBreakpointInfoArguments(DataBreakpointInfoArguments dataBreakpointInfoArguments) {
        this.dataBreakpointInfoArguments = dataBreakpointInfoArguments;
    }

    @JsonProperty("DataBreakpointInfoRequest")
    public Object getDataBreakpointInfoRequest() {
        return dataBreakpointInfoRequest;
    }

    @JsonProperty("DataBreakpointInfoRequest")
    public void setDataBreakpointInfoRequest(Object dataBreakpointInfoRequest) {
        this.dataBreakpointInfoRequest = dataBreakpointInfoRequest;
    }

    @JsonProperty("DataBreakpointInfoResponse")
    public Object getDataBreakpointInfoResponse() {
        return dataBreakpointInfoResponse;
    }

    @JsonProperty("DataBreakpointInfoResponse")
    public void setDataBreakpointInfoResponse(Object dataBreakpointInfoResponse) {
        this.dataBreakpointInfoResponse = dataBreakpointInfoResponse;
    }

    /**
     * Arguments for `disassemble` request.
     * 
     */
    @JsonProperty("DisassembleArguments")
    public DisassembleArguments getDisassembleArguments() {
        return disassembleArguments;
    }

    /**
     * Arguments for `disassemble` request.
     * 
     */
    @JsonProperty("DisassembleArguments")
    public void setDisassembleArguments(DisassembleArguments disassembleArguments) {
        this.disassembleArguments = disassembleArguments;
    }

    @JsonProperty("DisassembleRequest")
    public Object getDisassembleRequest() {
        return disassembleRequest;
    }

    @JsonProperty("DisassembleRequest")
    public void setDisassembleRequest(Object disassembleRequest) {
        this.disassembleRequest = disassembleRequest;
    }

    @JsonProperty("DisassembleResponse")
    public Object getDisassembleResponse() {
        return disassembleResponse;
    }

    @JsonProperty("DisassembleResponse")
    public void setDisassembleResponse(Object disassembleResponse) {
        this.disassembleResponse = disassembleResponse;
    }

    /**
     * Represents a single disassembled instruction.
     * 
     */
    @JsonProperty("DisassembledInstruction")
    public DisassembledInstruction getDisassembledInstruction() {
        return disassembledInstruction;
    }

    /**
     * Represents a single disassembled instruction.
     * 
     */
    @JsonProperty("DisassembledInstruction")
    public void setDisassembledInstruction(DisassembledInstruction disassembledInstruction) {
        this.disassembledInstruction = disassembledInstruction;
    }

    /**
     * Arguments for `disconnect` request.
     * 
     */
    @JsonProperty("DisconnectArguments")
    public DisconnectArguments getDisconnectArguments() {
        return disconnectArguments;
    }

    /**
     * Arguments for `disconnect` request.
     * 
     */
    @JsonProperty("DisconnectArguments")
    public void setDisconnectArguments(DisconnectArguments disconnectArguments) {
        this.disconnectArguments = disconnectArguments;
    }

    @JsonProperty("DisconnectRequest")
    public Object getDisconnectRequest() {
        return disconnectRequest;
    }

    @JsonProperty("DisconnectRequest")
    public void setDisconnectRequest(Object disconnectRequest) {
        this.disconnectRequest = disconnectRequest;
    }

    @JsonProperty("DisconnectResponse")
    public Object getDisconnectResponse() {
        return disconnectResponse;
    }

    @JsonProperty("DisconnectResponse")
    public void setDisconnectResponse(Object disconnectResponse) {
        this.disconnectResponse = disconnectResponse;
    }

    @JsonProperty("ErrorResponse")
    public Object getErrorResponse() {
        return errorResponse;
    }

    @JsonProperty("ErrorResponse")
    public void setErrorResponse(Object errorResponse) {
        this.errorResponse = errorResponse;
    }

    /**
     * Arguments for `evaluate` request.
     * 
     */
    @JsonProperty("EvaluateArguments")
    public EvaluateArguments getEvaluateArguments() {
        return evaluateArguments;
    }

    /**
     * Arguments for `evaluate` request.
     * 
     */
    @JsonProperty("EvaluateArguments")
    public void setEvaluateArguments(EvaluateArguments evaluateArguments) {
        this.evaluateArguments = evaluateArguments;
    }

    @JsonProperty("EvaluateRequest")
    public Object getEvaluateRequest() {
        return evaluateRequest;
    }

    @JsonProperty("EvaluateRequest")
    public void setEvaluateRequest(Object evaluateRequest) {
        this.evaluateRequest = evaluateRequest;
    }

    @JsonProperty("EvaluateResponse")
    public Object getEvaluateResponse() {
        return evaluateResponse;
    }

    @JsonProperty("EvaluateResponse")
    public void setEvaluateResponse(Object evaluateResponse) {
        this.evaluateResponse = evaluateResponse;
    }

    @JsonProperty("Event")
    public Object getEvent() {
        return event;
    }

    @JsonProperty("Event")
    public void setEvent(Object event) {
        this.event = event;
    }

    /**
     * This enumeration defines all possible conditions when a thrown exception should result in a break.
     * never: never breaks,
     * always: always breaks,
     * unhandled: breaks when exception unhandled,
     * userUnhandled: breaks if the exception is not handled by user code.
     * 
     */
    @JsonProperty("ExceptionBreakMode")
    public ExceptionBreakMode getExceptionBreakMode() {
        return exceptionBreakMode;
    }

    /**
     * This enumeration defines all possible conditions when a thrown exception should result in a break.
     * never: never breaks,
     * always: always breaks,
     * unhandled: breaks when exception unhandled,
     * userUnhandled: breaks if the exception is not handled by user code.
     * 
     */
    @JsonProperty("ExceptionBreakMode")
    public void setExceptionBreakMode(ExceptionBreakMode exceptionBreakMode) {
        this.exceptionBreakMode = exceptionBreakMode;
    }

    /**
     * An `ExceptionBreakpointsFilter` is shown in the UI as an filter option for configuring how exceptions are dealt with.
     * 
     */
    @JsonProperty("ExceptionBreakpointsFilter")
    public ExceptionBreakpointsFilter getExceptionBreakpointsFilter() {
        return exceptionBreakpointsFilter;
    }

    /**
     * An `ExceptionBreakpointsFilter` is shown in the UI as an filter option for configuring how exceptions are dealt with.
     * 
     */
    @JsonProperty("ExceptionBreakpointsFilter")
    public void setExceptionBreakpointsFilter(ExceptionBreakpointsFilter exceptionBreakpointsFilter) {
        this.exceptionBreakpointsFilter = exceptionBreakpointsFilter;
    }

    /**
     * Detailed information about an exception that has occurred.
     * 
     */
    @JsonProperty("ExceptionDetails")
    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }

    /**
     * Detailed information about an exception that has occurred.
     * 
     */
    @JsonProperty("ExceptionDetails")
    public void setExceptionDetails(ExceptionDetails exceptionDetails) {
        this.exceptionDetails = exceptionDetails;
    }

    /**
     * An `ExceptionFilterOptions` is used to specify an exception filter together with a condition for the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("ExceptionFilterOptions")
    public ExceptionFilterOptions getExceptionFilterOptions() {
        return exceptionFilterOptions;
    }

    /**
     * An `ExceptionFilterOptions` is used to specify an exception filter together with a condition for the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("ExceptionFilterOptions")
    public void setExceptionFilterOptions(ExceptionFilterOptions exceptionFilterOptions) {
        this.exceptionFilterOptions = exceptionFilterOptions;
    }

    /**
     * Arguments for `exceptionInfo` request.
     * 
     */
    @JsonProperty("ExceptionInfoArguments")
    public ExceptionInfoArguments getExceptionInfoArguments() {
        return exceptionInfoArguments;
    }

    /**
     * Arguments for `exceptionInfo` request.
     * 
     */
    @JsonProperty("ExceptionInfoArguments")
    public void setExceptionInfoArguments(ExceptionInfoArguments exceptionInfoArguments) {
        this.exceptionInfoArguments = exceptionInfoArguments;
    }

    @JsonProperty("ExceptionInfoRequest")
    public Object getExceptionInfoRequest() {
        return exceptionInfoRequest;
    }

    @JsonProperty("ExceptionInfoRequest")
    public void setExceptionInfoRequest(Object exceptionInfoRequest) {
        this.exceptionInfoRequest = exceptionInfoRequest;
    }

    @JsonProperty("ExceptionInfoResponse")
    public Object getExceptionInfoResponse() {
        return exceptionInfoResponse;
    }

    @JsonProperty("ExceptionInfoResponse")
    public void setExceptionInfoResponse(Object exceptionInfoResponse) {
        this.exceptionInfoResponse = exceptionInfoResponse;
    }

    /**
     * An `ExceptionOptions` assigns configuration options to a set of exceptions.
     * 
     */
    @JsonProperty("ExceptionOptions")
    public ExceptionOptions getExceptionOptions() {
        return exceptionOptions;
    }

    /**
     * An `ExceptionOptions` assigns configuration options to a set of exceptions.
     * 
     */
    @JsonProperty("ExceptionOptions")
    public void setExceptionOptions(ExceptionOptions exceptionOptions) {
        this.exceptionOptions = exceptionOptions;
    }

    /**
     * An `ExceptionPathSegment` represents a segment in a path that is used to match leafs or nodes in a tree of exceptions.
     * If a segment consists of more than one name, it matches the names provided if `negate` is false or missing, or it matches anything except the names provided if `negate` is true.
     * 
     */
    @JsonProperty("ExceptionPathSegment")
    public ExceptionPathSegment getExceptionPathSegment() {
        return exceptionPathSegment;
    }

    /**
     * An `ExceptionPathSegment` represents a segment in a path that is used to match leafs or nodes in a tree of exceptions.
     * If a segment consists of more than one name, it matches the names provided if `negate` is false or missing, or it matches anything except the names provided if `negate` is true.
     * 
     */
    @JsonProperty("ExceptionPathSegment")
    public void setExceptionPathSegment(ExceptionPathSegment exceptionPathSegment) {
        this.exceptionPathSegment = exceptionPathSegment;
    }

    @JsonProperty("ExitedEvent")
    public Object getExitedEvent() {
        return exitedEvent;
    }

    @JsonProperty("ExitedEvent")
    public void setExitedEvent(Object exitedEvent) {
        this.exitedEvent = exitedEvent;
    }

    /**
     * Properties of a breakpoint passed to the `setFunctionBreakpoints` request.
     * 
     */
    @JsonProperty("FunctionBreakpoint")
    public FunctionBreakpoint getFunctionBreakpoint() {
        return functionBreakpoint;
    }

    /**
     * Properties of a breakpoint passed to the `setFunctionBreakpoints` request.
     * 
     */
    @JsonProperty("FunctionBreakpoint")
    public void setFunctionBreakpoint(FunctionBreakpoint functionBreakpoint) {
        this.functionBreakpoint = functionBreakpoint;
    }

    /**
     * Arguments for `goto` request.
     * 
     */
    @JsonProperty("GotoArguments")
    public GotoArguments getGotoArguments() {
        return gotoArguments;
    }

    /**
     * Arguments for `goto` request.
     * 
     */
    @JsonProperty("GotoArguments")
    public void setGotoArguments(GotoArguments gotoArguments) {
        this.gotoArguments = gotoArguments;
    }

    @JsonProperty("GotoRequest")
    public Object getGotoRequest() {
        return gotoRequest;
    }

    @JsonProperty("GotoRequest")
    public void setGotoRequest(Object gotoRequest) {
        this.gotoRequest = gotoRequest;
    }

    @JsonProperty("GotoResponse")
    public Object getGotoResponse() {
        return gotoResponse;
    }

    @JsonProperty("GotoResponse")
    public void setGotoResponse(Object gotoResponse) {
        this.gotoResponse = gotoResponse;
    }

    /**
     * A `GotoTarget` describes a code location that can be used as a target in the `goto` request.
     * The possible goto targets can be determined via the `gotoTargets` request.
     * 
     */
    @JsonProperty("GotoTarget")
    public GotoTarget getGotoTarget() {
        return gotoTarget;
    }

    /**
     * A `GotoTarget` describes a code location that can be used as a target in the `goto` request.
     * The possible goto targets can be determined via the `gotoTargets` request.
     * 
     */
    @JsonProperty("GotoTarget")
    public void setGotoTarget(GotoTarget gotoTarget) {
        this.gotoTarget = gotoTarget;
    }

    /**
     * Arguments for `gotoTargets` request.
     * 
     */
    @JsonProperty("GotoTargetsArguments")
    public GotoTargetsArguments getGotoTargetsArguments() {
        return gotoTargetsArguments;
    }

    /**
     * Arguments for `gotoTargets` request.
     * 
     */
    @JsonProperty("GotoTargetsArguments")
    public void setGotoTargetsArguments(GotoTargetsArguments gotoTargetsArguments) {
        this.gotoTargetsArguments = gotoTargetsArguments;
    }

    @JsonProperty("GotoTargetsRequest")
    public Object getGotoTargetsRequest() {
        return gotoTargetsRequest;
    }

    @JsonProperty("GotoTargetsRequest")
    public void setGotoTargetsRequest(Object gotoTargetsRequest) {
        this.gotoTargetsRequest = gotoTargetsRequest;
    }

    @JsonProperty("GotoTargetsResponse")
    public Object getGotoTargetsResponse() {
        return gotoTargetsResponse;
    }

    @JsonProperty("GotoTargetsResponse")
    public void setGotoTargetsResponse(Object gotoTargetsResponse) {
        this.gotoTargetsResponse = gotoTargetsResponse;
    }

    @JsonProperty("InitializeRequest")
    public Object getInitializeRequest() {
        return initializeRequest;
    }

    @JsonProperty("InitializeRequest")
    public void setInitializeRequest(Object initializeRequest) {
        this.initializeRequest = initializeRequest;
    }

    /**
     * Arguments for `initialize` request.
     * 
     */
    @JsonProperty("InitializeRequestArguments")
    public InitializeRequestArguments getInitializeRequestArguments() {
        return initializeRequestArguments;
    }

    /**
     * Arguments for `initialize` request.
     * 
     */
    @JsonProperty("InitializeRequestArguments")
    public void setInitializeRequestArguments(InitializeRequestArguments initializeRequestArguments) {
        this.initializeRequestArguments = initializeRequestArguments;
    }

    @JsonProperty("InitializeResponse")
    public Object getInitializeResponse() {
        return initializeResponse;
    }

    @JsonProperty("InitializeResponse")
    public void setInitializeResponse(Object initializeResponse) {
        this.initializeResponse = initializeResponse;
    }

    @JsonProperty("InitializedEvent")
    public Object getInitializedEvent() {
        return initializedEvent;
    }

    @JsonProperty("InitializedEvent")
    public void setInitializedEvent(Object initializedEvent) {
        this.initializedEvent = initializedEvent;
    }

    /**
     * Properties of a breakpoint passed to the `setInstructionBreakpoints` request
     * 
     */
    @JsonProperty("InstructionBreakpoint")
    public InstructionBreakpoint getInstructionBreakpoint() {
        return instructionBreakpoint;
    }

    /**
     * Properties of a breakpoint passed to the `setInstructionBreakpoints` request
     * 
     */
    @JsonProperty("InstructionBreakpoint")
    public void setInstructionBreakpoint(InstructionBreakpoint instructionBreakpoint) {
        this.instructionBreakpoint = instructionBreakpoint;
    }

    /**
     * Logical areas that can be invalidated by the `invalidated` event.
     * 
     */
    @JsonProperty("InvalidatedAreas")
    public String getInvalidatedAreas() {
        return invalidatedAreas;
    }

    /**
     * Logical areas that can be invalidated by the `invalidated` event.
     * 
     */
    @JsonProperty("InvalidatedAreas")
    public void setInvalidatedAreas(String invalidatedAreas) {
        this.invalidatedAreas = invalidatedAreas;
    }

    @JsonProperty("InvalidatedEvent")
    public Object getInvalidatedEvent() {
        return invalidatedEvent;
    }

    @JsonProperty("InvalidatedEvent")
    public void setInvalidatedEvent(Object invalidatedEvent) {
        this.invalidatedEvent = invalidatedEvent;
    }

    @JsonProperty("LaunchRequest")
    public Object getLaunchRequest() {
        return launchRequest;
    }

    @JsonProperty("LaunchRequest")
    public void setLaunchRequest(Object launchRequest) {
        this.launchRequest = launchRequest;
    }

    /**
     * Arguments for `launch` request. Additional attributes are implementation specific.
     * 
     */
    @JsonProperty("LaunchRequestArguments")
    public LaunchRequestArguments getLaunchRequestArguments() {
        return launchRequestArguments;
    }

    /**
     * Arguments for `launch` request. Additional attributes are implementation specific.
     * 
     */
    @JsonProperty("LaunchRequestArguments")
    public void setLaunchRequestArguments(LaunchRequestArguments launchRequestArguments) {
        this.launchRequestArguments = launchRequestArguments;
    }

    @JsonProperty("LaunchResponse")
    public Object getLaunchResponse() {
        return launchResponse;
    }

    @JsonProperty("LaunchResponse")
    public void setLaunchResponse(Object launchResponse) {
        this.launchResponse = launchResponse;
    }

    @JsonProperty("LoadedSourceEvent")
    public Object getLoadedSourceEvent() {
        return loadedSourceEvent;
    }

    @JsonProperty("LoadedSourceEvent")
    public void setLoadedSourceEvent(Object loadedSourceEvent) {
        this.loadedSourceEvent = loadedSourceEvent;
    }

    /**
     * Arguments for `loadedSources` request.
     * 
     */
    @JsonProperty("LoadedSourcesArguments")
    public LoadedSourcesArguments getLoadedSourcesArguments() {
        return loadedSourcesArguments;
    }

    /**
     * Arguments for `loadedSources` request.
     * 
     */
    @JsonProperty("LoadedSourcesArguments")
    public void setLoadedSourcesArguments(LoadedSourcesArguments loadedSourcesArguments) {
        this.loadedSourcesArguments = loadedSourcesArguments;
    }

    @JsonProperty("LoadedSourcesRequest")
    public Object getLoadedSourcesRequest() {
        return loadedSourcesRequest;
    }

    @JsonProperty("LoadedSourcesRequest")
    public void setLoadedSourcesRequest(Object loadedSourcesRequest) {
        this.loadedSourcesRequest = loadedSourcesRequest;
    }

    @JsonProperty("LoadedSourcesResponse")
    public Object getLoadedSourcesResponse() {
        return loadedSourcesResponse;
    }

    @JsonProperty("LoadedSourcesResponse")
    public void setLoadedSourcesResponse(Object loadedSourcesResponse) {
        this.loadedSourcesResponse = loadedSourcesResponse;
    }

    @JsonProperty("MemoryEvent")
    public Object getMemoryEvent() {
        return memoryEvent;
    }

    @JsonProperty("MemoryEvent")
    public void setMemoryEvent(Object memoryEvent) {
        this.memoryEvent = memoryEvent;
    }

    /**
     * A structured message object. Used to return errors from requests.
     * 
     */
    @JsonProperty("Message")
    public Message getMessage() {
        return message;
    }

    /**
     * A structured message object. Used to return errors from requests.
     * 
     */
    @JsonProperty("Message")
    public void setMessage(Message message) {
        this.message = message;
    }

    /**
     * A Module object represents a row in the modules view.
     * The `id` attribute identifies a module in the modules view and is used in a `module` event for identifying a module for adding, updating or deleting.
     * The `name` attribute is used to minimally render the module in the UI.
     * 
     * Additional attributes can be added to the module. They show up in the module view if they have a corresponding `ColumnDescriptor`.
     * 
     * To avoid an unnecessary proliferation of additional attributes with similar semantics but different names, we recommend to re-use attributes from the 'recommended' list below first, and only introduce new attributes if nothing appropriate could be found.
     * 
     */
    @JsonProperty("Module")
    public Module getModule() {
        return module;
    }

    /**
     * A Module object represents a row in the modules view.
     * The `id` attribute identifies a module in the modules view and is used in a `module` event for identifying a module for adding, updating or deleting.
     * The `name` attribute is used to minimally render the module in the UI.
     * 
     * Additional attributes can be added to the module. They show up in the module view if they have a corresponding `ColumnDescriptor`.
     * 
     * To avoid an unnecessary proliferation of additional attributes with similar semantics but different names, we recommend to re-use attributes from the 'recommended' list below first, and only introduce new attributes if nothing appropriate could be found.
     * 
     */
    @JsonProperty("Module")
    public void setModule(Module module) {
        this.module = module;
    }

    @JsonProperty("ModuleEvent")
    public Object getModuleEvent() {
        return moduleEvent;
    }

    @JsonProperty("ModuleEvent")
    public void setModuleEvent(Object moduleEvent) {
        this.moduleEvent = moduleEvent;
    }

    /**
     * Arguments for `modules` request.
     * 
     */
    @JsonProperty("ModulesArguments")
    public ModulesArguments getModulesArguments() {
        return modulesArguments;
    }

    /**
     * Arguments for `modules` request.
     * 
     */
    @JsonProperty("ModulesArguments")
    public void setModulesArguments(ModulesArguments modulesArguments) {
        this.modulesArguments = modulesArguments;
    }

    @JsonProperty("ModulesRequest")
    public Object getModulesRequest() {
        return modulesRequest;
    }

    @JsonProperty("ModulesRequest")
    public void setModulesRequest(Object modulesRequest) {
        this.modulesRequest = modulesRequest;
    }

    @JsonProperty("ModulesResponse")
    public Object getModulesResponse() {
        return modulesResponse;
    }

    @JsonProperty("ModulesResponse")
    public void setModulesResponse(Object modulesResponse) {
        this.modulesResponse = modulesResponse;
    }

    /**
     * Arguments for `next` request.
     * 
     */
    @JsonProperty("NextArguments")
    public NextArguments getNextArguments() {
        return nextArguments;
    }

    /**
     * Arguments for `next` request.
     * 
     */
    @JsonProperty("NextArguments")
    public void setNextArguments(NextArguments nextArguments) {
        this.nextArguments = nextArguments;
    }

    @JsonProperty("NextRequest")
    public Object getNextRequest() {
        return nextRequest;
    }

    @JsonProperty("NextRequest")
    public void setNextRequest(Object nextRequest) {
        this.nextRequest = nextRequest;
    }

    @JsonProperty("NextResponse")
    public Object getNextResponse() {
        return nextResponse;
    }

    @JsonProperty("NextResponse")
    public void setNextResponse(Object nextResponse) {
        this.nextResponse = nextResponse;
    }

    @JsonProperty("OutputEvent")
    public Object getOutputEvent() {
        return outputEvent;
    }

    @JsonProperty("OutputEvent")
    public void setOutputEvent(Object outputEvent) {
        this.outputEvent = outputEvent;
    }

    /**
     * Arguments for `pause` request.
     * 
     */
    @JsonProperty("PauseArguments")
    public PauseArguments getPauseArguments() {
        return pauseArguments;
    }

    /**
     * Arguments for `pause` request.
     * 
     */
    @JsonProperty("PauseArguments")
    public void setPauseArguments(PauseArguments pauseArguments) {
        this.pauseArguments = pauseArguments;
    }

    @JsonProperty("PauseRequest")
    public Object getPauseRequest() {
        return pauseRequest;
    }

    @JsonProperty("PauseRequest")
    public void setPauseRequest(Object pauseRequest) {
        this.pauseRequest = pauseRequest;
    }

    @JsonProperty("PauseResponse")
    public Object getPauseResponse() {
        return pauseResponse;
    }

    @JsonProperty("PauseResponse")
    public void setPauseResponse(Object pauseResponse) {
        this.pauseResponse = pauseResponse;
    }

    @JsonProperty("ProcessEvent")
    public Object getProcessEvent() {
        return processEvent;
    }

    @JsonProperty("ProcessEvent")
    public void setProcessEvent(Object processEvent) {
        this.processEvent = processEvent;
    }

    @JsonProperty("ProgressEndEvent")
    public Object getProgressEndEvent() {
        return progressEndEvent;
    }

    @JsonProperty("ProgressEndEvent")
    public void setProgressEndEvent(Object progressEndEvent) {
        this.progressEndEvent = progressEndEvent;
    }

    @JsonProperty("ProgressStartEvent")
    public Object getProgressStartEvent() {
        return progressStartEvent;
    }

    @JsonProperty("ProgressStartEvent")
    public void setProgressStartEvent(Object progressStartEvent) {
        this.progressStartEvent = progressStartEvent;
    }

    @JsonProperty("ProgressUpdateEvent")
    public Object getProgressUpdateEvent() {
        return progressUpdateEvent;
    }

    @JsonProperty("ProgressUpdateEvent")
    public void setProgressUpdateEvent(Object progressUpdateEvent) {
        this.progressUpdateEvent = progressUpdateEvent;
    }

    /**
     * Base Protocol
     * <p>
     * Base class of requests, responses, and events.
     * 
     */
    @JsonProperty("ProtocolMessage")
    public ProtocolMessage getProtocolMessage() {
        return protocolMessage;
    }

    /**
     * Base Protocol
     * <p>
     * Base class of requests, responses, and events.
     * 
     */
    @JsonProperty("ProtocolMessage")
    public void setProtocolMessage(ProtocolMessage protocolMessage) {
        this.protocolMessage = protocolMessage;
    }

    /**
     * Arguments for `readMemory` request.
     * 
     */
    @JsonProperty("ReadMemoryArguments")
    public ReadMemoryArguments getReadMemoryArguments() {
        return readMemoryArguments;
    }

    /**
     * Arguments for `readMemory` request.
     * 
     */
    @JsonProperty("ReadMemoryArguments")
    public void setReadMemoryArguments(ReadMemoryArguments readMemoryArguments) {
        this.readMemoryArguments = readMemoryArguments;
    }

    @JsonProperty("ReadMemoryRequest")
    public Object getReadMemoryRequest() {
        return readMemoryRequest;
    }

    @JsonProperty("ReadMemoryRequest")
    public void setReadMemoryRequest(Object readMemoryRequest) {
        this.readMemoryRequest = readMemoryRequest;
    }

    @JsonProperty("ReadMemoryResponse")
    public Object getReadMemoryResponse() {
        return readMemoryResponse;
    }

    @JsonProperty("ReadMemoryResponse")
    public void setReadMemoryResponse(Object readMemoryResponse) {
        this.readMemoryResponse = readMemoryResponse;
    }

    @JsonProperty("Request")
    public Object getRequest() {
        return request;
    }

    @JsonProperty("Request")
    public void setRequest(Object request) {
        this.request = request;
    }

    @JsonProperty("Response")
    public Object getResponse() {
        return response;
    }

    @JsonProperty("Response")
    public void setResponse(Object response) {
        this.response = response;
    }

    /**
     * Arguments for `restart` request.
     * 
     */
    @JsonProperty("RestartArguments")
    public RestartArguments getRestartArguments() {
        return restartArguments;
    }

    /**
     * Arguments for `restart` request.
     * 
     */
    @JsonProperty("RestartArguments")
    public void setRestartArguments(RestartArguments restartArguments) {
        this.restartArguments = restartArguments;
    }

    /**
     * Arguments for `restartFrame` request.
     * 
     */
    @JsonProperty("RestartFrameArguments")
    public RestartFrameArguments getRestartFrameArguments() {
        return restartFrameArguments;
    }

    /**
     * Arguments for `restartFrame` request.
     * 
     */
    @JsonProperty("RestartFrameArguments")
    public void setRestartFrameArguments(RestartFrameArguments restartFrameArguments) {
        this.restartFrameArguments = restartFrameArguments;
    }

    @JsonProperty("RestartFrameRequest")
    public Object getRestartFrameRequest() {
        return restartFrameRequest;
    }

    @JsonProperty("RestartFrameRequest")
    public void setRestartFrameRequest(Object restartFrameRequest) {
        this.restartFrameRequest = restartFrameRequest;
    }

    @JsonProperty("RestartFrameResponse")
    public Object getRestartFrameResponse() {
        return restartFrameResponse;
    }

    @JsonProperty("RestartFrameResponse")
    public void setRestartFrameResponse(Object restartFrameResponse) {
        this.restartFrameResponse = restartFrameResponse;
    }

    @JsonProperty("RestartRequest")
    public Object getRestartRequest() {
        return restartRequest;
    }

    @JsonProperty("RestartRequest")
    public void setRestartRequest(Object restartRequest) {
        this.restartRequest = restartRequest;
    }

    @JsonProperty("RestartResponse")
    public Object getRestartResponse() {
        return restartResponse;
    }

    @JsonProperty("RestartResponse")
    public void setRestartResponse(Object restartResponse) {
        this.restartResponse = restartResponse;
    }

    /**
     * Arguments for `reverseContinue` request.
     * 
     */
    @JsonProperty("ReverseContinueArguments")
    public ReverseContinueArguments getReverseContinueArguments() {
        return reverseContinueArguments;
    }

    /**
     * Arguments for `reverseContinue` request.
     * 
     */
    @JsonProperty("ReverseContinueArguments")
    public void setReverseContinueArguments(ReverseContinueArguments reverseContinueArguments) {
        this.reverseContinueArguments = reverseContinueArguments;
    }

    @JsonProperty("ReverseContinueRequest")
    public Object getReverseContinueRequest() {
        return reverseContinueRequest;
    }

    @JsonProperty("ReverseContinueRequest")
    public void setReverseContinueRequest(Object reverseContinueRequest) {
        this.reverseContinueRequest = reverseContinueRequest;
    }

    @JsonProperty("ReverseContinueResponse")
    public Object getReverseContinueResponse() {
        return reverseContinueResponse;
    }

    @JsonProperty("ReverseContinueResponse")
    public void setReverseContinueResponse(Object reverseContinueResponse) {
        this.reverseContinueResponse = reverseContinueResponse;
    }

    @JsonProperty("RunInTerminalRequest")
    public Object getRunInTerminalRequest() {
        return runInTerminalRequest;
    }

    @JsonProperty("RunInTerminalRequest")
    public void setRunInTerminalRequest(Object runInTerminalRequest) {
        this.runInTerminalRequest = runInTerminalRequest;
    }

    /**
     * Arguments for `runInTerminal` request.
     * 
     */
    @JsonProperty("RunInTerminalRequestArguments")
    public RunInTerminalRequestArguments getRunInTerminalRequestArguments() {
        return runInTerminalRequestArguments;
    }

    /**
     * Arguments for `runInTerminal` request.
     * 
     */
    @JsonProperty("RunInTerminalRequestArguments")
    public void setRunInTerminalRequestArguments(RunInTerminalRequestArguments runInTerminalRequestArguments) {
        this.runInTerminalRequestArguments = runInTerminalRequestArguments;
    }

    @JsonProperty("RunInTerminalResponse")
    public Object getRunInTerminalResponse() {
        return runInTerminalResponse;
    }

    @JsonProperty("RunInTerminalResponse")
    public void setRunInTerminalResponse(Object runInTerminalResponse) {
        this.runInTerminalResponse = runInTerminalResponse;
    }

    /**
     * A `Scope` is a named container for variables. Optionally a scope can map to a source or a range within a source.
     * 
     */
    @JsonProperty("Scope")
    public Scope getScope() {
        return scope;
    }

    /**
     * A `Scope` is a named container for variables. Optionally a scope can map to a source or a range within a source.
     * 
     */
    @JsonProperty("Scope")
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * Arguments for `scopes` request.
     * 
     */
    @JsonProperty("ScopesArguments")
    public ScopesArguments getScopesArguments() {
        return scopesArguments;
    }

    /**
     * Arguments for `scopes` request.
     * 
     */
    @JsonProperty("ScopesArguments")
    public void setScopesArguments(ScopesArguments scopesArguments) {
        this.scopesArguments = scopesArguments;
    }

    @JsonProperty("ScopesRequest")
    public Object getScopesRequest() {
        return scopesRequest;
    }

    @JsonProperty("ScopesRequest")
    public void setScopesRequest(Object scopesRequest) {
        this.scopesRequest = scopesRequest;
    }

    @JsonProperty("ScopesResponse")
    public Object getScopesResponse() {
        return scopesResponse;
    }

    @JsonProperty("ScopesResponse")
    public void setScopesResponse(Object scopesResponse) {
        this.scopesResponse = scopesResponse;
    }

    /**
     * Arguments for `setBreakpoints` request.
     * 
     */
    @JsonProperty("SetBreakpointsArguments")
    public SetBreakpointsArguments getSetBreakpointsArguments() {
        return setBreakpointsArguments;
    }

    /**
     * Arguments for `setBreakpoints` request.
     * 
     */
    @JsonProperty("SetBreakpointsArguments")
    public void setSetBreakpointsArguments(SetBreakpointsArguments setBreakpointsArguments) {
        this.setBreakpointsArguments = setBreakpointsArguments;
    }

    @JsonProperty("SetBreakpointsRequest")
    public Object getSetBreakpointsRequest() {
        return setBreakpointsRequest;
    }

    @JsonProperty("SetBreakpointsRequest")
    public void setSetBreakpointsRequest(Object setBreakpointsRequest) {
        this.setBreakpointsRequest = setBreakpointsRequest;
    }

    @JsonProperty("SetBreakpointsResponse")
    public Object getSetBreakpointsResponse() {
        return setBreakpointsResponse;
    }

    @JsonProperty("SetBreakpointsResponse")
    public void setSetBreakpointsResponse(Object setBreakpointsResponse) {
        this.setBreakpointsResponse = setBreakpointsResponse;
    }

    /**
     * Arguments for `setDataBreakpoints` request.
     * 
     */
    @JsonProperty("SetDataBreakpointsArguments")
    public SetDataBreakpointsArguments getSetDataBreakpointsArguments() {
        return setDataBreakpointsArguments;
    }

    /**
     * Arguments for `setDataBreakpoints` request.
     * 
     */
    @JsonProperty("SetDataBreakpointsArguments")
    public void setSetDataBreakpointsArguments(SetDataBreakpointsArguments setDataBreakpointsArguments) {
        this.setDataBreakpointsArguments = setDataBreakpointsArguments;
    }

    @JsonProperty("SetDataBreakpointsRequest")
    public Object getSetDataBreakpointsRequest() {
        return setDataBreakpointsRequest;
    }

    @JsonProperty("SetDataBreakpointsRequest")
    public void setSetDataBreakpointsRequest(Object setDataBreakpointsRequest) {
        this.setDataBreakpointsRequest = setDataBreakpointsRequest;
    }

    @JsonProperty("SetDataBreakpointsResponse")
    public Object getSetDataBreakpointsResponse() {
        return setDataBreakpointsResponse;
    }

    @JsonProperty("SetDataBreakpointsResponse")
    public void setSetDataBreakpointsResponse(Object setDataBreakpointsResponse) {
        this.setDataBreakpointsResponse = setDataBreakpointsResponse;
    }

    /**
     * Arguments for `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("SetExceptionBreakpointsArguments")
    public SetExceptionBreakpointsArguments getSetExceptionBreakpointsArguments() {
        return setExceptionBreakpointsArguments;
    }

    /**
     * Arguments for `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("SetExceptionBreakpointsArguments")
    public void setSetExceptionBreakpointsArguments(SetExceptionBreakpointsArguments setExceptionBreakpointsArguments) {
        this.setExceptionBreakpointsArguments = setExceptionBreakpointsArguments;
    }

    @JsonProperty("SetExceptionBreakpointsRequest")
    public Object getSetExceptionBreakpointsRequest() {
        return setExceptionBreakpointsRequest;
    }

    @JsonProperty("SetExceptionBreakpointsRequest")
    public void setSetExceptionBreakpointsRequest(Object setExceptionBreakpointsRequest) {
        this.setExceptionBreakpointsRequest = setExceptionBreakpointsRequest;
    }

    @JsonProperty("SetExceptionBreakpointsResponse")
    public Object getSetExceptionBreakpointsResponse() {
        return setExceptionBreakpointsResponse;
    }

    @JsonProperty("SetExceptionBreakpointsResponse")
    public void setSetExceptionBreakpointsResponse(Object setExceptionBreakpointsResponse) {
        this.setExceptionBreakpointsResponse = setExceptionBreakpointsResponse;
    }

    /**
     * Arguments for `setExpression` request.
     * 
     */
    @JsonProperty("SetExpressionArguments")
    public SetExpressionArguments getSetExpressionArguments() {
        return setExpressionArguments;
    }

    /**
     * Arguments for `setExpression` request.
     * 
     */
    @JsonProperty("SetExpressionArguments")
    public void setSetExpressionArguments(SetExpressionArguments setExpressionArguments) {
        this.setExpressionArguments = setExpressionArguments;
    }

    @JsonProperty("SetExpressionRequest")
    public Object getSetExpressionRequest() {
        return setExpressionRequest;
    }

    @JsonProperty("SetExpressionRequest")
    public void setSetExpressionRequest(Object setExpressionRequest) {
        this.setExpressionRequest = setExpressionRequest;
    }

    @JsonProperty("SetExpressionResponse")
    public Object getSetExpressionResponse() {
        return setExpressionResponse;
    }

    @JsonProperty("SetExpressionResponse")
    public void setSetExpressionResponse(Object setExpressionResponse) {
        this.setExpressionResponse = setExpressionResponse;
    }

    /**
     * Arguments for `setFunctionBreakpoints` request.
     * 
     */
    @JsonProperty("SetFunctionBreakpointsArguments")
    public SetFunctionBreakpointsArguments getSetFunctionBreakpointsArguments() {
        return setFunctionBreakpointsArguments;
    }

    /**
     * Arguments for `setFunctionBreakpoints` request.
     * 
     */
    @JsonProperty("SetFunctionBreakpointsArguments")
    public void setSetFunctionBreakpointsArguments(SetFunctionBreakpointsArguments setFunctionBreakpointsArguments) {
        this.setFunctionBreakpointsArguments = setFunctionBreakpointsArguments;
    }

    @JsonProperty("SetFunctionBreakpointsRequest")
    public Object getSetFunctionBreakpointsRequest() {
        return setFunctionBreakpointsRequest;
    }

    @JsonProperty("SetFunctionBreakpointsRequest")
    public void setSetFunctionBreakpointsRequest(Object setFunctionBreakpointsRequest) {
        this.setFunctionBreakpointsRequest = setFunctionBreakpointsRequest;
    }

    @JsonProperty("SetFunctionBreakpointsResponse")
    public Object getSetFunctionBreakpointsResponse() {
        return setFunctionBreakpointsResponse;
    }

    @JsonProperty("SetFunctionBreakpointsResponse")
    public void setSetFunctionBreakpointsResponse(Object setFunctionBreakpointsResponse) {
        this.setFunctionBreakpointsResponse = setFunctionBreakpointsResponse;
    }

    /**
     * Arguments for `setInstructionBreakpoints` request
     * 
     */
    @JsonProperty("SetInstructionBreakpointsArguments")
    public SetInstructionBreakpointsArguments getSetInstructionBreakpointsArguments() {
        return setInstructionBreakpointsArguments;
    }

    /**
     * Arguments for `setInstructionBreakpoints` request
     * 
     */
    @JsonProperty("SetInstructionBreakpointsArguments")
    public void setSetInstructionBreakpointsArguments(SetInstructionBreakpointsArguments setInstructionBreakpointsArguments) {
        this.setInstructionBreakpointsArguments = setInstructionBreakpointsArguments;
    }

    @JsonProperty("SetInstructionBreakpointsRequest")
    public Object getSetInstructionBreakpointsRequest() {
        return setInstructionBreakpointsRequest;
    }

    @JsonProperty("SetInstructionBreakpointsRequest")
    public void setSetInstructionBreakpointsRequest(Object setInstructionBreakpointsRequest) {
        this.setInstructionBreakpointsRequest = setInstructionBreakpointsRequest;
    }

    @JsonProperty("SetInstructionBreakpointsResponse")
    public Object getSetInstructionBreakpointsResponse() {
        return setInstructionBreakpointsResponse;
    }

    @JsonProperty("SetInstructionBreakpointsResponse")
    public void setSetInstructionBreakpointsResponse(Object setInstructionBreakpointsResponse) {
        this.setInstructionBreakpointsResponse = setInstructionBreakpointsResponse;
    }

    /**
     * Arguments for `setVariable` request.
     * 
     */
    @JsonProperty("SetVariableArguments")
    public SetVariableArguments getSetVariableArguments() {
        return setVariableArguments;
    }

    /**
     * Arguments for `setVariable` request.
     * 
     */
    @JsonProperty("SetVariableArguments")
    public void setSetVariableArguments(SetVariableArguments setVariableArguments) {
        this.setVariableArguments = setVariableArguments;
    }

    @JsonProperty("SetVariableRequest")
    public Object getSetVariableRequest() {
        return setVariableRequest;
    }

    @JsonProperty("SetVariableRequest")
    public void setSetVariableRequest(Object setVariableRequest) {
        this.setVariableRequest = setVariableRequest;
    }

    @JsonProperty("SetVariableResponse")
    public Object getSetVariableResponse() {
        return setVariableResponse;
    }

    @JsonProperty("SetVariableResponse")
    public void setSetVariableResponse(Object setVariableResponse) {
        this.setVariableResponse = setVariableResponse;
    }

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("Source")
    public Source getSource() {
        return source;
    }

    /**
     * A `Source` is a descriptor for source code.
     * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
     * 
     */
    @JsonProperty("Source")
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * Arguments for `source` request.
     * 
     */
    @JsonProperty("SourceArguments")
    public SourceArguments getSourceArguments() {
        return sourceArguments;
    }

    /**
     * Arguments for `source` request.
     * 
     */
    @JsonProperty("SourceArguments")
    public void setSourceArguments(SourceArguments sourceArguments) {
        this.sourceArguments = sourceArguments;
    }

    /**
     * Properties of a breakpoint or logpoint passed to the `setBreakpoints` request.
     * 
     */
    @JsonProperty("SourceBreakpoint")
    public SourceBreakpoint getSourceBreakpoint() {
        return sourceBreakpoint;
    }

    /**
     * Properties of a breakpoint or logpoint passed to the `setBreakpoints` request.
     * 
     */
    @JsonProperty("SourceBreakpoint")
    public void setSourceBreakpoint(SourceBreakpoint sourceBreakpoint) {
        this.sourceBreakpoint = sourceBreakpoint;
    }

    @JsonProperty("SourceRequest")
    public Object getSourceRequest() {
        return sourceRequest;
    }

    @JsonProperty("SourceRequest")
    public void setSourceRequest(Object sourceRequest) {
        this.sourceRequest = sourceRequest;
    }

    @JsonProperty("SourceResponse")
    public Object getSourceResponse() {
        return sourceResponse;
    }

    @JsonProperty("SourceResponse")
    public void setSourceResponse(Object sourceResponse) {
        this.sourceResponse = sourceResponse;
    }

    /**
     * A Stackframe contains the source location.
     * 
     */
    @JsonProperty("StackFrame")
    public StackFrame getStackFrame() {
        return stackFrame;
    }

    /**
     * A Stackframe contains the source location.
     * 
     */
    @JsonProperty("StackFrame")
    public void setStackFrame(StackFrame stackFrame) {
        this.stackFrame = stackFrame;
    }

    @JsonProperty("StackFrameFormat")
    public Object getStackFrameFormat() {
        return stackFrameFormat;
    }

    @JsonProperty("StackFrameFormat")
    public void setStackFrameFormat(Object stackFrameFormat) {
        this.stackFrameFormat = stackFrameFormat;
    }

    /**
     * Arguments for `stackTrace` request.
     * 
     */
    @JsonProperty("StackTraceArguments")
    public StackTraceArguments getStackTraceArguments() {
        return stackTraceArguments;
    }

    /**
     * Arguments for `stackTrace` request.
     * 
     */
    @JsonProperty("StackTraceArguments")
    public void setStackTraceArguments(StackTraceArguments stackTraceArguments) {
        this.stackTraceArguments = stackTraceArguments;
    }

    @JsonProperty("StackTraceRequest")
    public Object getStackTraceRequest() {
        return stackTraceRequest;
    }

    @JsonProperty("StackTraceRequest")
    public void setStackTraceRequest(Object stackTraceRequest) {
        this.stackTraceRequest = stackTraceRequest;
    }

    @JsonProperty("StackTraceResponse")
    public Object getStackTraceResponse() {
        return stackTraceResponse;
    }

    @JsonProperty("StackTraceResponse")
    public void setStackTraceResponse(Object stackTraceResponse) {
        this.stackTraceResponse = stackTraceResponse;
    }

    @JsonProperty("StartDebuggingRequest")
    public Object getStartDebuggingRequest() {
        return startDebuggingRequest;
    }

    @JsonProperty("StartDebuggingRequest")
    public void setStartDebuggingRequest(Object startDebuggingRequest) {
        this.startDebuggingRequest = startDebuggingRequest;
    }

    /**
     * Arguments for `startDebugging` request.
     * 
     */
    @JsonProperty("StartDebuggingRequestArguments")
    public StartDebuggingRequestArguments getStartDebuggingRequestArguments() {
        return startDebuggingRequestArguments;
    }

    /**
     * Arguments for `startDebugging` request.
     * 
     */
    @JsonProperty("StartDebuggingRequestArguments")
    public void setStartDebuggingRequestArguments(StartDebuggingRequestArguments startDebuggingRequestArguments) {
        this.startDebuggingRequestArguments = startDebuggingRequestArguments;
    }

    @JsonProperty("StartDebuggingResponse")
    public Object getStartDebuggingResponse() {
        return startDebuggingResponse;
    }

    @JsonProperty("StartDebuggingResponse")
    public void setStartDebuggingResponse(Object startDebuggingResponse) {
        this.startDebuggingResponse = startDebuggingResponse;
    }

    /**
     * Arguments for `stepBack` request.
     * 
     */
    @JsonProperty("StepBackArguments")
    public StepBackArguments getStepBackArguments() {
        return stepBackArguments;
    }

    /**
     * Arguments for `stepBack` request.
     * 
     */
    @JsonProperty("StepBackArguments")
    public void setStepBackArguments(StepBackArguments stepBackArguments) {
        this.stepBackArguments = stepBackArguments;
    }

    @JsonProperty("StepBackRequest")
    public Object getStepBackRequest() {
        return stepBackRequest;
    }

    @JsonProperty("StepBackRequest")
    public void setStepBackRequest(Object stepBackRequest) {
        this.stepBackRequest = stepBackRequest;
    }

    @JsonProperty("StepBackResponse")
    public Object getStepBackResponse() {
        return stepBackResponse;
    }

    @JsonProperty("StepBackResponse")
    public void setStepBackResponse(Object stepBackResponse) {
        this.stepBackResponse = stepBackResponse;
    }

    /**
     * Arguments for `stepIn` request.
     * 
     */
    @JsonProperty("StepInArguments")
    public StepInArguments getStepInArguments() {
        return stepInArguments;
    }

    /**
     * Arguments for `stepIn` request.
     * 
     */
    @JsonProperty("StepInArguments")
    public void setStepInArguments(StepInArguments stepInArguments) {
        this.stepInArguments = stepInArguments;
    }

    @JsonProperty("StepInRequest")
    public Object getStepInRequest() {
        return stepInRequest;
    }

    @JsonProperty("StepInRequest")
    public void setStepInRequest(Object stepInRequest) {
        this.stepInRequest = stepInRequest;
    }

    @JsonProperty("StepInResponse")
    public Object getStepInResponse() {
        return stepInResponse;
    }

    @JsonProperty("StepInResponse")
    public void setStepInResponse(Object stepInResponse) {
        this.stepInResponse = stepInResponse;
    }

    /**
     * A `StepInTarget` can be used in the `stepIn` request and determines into which single target the `stepIn` request should step.
     * 
     */
    @JsonProperty("StepInTarget")
    public StepInTarget getStepInTarget() {
        return stepInTarget;
    }

    /**
     * A `StepInTarget` can be used in the `stepIn` request and determines into which single target the `stepIn` request should step.
     * 
     */
    @JsonProperty("StepInTarget")
    public void setStepInTarget(StepInTarget stepInTarget) {
        this.stepInTarget = stepInTarget;
    }

    /**
     * Arguments for `stepInTargets` request.
     * 
     */
    @JsonProperty("StepInTargetsArguments")
    public StepInTargetsArguments getStepInTargetsArguments() {
        return stepInTargetsArguments;
    }

    /**
     * Arguments for `stepInTargets` request.
     * 
     */
    @JsonProperty("StepInTargetsArguments")
    public void setStepInTargetsArguments(StepInTargetsArguments stepInTargetsArguments) {
        this.stepInTargetsArguments = stepInTargetsArguments;
    }

    @JsonProperty("StepInTargetsRequest")
    public Object getStepInTargetsRequest() {
        return stepInTargetsRequest;
    }

    @JsonProperty("StepInTargetsRequest")
    public void setStepInTargetsRequest(Object stepInTargetsRequest) {
        this.stepInTargetsRequest = stepInTargetsRequest;
    }

    @JsonProperty("StepInTargetsResponse")
    public Object getStepInTargetsResponse() {
        return stepInTargetsResponse;
    }

    @JsonProperty("StepInTargetsResponse")
    public void setStepInTargetsResponse(Object stepInTargetsResponse) {
        this.stepInTargetsResponse = stepInTargetsResponse;
    }

    /**
     * Arguments for `stepOut` request.
     * 
     */
    @JsonProperty("StepOutArguments")
    public StepOutArguments getStepOutArguments() {
        return stepOutArguments;
    }

    /**
     * Arguments for `stepOut` request.
     * 
     */
    @JsonProperty("StepOutArguments")
    public void setStepOutArguments(StepOutArguments stepOutArguments) {
        this.stepOutArguments = stepOutArguments;
    }

    @JsonProperty("StepOutRequest")
    public Object getStepOutRequest() {
        return stepOutRequest;
    }

    @JsonProperty("StepOutRequest")
    public void setStepOutRequest(Object stepOutRequest) {
        this.stepOutRequest = stepOutRequest;
    }

    @JsonProperty("StepOutResponse")
    public Object getStepOutResponse() {
        return stepOutResponse;
    }

    @JsonProperty("StepOutResponse")
    public void setStepOutResponse(Object stepOutResponse) {
        this.stepOutResponse = stepOutResponse;
    }

    /**
     * The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.
     * 
     */
    @JsonProperty("SteppingGranularity")
    public NextArguments.SteppingGranularity getSteppingGranularity() {
        return steppingGranularity;
    }

    /**
     * The granularity of one 'step' in the stepping requests `next`, `stepIn`, `stepOut`, and `stepBack`.
     * 
     */
    @JsonProperty("SteppingGranularity")
    public void setSteppingGranularity(NextArguments.SteppingGranularity steppingGranularity) {
        this.steppingGranularity = steppingGranularity;
    }

    @JsonProperty("StoppedEvent")
    public Object getStoppedEvent() {
        return stoppedEvent;
    }

    @JsonProperty("StoppedEvent")
    public void setStoppedEvent(Object stoppedEvent) {
        this.stoppedEvent = stoppedEvent;
    }

    /**
     * Arguments for `terminate` request.
     * 
     */
    @JsonProperty("TerminateArguments")
    public TerminateArguments getTerminateArguments() {
        return terminateArguments;
    }

    /**
     * Arguments for `terminate` request.
     * 
     */
    @JsonProperty("TerminateArguments")
    public void setTerminateArguments(TerminateArguments terminateArguments) {
        this.terminateArguments = terminateArguments;
    }

    @JsonProperty("TerminateRequest")
    public Object getTerminateRequest() {
        return terminateRequest;
    }

    @JsonProperty("TerminateRequest")
    public void setTerminateRequest(Object terminateRequest) {
        this.terminateRequest = terminateRequest;
    }

    @JsonProperty("TerminateResponse")
    public Object getTerminateResponse() {
        return terminateResponse;
    }

    @JsonProperty("TerminateResponse")
    public void setTerminateResponse(Object terminateResponse) {
        this.terminateResponse = terminateResponse;
    }

    /**
     * Arguments for `terminateThreads` request.
     * 
     */
    @JsonProperty("TerminateThreadsArguments")
    public TerminateThreadsArguments getTerminateThreadsArguments() {
        return terminateThreadsArguments;
    }

    /**
     * Arguments for `terminateThreads` request.
     * 
     */
    @JsonProperty("TerminateThreadsArguments")
    public void setTerminateThreadsArguments(TerminateThreadsArguments terminateThreadsArguments) {
        this.terminateThreadsArguments = terminateThreadsArguments;
    }

    @JsonProperty("TerminateThreadsRequest")
    public Object getTerminateThreadsRequest() {
        return terminateThreadsRequest;
    }

    @JsonProperty("TerminateThreadsRequest")
    public void setTerminateThreadsRequest(Object terminateThreadsRequest) {
        this.terminateThreadsRequest = terminateThreadsRequest;
    }

    @JsonProperty("TerminateThreadsResponse")
    public Object getTerminateThreadsResponse() {
        return terminateThreadsResponse;
    }

    @JsonProperty("TerminateThreadsResponse")
    public void setTerminateThreadsResponse(Object terminateThreadsResponse) {
        this.terminateThreadsResponse = terminateThreadsResponse;
    }

    @JsonProperty("TerminatedEvent")
    public Object getTerminatedEvent() {
        return terminatedEvent;
    }

    @JsonProperty("TerminatedEvent")
    public void setTerminatedEvent(Object terminatedEvent) {
        this.terminatedEvent = terminatedEvent;
    }

    /**
     * A Thread
     * 
     */
    @JsonProperty("Thread")
    public Thread getThread() {
        return thread;
    }

    /**
     * A Thread
     * 
     */
    @JsonProperty("Thread")
    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @JsonProperty("ThreadEvent")
    public Object getThreadEvent() {
        return threadEvent;
    }

    @JsonProperty("ThreadEvent")
    public void setThreadEvent(Object threadEvent) {
        this.threadEvent = threadEvent;
    }

    @JsonProperty("ThreadsRequest")
    public Object getThreadsRequest() {
        return threadsRequest;
    }

    @JsonProperty("ThreadsRequest")
    public void setThreadsRequest(Object threadsRequest) {
        this.threadsRequest = threadsRequest;
    }

    @JsonProperty("ThreadsResponse")
    public Object getThreadsResponse() {
        return threadsResponse;
    }

    @JsonProperty("ThreadsResponse")
    public void setThreadsResponse(Object threadsResponse) {
        this.threadsResponse = threadsResponse;
    }

    /**
     * Provides formatting information for a value.
     * 
     */
    @JsonProperty("ValueFormat")
    public ValueFormat getValueFormat() {
        return valueFormat;
    }

    /**
     * Provides formatting information for a value.
     * 
     */
    @JsonProperty("ValueFormat")
    public void setValueFormat(ValueFormat valueFormat) {
        this.valueFormat = valueFormat;
    }

    /**
     * A Variable is a name/value pair.
     * The `type` attribute is shown if space permits or when hovering over the variable's name.
     * The `kind` attribute is used to render additional properties of the variable, e.g. different icons can be used to indicate that a variable is public or private.
     * If the value is structured (has children), a handle is provided to retrieve the children with the `variables` request.
     * If the number of named or indexed children is large, the numbers should be returned via the `namedVariables` and `indexedVariables` attributes.
     * The client can use this information to present the children in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("Variable")
    public Variable getVariable() {
        return variable;
    }

    /**
     * A Variable is a name/value pair.
     * The `type` attribute is shown if space permits or when hovering over the variable's name.
     * The `kind` attribute is used to render additional properties of the variable, e.g. different icons can be used to indicate that a variable is public or private.
     * If the value is structured (has children), a handle is provided to retrieve the children with the `variables` request.
     * If the number of named or indexed children is large, the numbers should be returned via the `namedVariables` and `indexedVariables` attributes.
     * The client can use this information to present the children in a paged UI and fetch them in chunks.
     * 
     */
    @JsonProperty("Variable")
    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    /**
     * Properties of a variable that can be used to determine how to render the variable in the UI.
     * 
     */
    @JsonProperty("VariablePresentationHint")
    public VariablePresentationHint getVariablePresentationHint() {
        return variablePresentationHint;
    }

    /**
     * Properties of a variable that can be used to determine how to render the variable in the UI.
     * 
     */
    @JsonProperty("VariablePresentationHint")
    public void setVariablePresentationHint(VariablePresentationHint variablePresentationHint) {
        this.variablePresentationHint = variablePresentationHint;
    }

    /**
     * Arguments for `variables` request.
     * 
     */
    @JsonProperty("VariablesArguments")
    public VariablesArguments getVariablesArguments() {
        return variablesArguments;
    }

    /**
     * Arguments for `variables` request.
     * 
     */
    @JsonProperty("VariablesArguments")
    public void setVariablesArguments(VariablesArguments variablesArguments) {
        this.variablesArguments = variablesArguments;
    }

    @JsonProperty("VariablesRequest")
    public Object getVariablesRequest() {
        return variablesRequest;
    }

    @JsonProperty("VariablesRequest")
    public void setVariablesRequest(Object variablesRequest) {
        this.variablesRequest = variablesRequest;
    }

    @JsonProperty("VariablesResponse")
    public Object getVariablesResponse() {
        return variablesResponse;
    }

    @JsonProperty("VariablesResponse")
    public void setVariablesResponse(Object variablesResponse) {
        this.variablesResponse = variablesResponse;
    }

    /**
     * Arguments for `writeMemory` request.
     * 
     */
    @JsonProperty("WriteMemoryArguments")
    public WriteMemoryArguments getWriteMemoryArguments() {
        return writeMemoryArguments;
    }

    /**
     * Arguments for `writeMemory` request.
     * 
     */
    @JsonProperty("WriteMemoryArguments")
    public void setWriteMemoryArguments(WriteMemoryArguments writeMemoryArguments) {
        this.writeMemoryArguments = writeMemoryArguments;
    }

    @JsonProperty("WriteMemoryRequest")
    public Object getWriteMemoryRequest() {
        return writeMemoryRequest;
    }

    @JsonProperty("WriteMemoryRequest")
    public void setWriteMemoryRequest(Object writeMemoryRequest) {
        this.writeMemoryRequest = writeMemoryRequest;
    }

    @JsonProperty("WriteMemoryResponse")
    public Object getWriteMemoryResponse() {
        return writeMemoryResponse;
    }

    @JsonProperty("WriteMemoryResponse")
    public void setWriteMemoryResponse(Object writeMemoryResponse) {
        this.writeMemoryResponse = writeMemoryResponse;
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
        sb.append(DebugProtocol.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attachRequest");
        sb.append('=');
        sb.append(((this.attachRequest == null)?"<null>":this.attachRequest));
        sb.append(',');
        sb.append("attachRequestArguments");
        sb.append('=');
        sb.append(((this.attachRequestArguments == null)?"<null>":this.attachRequestArguments));
        sb.append(',');
        sb.append("attachResponse");
        sb.append('=');
        sb.append(((this.attachResponse == null)?"<null>":this.attachResponse));
        sb.append(',');
        sb.append("breakpoint");
        sb.append('=');
        sb.append(((this.breakpoint == null)?"<null>":this.breakpoint));
        sb.append(',');
        sb.append("breakpointEvent");
        sb.append('=');
        sb.append(((this.breakpointEvent == null)?"<null>":this.breakpointEvent));
        sb.append(',');
        sb.append("breakpointLocation");
        sb.append('=');
        sb.append(((this.breakpointLocation == null)?"<null>":this.breakpointLocation));
        sb.append(',');
        sb.append("breakpointLocationsArguments");
        sb.append('=');
        sb.append(((this.breakpointLocationsArguments == null)?"<null>":this.breakpointLocationsArguments));
        sb.append(',');
        sb.append("breakpointLocationsRequest");
        sb.append('=');
        sb.append(((this.breakpointLocationsRequest == null)?"<null>":this.breakpointLocationsRequest));
        sb.append(',');
        sb.append("breakpointLocationsResponse");
        sb.append('=');
        sb.append(((this.breakpointLocationsResponse == null)?"<null>":this.breakpointLocationsResponse));
        sb.append(',');
        sb.append("cancelArguments");
        sb.append('=');
        sb.append(((this.cancelArguments == null)?"<null>":this.cancelArguments));
        sb.append(',');
        sb.append("cancelRequest");
        sb.append('=');
        sb.append(((this.cancelRequest == null)?"<null>":this.cancelRequest));
        sb.append(',');
        sb.append("cancelResponse");
        sb.append('=');
        sb.append(((this.cancelResponse == null)?"<null>":this.cancelResponse));
        sb.append(',');
        sb.append("capabilities");
        sb.append('=');
        sb.append(((this.capabilities == null)?"<null>":this.capabilities));
        sb.append(',');
        sb.append("capabilitiesEvent");
        sb.append('=');
        sb.append(((this.capabilitiesEvent == null)?"<null>":this.capabilitiesEvent));
        sb.append(',');
        sb.append("checksum");
        sb.append('=');
        sb.append(((this.checksum == null)?"<null>":this.checksum));
        sb.append(',');
        sb.append("checksumAlgorithm");
        sb.append('=');
        sb.append(((this.checksumAlgorithm == null)?"<null>":this.checksumAlgorithm));
        sb.append(',');
        sb.append("columnDescriptor");
        sb.append('=');
        sb.append(((this.columnDescriptor == null)?"<null>":this.columnDescriptor));
        sb.append(',');
        sb.append("completionItem");
        sb.append('=');
        sb.append(((this.completionItem == null)?"<null>":this.completionItem));
        sb.append(',');
        sb.append("completionItemType");
        sb.append('=');
        sb.append(((this.completionItemType == null)?"<null>":this.completionItemType));
        sb.append(',');
        sb.append("completionsArguments");
        sb.append('=');
        sb.append(((this.completionsArguments == null)?"<null>":this.completionsArguments));
        sb.append(',');
        sb.append("completionsRequest");
        sb.append('=');
        sb.append(((this.completionsRequest == null)?"<null>":this.completionsRequest));
        sb.append(',');
        sb.append("completionsResponse");
        sb.append('=');
        sb.append(((this.completionsResponse == null)?"<null>":this.completionsResponse));
        sb.append(',');
        sb.append("configurationDoneArguments");
        sb.append('=');
        sb.append(((this.configurationDoneArguments == null)?"<null>":this.configurationDoneArguments));
        sb.append(',');
        sb.append("configurationDoneRequest");
        sb.append('=');
        sb.append(((this.configurationDoneRequest == null)?"<null>":this.configurationDoneRequest));
        sb.append(',');
        sb.append("configurationDoneResponse");
        sb.append('=');
        sb.append(((this.configurationDoneResponse == null)?"<null>":this.configurationDoneResponse));
        sb.append(',');
        sb.append("continueArguments");
        sb.append('=');
        sb.append(((this.continueArguments == null)?"<null>":this.continueArguments));
        sb.append(',');
        sb.append("continueRequest");
        sb.append('=');
        sb.append(((this.continueRequest == null)?"<null>":this.continueRequest));
        sb.append(',');
        sb.append("continueResponse");
        sb.append('=');
        sb.append(((this.continueResponse == null)?"<null>":this.continueResponse));
        sb.append(',');
        sb.append("continuedEvent");
        sb.append('=');
        sb.append(((this.continuedEvent == null)?"<null>":this.continuedEvent));
        sb.append(',');
        sb.append("dataBreakpoint");
        sb.append('=');
        sb.append(((this.dataBreakpoint == null)?"<null>":this.dataBreakpoint));
        sb.append(',');
        sb.append("dataBreakpointAccessType");
        sb.append('=');
        sb.append(((this.dataBreakpointAccessType == null)?"<null>":this.dataBreakpointAccessType));
        sb.append(',');
        sb.append("dataBreakpointInfoArguments");
        sb.append('=');
        sb.append(((this.dataBreakpointInfoArguments == null)?"<null>":this.dataBreakpointInfoArguments));
        sb.append(',');
        sb.append("dataBreakpointInfoRequest");
        sb.append('=');
        sb.append(((this.dataBreakpointInfoRequest == null)?"<null>":this.dataBreakpointInfoRequest));
        sb.append(',');
        sb.append("dataBreakpointInfoResponse");
        sb.append('=');
        sb.append(((this.dataBreakpointInfoResponse == null)?"<null>":this.dataBreakpointInfoResponse));
        sb.append(',');
        sb.append("disassembleArguments");
        sb.append('=');
        sb.append(((this.disassembleArguments == null)?"<null>":this.disassembleArguments));
        sb.append(',');
        sb.append("disassembleRequest");
        sb.append('=');
        sb.append(((this.disassembleRequest == null)?"<null>":this.disassembleRequest));
        sb.append(',');
        sb.append("disassembleResponse");
        sb.append('=');
        sb.append(((this.disassembleResponse == null)?"<null>":this.disassembleResponse));
        sb.append(',');
        sb.append("disassembledInstruction");
        sb.append('=');
        sb.append(((this.disassembledInstruction == null)?"<null>":this.disassembledInstruction));
        sb.append(',');
        sb.append("disconnectArguments");
        sb.append('=');
        sb.append(((this.disconnectArguments == null)?"<null>":this.disconnectArguments));
        sb.append(',');
        sb.append("disconnectRequest");
        sb.append('=');
        sb.append(((this.disconnectRequest == null)?"<null>":this.disconnectRequest));
        sb.append(',');
        sb.append("disconnectResponse");
        sb.append('=');
        sb.append(((this.disconnectResponse == null)?"<null>":this.disconnectResponse));
        sb.append(',');
        sb.append("errorResponse");
        sb.append('=');
        sb.append(((this.errorResponse == null)?"<null>":this.errorResponse));
        sb.append(',');
        sb.append("evaluateArguments");
        sb.append('=');
        sb.append(((this.evaluateArguments == null)?"<null>":this.evaluateArguments));
        sb.append(',');
        sb.append("evaluateRequest");
        sb.append('=');
        sb.append(((this.evaluateRequest == null)?"<null>":this.evaluateRequest));
        sb.append(',');
        sb.append("evaluateResponse");
        sb.append('=');
        sb.append(((this.evaluateResponse == null)?"<null>":this.evaluateResponse));
        sb.append(',');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        sb.append("exceptionBreakMode");
        sb.append('=');
        sb.append(((this.exceptionBreakMode == null)?"<null>":this.exceptionBreakMode));
        sb.append(',');
        sb.append("exceptionBreakpointsFilter");
        sb.append('=');
        sb.append(((this.exceptionBreakpointsFilter == null)?"<null>":this.exceptionBreakpointsFilter));
        sb.append(',');
        sb.append("exceptionDetails");
        sb.append('=');
        sb.append(((this.exceptionDetails == null)?"<null>":this.exceptionDetails));
        sb.append(',');
        sb.append("exceptionFilterOptions");
        sb.append('=');
        sb.append(((this.exceptionFilterOptions == null)?"<null>":this.exceptionFilterOptions));
        sb.append(',');
        sb.append("exceptionInfoArguments");
        sb.append('=');
        sb.append(((this.exceptionInfoArguments == null)?"<null>":this.exceptionInfoArguments));
        sb.append(',');
        sb.append("exceptionInfoRequest");
        sb.append('=');
        sb.append(((this.exceptionInfoRequest == null)?"<null>":this.exceptionInfoRequest));
        sb.append(',');
        sb.append("exceptionInfoResponse");
        sb.append('=');
        sb.append(((this.exceptionInfoResponse == null)?"<null>":this.exceptionInfoResponse));
        sb.append(',');
        sb.append("exceptionOptions");
        sb.append('=');
        sb.append(((this.exceptionOptions == null)?"<null>":this.exceptionOptions));
        sb.append(',');
        sb.append("exceptionPathSegment");
        sb.append('=');
        sb.append(((this.exceptionPathSegment == null)?"<null>":this.exceptionPathSegment));
        sb.append(',');
        sb.append("exitedEvent");
        sb.append('=');
        sb.append(((this.exitedEvent == null)?"<null>":this.exitedEvent));
        sb.append(',');
        sb.append("functionBreakpoint");
        sb.append('=');
        sb.append(((this.functionBreakpoint == null)?"<null>":this.functionBreakpoint));
        sb.append(',');
        sb.append("gotoArguments");
        sb.append('=');
        sb.append(((this.gotoArguments == null)?"<null>":this.gotoArguments));
        sb.append(',');
        sb.append("gotoRequest");
        sb.append('=');
        sb.append(((this.gotoRequest == null)?"<null>":this.gotoRequest));
        sb.append(',');
        sb.append("gotoResponse");
        sb.append('=');
        sb.append(((this.gotoResponse == null)?"<null>":this.gotoResponse));
        sb.append(',');
        sb.append("gotoTarget");
        sb.append('=');
        sb.append(((this.gotoTarget == null)?"<null>":this.gotoTarget));
        sb.append(',');
        sb.append("gotoTargetsArguments");
        sb.append('=');
        sb.append(((this.gotoTargetsArguments == null)?"<null>":this.gotoTargetsArguments));
        sb.append(',');
        sb.append("gotoTargetsRequest");
        sb.append('=');
        sb.append(((this.gotoTargetsRequest == null)?"<null>":this.gotoTargetsRequest));
        sb.append(',');
        sb.append("gotoTargetsResponse");
        sb.append('=');
        sb.append(((this.gotoTargetsResponse == null)?"<null>":this.gotoTargetsResponse));
        sb.append(',');
        sb.append("initializeRequest");
        sb.append('=');
        sb.append(((this.initializeRequest == null)?"<null>":this.initializeRequest));
        sb.append(',');
        sb.append("initializeRequestArguments");
        sb.append('=');
        sb.append(((this.initializeRequestArguments == null)?"<null>":this.initializeRequestArguments));
        sb.append(',');
        sb.append("initializeResponse");
        sb.append('=');
        sb.append(((this.initializeResponse == null)?"<null>":this.initializeResponse));
        sb.append(',');
        sb.append("initializedEvent");
        sb.append('=');
        sb.append(((this.initializedEvent == null)?"<null>":this.initializedEvent));
        sb.append(',');
        sb.append("instructionBreakpoint");
        sb.append('=');
        sb.append(((this.instructionBreakpoint == null)?"<null>":this.instructionBreakpoint));
        sb.append(',');
        sb.append("invalidatedAreas");
        sb.append('=');
        sb.append(((this.invalidatedAreas == null)?"<null>":this.invalidatedAreas));
        sb.append(',');
        sb.append("invalidatedEvent");
        sb.append('=');
        sb.append(((this.invalidatedEvent == null)?"<null>":this.invalidatedEvent));
        sb.append(',');
        sb.append("launchRequest");
        sb.append('=');
        sb.append(((this.launchRequest == null)?"<null>":this.launchRequest));
        sb.append(',');
        sb.append("launchRequestArguments");
        sb.append('=');
        sb.append(((this.launchRequestArguments == null)?"<null>":this.launchRequestArguments));
        sb.append(',');
        sb.append("launchResponse");
        sb.append('=');
        sb.append(((this.launchResponse == null)?"<null>":this.launchResponse));
        sb.append(',');
        sb.append("loadedSourceEvent");
        sb.append('=');
        sb.append(((this.loadedSourceEvent == null)?"<null>":this.loadedSourceEvent));
        sb.append(',');
        sb.append("loadedSourcesArguments");
        sb.append('=');
        sb.append(((this.loadedSourcesArguments == null)?"<null>":this.loadedSourcesArguments));
        sb.append(',');
        sb.append("loadedSourcesRequest");
        sb.append('=');
        sb.append(((this.loadedSourcesRequest == null)?"<null>":this.loadedSourcesRequest));
        sb.append(',');
        sb.append("loadedSourcesResponse");
        sb.append('=');
        sb.append(((this.loadedSourcesResponse == null)?"<null>":this.loadedSourcesResponse));
        sb.append(',');
        sb.append("memoryEvent");
        sb.append('=');
        sb.append(((this.memoryEvent == null)?"<null>":this.memoryEvent));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("module");
        sb.append('=');
        sb.append(((this.module == null)?"<null>":this.module));
        sb.append(',');
        sb.append("moduleEvent");
        sb.append('=');
        sb.append(((this.moduleEvent == null)?"<null>":this.moduleEvent));
        sb.append(',');
        sb.append("modulesArguments");
        sb.append('=');
        sb.append(((this.modulesArguments == null)?"<null>":this.modulesArguments));
        sb.append(',');
        sb.append("modulesRequest");
        sb.append('=');
        sb.append(((this.modulesRequest == null)?"<null>":this.modulesRequest));
        sb.append(',');
        sb.append("modulesResponse");
        sb.append('=');
        sb.append(((this.modulesResponse == null)?"<null>":this.modulesResponse));
        sb.append(',');
        sb.append("nextArguments");
        sb.append('=');
        sb.append(((this.nextArguments == null)?"<null>":this.nextArguments));
        sb.append(',');
        sb.append("nextRequest");
        sb.append('=');
        sb.append(((this.nextRequest == null)?"<null>":this.nextRequest));
        sb.append(',');
        sb.append("nextResponse");
        sb.append('=');
        sb.append(((this.nextResponse == null)?"<null>":this.nextResponse));
        sb.append(',');
        sb.append("outputEvent");
        sb.append('=');
        sb.append(((this.outputEvent == null)?"<null>":this.outputEvent));
        sb.append(',');
        sb.append("pauseArguments");
        sb.append('=');
        sb.append(((this.pauseArguments == null)?"<null>":this.pauseArguments));
        sb.append(',');
        sb.append("pauseRequest");
        sb.append('=');
        sb.append(((this.pauseRequest == null)?"<null>":this.pauseRequest));
        sb.append(',');
        sb.append("pauseResponse");
        sb.append('=');
        sb.append(((this.pauseResponse == null)?"<null>":this.pauseResponse));
        sb.append(',');
        sb.append("processEvent");
        sb.append('=');
        sb.append(((this.processEvent == null)?"<null>":this.processEvent));
        sb.append(',');
        sb.append("progressEndEvent");
        sb.append('=');
        sb.append(((this.progressEndEvent == null)?"<null>":this.progressEndEvent));
        sb.append(',');
        sb.append("progressStartEvent");
        sb.append('=');
        sb.append(((this.progressStartEvent == null)?"<null>":this.progressStartEvent));
        sb.append(',');
        sb.append("progressUpdateEvent");
        sb.append('=');
        sb.append(((this.progressUpdateEvent == null)?"<null>":this.progressUpdateEvent));
        sb.append(',');
        sb.append("protocolMessage");
        sb.append('=');
        sb.append(((this.protocolMessage == null)?"<null>":this.protocolMessage));
        sb.append(',');
        sb.append("readMemoryArguments");
        sb.append('=');
        sb.append(((this.readMemoryArguments == null)?"<null>":this.readMemoryArguments));
        sb.append(',');
        sb.append("readMemoryRequest");
        sb.append('=');
        sb.append(((this.readMemoryRequest == null)?"<null>":this.readMemoryRequest));
        sb.append(',');
        sb.append("readMemoryResponse");
        sb.append('=');
        sb.append(((this.readMemoryResponse == null)?"<null>":this.readMemoryResponse));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
        sb.append(',');
        sb.append("restartArguments");
        sb.append('=');
        sb.append(((this.restartArguments == null)?"<null>":this.restartArguments));
        sb.append(',');
        sb.append("restartFrameArguments");
        sb.append('=');
        sb.append(((this.restartFrameArguments == null)?"<null>":this.restartFrameArguments));
        sb.append(',');
        sb.append("restartFrameRequest");
        sb.append('=');
        sb.append(((this.restartFrameRequest == null)?"<null>":this.restartFrameRequest));
        sb.append(',');
        sb.append("restartFrameResponse");
        sb.append('=');
        sb.append(((this.restartFrameResponse == null)?"<null>":this.restartFrameResponse));
        sb.append(',');
        sb.append("restartRequest");
        sb.append('=');
        sb.append(((this.restartRequest == null)?"<null>":this.restartRequest));
        sb.append(',');
        sb.append("restartResponse");
        sb.append('=');
        sb.append(((this.restartResponse == null)?"<null>":this.restartResponse));
        sb.append(',');
        sb.append("reverseContinueArguments");
        sb.append('=');
        sb.append(((this.reverseContinueArguments == null)?"<null>":this.reverseContinueArguments));
        sb.append(',');
        sb.append("reverseContinueRequest");
        sb.append('=');
        sb.append(((this.reverseContinueRequest == null)?"<null>":this.reverseContinueRequest));
        sb.append(',');
        sb.append("reverseContinueResponse");
        sb.append('=');
        sb.append(((this.reverseContinueResponse == null)?"<null>":this.reverseContinueResponse));
        sb.append(',');
        sb.append("runInTerminalRequest");
        sb.append('=');
        sb.append(((this.runInTerminalRequest == null)?"<null>":this.runInTerminalRequest));
        sb.append(',');
        sb.append("runInTerminalRequestArguments");
        sb.append('=');
        sb.append(((this.runInTerminalRequestArguments == null)?"<null>":this.runInTerminalRequestArguments));
        sb.append(',');
        sb.append("runInTerminalResponse");
        sb.append('=');
        sb.append(((this.runInTerminalResponse == null)?"<null>":this.runInTerminalResponse));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("scopesArguments");
        sb.append('=');
        sb.append(((this.scopesArguments == null)?"<null>":this.scopesArguments));
        sb.append(',');
        sb.append("scopesRequest");
        sb.append('=');
        sb.append(((this.scopesRequest == null)?"<null>":this.scopesRequest));
        sb.append(',');
        sb.append("scopesResponse");
        sb.append('=');
        sb.append(((this.scopesResponse == null)?"<null>":this.scopesResponse));
        sb.append(',');
        sb.append("setBreakpointsArguments");
        sb.append('=');
        sb.append(((this.setBreakpointsArguments == null)?"<null>":this.setBreakpointsArguments));
        sb.append(',');
        sb.append("setBreakpointsRequest");
        sb.append('=');
        sb.append(((this.setBreakpointsRequest == null)?"<null>":this.setBreakpointsRequest));
        sb.append(',');
        sb.append("setBreakpointsResponse");
        sb.append('=');
        sb.append(((this.setBreakpointsResponse == null)?"<null>":this.setBreakpointsResponse));
        sb.append(',');
        sb.append("setDataBreakpointsArguments");
        sb.append('=');
        sb.append(((this.setDataBreakpointsArguments == null)?"<null>":this.setDataBreakpointsArguments));
        sb.append(',');
        sb.append("setDataBreakpointsRequest");
        sb.append('=');
        sb.append(((this.setDataBreakpointsRequest == null)?"<null>":this.setDataBreakpointsRequest));
        sb.append(',');
        sb.append("setDataBreakpointsResponse");
        sb.append('=');
        sb.append(((this.setDataBreakpointsResponse == null)?"<null>":this.setDataBreakpointsResponse));
        sb.append(',');
        sb.append("setExceptionBreakpointsArguments");
        sb.append('=');
        sb.append(((this.setExceptionBreakpointsArguments == null)?"<null>":this.setExceptionBreakpointsArguments));
        sb.append(',');
        sb.append("setExceptionBreakpointsRequest");
        sb.append('=');
        sb.append(((this.setExceptionBreakpointsRequest == null)?"<null>":this.setExceptionBreakpointsRequest));
        sb.append(',');
        sb.append("setExceptionBreakpointsResponse");
        sb.append('=');
        sb.append(((this.setExceptionBreakpointsResponse == null)?"<null>":this.setExceptionBreakpointsResponse));
        sb.append(',');
        sb.append("setExpressionArguments");
        sb.append('=');
        sb.append(((this.setExpressionArguments == null)?"<null>":this.setExpressionArguments));
        sb.append(',');
        sb.append("setExpressionRequest");
        sb.append('=');
        sb.append(((this.setExpressionRequest == null)?"<null>":this.setExpressionRequest));
        sb.append(',');
        sb.append("setExpressionResponse");
        sb.append('=');
        sb.append(((this.setExpressionResponse == null)?"<null>":this.setExpressionResponse));
        sb.append(',');
        sb.append("setFunctionBreakpointsArguments");
        sb.append('=');
        sb.append(((this.setFunctionBreakpointsArguments == null)?"<null>":this.setFunctionBreakpointsArguments));
        sb.append(',');
        sb.append("setFunctionBreakpointsRequest");
        sb.append('=');
        sb.append(((this.setFunctionBreakpointsRequest == null)?"<null>":this.setFunctionBreakpointsRequest));
        sb.append(',');
        sb.append("setFunctionBreakpointsResponse");
        sb.append('=');
        sb.append(((this.setFunctionBreakpointsResponse == null)?"<null>":this.setFunctionBreakpointsResponse));
        sb.append(',');
        sb.append("setInstructionBreakpointsArguments");
        sb.append('=');
        sb.append(((this.setInstructionBreakpointsArguments == null)?"<null>":this.setInstructionBreakpointsArguments));
        sb.append(',');
        sb.append("setInstructionBreakpointsRequest");
        sb.append('=');
        sb.append(((this.setInstructionBreakpointsRequest == null)?"<null>":this.setInstructionBreakpointsRequest));
        sb.append(',');
        sb.append("setInstructionBreakpointsResponse");
        sb.append('=');
        sb.append(((this.setInstructionBreakpointsResponse == null)?"<null>":this.setInstructionBreakpointsResponse));
        sb.append(',');
        sb.append("setVariableArguments");
        sb.append('=');
        sb.append(((this.setVariableArguments == null)?"<null>":this.setVariableArguments));
        sb.append(',');
        sb.append("setVariableRequest");
        sb.append('=');
        sb.append(((this.setVariableRequest == null)?"<null>":this.setVariableRequest));
        sb.append(',');
        sb.append("setVariableResponse");
        sb.append('=');
        sb.append(((this.setVariableResponse == null)?"<null>":this.setVariableResponse));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("sourceArguments");
        sb.append('=');
        sb.append(((this.sourceArguments == null)?"<null>":this.sourceArguments));
        sb.append(',');
        sb.append("sourceBreakpoint");
        sb.append('=');
        sb.append(((this.sourceBreakpoint == null)?"<null>":this.sourceBreakpoint));
        sb.append(',');
        sb.append("sourceRequest");
        sb.append('=');
        sb.append(((this.sourceRequest == null)?"<null>":this.sourceRequest));
        sb.append(',');
        sb.append("sourceResponse");
        sb.append('=');
        sb.append(((this.sourceResponse == null)?"<null>":this.sourceResponse));
        sb.append(',');
        sb.append("stackFrame");
        sb.append('=');
        sb.append(((this.stackFrame == null)?"<null>":this.stackFrame));
        sb.append(',');
        sb.append("stackFrameFormat");
        sb.append('=');
        sb.append(((this.stackFrameFormat == null)?"<null>":this.stackFrameFormat));
        sb.append(',');
        sb.append("stackTraceArguments");
        sb.append('=');
        sb.append(((this.stackTraceArguments == null)?"<null>":this.stackTraceArguments));
        sb.append(',');
        sb.append("stackTraceRequest");
        sb.append('=');
        sb.append(((this.stackTraceRequest == null)?"<null>":this.stackTraceRequest));
        sb.append(',');
        sb.append("stackTraceResponse");
        sb.append('=');
        sb.append(((this.stackTraceResponse == null)?"<null>":this.stackTraceResponse));
        sb.append(',');
        sb.append("startDebuggingRequest");
        sb.append('=');
        sb.append(((this.startDebuggingRequest == null)?"<null>":this.startDebuggingRequest));
        sb.append(',');
        sb.append("startDebuggingRequestArguments");
        sb.append('=');
        sb.append(((this.startDebuggingRequestArguments == null)?"<null>":this.startDebuggingRequestArguments));
        sb.append(',');
        sb.append("startDebuggingResponse");
        sb.append('=');
        sb.append(((this.startDebuggingResponse == null)?"<null>":this.startDebuggingResponse));
        sb.append(',');
        sb.append("stepBackArguments");
        sb.append('=');
        sb.append(((this.stepBackArguments == null)?"<null>":this.stepBackArguments));
        sb.append(',');
        sb.append("stepBackRequest");
        sb.append('=');
        sb.append(((this.stepBackRequest == null)?"<null>":this.stepBackRequest));
        sb.append(',');
        sb.append("stepBackResponse");
        sb.append('=');
        sb.append(((this.stepBackResponse == null)?"<null>":this.stepBackResponse));
        sb.append(',');
        sb.append("stepInArguments");
        sb.append('=');
        sb.append(((this.stepInArguments == null)?"<null>":this.stepInArguments));
        sb.append(',');
        sb.append("stepInRequest");
        sb.append('=');
        sb.append(((this.stepInRequest == null)?"<null>":this.stepInRequest));
        sb.append(',');
        sb.append("stepInResponse");
        sb.append('=');
        sb.append(((this.stepInResponse == null)?"<null>":this.stepInResponse));
        sb.append(',');
        sb.append("stepInTarget");
        sb.append('=');
        sb.append(((this.stepInTarget == null)?"<null>":this.stepInTarget));
        sb.append(',');
        sb.append("stepInTargetsArguments");
        sb.append('=');
        sb.append(((this.stepInTargetsArguments == null)?"<null>":this.stepInTargetsArguments));
        sb.append(',');
        sb.append("stepInTargetsRequest");
        sb.append('=');
        sb.append(((this.stepInTargetsRequest == null)?"<null>":this.stepInTargetsRequest));
        sb.append(',');
        sb.append("stepInTargetsResponse");
        sb.append('=');
        sb.append(((this.stepInTargetsResponse == null)?"<null>":this.stepInTargetsResponse));
        sb.append(',');
        sb.append("stepOutArguments");
        sb.append('=');
        sb.append(((this.stepOutArguments == null)?"<null>":this.stepOutArguments));
        sb.append(',');
        sb.append("stepOutRequest");
        sb.append('=');
        sb.append(((this.stepOutRequest == null)?"<null>":this.stepOutRequest));
        sb.append(',');
        sb.append("stepOutResponse");
        sb.append('=');
        sb.append(((this.stepOutResponse == null)?"<null>":this.stepOutResponse));
        sb.append(',');
        sb.append("steppingGranularity");
        sb.append('=');
        sb.append(((this.steppingGranularity == null)?"<null>":this.steppingGranularity));
        sb.append(',');
        sb.append("stoppedEvent");
        sb.append('=');
        sb.append(((this.stoppedEvent == null)?"<null>":this.stoppedEvent));
        sb.append(',');
        sb.append("terminateArguments");
        sb.append('=');
        sb.append(((this.terminateArguments == null)?"<null>":this.terminateArguments));
        sb.append(',');
        sb.append("terminateRequest");
        sb.append('=');
        sb.append(((this.terminateRequest == null)?"<null>":this.terminateRequest));
        sb.append(',');
        sb.append("terminateResponse");
        sb.append('=');
        sb.append(((this.terminateResponse == null)?"<null>":this.terminateResponse));
        sb.append(',');
        sb.append("terminateThreadsArguments");
        sb.append('=');
        sb.append(((this.terminateThreadsArguments == null)?"<null>":this.terminateThreadsArguments));
        sb.append(',');
        sb.append("terminateThreadsRequest");
        sb.append('=');
        sb.append(((this.terminateThreadsRequest == null)?"<null>":this.terminateThreadsRequest));
        sb.append(',');
        sb.append("terminateThreadsResponse");
        sb.append('=');
        sb.append(((this.terminateThreadsResponse == null)?"<null>":this.terminateThreadsResponse));
        sb.append(',');
        sb.append("terminatedEvent");
        sb.append('=');
        sb.append(((this.terminatedEvent == null)?"<null>":this.terminatedEvent));
        sb.append(',');
        sb.append("thread");
        sb.append('=');
        sb.append(((this.thread == null)?"<null>":this.thread));
        sb.append(',');
        sb.append("threadEvent");
        sb.append('=');
        sb.append(((this.threadEvent == null)?"<null>":this.threadEvent));
        sb.append(',');
        sb.append("threadsRequest");
        sb.append('=');
        sb.append(((this.threadsRequest == null)?"<null>":this.threadsRequest));
        sb.append(',');
        sb.append("threadsResponse");
        sb.append('=');
        sb.append(((this.threadsResponse == null)?"<null>":this.threadsResponse));
        sb.append(',');
        sb.append("valueFormat");
        sb.append('=');
        sb.append(((this.valueFormat == null)?"<null>":this.valueFormat));
        sb.append(',');
        sb.append("variable");
        sb.append('=');
        sb.append(((this.variable == null)?"<null>":this.variable));
        sb.append(',');
        sb.append("variablePresentationHint");
        sb.append('=');
        sb.append(((this.variablePresentationHint == null)?"<null>":this.variablePresentationHint));
        sb.append(',');
        sb.append("variablesArguments");
        sb.append('=');
        sb.append(((this.variablesArguments == null)?"<null>":this.variablesArguments));
        sb.append(',');
        sb.append("variablesRequest");
        sb.append('=');
        sb.append(((this.variablesRequest == null)?"<null>":this.variablesRequest));
        sb.append(',');
        sb.append("variablesResponse");
        sb.append('=');
        sb.append(((this.variablesResponse == null)?"<null>":this.variablesResponse));
        sb.append(',');
        sb.append("writeMemoryArguments");
        sb.append('=');
        sb.append(((this.writeMemoryArguments == null)?"<null>":this.writeMemoryArguments));
        sb.append(',');
        sb.append("writeMemoryRequest");
        sb.append('=');
        sb.append(((this.writeMemoryRequest == null)?"<null>":this.writeMemoryRequest));
        sb.append(',');
        sb.append("writeMemoryResponse");
        sb.append('=');
        sb.append(((this.writeMemoryResponse == null)?"<null>":this.writeMemoryResponse));
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
        result = ((result* 31)+((this.setFunctionBreakpointsResponse == null)? 0 :this.setFunctionBreakpointsResponse.hashCode()));
        result = ((result* 31)+((this.breakpointLocation == null)? 0 :this.breakpointLocation.hashCode()));
        result = ((result* 31)+((this.sourceRequest == null)? 0 :this.sourceRequest.hashCode()));
        result = ((result* 31)+((this.writeMemoryArguments == null)? 0 :this.writeMemoryArguments.hashCode()));
        result = ((result* 31)+((this.continueArguments == null)? 0 :this.continueArguments.hashCode()));
        result = ((result* 31)+((this.processEvent == null)? 0 :this.processEvent.hashCode()));
        result = ((result* 31)+((this.stepInTargetsArguments == null)? 0 :this.stepInTargetsArguments.hashCode()));
        result = ((result* 31)+((this.terminateThreadsRequest == null)? 0 :this.terminateThreadsRequest.hashCode()));
        result = ((result* 31)+((this.exceptionInfoResponse == null)? 0 :this.exceptionInfoResponse.hashCode()));
        result = ((result* 31)+((this.progressEndEvent == null)? 0 :this.progressEndEvent.hashCode()));
        result = ((result* 31)+((this.sourceResponse == null)? 0 :this.sourceResponse.hashCode()));
        result = ((result* 31)+((this.setExceptionBreakpointsResponse == null)? 0 :this.setExceptionBreakpointsResponse.hashCode()));
        result = ((result* 31)+((this.instructionBreakpoint == null)? 0 :this.instructionBreakpoint.hashCode()));
        result = ((result* 31)+((this.restartArguments == null)? 0 :this.restartArguments.hashCode()));
        result = ((result* 31)+((this.loadedSourcesArguments == null)? 0 :this.loadedSourcesArguments.hashCode()));
        result = ((result* 31)+((this.loadedSourcesResponse == null)? 0 :this.loadedSourcesResponse.hashCode()));
        result = ((result* 31)+((this.stepOutArguments == null)? 0 :this.stepOutArguments.hashCode()));
        result = ((result* 31)+((this.launchRequestArguments == null)? 0 :this.launchRequestArguments.hashCode()));
        result = ((result* 31)+((this.stepInArguments == null)? 0 :this.stepInArguments.hashCode()));
        result = ((result* 31)+((this.threadEvent == null)? 0 :this.threadEvent.hashCode()));
        result = ((result* 31)+((this.readMemoryArguments == null)? 0 :this.readMemoryArguments.hashCode()));
        result = ((result* 31)+((this.setInstructionBreakpointsRequest == null)? 0 :this.setInstructionBreakpointsRequest.hashCode()));
        result = ((result* 31)+((this.disassembleArguments == null)? 0 :this.disassembleArguments.hashCode()));
        result = ((result* 31)+((this.protocolMessage == null)? 0 :this.protocolMessage.hashCode()));
        result = ((result* 31)+((this.setInstructionBreakpointsResponse == null)? 0 :this.setInstructionBreakpointsResponse.hashCode()));
        result = ((result* 31)+((this.exceptionInfoArguments == null)? 0 :this.exceptionInfoArguments.hashCode()));
        result = ((result* 31)+((this.exceptionDetails == null)? 0 :this.exceptionDetails.hashCode()));
        result = ((result* 31)+((this.module == null)? 0 :this.module.hashCode()));
        result = ((result* 31)+((this.steppingGranularity == null)? 0 :this.steppingGranularity.hashCode()));
        result = ((result* 31)+((this.gotoTarget == null)? 0 :this.gotoTarget.hashCode()));
        result = ((result* 31)+((this.setVariableRequest == null)? 0 :this.setVariableRequest.hashCode()));
        result = ((result* 31)+((this.setFunctionBreakpointsArguments == null)? 0 :this.setFunctionBreakpointsArguments.hashCode()));
        result = ((result* 31)+((this.stackTraceArguments == null)? 0 :this.stackTraceArguments.hashCode()));
        result = ((result* 31)+((this.gotoTargetsResponse == null)? 0 :this.gotoTargetsResponse.hashCode()));
        result = ((result* 31)+((this.setExceptionBreakpointsArguments == null)? 0 :this.setExceptionBreakpointsArguments.hashCode()));
        result = ((result* 31)+((this.reverseContinueArguments == null)? 0 :this.reverseContinueArguments.hashCode()));
        result = ((result* 31)+((this.terminateArguments == null)? 0 :this.terminateArguments.hashCode()));
        result = ((result* 31)+((this.configurationDoneRequest == null)? 0 :this.configurationDoneRequest.hashCode()));
        result = ((result* 31)+((this.continueRequest == null)? 0 :this.continueRequest.hashCode()));
        result = ((result* 31)+((this.sourceArguments == null)? 0 :this.sourceArguments.hashCode()));
        result = ((result* 31)+((this.memoryEvent == null)? 0 :this.memoryEvent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.exceptionFilterOptions == null)? 0 :this.exceptionFilterOptions.hashCode()));
        result = ((result* 31)+((this.setExceptionBreakpointsRequest == null)? 0 :this.setExceptionBreakpointsRequest.hashCode()));
        result = ((result* 31)+((this.restartRequest == null)? 0 :this.restartRequest.hashCode()));
        result = ((result* 31)+((this.setVariableResponse == null)? 0 :this.setVariableResponse.hashCode()));
        result = ((result* 31)+((this.cancelResponse == null)? 0 :this.cancelResponse.hashCode()));
        result = ((result* 31)+((this.setBreakpointsRequest == null)? 0 :this.setBreakpointsRequest.hashCode()));
        result = ((result* 31)+((this.stepInTargetsRequest == null)? 0 :this.stepInTargetsRequest.hashCode()));
        result = ((result* 31)+((this.dataBreakpointInfoRequest == null)? 0 :this.dataBreakpointInfoRequest.hashCode()));
        result = ((result* 31)+((this.scopesArguments == null)? 0 :this.scopesArguments.hashCode()));
        result = ((result* 31)+((this.readMemoryRequest == null)? 0 :this.readMemoryRequest.hashCode()));
        result = ((result* 31)+((this.breakpointLocationsResponse == null)? 0 :this.breakpointLocationsResponse.hashCode()));
        result = ((result* 31)+((this.restartFrameArguments == null)? 0 :this.restartFrameArguments.hashCode()));
        result = ((result* 31)+((this.breakpointLocationsArguments == null)? 0 :this.breakpointLocationsArguments.hashCode()));
        result = ((result* 31)+((this.evaluateResponse == null)? 0 :this.evaluateResponse.hashCode()));
        result = ((result* 31)+((this.runInTerminalRequest == null)? 0 :this.runInTerminalRequest.hashCode()));
        result = ((result* 31)+((this.reverseContinueRequest == null)? 0 :this.reverseContinueRequest.hashCode()));
        result = ((result* 31)+((this.restartFrameResponse == null)? 0 :this.restartFrameResponse.hashCode()));
        result = ((result* 31)+((this.invalidatedEvent == null)? 0 :this.invalidatedEvent.hashCode()));
        result = ((result* 31)+((this.breakpointEvent == null)? 0 :this.breakpointEvent.hashCode()));
        result = ((result* 31)+((this.loadedSourceEvent == null)? 0 :this.loadedSourceEvent.hashCode()));
        result = ((result* 31)+((this.runInTerminalResponse == null)? 0 :this.runInTerminalResponse.hashCode()));
        result = ((result* 31)+((this.readMemoryResponse == null)? 0 :this.readMemoryResponse.hashCode()));
        result = ((result* 31)+((this.startDebuggingResponse == null)? 0 :this.startDebuggingResponse.hashCode()));
        result = ((result* 31)+((this.modulesResponse == null)? 0 :this.modulesResponse.hashCode()));
        result = ((result* 31)+((this.dataBreakpointAccessType == null)? 0 :this.dataBreakpointAccessType.hashCode()));
        result = ((result* 31)+((this.disassembleResponse == null)? 0 :this.disassembleResponse.hashCode()));
        result = ((result* 31)+((this.exceptionPathSegment == null)? 0 :this.exceptionPathSegment.hashCode()));
        result = ((result* 31)+((this.completionsArguments == null)? 0 :this.completionsArguments.hashCode()));
        result = ((result* 31)+((this.completionItem == null)? 0 :this.completionItem.hashCode()));
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        result = ((result* 31)+((this.stepBackRequest == null)? 0 :this.stepBackRequest.hashCode()));
        result = ((result* 31)+((this.evaluateArguments == null)? 0 :this.evaluateArguments.hashCode()));
        result = ((result* 31)+((this.stepInTarget == null)? 0 :this.stepInTarget.hashCode()));
        result = ((result* 31)+((this.dataBreakpointInfoArguments == null)? 0 :this.dataBreakpointInfoArguments.hashCode()));
        result = ((result* 31)+((this.nextArguments == null)? 0 :this.nextArguments.hashCode()));
        result = ((result* 31)+((this.progressUpdateEvent == null)? 0 :this.progressUpdateEvent.hashCode()));
        result = ((result* 31)+((this.setDataBreakpointsArguments == null)? 0 :this.setDataBreakpointsArguments.hashCode()));
        result = ((result* 31)+((this.exitedEvent == null)? 0 :this.exitedEvent.hashCode()));
        result = ((result* 31)+((this.terminateRequest == null)? 0 :this.terminateRequest.hashCode()));
        result = ((result* 31)+((this.launchResponse == null)? 0 :this.launchResponse.hashCode()));
        result = ((result* 31)+((this.gotoArguments == null)? 0 :this.gotoArguments.hashCode()));
        result = ((result* 31)+((this.setDataBreakpointsResponse == null)? 0 :this.setDataBreakpointsResponse.hashCode()));
        result = ((result* 31)+((this.valueFormat == null)? 0 :this.valueFormat.hashCode()));
        result = ((result* 31)+((this.runInTerminalRequestArguments == null)? 0 :this.runInTerminalRequestArguments.hashCode()));
        result = ((result* 31)+((this.variablePresentationHint == null)? 0 :this.variablePresentationHint.hashCode()));
        result = ((result* 31)+((this.breakpoint == null)? 0 :this.breakpoint.hashCode()));
        result = ((result* 31)+((this.variablesResponse == null)? 0 :this.variablesResponse.hashCode()));
        result = ((result* 31)+((this.stepOutResponse == null)? 0 :this.stepOutResponse.hashCode()));
        result = ((result* 31)+((this.continueResponse == null)? 0 :this.continueResponse.hashCode()));
        result = ((result* 31)+((this.writeMemoryResponse == null)? 0 :this.writeMemoryResponse.hashCode()));
        result = ((result* 31)+((this.setBreakpointsResponse == null)? 0 :this.setBreakpointsResponse.hashCode()));
        result = ((result* 31)+((this.outputEvent == null)? 0 :this.outputEvent.hashCode()));
        result = ((result* 31)+((this.columnDescriptor == null)? 0 :this.columnDescriptor.hashCode()));
        result = ((result* 31)+((this.scopesRequest == null)? 0 :this.scopesRequest.hashCode()));
        result = ((result* 31)+((this.attachRequestArguments == null)? 0 :this.attachRequestArguments.hashCode()));
        result = ((result* 31)+((this.stepInResponse == null)? 0 :this.stepInResponse.hashCode()));
        result = ((result* 31)+((this.setInstructionBreakpointsArguments == null)? 0 :this.setInstructionBreakpointsArguments.hashCode()));
        result = ((result* 31)+((this.launchRequest == null)? 0 :this.launchRequest.hashCode()));
        result = ((result* 31)+((this.variablesRequest == null)? 0 :this.variablesRequest.hashCode()));
        result = ((result* 31)+((this.modulesArguments == null)? 0 :this.modulesArguments.hashCode()));
        result = ((result* 31)+((this.startDebuggingRequest == null)? 0 :this.startDebuggingRequest.hashCode()));
        result = ((result* 31)+((this.continuedEvent == null)? 0 :this.continuedEvent.hashCode()));
        result = ((result* 31)+((this.exceptionInfoRequest == null)? 0 :this.exceptionInfoRequest.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.terminatedEvent == null)? 0 :this.terminatedEvent.hashCode()));
        result = ((result* 31)+((this.stackFrameFormat == null)? 0 :this.stackFrameFormat.hashCode()));
        result = ((result* 31)+((this.exceptionBreakpointsFilter == null)? 0 :this.exceptionBreakpointsFilter.hashCode()));
        result = ((result* 31)+((this.capabilitiesEvent == null)? 0 :this.capabilitiesEvent.hashCode()));
        result = ((result* 31)+((this.disassembledInstruction == null)? 0 :this.disassembledInstruction.hashCode()));
        result = ((result* 31)+((this.threadsResponse == null)? 0 :this.threadsResponse.hashCode()));
        result = ((result* 31)+((this.variablesArguments == null)? 0 :this.variablesArguments.hashCode()));
        result = ((result* 31)+((this.setBreakpointsArguments == null)? 0 :this.setBreakpointsArguments.hashCode()));
        result = ((result* 31)+((this.cancelRequest == null)? 0 :this.cancelRequest.hashCode()));
        result = ((result* 31)+((this.stepBackArguments == null)? 0 :this.stepBackArguments.hashCode()));
        result = ((result* 31)+((this.attachRequest == null)? 0 :this.attachRequest.hashCode()));
        result = ((result* 31)+((this.terminateThreadsArguments == null)? 0 :this.terminateThreadsArguments.hashCode()));
        result = ((result* 31)+((this.gotoRequest == null)? 0 :this.gotoRequest.hashCode()));
        result = ((result* 31)+((this.initializeRequest == null)? 0 :this.initializeRequest.hashCode()));
        result = ((result* 31)+((this.startDebuggingRequestArguments == null)? 0 :this.startDebuggingRequestArguments.hashCode()));
        result = ((result* 31)+((this.functionBreakpoint == null)? 0 :this.functionBreakpoint.hashCode()));
        result = ((result* 31)+((this.scopesResponse == null)? 0 :this.scopesResponse.hashCode()));
        result = ((result* 31)+((this.evaluateRequest == null)? 0 :this.evaluateRequest.hashCode()));
        result = ((result* 31)+((this.disassembleRequest == null)? 0 :this.disassembleRequest.hashCode()));
        result = ((result* 31)+((this.pauseArguments == null)? 0 :this.pauseArguments.hashCode()));
        result = ((result* 31)+((this.pauseRequest == null)? 0 :this.pauseRequest.hashCode()));
        result = ((result* 31)+((this.setFunctionBreakpointsRequest == null)? 0 :this.setFunctionBreakpointsRequest.hashCode()));
        result = ((result* 31)+((this.dataBreakpointInfoResponse == null)? 0 :this.dataBreakpointInfoResponse.hashCode()));
        result = ((result* 31)+((this.gotoTargetsRequest == null)? 0 :this.gotoTargetsRequest.hashCode()));
        result = ((result* 31)+((this.setVariableArguments == null)? 0 :this.setVariableArguments.hashCode()));
        result = ((result* 31)+((this.disconnectRequest == null)? 0 :this.disconnectRequest.hashCode()));
        result = ((result* 31)+((this.stepInRequest == null)? 0 :this.stepInRequest.hashCode()));
        result = ((result* 31)+((this.exceptionBreakMode == null)? 0 :this.exceptionBreakMode.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.loadedSourcesRequest == null)? 0 :this.loadedSourcesRequest.hashCode()));
        result = ((result* 31)+((this.cancelArguments == null)? 0 :this.cancelArguments.hashCode()));
        result = ((result* 31)+((this.configurationDoneArguments == null)? 0 :this.configurationDoneArguments.hashCode()));
        result = ((result* 31)+((this.nextResponse == null)? 0 :this.nextResponse.hashCode()));
        result = ((result* 31)+((this.stackFrame == null)? 0 :this.stackFrame.hashCode()));
        result = ((result* 31)+((this.restartFrameRequest == null)? 0 :this.restartFrameRequest.hashCode()));
        result = ((result* 31)+((this.setExpressionArguments == null)? 0 :this.setExpressionArguments.hashCode()));
        result = ((result* 31)+((this.exceptionOptions == null)? 0 :this.exceptionOptions.hashCode()));
        result = ((result* 31)+((this.completionsRequest == null)? 0 :this.completionsRequest.hashCode()));
        result = ((result* 31)+((this.sourceBreakpoint == null)? 0 :this.sourceBreakpoint.hashCode()));
        result = ((result* 31)+((this.moduleEvent == null)? 0 :this.moduleEvent.hashCode()));
        result = ((result* 31)+((this.reverseContinueResponse == null)? 0 :this.reverseContinueResponse.hashCode()));
        result = ((result* 31)+((this.setExpressionRequest == null)? 0 :this.setExpressionRequest.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        result = ((result* 31)+((this.checksum == null)? 0 :this.checksum.hashCode()));
        result = ((result* 31)+((this.invalidatedAreas == null)? 0 :this.invalidatedAreas.hashCode()));
        result = ((result* 31)+((this.breakpointLocationsRequest == null)? 0 :this.breakpointLocationsRequest.hashCode()));
        result = ((result* 31)+((this.modulesRequest == null)? 0 :this.modulesRequest.hashCode()));
        result = ((result* 31)+((this.disconnectArguments == null)? 0 :this.disconnectArguments.hashCode()));
        result = ((result* 31)+((this.pauseResponse == null)? 0 :this.pauseResponse.hashCode()));
        result = ((result* 31)+((this.capabilities == null)? 0 :this.capabilities.hashCode()));
        result = ((result* 31)+((this.gotoResponse == null)? 0 :this.gotoResponse.hashCode()));
        result = ((result* 31)+((this.dataBreakpoint == null)? 0 :this.dataBreakpoint.hashCode()));
        result = ((result* 31)+((this.completionsResponse == null)? 0 :this.completionsResponse.hashCode()));
        result = ((result* 31)+((this.stepOutRequest == null)? 0 :this.stepOutRequest.hashCode()));
        result = ((result* 31)+((this.threadsRequest == null)? 0 :this.threadsRequest.hashCode()));
        result = ((result* 31)+((this.checksumAlgorithm == null)? 0 :this.checksumAlgorithm.hashCode()));
        result = ((result* 31)+((this.setDataBreakpointsRequest == null)? 0 :this.setDataBreakpointsRequest.hashCode()));
        result = ((result* 31)+((this.thread == null)? 0 :this.thread.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.stackTraceRequest == null)? 0 :this.stackTraceRequest.hashCode()));
        result = ((result* 31)+((this.terminateThreadsResponse == null)? 0 :this.terminateThreadsResponse.hashCode()));
        result = ((result* 31)+((this.completionItemType == null)? 0 :this.completionItemType.hashCode()));
        result = ((result* 31)+((this.errorResponse == null)? 0 :this.errorResponse.hashCode()));
        result = ((result* 31)+((this.restartResponse == null)? 0 :this.restartResponse.hashCode()));
        result = ((result* 31)+((this.initializeResponse == null)? 0 :this.initializeResponse.hashCode()));
        result = ((result* 31)+((this.attachResponse == null)? 0 :this.attachResponse.hashCode()));
        result = ((result* 31)+((this.stepInTargetsResponse == null)? 0 :this.stepInTargetsResponse.hashCode()));
        result = ((result* 31)+((this.stackTraceResponse == null)? 0 :this.stackTraceResponse.hashCode()));
        result = ((result* 31)+((this.writeMemoryRequest == null)? 0 :this.writeMemoryRequest.hashCode()));
        result = ((result* 31)+((this.stoppedEvent == null)? 0 :this.stoppedEvent.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this.disconnectResponse == null)? 0 :this.disconnectResponse.hashCode()));
        result = ((result* 31)+((this.initializedEvent == null)? 0 :this.initializedEvent.hashCode()));
        result = ((result* 31)+((this.progressStartEvent == null)? 0 :this.progressStartEvent.hashCode()));
        result = ((result* 31)+((this.variable == null)? 0 :this.variable.hashCode()));
        result = ((result* 31)+((this.gotoTargetsArguments == null)? 0 :this.gotoTargetsArguments.hashCode()));
        result = ((result* 31)+((this.stepBackResponse == null)? 0 :this.stepBackResponse.hashCode()));
        result = ((result* 31)+((this.initializeRequestArguments == null)? 0 :this.initializeRequestArguments.hashCode()));
        result = ((result* 31)+((this.configurationDoneResponse == null)? 0 :this.configurationDoneResponse.hashCode()));
        result = ((result* 31)+((this.nextRequest == null)? 0 :this.nextRequest.hashCode()));
        result = ((result* 31)+((this.terminateResponse == null)? 0 :this.terminateResponse.hashCode()));
        result = ((result* 31)+((this.setExpressionResponse == null)? 0 :this.setExpressionResponse.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DebugProtocol) == false) {
            return false;
        }
        DebugProtocol rhs = ((DebugProtocol) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.setFunctionBreakpointsResponse == rhs.setFunctionBreakpointsResponse)||((this.setFunctionBreakpointsResponse!= null)&&this.setFunctionBreakpointsResponse.equals(rhs.setFunctionBreakpointsResponse)))&&((this.breakpointLocation == rhs.breakpointLocation)||((this.breakpointLocation!= null)&&this.breakpointLocation.equals(rhs.breakpointLocation))))&&((this.sourceRequest == rhs.sourceRequest)||((this.sourceRequest!= null)&&this.sourceRequest.equals(rhs.sourceRequest))))&&((this.writeMemoryArguments == rhs.writeMemoryArguments)||((this.writeMemoryArguments!= null)&&this.writeMemoryArguments.equals(rhs.writeMemoryArguments))))&&((this.continueArguments == rhs.continueArguments)||((this.continueArguments!= null)&&this.continueArguments.equals(rhs.continueArguments))))&&((this.processEvent == rhs.processEvent)||((this.processEvent!= null)&&this.processEvent.equals(rhs.processEvent))))&&((this.stepInTargetsArguments == rhs.stepInTargetsArguments)||((this.stepInTargetsArguments!= null)&&this.stepInTargetsArguments.equals(rhs.stepInTargetsArguments))))&&((this.terminateThreadsRequest == rhs.terminateThreadsRequest)||((this.terminateThreadsRequest!= null)&&this.terminateThreadsRequest.equals(rhs.terminateThreadsRequest))))&&((this.exceptionInfoResponse == rhs.exceptionInfoResponse)||((this.exceptionInfoResponse!= null)&&this.exceptionInfoResponse.equals(rhs.exceptionInfoResponse))))&&((this.progressEndEvent == rhs.progressEndEvent)||((this.progressEndEvent!= null)&&this.progressEndEvent.equals(rhs.progressEndEvent))))&&((this.sourceResponse == rhs.sourceResponse)||((this.sourceResponse!= null)&&this.sourceResponse.equals(rhs.sourceResponse))))&&((this.setExceptionBreakpointsResponse == rhs.setExceptionBreakpointsResponse)||((this.setExceptionBreakpointsResponse!= null)&&this.setExceptionBreakpointsResponse.equals(rhs.setExceptionBreakpointsResponse))))&&((this.instructionBreakpoint == rhs.instructionBreakpoint)||((this.instructionBreakpoint!= null)&&this.instructionBreakpoint.equals(rhs.instructionBreakpoint))))&&((this.restartArguments == rhs.restartArguments)||((this.restartArguments!= null)&&this.restartArguments.equals(rhs.restartArguments))))&&((this.loadedSourcesArguments == rhs.loadedSourcesArguments)||((this.loadedSourcesArguments!= null)&&this.loadedSourcesArguments.equals(rhs.loadedSourcesArguments))))&&((this.loadedSourcesResponse == rhs.loadedSourcesResponse)||((this.loadedSourcesResponse!= null)&&this.loadedSourcesResponse.equals(rhs.loadedSourcesResponse))))&&((this.stepOutArguments == rhs.stepOutArguments)||((this.stepOutArguments!= null)&&this.stepOutArguments.equals(rhs.stepOutArguments))))&&((this.launchRequestArguments == rhs.launchRequestArguments)||((this.launchRequestArguments!= null)&&this.launchRequestArguments.equals(rhs.launchRequestArguments))))&&((this.stepInArguments == rhs.stepInArguments)||((this.stepInArguments!= null)&&this.stepInArguments.equals(rhs.stepInArguments))))&&((this.threadEvent == rhs.threadEvent)||((this.threadEvent!= null)&&this.threadEvent.equals(rhs.threadEvent))))&&((this.readMemoryArguments == rhs.readMemoryArguments)||((this.readMemoryArguments!= null)&&this.readMemoryArguments.equals(rhs.readMemoryArguments))))&&((this.setInstructionBreakpointsRequest == rhs.setInstructionBreakpointsRequest)||((this.setInstructionBreakpointsRequest!= null)&&this.setInstructionBreakpointsRequest.equals(rhs.setInstructionBreakpointsRequest))))&&((this.disassembleArguments == rhs.disassembleArguments)||((this.disassembleArguments!= null)&&this.disassembleArguments.equals(rhs.disassembleArguments))))&&((this.protocolMessage == rhs.protocolMessage)||((this.protocolMessage!= null)&&this.protocolMessage.equals(rhs.protocolMessage))))&&((this.setInstructionBreakpointsResponse == rhs.setInstructionBreakpointsResponse)||((this.setInstructionBreakpointsResponse!= null)&&this.setInstructionBreakpointsResponse.equals(rhs.setInstructionBreakpointsResponse))))&&((this.exceptionInfoArguments == rhs.exceptionInfoArguments)||((this.exceptionInfoArguments!= null)&&this.exceptionInfoArguments.equals(rhs.exceptionInfoArguments))))&&((this.exceptionDetails == rhs.exceptionDetails)||((this.exceptionDetails!= null)&&this.exceptionDetails.equals(rhs.exceptionDetails))))&&((this.module == rhs.module)||((this.module!= null)&&this.module.equals(rhs.module))))&&((this.steppingGranularity == rhs.steppingGranularity)||((this.steppingGranularity!= null)&&this.steppingGranularity.equals(rhs.steppingGranularity))))&&((this.gotoTarget == rhs.gotoTarget)||((this.gotoTarget!= null)&&this.gotoTarget.equals(rhs.gotoTarget))))&&((this.setVariableRequest == rhs.setVariableRequest)||((this.setVariableRequest!= null)&&this.setVariableRequest.equals(rhs.setVariableRequest))))&&((this.setFunctionBreakpointsArguments == rhs.setFunctionBreakpointsArguments)||((this.setFunctionBreakpointsArguments!= null)&&this.setFunctionBreakpointsArguments.equals(rhs.setFunctionBreakpointsArguments))))&&((this.stackTraceArguments == rhs.stackTraceArguments)||((this.stackTraceArguments!= null)&&this.stackTraceArguments.equals(rhs.stackTraceArguments))))&&((this.gotoTargetsResponse == rhs.gotoTargetsResponse)||((this.gotoTargetsResponse!= null)&&this.gotoTargetsResponse.equals(rhs.gotoTargetsResponse))))&&((this.setExceptionBreakpointsArguments == rhs.setExceptionBreakpointsArguments)||((this.setExceptionBreakpointsArguments!= null)&&this.setExceptionBreakpointsArguments.equals(rhs.setExceptionBreakpointsArguments))))&&((this.reverseContinueArguments == rhs.reverseContinueArguments)||((this.reverseContinueArguments!= null)&&this.reverseContinueArguments.equals(rhs.reverseContinueArguments))))&&((this.terminateArguments == rhs.terminateArguments)||((this.terminateArguments!= null)&&this.terminateArguments.equals(rhs.terminateArguments))))&&((this.configurationDoneRequest == rhs.configurationDoneRequest)||((this.configurationDoneRequest!= null)&&this.configurationDoneRequest.equals(rhs.configurationDoneRequest))))&&((this.continueRequest == rhs.continueRequest)||((this.continueRequest!= null)&&this.continueRequest.equals(rhs.continueRequest))))&&((this.sourceArguments == rhs.sourceArguments)||((this.sourceArguments!= null)&&this.sourceArguments.equals(rhs.sourceArguments))))&&((this.memoryEvent == rhs.memoryEvent)||((this.memoryEvent!= null)&&this.memoryEvent.equals(rhs.memoryEvent))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.exceptionFilterOptions == rhs.exceptionFilterOptions)||((this.exceptionFilterOptions!= null)&&this.exceptionFilterOptions.equals(rhs.exceptionFilterOptions))))&&((this.setExceptionBreakpointsRequest == rhs.setExceptionBreakpointsRequest)||((this.setExceptionBreakpointsRequest!= null)&&this.setExceptionBreakpointsRequest.equals(rhs.setExceptionBreakpointsRequest))))&&((this.restartRequest == rhs.restartRequest)||((this.restartRequest!= null)&&this.restartRequest.equals(rhs.restartRequest))))&&((this.setVariableResponse == rhs.setVariableResponse)||((this.setVariableResponse!= null)&&this.setVariableResponse.equals(rhs.setVariableResponse))))&&((this.cancelResponse == rhs.cancelResponse)||((this.cancelResponse!= null)&&this.cancelResponse.equals(rhs.cancelResponse))))&&((this.setBreakpointsRequest == rhs.setBreakpointsRequest)||((this.setBreakpointsRequest!= null)&&this.setBreakpointsRequest.equals(rhs.setBreakpointsRequest))))&&((this.stepInTargetsRequest == rhs.stepInTargetsRequest)||((this.stepInTargetsRequest!= null)&&this.stepInTargetsRequest.equals(rhs.stepInTargetsRequest))))&&((this.dataBreakpointInfoRequest == rhs.dataBreakpointInfoRequest)||((this.dataBreakpointInfoRequest!= null)&&this.dataBreakpointInfoRequest.equals(rhs.dataBreakpointInfoRequest))))&&((this.scopesArguments == rhs.scopesArguments)||((this.scopesArguments!= null)&&this.scopesArguments.equals(rhs.scopesArguments))))&&((this.readMemoryRequest == rhs.readMemoryRequest)||((this.readMemoryRequest!= null)&&this.readMemoryRequest.equals(rhs.readMemoryRequest))))&&((this.breakpointLocationsResponse == rhs.breakpointLocationsResponse)||((this.breakpointLocationsResponse!= null)&&this.breakpointLocationsResponse.equals(rhs.breakpointLocationsResponse))))&&((this.restartFrameArguments == rhs.restartFrameArguments)||((this.restartFrameArguments!= null)&&this.restartFrameArguments.equals(rhs.restartFrameArguments))))&&((this.breakpointLocationsArguments == rhs.breakpointLocationsArguments)||((this.breakpointLocationsArguments!= null)&&this.breakpointLocationsArguments.equals(rhs.breakpointLocationsArguments))))&&((this.evaluateResponse == rhs.evaluateResponse)||((this.evaluateResponse!= null)&&this.evaluateResponse.equals(rhs.evaluateResponse))))&&((this.runInTerminalRequest == rhs.runInTerminalRequest)||((this.runInTerminalRequest!= null)&&this.runInTerminalRequest.equals(rhs.runInTerminalRequest))))&&((this.reverseContinueRequest == rhs.reverseContinueRequest)||((this.reverseContinueRequest!= null)&&this.reverseContinueRequest.equals(rhs.reverseContinueRequest))))&&((this.restartFrameResponse == rhs.restartFrameResponse)||((this.restartFrameResponse!= null)&&this.restartFrameResponse.equals(rhs.restartFrameResponse))))&&((this.invalidatedEvent == rhs.invalidatedEvent)||((this.invalidatedEvent!= null)&&this.invalidatedEvent.equals(rhs.invalidatedEvent))))&&((this.breakpointEvent == rhs.breakpointEvent)||((this.breakpointEvent!= null)&&this.breakpointEvent.equals(rhs.breakpointEvent))))&&((this.loadedSourceEvent == rhs.loadedSourceEvent)||((this.loadedSourceEvent!= null)&&this.loadedSourceEvent.equals(rhs.loadedSourceEvent))))&&((this.runInTerminalResponse == rhs.runInTerminalResponse)||((this.runInTerminalResponse!= null)&&this.runInTerminalResponse.equals(rhs.runInTerminalResponse))))&&((this.readMemoryResponse == rhs.readMemoryResponse)||((this.readMemoryResponse!= null)&&this.readMemoryResponse.equals(rhs.readMemoryResponse))))&&((this.startDebuggingResponse == rhs.startDebuggingResponse)||((this.startDebuggingResponse!= null)&&this.startDebuggingResponse.equals(rhs.startDebuggingResponse))))&&((this.modulesResponse == rhs.modulesResponse)||((this.modulesResponse!= null)&&this.modulesResponse.equals(rhs.modulesResponse))))&&((this.dataBreakpointAccessType == rhs.dataBreakpointAccessType)||((this.dataBreakpointAccessType!= null)&&this.dataBreakpointAccessType.equals(rhs.dataBreakpointAccessType))))&&((this.disassembleResponse == rhs.disassembleResponse)||((this.disassembleResponse!= null)&&this.disassembleResponse.equals(rhs.disassembleResponse))))&&((this.exceptionPathSegment == rhs.exceptionPathSegment)||((this.exceptionPathSegment!= null)&&this.exceptionPathSegment.equals(rhs.exceptionPathSegment))))&&((this.completionsArguments == rhs.completionsArguments)||((this.completionsArguments!= null)&&this.completionsArguments.equals(rhs.completionsArguments))))&&((this.completionItem == rhs.completionItem)||((this.completionItem!= null)&&this.completionItem.equals(rhs.completionItem))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))))&&((this.stepBackRequest == rhs.stepBackRequest)||((this.stepBackRequest!= null)&&this.stepBackRequest.equals(rhs.stepBackRequest))))&&((this.evaluateArguments == rhs.evaluateArguments)||((this.evaluateArguments!= null)&&this.evaluateArguments.equals(rhs.evaluateArguments))))&&((this.stepInTarget == rhs.stepInTarget)||((this.stepInTarget!= null)&&this.stepInTarget.equals(rhs.stepInTarget))))&&((this.dataBreakpointInfoArguments == rhs.dataBreakpointInfoArguments)||((this.dataBreakpointInfoArguments!= null)&&this.dataBreakpointInfoArguments.equals(rhs.dataBreakpointInfoArguments))))&&((this.nextArguments == rhs.nextArguments)||((this.nextArguments!= null)&&this.nextArguments.equals(rhs.nextArguments))))&&((this.progressUpdateEvent == rhs.progressUpdateEvent)||((this.progressUpdateEvent!= null)&&this.progressUpdateEvent.equals(rhs.progressUpdateEvent))))&&((this.setDataBreakpointsArguments == rhs.setDataBreakpointsArguments)||((this.setDataBreakpointsArguments!= null)&&this.setDataBreakpointsArguments.equals(rhs.setDataBreakpointsArguments))))&&((this.exitedEvent == rhs.exitedEvent)||((this.exitedEvent!= null)&&this.exitedEvent.equals(rhs.exitedEvent))))&&((this.terminateRequest == rhs.terminateRequest)||((this.terminateRequest!= null)&&this.terminateRequest.equals(rhs.terminateRequest))))&&((this.launchResponse == rhs.launchResponse)||((this.launchResponse!= null)&&this.launchResponse.equals(rhs.launchResponse))))&&((this.gotoArguments == rhs.gotoArguments)||((this.gotoArguments!= null)&&this.gotoArguments.equals(rhs.gotoArguments))))&&((this.setDataBreakpointsResponse == rhs.setDataBreakpointsResponse)||((this.setDataBreakpointsResponse!= null)&&this.setDataBreakpointsResponse.equals(rhs.setDataBreakpointsResponse))))&&((this.valueFormat == rhs.valueFormat)||((this.valueFormat!= null)&&this.valueFormat.equals(rhs.valueFormat))))&&((this.runInTerminalRequestArguments == rhs.runInTerminalRequestArguments)||((this.runInTerminalRequestArguments!= null)&&this.runInTerminalRequestArguments.equals(rhs.runInTerminalRequestArguments))))&&((this.variablePresentationHint == rhs.variablePresentationHint)||((this.variablePresentationHint!= null)&&this.variablePresentationHint.equals(rhs.variablePresentationHint))))&&((this.breakpoint == rhs.breakpoint)||((this.breakpoint!= null)&&this.breakpoint.equals(rhs.breakpoint))))&&((this.variablesResponse == rhs.variablesResponse)||((this.variablesResponse!= null)&&this.variablesResponse.equals(rhs.variablesResponse))))&&((this.stepOutResponse == rhs.stepOutResponse)||((this.stepOutResponse!= null)&&this.stepOutResponse.equals(rhs.stepOutResponse))))&&((this.continueResponse == rhs.continueResponse)||((this.continueResponse!= null)&&this.continueResponse.equals(rhs.continueResponse))))&&((this.writeMemoryResponse == rhs.writeMemoryResponse)||((this.writeMemoryResponse!= null)&&this.writeMemoryResponse.equals(rhs.writeMemoryResponse))))&&((this.setBreakpointsResponse == rhs.setBreakpointsResponse)||((this.setBreakpointsResponse!= null)&&this.setBreakpointsResponse.equals(rhs.setBreakpointsResponse))))&&((this.outputEvent == rhs.outputEvent)||((this.outputEvent!= null)&&this.outputEvent.equals(rhs.outputEvent))))&&((this.columnDescriptor == rhs.columnDescriptor)||((this.columnDescriptor!= null)&&this.columnDescriptor.equals(rhs.columnDescriptor))))&&((this.scopesRequest == rhs.scopesRequest)||((this.scopesRequest!= null)&&this.scopesRequest.equals(rhs.scopesRequest))))&&((this.attachRequestArguments == rhs.attachRequestArguments)||((this.attachRequestArguments!= null)&&this.attachRequestArguments.equals(rhs.attachRequestArguments))))&&((this.stepInResponse == rhs.stepInResponse)||((this.stepInResponse!= null)&&this.stepInResponse.equals(rhs.stepInResponse))))&&((this.setInstructionBreakpointsArguments == rhs.setInstructionBreakpointsArguments)||((this.setInstructionBreakpointsArguments!= null)&&this.setInstructionBreakpointsArguments.equals(rhs.setInstructionBreakpointsArguments))))&&((this.launchRequest == rhs.launchRequest)||((this.launchRequest!= null)&&this.launchRequest.equals(rhs.launchRequest))))&&((this.variablesRequest == rhs.variablesRequest)||((this.variablesRequest!= null)&&this.variablesRequest.equals(rhs.variablesRequest))))&&((this.modulesArguments == rhs.modulesArguments)||((this.modulesArguments!= null)&&this.modulesArguments.equals(rhs.modulesArguments))))&&((this.startDebuggingRequest == rhs.startDebuggingRequest)||((this.startDebuggingRequest!= null)&&this.startDebuggingRequest.equals(rhs.startDebuggingRequest))))&&((this.continuedEvent == rhs.continuedEvent)||((this.continuedEvent!= null)&&this.continuedEvent.equals(rhs.continuedEvent))))&&((this.exceptionInfoRequest == rhs.exceptionInfoRequest)||((this.exceptionInfoRequest!= null)&&this.exceptionInfoRequest.equals(rhs.exceptionInfoRequest))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.terminatedEvent == rhs.terminatedEvent)||((this.terminatedEvent!= null)&&this.terminatedEvent.equals(rhs.terminatedEvent))))&&((this.stackFrameFormat == rhs.stackFrameFormat)||((this.stackFrameFormat!= null)&&this.stackFrameFormat.equals(rhs.stackFrameFormat))))&&((this.exceptionBreakpointsFilter == rhs.exceptionBreakpointsFilter)||((this.exceptionBreakpointsFilter!= null)&&this.exceptionBreakpointsFilter.equals(rhs.exceptionBreakpointsFilter))))&&((this.capabilitiesEvent == rhs.capabilitiesEvent)||((this.capabilitiesEvent!= null)&&this.capabilitiesEvent.equals(rhs.capabilitiesEvent))))&&((this.disassembledInstruction == rhs.disassembledInstruction)||((this.disassembledInstruction!= null)&&this.disassembledInstruction.equals(rhs.disassembledInstruction))))&&((this.threadsResponse == rhs.threadsResponse)||((this.threadsResponse!= null)&&this.threadsResponse.equals(rhs.threadsResponse))))&&((this.variablesArguments == rhs.variablesArguments)||((this.variablesArguments!= null)&&this.variablesArguments.equals(rhs.variablesArguments))))&&((this.setBreakpointsArguments == rhs.setBreakpointsArguments)||((this.setBreakpointsArguments!= null)&&this.setBreakpointsArguments.equals(rhs.setBreakpointsArguments))))&&((this.cancelRequest == rhs.cancelRequest)||((this.cancelRequest!= null)&&this.cancelRequest.equals(rhs.cancelRequest))))&&((this.stepBackArguments == rhs.stepBackArguments)||((this.stepBackArguments!= null)&&this.stepBackArguments.equals(rhs.stepBackArguments))))&&((this.attachRequest == rhs.attachRequest)||((this.attachRequest!= null)&&this.attachRequest.equals(rhs.attachRequest))))&&((this.terminateThreadsArguments == rhs.terminateThreadsArguments)||((this.terminateThreadsArguments!= null)&&this.terminateThreadsArguments.equals(rhs.terminateThreadsArguments))))&&((this.gotoRequest == rhs.gotoRequest)||((this.gotoRequest!= null)&&this.gotoRequest.equals(rhs.gotoRequest))))&&((this.initializeRequest == rhs.initializeRequest)||((this.initializeRequest!= null)&&this.initializeRequest.equals(rhs.initializeRequest))))&&((this.startDebuggingRequestArguments == rhs.startDebuggingRequestArguments)||((this.startDebuggingRequestArguments!= null)&&this.startDebuggingRequestArguments.equals(rhs.startDebuggingRequestArguments))))&&((this.functionBreakpoint == rhs.functionBreakpoint)||((this.functionBreakpoint!= null)&&this.functionBreakpoint.equals(rhs.functionBreakpoint))))&&((this.scopesResponse == rhs.scopesResponse)||((this.scopesResponse!= null)&&this.scopesResponse.equals(rhs.scopesResponse))))&&((this.evaluateRequest == rhs.evaluateRequest)||((this.evaluateRequest!= null)&&this.evaluateRequest.equals(rhs.evaluateRequest))))&&((this.disassembleRequest == rhs.disassembleRequest)||((this.disassembleRequest!= null)&&this.disassembleRequest.equals(rhs.disassembleRequest))))&&((this.pauseArguments == rhs.pauseArguments)||((this.pauseArguments!= null)&&this.pauseArguments.equals(rhs.pauseArguments))))&&((this.pauseRequest == rhs.pauseRequest)||((this.pauseRequest!= null)&&this.pauseRequest.equals(rhs.pauseRequest))))&&((this.setFunctionBreakpointsRequest == rhs.setFunctionBreakpointsRequest)||((this.setFunctionBreakpointsRequest!= null)&&this.setFunctionBreakpointsRequest.equals(rhs.setFunctionBreakpointsRequest))))&&((this.dataBreakpointInfoResponse == rhs.dataBreakpointInfoResponse)||((this.dataBreakpointInfoResponse!= null)&&this.dataBreakpointInfoResponse.equals(rhs.dataBreakpointInfoResponse))))&&((this.gotoTargetsRequest == rhs.gotoTargetsRequest)||((this.gotoTargetsRequest!= null)&&this.gotoTargetsRequest.equals(rhs.gotoTargetsRequest))))&&((this.setVariableArguments == rhs.setVariableArguments)||((this.setVariableArguments!= null)&&this.setVariableArguments.equals(rhs.setVariableArguments))))&&((this.disconnectRequest == rhs.disconnectRequest)||((this.disconnectRequest!= null)&&this.disconnectRequest.equals(rhs.disconnectRequest))))&&((this.stepInRequest == rhs.stepInRequest)||((this.stepInRequest!= null)&&this.stepInRequest.equals(rhs.stepInRequest))))&&((this.exceptionBreakMode == rhs.exceptionBreakMode)||((this.exceptionBreakMode!= null)&&this.exceptionBreakMode.equals(rhs.exceptionBreakMode))))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.loadedSourcesRequest == rhs.loadedSourcesRequest)||((this.loadedSourcesRequest!= null)&&this.loadedSourcesRequest.equals(rhs.loadedSourcesRequest))))&&((this.cancelArguments == rhs.cancelArguments)||((this.cancelArguments!= null)&&this.cancelArguments.equals(rhs.cancelArguments))))&&((this.configurationDoneArguments == rhs.configurationDoneArguments)||((this.configurationDoneArguments!= null)&&this.configurationDoneArguments.equals(rhs.configurationDoneArguments))))&&((this.nextResponse == rhs.nextResponse)||((this.nextResponse!= null)&&this.nextResponse.equals(rhs.nextResponse))))&&((this.stackFrame == rhs.stackFrame)||((this.stackFrame!= null)&&this.stackFrame.equals(rhs.stackFrame))))&&((this.restartFrameRequest == rhs.restartFrameRequest)||((this.restartFrameRequest!= null)&&this.restartFrameRequest.equals(rhs.restartFrameRequest))))&&((this.setExpressionArguments == rhs.setExpressionArguments)||((this.setExpressionArguments!= null)&&this.setExpressionArguments.equals(rhs.setExpressionArguments))))&&((this.exceptionOptions == rhs.exceptionOptions)||((this.exceptionOptions!= null)&&this.exceptionOptions.equals(rhs.exceptionOptions))))&&((this.completionsRequest == rhs.completionsRequest)||((this.completionsRequest!= null)&&this.completionsRequest.equals(rhs.completionsRequest))))&&((this.sourceBreakpoint == rhs.sourceBreakpoint)||((this.sourceBreakpoint!= null)&&this.sourceBreakpoint.equals(rhs.sourceBreakpoint))))&&((this.moduleEvent == rhs.moduleEvent)||((this.moduleEvent!= null)&&this.moduleEvent.equals(rhs.moduleEvent))))&&((this.reverseContinueResponse == rhs.reverseContinueResponse)||((this.reverseContinueResponse!= null)&&this.reverseContinueResponse.equals(rhs.reverseContinueResponse))))&&((this.setExpressionRequest == rhs.setExpressionRequest)||((this.setExpressionRequest!= null)&&this.setExpressionRequest.equals(rhs.setExpressionRequest))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))))&&((this.checksum == rhs.checksum)||((this.checksum!= null)&&this.checksum.equals(rhs.checksum))))&&((this.invalidatedAreas == rhs.invalidatedAreas)||((this.invalidatedAreas!= null)&&this.invalidatedAreas.equals(rhs.invalidatedAreas))))&&((this.breakpointLocationsRequest == rhs.breakpointLocationsRequest)||((this.breakpointLocationsRequest!= null)&&this.breakpointLocationsRequest.equals(rhs.breakpointLocationsRequest))))&&((this.modulesRequest == rhs.modulesRequest)||((this.modulesRequest!= null)&&this.modulesRequest.equals(rhs.modulesRequest))))&&((this.disconnectArguments == rhs.disconnectArguments)||((this.disconnectArguments!= null)&&this.disconnectArguments.equals(rhs.disconnectArguments))))&&((this.pauseResponse == rhs.pauseResponse)||((this.pauseResponse!= null)&&this.pauseResponse.equals(rhs.pauseResponse))))&&((this.capabilities == rhs.capabilities)||((this.capabilities!= null)&&this.capabilities.equals(rhs.capabilities))))&&((this.gotoResponse == rhs.gotoResponse)||((this.gotoResponse!= null)&&this.gotoResponse.equals(rhs.gotoResponse))))&&((this.dataBreakpoint == rhs.dataBreakpoint)||((this.dataBreakpoint!= null)&&this.dataBreakpoint.equals(rhs.dataBreakpoint))))&&((this.completionsResponse == rhs.completionsResponse)||((this.completionsResponse!= null)&&this.completionsResponse.equals(rhs.completionsResponse))))&&((this.stepOutRequest == rhs.stepOutRequest)||((this.stepOutRequest!= null)&&this.stepOutRequest.equals(rhs.stepOutRequest))))&&((this.threadsRequest == rhs.threadsRequest)||((this.threadsRequest!= null)&&this.threadsRequest.equals(rhs.threadsRequest))))&&((this.checksumAlgorithm == rhs.checksumAlgorithm)||((this.checksumAlgorithm!= null)&&this.checksumAlgorithm.equals(rhs.checksumAlgorithm))))&&((this.setDataBreakpointsRequest == rhs.setDataBreakpointsRequest)||((this.setDataBreakpointsRequest!= null)&&this.setDataBreakpointsRequest.equals(rhs.setDataBreakpointsRequest))))&&((this.thread == rhs.thread)||((this.thread!= null)&&this.thread.equals(rhs.thread))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.stackTraceRequest == rhs.stackTraceRequest)||((this.stackTraceRequest!= null)&&this.stackTraceRequest.equals(rhs.stackTraceRequest))))&&((this.terminateThreadsResponse == rhs.terminateThreadsResponse)||((this.terminateThreadsResponse!= null)&&this.terminateThreadsResponse.equals(rhs.terminateThreadsResponse))))&&((this.completionItemType == rhs.completionItemType)||((this.completionItemType!= null)&&this.completionItemType.equals(rhs.completionItemType))))&&((this.errorResponse == rhs.errorResponse)||((this.errorResponse!= null)&&this.errorResponse.equals(rhs.errorResponse))))&&((this.restartResponse == rhs.restartResponse)||((this.restartResponse!= null)&&this.restartResponse.equals(rhs.restartResponse))))&&((this.initializeResponse == rhs.initializeResponse)||((this.initializeResponse!= null)&&this.initializeResponse.equals(rhs.initializeResponse))))&&((this.attachResponse == rhs.attachResponse)||((this.attachResponse!= null)&&this.attachResponse.equals(rhs.attachResponse))))&&((this.stepInTargetsResponse == rhs.stepInTargetsResponse)||((this.stepInTargetsResponse!= null)&&this.stepInTargetsResponse.equals(rhs.stepInTargetsResponse))))&&((this.stackTraceResponse == rhs.stackTraceResponse)||((this.stackTraceResponse!= null)&&this.stackTraceResponse.equals(rhs.stackTraceResponse))))&&((this.writeMemoryRequest == rhs.writeMemoryRequest)||((this.writeMemoryRequest!= null)&&this.writeMemoryRequest.equals(rhs.writeMemoryRequest))))&&((this.stoppedEvent == rhs.stoppedEvent)||((this.stoppedEvent!= null)&&this.stoppedEvent.equals(rhs.stoppedEvent))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))))&&((this.disconnectResponse == rhs.disconnectResponse)||((this.disconnectResponse!= null)&&this.disconnectResponse.equals(rhs.disconnectResponse))))&&((this.initializedEvent == rhs.initializedEvent)||((this.initializedEvent!= null)&&this.initializedEvent.equals(rhs.initializedEvent))))&&((this.progressStartEvent == rhs.progressStartEvent)||((this.progressStartEvent!= null)&&this.progressStartEvent.equals(rhs.progressStartEvent))))&&((this.variable == rhs.variable)||((this.variable!= null)&&this.variable.equals(rhs.variable))))&&((this.gotoTargetsArguments == rhs.gotoTargetsArguments)||((this.gotoTargetsArguments!= null)&&this.gotoTargetsArguments.equals(rhs.gotoTargetsArguments))))&&((this.stepBackResponse == rhs.stepBackResponse)||((this.stepBackResponse!= null)&&this.stepBackResponse.equals(rhs.stepBackResponse))))&&((this.initializeRequestArguments == rhs.initializeRequestArguments)||((this.initializeRequestArguments!= null)&&this.initializeRequestArguments.equals(rhs.initializeRequestArguments))))&&((this.configurationDoneResponse == rhs.configurationDoneResponse)||((this.configurationDoneResponse!= null)&&this.configurationDoneResponse.equals(rhs.configurationDoneResponse))))&&((this.nextRequest == rhs.nextRequest)||((this.nextRequest!= null)&&this.nextRequest.equals(rhs.nextRequest))))&&((this.terminateResponse == rhs.terminateResponse)||((this.terminateResponse!= null)&&this.terminateResponse.equals(rhs.terminateResponse))))&&((this.setExpressionResponse == rhs.setExpressionResponse)||((this.setExpressionResponse!= null)&&this.setExpressionResponse.equals(rhs.setExpressionResponse))));
    }


    /**
     * This enumeration defines all possible conditions when a thrown exception should result in a break.
     * never: never breaks,
     * always: always breaks,
     * unhandled: breaks when exception unhandled,
     * userUnhandled: breaks if the exception is not handled by user code.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ExceptionBreakMode {

        NEVER("never"),
        ALWAYS("always"),
        UNHANDLED("unhandled"),
        USER_UNHANDLED("userUnhandled");
        private final String value;
        private final static Map<String, ExceptionBreakMode> CONSTANTS = new HashMap<String, ExceptionBreakMode>();

        static {
            for (ExceptionBreakMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ExceptionBreakMode(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ExceptionBreakMode fromValue(String value) {
            ExceptionBreakMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
