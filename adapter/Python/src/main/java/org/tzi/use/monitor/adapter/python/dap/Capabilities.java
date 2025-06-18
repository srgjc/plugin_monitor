
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
 * Types
 * <p>
 * Information about the capabilities of a debug adapter.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "supportsConfigurationDoneRequest",
    "supportsFunctionBreakpoints",
    "supportsConditionalBreakpoints",
    "supportsHitConditionalBreakpoints",
    "supportsEvaluateForHovers",
    "exceptionBreakpointFilters",
    "supportsStepBack",
    "supportsSetVariable",
    "supportsRestartFrame",
    "supportsGotoTargetsRequest",
    "supportsStepInTargetsRequest",
    "supportsCompletionsRequest",
    "completionTriggerCharacters",
    "supportsModulesRequest",
    "additionalModuleColumns",
    "supportedChecksumAlgorithms",
    "supportsRestartRequest",
    "supportsExceptionOptions",
    "supportsValueFormattingOptions",
    "supportsExceptionInfoRequest",
    "supportTerminateDebuggee",
    "supportSuspendDebuggee",
    "supportsDelayedStackTraceLoading",
    "supportsLoadedSourcesRequest",
    "supportsLogPoints",
    "supportsTerminateThreadsRequest",
    "supportsSetExpression",
    "supportsTerminateRequest",
    "supportsDataBreakpoints",
    "supportsReadMemoryRequest",
    "supportsWriteMemoryRequest",
    "supportsDisassembleRequest",
    "supportsCancelRequest",
    "supportsBreakpointLocationsRequest",
    "supportsClipboardContext",
    "supportsSteppingGranularity",
    "supportsInstructionBreakpoints",
    "supportsExceptionFilterOptions",
    "supportsSingleThreadExecutionRequests"
})
@Generated("jsonschema2pojo")
public class Capabilities {

    /**
     * The debug adapter supports the `configurationDone` request.
     * 
     */
    @JsonProperty("supportsConfigurationDoneRequest")
    @JsonPropertyDescription("The debug adapter supports the `configurationDone` request.")
    private Boolean supportsConfigurationDoneRequest;
    /**
     * The debug adapter supports function breakpoints.
     * 
     */
    @JsonProperty("supportsFunctionBreakpoints")
    @JsonPropertyDescription("The debug adapter supports function breakpoints.")
    private Boolean supportsFunctionBreakpoints;
    /**
     * The debug adapter supports conditional breakpoints.
     * 
     */
    @JsonProperty("supportsConditionalBreakpoints")
    @JsonPropertyDescription("The debug adapter supports conditional breakpoints.")
    private Boolean supportsConditionalBreakpoints;
    /**
     * The debug adapter supports breakpoints that break execution after a specified number of hits.
     * 
     */
    @JsonProperty("supportsHitConditionalBreakpoints")
    @JsonPropertyDescription("The debug adapter supports breakpoints that break execution after a specified number of hits.")
    private Boolean supportsHitConditionalBreakpoints;
    /**
     * The debug adapter supports a (side effect free) `evaluate` request for data hovers.
     * 
     */
    @JsonProperty("supportsEvaluateForHovers")
    @JsonPropertyDescription("The debug adapter supports a (side effect free) `evaluate` request for data hovers.")
    private Boolean supportsEvaluateForHovers;
    /**
     * Available exception filter options for the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("exceptionBreakpointFilters")
    @JsonPropertyDescription("Available exception filter options for the `setExceptionBreakpoints` request.")
    private List<ExceptionBreakpointsFilter> exceptionBreakpointFilters = new ArrayList<ExceptionBreakpointsFilter>();
    /**
     * The debug adapter supports stepping back via the `stepBack` and `reverseContinue` requests.
     * 
     */
    @JsonProperty("supportsStepBack")
    @JsonPropertyDescription("The debug adapter supports stepping back via the `stepBack` and `reverseContinue` requests.")
    private Boolean supportsStepBack;
    /**
     * The debug adapter supports setting a variable to a value.
     * 
     */
    @JsonProperty("supportsSetVariable")
    @JsonPropertyDescription("The debug adapter supports setting a variable to a value.")
    private Boolean supportsSetVariable;
    /**
     * The debug adapter supports restarting a frame.
     * 
     */
    @JsonProperty("supportsRestartFrame")
    @JsonPropertyDescription("The debug adapter supports restarting a frame.")
    private Boolean supportsRestartFrame;
    /**
     * The debug adapter supports the `gotoTargets` request.
     * 
     */
    @JsonProperty("supportsGotoTargetsRequest")
    @JsonPropertyDescription("The debug adapter supports the `gotoTargets` request.")
    private Boolean supportsGotoTargetsRequest;
    /**
     * The debug adapter supports the `stepInTargets` request.
     * 
     */
    @JsonProperty("supportsStepInTargetsRequest")
    @JsonPropertyDescription("The debug adapter supports the `stepInTargets` request.")
    private Boolean supportsStepInTargetsRequest;
    /**
     * The debug adapter supports the `completions` request.
     * 
     */
    @JsonProperty("supportsCompletionsRequest")
    @JsonPropertyDescription("The debug adapter supports the `completions` request.")
    private Boolean supportsCompletionsRequest;
    /**
     * The set of characters that should trigger completion in a REPL. If not specified, the UI should assume the `.` character.
     * 
     */
    @JsonProperty("completionTriggerCharacters")
    @JsonPropertyDescription("The set of characters that should trigger completion in a REPL. If not specified, the UI should assume the `.` character.")
    private List<String> completionTriggerCharacters = new ArrayList<String>();
    /**
     * The debug adapter supports the `modules` request.
     * 
     */
    @JsonProperty("supportsModulesRequest")
    @JsonPropertyDescription("The debug adapter supports the `modules` request.")
    private Boolean supportsModulesRequest;
    /**
     * The set of additional module information exposed by the debug adapter.
     * 
     */
    @JsonProperty("additionalModuleColumns")
    @JsonPropertyDescription("The set of additional module information exposed by the debug adapter.")
    private List<ColumnDescriptor> additionalModuleColumns = new ArrayList<ColumnDescriptor>();
    /**
     * Checksum algorithms supported by the debug adapter.
     * 
     */
    @JsonProperty("supportedChecksumAlgorithms")
    @JsonPropertyDescription("Checksum algorithms supported by the debug adapter.")
    private List<Checksum.ChecksumAlgorithm> supportedChecksumAlgorithms = new ArrayList<Checksum.ChecksumAlgorithm>();
    /**
     * The debug adapter supports the `restart` request. In this case a client should not implement `restart` by terminating and relaunching the adapter but by calling the `restart` request.
     * 
     */
    @JsonProperty("supportsRestartRequest")
    @JsonPropertyDescription("The debug adapter supports the `restart` request. In this case a client should not implement `restart` by terminating and relaunching the adapter but by calling the `restart` request.")
    private Boolean supportsRestartRequest;
    /**
     * The debug adapter supports `exceptionOptions` on the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("supportsExceptionOptions")
    @JsonPropertyDescription("The debug adapter supports `exceptionOptions` on the `setExceptionBreakpoints` request.")
    private Boolean supportsExceptionOptions;
    /**
     * The debug adapter supports a `format` attribute on the `stackTrace`, `variables`, and `evaluate` requests.
     * 
     */
    @JsonProperty("supportsValueFormattingOptions")
    @JsonPropertyDescription("The debug adapter supports a `format` attribute on the `stackTrace`, `variables`, and `evaluate` requests.")
    private Boolean supportsValueFormattingOptions;
    /**
     * The debug adapter supports the `exceptionInfo` request.
     * 
     */
    @JsonProperty("supportsExceptionInfoRequest")
    @JsonPropertyDescription("The debug adapter supports the `exceptionInfo` request.")
    private Boolean supportsExceptionInfoRequest;
    /**
     * The debug adapter supports the `terminateDebuggee` attribute on the `disconnect` request.
     * 
     */
    @JsonProperty("supportTerminateDebuggee")
    @JsonPropertyDescription("The debug adapter supports the `terminateDebuggee` attribute on the `disconnect` request.")
    private Boolean supportTerminateDebuggee;
    /**
     * The debug adapter supports the `suspendDebuggee` attribute on the `disconnect` request.
     * 
     */
    @JsonProperty("supportSuspendDebuggee")
    @JsonPropertyDescription("The debug adapter supports the `suspendDebuggee` attribute on the `disconnect` request.")
    private Boolean supportSuspendDebuggee;
    /**
     * The debug adapter supports the delayed loading of parts of the stack, which requires that both the `startFrame` and `levels` arguments and the `totalFrames` result of the `stackTrace` request are supported.
     * 
     */
    @JsonProperty("supportsDelayedStackTraceLoading")
    @JsonPropertyDescription("The debug adapter supports the delayed loading of parts of the stack, which requires that both the `startFrame` and `levels` arguments and the `totalFrames` result of the `stackTrace` request are supported.")
    private Boolean supportsDelayedStackTraceLoading;
    /**
     * The debug adapter supports the `loadedSources` request.
     * 
     */
    @JsonProperty("supportsLoadedSourcesRequest")
    @JsonPropertyDescription("The debug adapter supports the `loadedSources` request.")
    private Boolean supportsLoadedSourcesRequest;
    /**
     * The debug adapter supports log points by interpreting the `logMessage` attribute of the `SourceBreakpoint`.
     * 
     */
    @JsonProperty("supportsLogPoints")
    @JsonPropertyDescription("The debug adapter supports log points by interpreting the `logMessage` attribute of the `SourceBreakpoint`.")
    private Boolean supportsLogPoints;
    /**
     * The debug adapter supports the `terminateThreads` request.
     * 
     */
    @JsonProperty("supportsTerminateThreadsRequest")
    @JsonPropertyDescription("The debug adapter supports the `terminateThreads` request.")
    private Boolean supportsTerminateThreadsRequest;
    /**
     * The debug adapter supports the `setExpression` request.
     * 
     */
    @JsonProperty("supportsSetExpression")
    @JsonPropertyDescription("The debug adapter supports the `setExpression` request.")
    private Boolean supportsSetExpression;
    /**
     * The debug adapter supports the `terminate` request.
     * 
     */
    @JsonProperty("supportsTerminateRequest")
    @JsonPropertyDescription("The debug adapter supports the `terminate` request.")
    private Boolean supportsTerminateRequest;
    /**
     * The debug adapter supports data breakpoints.
     * 
     */
    @JsonProperty("supportsDataBreakpoints")
    @JsonPropertyDescription("The debug adapter supports data breakpoints.")
    private Boolean supportsDataBreakpoints;
    /**
     * The debug adapter supports the `readMemory` request.
     * 
     */
    @JsonProperty("supportsReadMemoryRequest")
    @JsonPropertyDescription("The debug adapter supports the `readMemory` request.")
    private Boolean supportsReadMemoryRequest;
    /**
     * The debug adapter supports the `writeMemory` request.
     * 
     */
    @JsonProperty("supportsWriteMemoryRequest")
    @JsonPropertyDescription("The debug adapter supports the `writeMemory` request.")
    private Boolean supportsWriteMemoryRequest;
    /**
     * The debug adapter supports the `disassemble` request.
     * 
     */
    @JsonProperty("supportsDisassembleRequest")
    @JsonPropertyDescription("The debug adapter supports the `disassemble` request.")
    private Boolean supportsDisassembleRequest;
    /**
     * The debug adapter supports the `cancel` request.
     * 
     */
    @JsonProperty("supportsCancelRequest")
    @JsonPropertyDescription("The debug adapter supports the `cancel` request.")
    private Boolean supportsCancelRequest;
    /**
     * The debug adapter supports the `breakpointLocations` request.
     * 
     */
    @JsonProperty("supportsBreakpointLocationsRequest")
    @JsonPropertyDescription("The debug adapter supports the `breakpointLocations` request.")
    private Boolean supportsBreakpointLocationsRequest;
    /**
     * The debug adapter supports the `clipboard` context value in the `evaluate` request.
     * 
     */
    @JsonProperty("supportsClipboardContext")
    @JsonPropertyDescription("The debug adapter supports the `clipboard` context value in the `evaluate` request.")
    private Boolean supportsClipboardContext;
    /**
     * The debug adapter supports stepping granularities (argument `granularity`) for the stepping requests.
     * 
     */
    @JsonProperty("supportsSteppingGranularity")
    @JsonPropertyDescription("The debug adapter supports stepping granularities (argument `granularity`) for the stepping requests.")
    private Boolean supportsSteppingGranularity;
    /**
     * The debug adapter supports adding breakpoints based on instruction references.
     * 
     */
    @JsonProperty("supportsInstructionBreakpoints")
    @JsonPropertyDescription("The debug adapter supports adding breakpoints based on instruction references.")
    private Boolean supportsInstructionBreakpoints;
    /**
     * The debug adapter supports `filterOptions` as an argument on the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("supportsExceptionFilterOptions")
    @JsonPropertyDescription("The debug adapter supports `filterOptions` as an argument on the `setExceptionBreakpoints` request.")
    private Boolean supportsExceptionFilterOptions;
    /**
     * The debug adapter supports the `singleThread` property on the execution requests (`continue`, `next`, `stepIn`, `stepOut`, `reverseContinue`, `stepBack`).
     * 
     */
    @JsonProperty("supportsSingleThreadExecutionRequests")
    @JsonPropertyDescription("The debug adapter supports the `singleThread` property on the execution requests (`continue`, `next`, `stepIn`, `stepOut`, `reverseContinue`, `stepBack`).")
    private Boolean supportsSingleThreadExecutionRequests;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The debug adapter supports the `configurationDone` request.
     * 
     */
    @JsonProperty("supportsConfigurationDoneRequest")
    public Boolean getSupportsConfigurationDoneRequest() {
        return supportsConfigurationDoneRequest;
    }

    /**
     * The debug adapter supports the `configurationDone` request.
     * 
     */
    @JsonProperty("supportsConfigurationDoneRequest")
    public void setSupportsConfigurationDoneRequest(Boolean supportsConfigurationDoneRequest) {
        this.supportsConfigurationDoneRequest = supportsConfigurationDoneRequest;
    }

    /**
     * The debug adapter supports function breakpoints.
     * 
     */
    @JsonProperty("supportsFunctionBreakpoints")
    public Boolean getSupportsFunctionBreakpoints() {
        return supportsFunctionBreakpoints;
    }

    /**
     * The debug adapter supports function breakpoints.
     * 
     */
    @JsonProperty("supportsFunctionBreakpoints")
    public void setSupportsFunctionBreakpoints(Boolean supportsFunctionBreakpoints) {
        this.supportsFunctionBreakpoints = supportsFunctionBreakpoints;
    }

    /**
     * The debug adapter supports conditional breakpoints.
     * 
     */
    @JsonProperty("supportsConditionalBreakpoints")
    public Boolean getSupportsConditionalBreakpoints() {
        return supportsConditionalBreakpoints;
    }

    /**
     * The debug adapter supports conditional breakpoints.
     * 
     */
    @JsonProperty("supportsConditionalBreakpoints")
    public void setSupportsConditionalBreakpoints(Boolean supportsConditionalBreakpoints) {
        this.supportsConditionalBreakpoints = supportsConditionalBreakpoints;
    }

    /**
     * The debug adapter supports breakpoints that break execution after a specified number of hits.
     * 
     */
    @JsonProperty("supportsHitConditionalBreakpoints")
    public Boolean getSupportsHitConditionalBreakpoints() {
        return supportsHitConditionalBreakpoints;
    }

    /**
     * The debug adapter supports breakpoints that break execution after a specified number of hits.
     * 
     */
    @JsonProperty("supportsHitConditionalBreakpoints")
    public void setSupportsHitConditionalBreakpoints(Boolean supportsHitConditionalBreakpoints) {
        this.supportsHitConditionalBreakpoints = supportsHitConditionalBreakpoints;
    }

    /**
     * The debug adapter supports a (side effect free) `evaluate` request for data hovers.
     * 
     */
    @JsonProperty("supportsEvaluateForHovers")
    public Boolean getSupportsEvaluateForHovers() {
        return supportsEvaluateForHovers;
    }

    /**
     * The debug adapter supports a (side effect free) `evaluate` request for data hovers.
     * 
     */
    @JsonProperty("supportsEvaluateForHovers")
    public void setSupportsEvaluateForHovers(Boolean supportsEvaluateForHovers) {
        this.supportsEvaluateForHovers = supportsEvaluateForHovers;
    }

    /**
     * Available exception filter options for the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("exceptionBreakpointFilters")
    public List<ExceptionBreakpointsFilter> getExceptionBreakpointFilters() {
        return exceptionBreakpointFilters;
    }

    /**
     * Available exception filter options for the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("exceptionBreakpointFilters")
    public void setExceptionBreakpointFilters(List<ExceptionBreakpointsFilter> exceptionBreakpointFilters) {
        this.exceptionBreakpointFilters = exceptionBreakpointFilters;
    }

    /**
     * The debug adapter supports stepping back via the `stepBack` and `reverseContinue` requests.
     * 
     */
    @JsonProperty("supportsStepBack")
    public Boolean getSupportsStepBack() {
        return supportsStepBack;
    }

    /**
     * The debug adapter supports stepping back via the `stepBack` and `reverseContinue` requests.
     * 
     */
    @JsonProperty("supportsStepBack")
    public void setSupportsStepBack(Boolean supportsStepBack) {
        this.supportsStepBack = supportsStepBack;
    }

    /**
     * The debug adapter supports setting a variable to a value.
     * 
     */
    @JsonProperty("supportsSetVariable")
    public Boolean getSupportsSetVariable() {
        return supportsSetVariable;
    }

    /**
     * The debug adapter supports setting a variable to a value.
     * 
     */
    @JsonProperty("supportsSetVariable")
    public void setSupportsSetVariable(Boolean supportsSetVariable) {
        this.supportsSetVariable = supportsSetVariable;
    }

    /**
     * The debug adapter supports restarting a frame.
     * 
     */
    @JsonProperty("supportsRestartFrame")
    public Boolean getSupportsRestartFrame() {
        return supportsRestartFrame;
    }

    /**
     * The debug adapter supports restarting a frame.
     * 
     */
    @JsonProperty("supportsRestartFrame")
    public void setSupportsRestartFrame(Boolean supportsRestartFrame) {
        this.supportsRestartFrame = supportsRestartFrame;
    }

    /**
     * The debug adapter supports the `gotoTargets` request.
     * 
     */
    @JsonProperty("supportsGotoTargetsRequest")
    public Boolean getSupportsGotoTargetsRequest() {
        return supportsGotoTargetsRequest;
    }

    /**
     * The debug adapter supports the `gotoTargets` request.
     * 
     */
    @JsonProperty("supportsGotoTargetsRequest")
    public void setSupportsGotoTargetsRequest(Boolean supportsGotoTargetsRequest) {
        this.supportsGotoTargetsRequest = supportsGotoTargetsRequest;
    }

    /**
     * The debug adapter supports the `stepInTargets` request.
     * 
     */
    @JsonProperty("supportsStepInTargetsRequest")
    public Boolean getSupportsStepInTargetsRequest() {
        return supportsStepInTargetsRequest;
    }

    /**
     * The debug adapter supports the `stepInTargets` request.
     * 
     */
    @JsonProperty("supportsStepInTargetsRequest")
    public void setSupportsStepInTargetsRequest(Boolean supportsStepInTargetsRequest) {
        this.supportsStepInTargetsRequest = supportsStepInTargetsRequest;
    }

    /**
     * The debug adapter supports the `completions` request.
     * 
     */
    @JsonProperty("supportsCompletionsRequest")
    public Boolean getSupportsCompletionsRequest() {
        return supportsCompletionsRequest;
    }

    /**
     * The debug adapter supports the `completions` request.
     * 
     */
    @JsonProperty("supportsCompletionsRequest")
    public void setSupportsCompletionsRequest(Boolean supportsCompletionsRequest) {
        this.supportsCompletionsRequest = supportsCompletionsRequest;
    }

    /**
     * The set of characters that should trigger completion in a REPL. If not specified, the UI should assume the `.` character.
     * 
     */
    @JsonProperty("completionTriggerCharacters")
    public List<String> getCompletionTriggerCharacters() {
        return completionTriggerCharacters;
    }

    /**
     * The set of characters that should trigger completion in a REPL. If not specified, the UI should assume the `.` character.
     * 
     */
    @JsonProperty("completionTriggerCharacters")
    public void setCompletionTriggerCharacters(List<String> completionTriggerCharacters) {
        this.completionTriggerCharacters = completionTriggerCharacters;
    }

    /**
     * The debug adapter supports the `modules` request.
     * 
     */
    @JsonProperty("supportsModulesRequest")
    public Boolean getSupportsModulesRequest() {
        return supportsModulesRequest;
    }

    /**
     * The debug adapter supports the `modules` request.
     * 
     */
    @JsonProperty("supportsModulesRequest")
    public void setSupportsModulesRequest(Boolean supportsModulesRequest) {
        this.supportsModulesRequest = supportsModulesRequest;
    }

    /**
     * The set of additional module information exposed by the debug adapter.
     * 
     */
    @JsonProperty("additionalModuleColumns")
    public List<ColumnDescriptor> getAdditionalModuleColumns() {
        return additionalModuleColumns;
    }

    /**
     * The set of additional module information exposed by the debug adapter.
     * 
     */
    @JsonProperty("additionalModuleColumns")
    public void setAdditionalModuleColumns(List<ColumnDescriptor> additionalModuleColumns) {
        this.additionalModuleColumns = additionalModuleColumns;
    }

    /**
     * Checksum algorithms supported by the debug adapter.
     * 
     */
    @JsonProperty("supportedChecksumAlgorithms")
    public List<Checksum.ChecksumAlgorithm> getSupportedChecksumAlgorithms() {
        return supportedChecksumAlgorithms;
    }

    /**
     * Checksum algorithms supported by the debug adapter.
     * 
     */
    @JsonProperty("supportedChecksumAlgorithms")
    public void setSupportedChecksumAlgorithms(List<Checksum.ChecksumAlgorithm> supportedChecksumAlgorithms) {
        this.supportedChecksumAlgorithms = supportedChecksumAlgorithms;
    }

    /**
     * The debug adapter supports the `restart` request. In this case a client should not implement `restart` by terminating and relaunching the adapter but by calling the `restart` request.
     * 
     */
    @JsonProperty("supportsRestartRequest")
    public Boolean getSupportsRestartRequest() {
        return supportsRestartRequest;
    }

    /**
     * The debug adapter supports the `restart` request. In this case a client should not implement `restart` by terminating and relaunching the adapter but by calling the `restart` request.
     * 
     */
    @JsonProperty("supportsRestartRequest")
    public void setSupportsRestartRequest(Boolean supportsRestartRequest) {
        this.supportsRestartRequest = supportsRestartRequest;
    }

    /**
     * The debug adapter supports `exceptionOptions` on the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("supportsExceptionOptions")
    public Boolean getSupportsExceptionOptions() {
        return supportsExceptionOptions;
    }

    /**
     * The debug adapter supports `exceptionOptions` on the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("supportsExceptionOptions")
    public void setSupportsExceptionOptions(Boolean supportsExceptionOptions) {
        this.supportsExceptionOptions = supportsExceptionOptions;
    }

    /**
     * The debug adapter supports a `format` attribute on the `stackTrace`, `variables`, and `evaluate` requests.
     * 
     */
    @JsonProperty("supportsValueFormattingOptions")
    public Boolean getSupportsValueFormattingOptions() {
        return supportsValueFormattingOptions;
    }

    /**
     * The debug adapter supports a `format` attribute on the `stackTrace`, `variables`, and `evaluate` requests.
     * 
     */
    @JsonProperty("supportsValueFormattingOptions")
    public void setSupportsValueFormattingOptions(Boolean supportsValueFormattingOptions) {
        this.supportsValueFormattingOptions = supportsValueFormattingOptions;
    }

    /**
     * The debug adapter supports the `exceptionInfo` request.
     * 
     */
    @JsonProperty("supportsExceptionInfoRequest")
    public Boolean getSupportsExceptionInfoRequest() {
        return supportsExceptionInfoRequest;
    }

    /**
     * The debug adapter supports the `exceptionInfo` request.
     * 
     */
    @JsonProperty("supportsExceptionInfoRequest")
    public void setSupportsExceptionInfoRequest(Boolean supportsExceptionInfoRequest) {
        this.supportsExceptionInfoRequest = supportsExceptionInfoRequest;
    }

    /**
     * The debug adapter supports the `terminateDebuggee` attribute on the `disconnect` request.
     * 
     */
    @JsonProperty("supportTerminateDebuggee")
    public Boolean getSupportTerminateDebuggee() {
        return supportTerminateDebuggee;
    }

    /**
     * The debug adapter supports the `terminateDebuggee` attribute on the `disconnect` request.
     * 
     */
    @JsonProperty("supportTerminateDebuggee")
    public void setSupportTerminateDebuggee(Boolean supportTerminateDebuggee) {
        this.supportTerminateDebuggee = supportTerminateDebuggee;
    }

    /**
     * The debug adapter supports the `suspendDebuggee` attribute on the `disconnect` request.
     * 
     */
    @JsonProperty("supportSuspendDebuggee")
    public Boolean getSupportSuspendDebuggee() {
        return supportSuspendDebuggee;
    }

    /**
     * The debug adapter supports the `suspendDebuggee` attribute on the `disconnect` request.
     * 
     */
    @JsonProperty("supportSuspendDebuggee")
    public void setSupportSuspendDebuggee(Boolean supportSuspendDebuggee) {
        this.supportSuspendDebuggee = supportSuspendDebuggee;
    }

    /**
     * The debug adapter supports the delayed loading of parts of the stack, which requires that both the `startFrame` and `levels` arguments and the `totalFrames` result of the `stackTrace` request are supported.
     * 
     */
    @JsonProperty("supportsDelayedStackTraceLoading")
    public Boolean getSupportsDelayedStackTraceLoading() {
        return supportsDelayedStackTraceLoading;
    }

    /**
     * The debug adapter supports the delayed loading of parts of the stack, which requires that both the `startFrame` and `levels` arguments and the `totalFrames` result of the `stackTrace` request are supported.
     * 
     */
    @JsonProperty("supportsDelayedStackTraceLoading")
    public void setSupportsDelayedStackTraceLoading(Boolean supportsDelayedStackTraceLoading) {
        this.supportsDelayedStackTraceLoading = supportsDelayedStackTraceLoading;
    }

    /**
     * The debug adapter supports the `loadedSources` request.
     * 
     */
    @JsonProperty("supportsLoadedSourcesRequest")
    public Boolean getSupportsLoadedSourcesRequest() {
        return supportsLoadedSourcesRequest;
    }

    /**
     * The debug adapter supports the `loadedSources` request.
     * 
     */
    @JsonProperty("supportsLoadedSourcesRequest")
    public void setSupportsLoadedSourcesRequest(Boolean supportsLoadedSourcesRequest) {
        this.supportsLoadedSourcesRequest = supportsLoadedSourcesRequest;
    }

    /**
     * The debug adapter supports log points by interpreting the `logMessage` attribute of the `SourceBreakpoint`.
     * 
     */
    @JsonProperty("supportsLogPoints")
    public Boolean getSupportsLogPoints() {
        return supportsLogPoints;
    }

    /**
     * The debug adapter supports log points by interpreting the `logMessage` attribute of the `SourceBreakpoint`.
     * 
     */
    @JsonProperty("supportsLogPoints")
    public void setSupportsLogPoints(Boolean supportsLogPoints) {
        this.supportsLogPoints = supportsLogPoints;
    }

    /**
     * The debug adapter supports the `terminateThreads` request.
     * 
     */
    @JsonProperty("supportsTerminateThreadsRequest")
    public Boolean getSupportsTerminateThreadsRequest() {
        return supportsTerminateThreadsRequest;
    }

    /**
     * The debug adapter supports the `terminateThreads` request.
     * 
     */
    @JsonProperty("supportsTerminateThreadsRequest")
    public void setSupportsTerminateThreadsRequest(Boolean supportsTerminateThreadsRequest) {
        this.supportsTerminateThreadsRequest = supportsTerminateThreadsRequest;
    }

    /**
     * The debug adapter supports the `setExpression` request.
     * 
     */
    @JsonProperty("supportsSetExpression")
    public Boolean getSupportsSetExpression() {
        return supportsSetExpression;
    }

    /**
     * The debug adapter supports the `setExpression` request.
     * 
     */
    @JsonProperty("supportsSetExpression")
    public void setSupportsSetExpression(Boolean supportsSetExpression) {
        this.supportsSetExpression = supportsSetExpression;
    }

    /**
     * The debug adapter supports the `terminate` request.
     * 
     */
    @JsonProperty("supportsTerminateRequest")
    public Boolean getSupportsTerminateRequest() {
        return supportsTerminateRequest;
    }

    /**
     * The debug adapter supports the `terminate` request.
     * 
     */
    @JsonProperty("supportsTerminateRequest")
    public void setSupportsTerminateRequest(Boolean supportsTerminateRequest) {
        this.supportsTerminateRequest = supportsTerminateRequest;
    }

    /**
     * The debug adapter supports data breakpoints.
     * 
     */
    @JsonProperty("supportsDataBreakpoints")
    public Boolean getSupportsDataBreakpoints() {
        return supportsDataBreakpoints;
    }

    /**
     * The debug adapter supports data breakpoints.
     * 
     */
    @JsonProperty("supportsDataBreakpoints")
    public void setSupportsDataBreakpoints(Boolean supportsDataBreakpoints) {
        this.supportsDataBreakpoints = supportsDataBreakpoints;
    }

    /**
     * The debug adapter supports the `readMemory` request.
     * 
     */
    @JsonProperty("supportsReadMemoryRequest")
    public Boolean getSupportsReadMemoryRequest() {
        return supportsReadMemoryRequest;
    }

    /**
     * The debug adapter supports the `readMemory` request.
     * 
     */
    @JsonProperty("supportsReadMemoryRequest")
    public void setSupportsReadMemoryRequest(Boolean supportsReadMemoryRequest) {
        this.supportsReadMemoryRequest = supportsReadMemoryRequest;
    }

    /**
     * The debug adapter supports the `writeMemory` request.
     * 
     */
    @JsonProperty("supportsWriteMemoryRequest")
    public Boolean getSupportsWriteMemoryRequest() {
        return supportsWriteMemoryRequest;
    }

    /**
     * The debug adapter supports the `writeMemory` request.
     * 
     */
    @JsonProperty("supportsWriteMemoryRequest")
    public void setSupportsWriteMemoryRequest(Boolean supportsWriteMemoryRequest) {
        this.supportsWriteMemoryRequest = supportsWriteMemoryRequest;
    }

    /**
     * The debug adapter supports the `disassemble` request.
     * 
     */
    @JsonProperty("supportsDisassembleRequest")
    public Boolean getSupportsDisassembleRequest() {
        return supportsDisassembleRequest;
    }

    /**
     * The debug adapter supports the `disassemble` request.
     * 
     */
    @JsonProperty("supportsDisassembleRequest")
    public void setSupportsDisassembleRequest(Boolean supportsDisassembleRequest) {
        this.supportsDisassembleRequest = supportsDisassembleRequest;
    }

    /**
     * The debug adapter supports the `cancel` request.
     * 
     */
    @JsonProperty("supportsCancelRequest")
    public Boolean getSupportsCancelRequest() {
        return supportsCancelRequest;
    }

    /**
     * The debug adapter supports the `cancel` request.
     * 
     */
    @JsonProperty("supportsCancelRequest")
    public void setSupportsCancelRequest(Boolean supportsCancelRequest) {
        this.supportsCancelRequest = supportsCancelRequest;
    }

    /**
     * The debug adapter supports the `breakpointLocations` request.
     * 
     */
    @JsonProperty("supportsBreakpointLocationsRequest")
    public Boolean getSupportsBreakpointLocationsRequest() {
        return supportsBreakpointLocationsRequest;
    }

    /**
     * The debug adapter supports the `breakpointLocations` request.
     * 
     */
    @JsonProperty("supportsBreakpointLocationsRequest")
    public void setSupportsBreakpointLocationsRequest(Boolean supportsBreakpointLocationsRequest) {
        this.supportsBreakpointLocationsRequest = supportsBreakpointLocationsRequest;
    }

    /**
     * The debug adapter supports the `clipboard` context value in the `evaluate` request.
     * 
     */
    @JsonProperty("supportsClipboardContext")
    public Boolean getSupportsClipboardContext() {
        return supportsClipboardContext;
    }

    /**
     * The debug adapter supports the `clipboard` context value in the `evaluate` request.
     * 
     */
    @JsonProperty("supportsClipboardContext")
    public void setSupportsClipboardContext(Boolean supportsClipboardContext) {
        this.supportsClipboardContext = supportsClipboardContext;
    }

    /**
     * The debug adapter supports stepping granularities (argument `granularity`) for the stepping requests.
     * 
     */
    @JsonProperty("supportsSteppingGranularity")
    public Boolean getSupportsSteppingGranularity() {
        return supportsSteppingGranularity;
    }

    /**
     * The debug adapter supports stepping granularities (argument `granularity`) for the stepping requests.
     * 
     */
    @JsonProperty("supportsSteppingGranularity")
    public void setSupportsSteppingGranularity(Boolean supportsSteppingGranularity) {
        this.supportsSteppingGranularity = supportsSteppingGranularity;
    }

    /**
     * The debug adapter supports adding breakpoints based on instruction references.
     * 
     */
    @JsonProperty("supportsInstructionBreakpoints")
    public Boolean getSupportsInstructionBreakpoints() {
        return supportsInstructionBreakpoints;
    }

    /**
     * The debug adapter supports adding breakpoints based on instruction references.
     * 
     */
    @JsonProperty("supportsInstructionBreakpoints")
    public void setSupportsInstructionBreakpoints(Boolean supportsInstructionBreakpoints) {
        this.supportsInstructionBreakpoints = supportsInstructionBreakpoints;
    }

    /**
     * The debug adapter supports `filterOptions` as an argument on the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("supportsExceptionFilterOptions")
    public Boolean getSupportsExceptionFilterOptions() {
        return supportsExceptionFilterOptions;
    }

    /**
     * The debug adapter supports `filterOptions` as an argument on the `setExceptionBreakpoints` request.
     * 
     */
    @JsonProperty("supportsExceptionFilterOptions")
    public void setSupportsExceptionFilterOptions(Boolean supportsExceptionFilterOptions) {
        this.supportsExceptionFilterOptions = supportsExceptionFilterOptions;
    }

    /**
     * The debug adapter supports the `singleThread` property on the execution requests (`continue`, `next`, `stepIn`, `stepOut`, `reverseContinue`, `stepBack`).
     * 
     */
    @JsonProperty("supportsSingleThreadExecutionRequests")
    public Boolean getSupportsSingleThreadExecutionRequests() {
        return supportsSingleThreadExecutionRequests;
    }

    /**
     * The debug adapter supports the `singleThread` property on the execution requests (`continue`, `next`, `stepIn`, `stepOut`, `reverseContinue`, `stepBack`).
     * 
     */
    @JsonProperty("supportsSingleThreadExecutionRequests")
    public void setSupportsSingleThreadExecutionRequests(Boolean supportsSingleThreadExecutionRequests) {
        this.supportsSingleThreadExecutionRequests = supportsSingleThreadExecutionRequests;
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
        sb.append(Capabilities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("supportsConfigurationDoneRequest");
        sb.append('=');
        sb.append(((this.supportsConfigurationDoneRequest == null)?"<null>":this.supportsConfigurationDoneRequest));
        sb.append(',');
        sb.append("supportsFunctionBreakpoints");
        sb.append('=');
        sb.append(((this.supportsFunctionBreakpoints == null)?"<null>":this.supportsFunctionBreakpoints));
        sb.append(',');
        sb.append("supportsConditionalBreakpoints");
        sb.append('=');
        sb.append(((this.supportsConditionalBreakpoints == null)?"<null>":this.supportsConditionalBreakpoints));
        sb.append(',');
        sb.append("supportsHitConditionalBreakpoints");
        sb.append('=');
        sb.append(((this.supportsHitConditionalBreakpoints == null)?"<null>":this.supportsHitConditionalBreakpoints));
        sb.append(',');
        sb.append("supportsEvaluateForHovers");
        sb.append('=');
        sb.append(((this.supportsEvaluateForHovers == null)?"<null>":this.supportsEvaluateForHovers));
        sb.append(',');
        sb.append("exceptionBreakpointFilters");
        sb.append('=');
        sb.append(((this.exceptionBreakpointFilters == null)?"<null>":this.exceptionBreakpointFilters));
        sb.append(',');
        sb.append("supportsStepBack");
        sb.append('=');
        sb.append(((this.supportsStepBack == null)?"<null>":this.supportsStepBack));
        sb.append(',');
        sb.append("supportsSetVariable");
        sb.append('=');
        sb.append(((this.supportsSetVariable == null)?"<null>":this.supportsSetVariable));
        sb.append(',');
        sb.append("supportsRestartFrame");
        sb.append('=');
        sb.append(((this.supportsRestartFrame == null)?"<null>":this.supportsRestartFrame));
        sb.append(',');
        sb.append("supportsGotoTargetsRequest");
        sb.append('=');
        sb.append(((this.supportsGotoTargetsRequest == null)?"<null>":this.supportsGotoTargetsRequest));
        sb.append(',');
        sb.append("supportsStepInTargetsRequest");
        sb.append('=');
        sb.append(((this.supportsStepInTargetsRequest == null)?"<null>":this.supportsStepInTargetsRequest));
        sb.append(',');
        sb.append("supportsCompletionsRequest");
        sb.append('=');
        sb.append(((this.supportsCompletionsRequest == null)?"<null>":this.supportsCompletionsRequest));
        sb.append(',');
        sb.append("completionTriggerCharacters");
        sb.append('=');
        sb.append(((this.completionTriggerCharacters == null)?"<null>":this.completionTriggerCharacters));
        sb.append(',');
        sb.append("supportsModulesRequest");
        sb.append('=');
        sb.append(((this.supportsModulesRequest == null)?"<null>":this.supportsModulesRequest));
        sb.append(',');
        sb.append("additionalModuleColumns");
        sb.append('=');
        sb.append(((this.additionalModuleColumns == null)?"<null>":this.additionalModuleColumns));
        sb.append(',');
        sb.append("supportedChecksumAlgorithms");
        sb.append('=');
        sb.append(((this.supportedChecksumAlgorithms == null)?"<null>":this.supportedChecksumAlgorithms));
        sb.append(',');
        sb.append("supportsRestartRequest");
        sb.append('=');
        sb.append(((this.supportsRestartRequest == null)?"<null>":this.supportsRestartRequest));
        sb.append(',');
        sb.append("supportsExceptionOptions");
        sb.append('=');
        sb.append(((this.supportsExceptionOptions == null)?"<null>":this.supportsExceptionOptions));
        sb.append(',');
        sb.append("supportsValueFormattingOptions");
        sb.append('=');
        sb.append(((this.supportsValueFormattingOptions == null)?"<null>":this.supportsValueFormattingOptions));
        sb.append(',');
        sb.append("supportsExceptionInfoRequest");
        sb.append('=');
        sb.append(((this.supportsExceptionInfoRequest == null)?"<null>":this.supportsExceptionInfoRequest));
        sb.append(',');
        sb.append("supportTerminateDebuggee");
        sb.append('=');
        sb.append(((this.supportTerminateDebuggee == null)?"<null>":this.supportTerminateDebuggee));
        sb.append(',');
        sb.append("supportSuspendDebuggee");
        sb.append('=');
        sb.append(((this.supportSuspendDebuggee == null)?"<null>":this.supportSuspendDebuggee));
        sb.append(',');
        sb.append("supportsDelayedStackTraceLoading");
        sb.append('=');
        sb.append(((this.supportsDelayedStackTraceLoading == null)?"<null>":this.supportsDelayedStackTraceLoading));
        sb.append(',');
        sb.append("supportsLoadedSourcesRequest");
        sb.append('=');
        sb.append(((this.supportsLoadedSourcesRequest == null)?"<null>":this.supportsLoadedSourcesRequest));
        sb.append(',');
        sb.append("supportsLogPoints");
        sb.append('=');
        sb.append(((this.supportsLogPoints == null)?"<null>":this.supportsLogPoints));
        sb.append(',');
        sb.append("supportsTerminateThreadsRequest");
        sb.append('=');
        sb.append(((this.supportsTerminateThreadsRequest == null)?"<null>":this.supportsTerminateThreadsRequest));
        sb.append(',');
        sb.append("supportsSetExpression");
        sb.append('=');
        sb.append(((this.supportsSetExpression == null)?"<null>":this.supportsSetExpression));
        sb.append(',');
        sb.append("supportsTerminateRequest");
        sb.append('=');
        sb.append(((this.supportsTerminateRequest == null)?"<null>":this.supportsTerminateRequest));
        sb.append(',');
        sb.append("supportsDataBreakpoints");
        sb.append('=');
        sb.append(((this.supportsDataBreakpoints == null)?"<null>":this.supportsDataBreakpoints));
        sb.append(',');
        sb.append("supportsReadMemoryRequest");
        sb.append('=');
        sb.append(((this.supportsReadMemoryRequest == null)?"<null>":this.supportsReadMemoryRequest));
        sb.append(',');
        sb.append("supportsWriteMemoryRequest");
        sb.append('=');
        sb.append(((this.supportsWriteMemoryRequest == null)?"<null>":this.supportsWriteMemoryRequest));
        sb.append(',');
        sb.append("supportsDisassembleRequest");
        sb.append('=');
        sb.append(((this.supportsDisassembleRequest == null)?"<null>":this.supportsDisassembleRequest));
        sb.append(',');
        sb.append("supportsCancelRequest");
        sb.append('=');
        sb.append(((this.supportsCancelRequest == null)?"<null>":this.supportsCancelRequest));
        sb.append(',');
        sb.append("supportsBreakpointLocationsRequest");
        sb.append('=');
        sb.append(((this.supportsBreakpointLocationsRequest == null)?"<null>":this.supportsBreakpointLocationsRequest));
        sb.append(',');
        sb.append("supportsClipboardContext");
        sb.append('=');
        sb.append(((this.supportsClipboardContext == null)?"<null>":this.supportsClipboardContext));
        sb.append(',');
        sb.append("supportsSteppingGranularity");
        sb.append('=');
        sb.append(((this.supportsSteppingGranularity == null)?"<null>":this.supportsSteppingGranularity));
        sb.append(',');
        sb.append("supportsInstructionBreakpoints");
        sb.append('=');
        sb.append(((this.supportsInstructionBreakpoints == null)?"<null>":this.supportsInstructionBreakpoints));
        sb.append(',');
        sb.append("supportsExceptionFilterOptions");
        sb.append('=');
        sb.append(((this.supportsExceptionFilterOptions == null)?"<null>":this.supportsExceptionFilterOptions));
        sb.append(',');
        sb.append("supportsSingleThreadExecutionRequests");
        sb.append('=');
        sb.append(((this.supportsSingleThreadExecutionRequests == null)?"<null>":this.supportsSingleThreadExecutionRequests));
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
        result = ((result* 31)+((this.supportsSetExpression == null)? 0 :this.supportsSetExpression.hashCode()));
        result = ((result* 31)+((this.supportsDisassembleRequest == null)? 0 :this.supportsDisassembleRequest.hashCode()));
        result = ((result* 31)+((this.supportsRestartFrame == null)? 0 :this.supportsRestartFrame.hashCode()));
        result = ((result* 31)+((this.supportsTerminateRequest == null)? 0 :this.supportsTerminateRequest.hashCode()));
        result = ((result* 31)+((this.supportsConfigurationDoneRequest == null)? 0 :this.supportsConfigurationDoneRequest.hashCode()));
        result = ((result* 31)+((this.supportSuspendDebuggee == null)? 0 :this.supportSuspendDebuggee.hashCode()));
        result = ((result* 31)+((this.supportsRestartRequest == null)? 0 :this.supportsRestartRequest.hashCode()));
        result = ((result* 31)+((this.supportsGotoTargetsRequest == null)? 0 :this.supportsGotoTargetsRequest.hashCode()));
        result = ((result* 31)+((this.supportsConditionalBreakpoints == null)? 0 :this.supportsConditionalBreakpoints.hashCode()));
        result = ((result* 31)+((this.supportsModulesRequest == null)? 0 :this.supportsModulesRequest.hashCode()));
        result = ((result* 31)+((this.supportsCancelRequest == null)? 0 :this.supportsCancelRequest.hashCode()));
        result = ((result* 31)+((this.supportsHitConditionalBreakpoints == null)? 0 :this.supportsHitConditionalBreakpoints.hashCode()));
        result = ((result* 31)+((this.supportsLogPoints == null)? 0 :this.supportsLogPoints.hashCode()));
        result = ((result* 31)+((this.supportedChecksumAlgorithms == null)? 0 :this.supportedChecksumAlgorithms.hashCode()));
        result = ((result* 31)+((this.supportsReadMemoryRequest == null)? 0 :this.supportsReadMemoryRequest.hashCode()));
        result = ((result* 31)+((this.supportsExceptionFilterOptions == null)? 0 :this.supportsExceptionFilterOptions.hashCode()));
        result = ((result* 31)+((this.exceptionBreakpointFilters == null)? 0 :this.exceptionBreakpointFilters.hashCode()));
        result = ((result* 31)+((this.supportsStepInTargetsRequest == null)? 0 :this.supportsStepInTargetsRequest.hashCode()));
        result = ((result* 31)+((this.supportsLoadedSourcesRequest == null)? 0 :this.supportsLoadedSourcesRequest.hashCode()));
        result = ((result* 31)+((this.supportsTerminateThreadsRequest == null)? 0 :this.supportsTerminateThreadsRequest.hashCode()));
        result = ((result* 31)+((this.supportsExceptionInfoRequest == null)? 0 :this.supportsExceptionInfoRequest.hashCode()));
        result = ((result* 31)+((this.completionTriggerCharacters == null)? 0 :this.completionTriggerCharacters.hashCode()));
        result = ((result* 31)+((this.supportsValueFormattingOptions == null)? 0 :this.supportsValueFormattingOptions.hashCode()));
        result = ((result* 31)+((this.supportsCompletionsRequest == null)? 0 :this.supportsCompletionsRequest.hashCode()));
        result = ((result* 31)+((this.supportTerminateDebuggee == null)? 0 :this.supportTerminateDebuggee.hashCode()));
        result = ((result* 31)+((this.supportsSteppingGranularity == null)? 0 :this.supportsSteppingGranularity.hashCode()));
        result = ((result* 31)+((this.supportsDelayedStackTraceLoading == null)? 0 :this.supportsDelayedStackTraceLoading.hashCode()));
        result = ((result* 31)+((this.supportsSingleThreadExecutionRequests == null)? 0 :this.supportsSingleThreadExecutionRequests.hashCode()));
        result = ((result* 31)+((this.supportsDataBreakpoints == null)? 0 :this.supportsDataBreakpoints.hashCode()));
        result = ((result* 31)+((this.supportsEvaluateForHovers == null)? 0 :this.supportsEvaluateForHovers.hashCode()));
        result = ((result* 31)+((this.additionalModuleColumns == null)? 0 :this.additionalModuleColumns.hashCode()));
        result = ((result* 31)+((this.supportsFunctionBreakpoints == null)? 0 :this.supportsFunctionBreakpoints.hashCode()));
        result = ((result* 31)+((this.supportsBreakpointLocationsRequest == null)? 0 :this.supportsBreakpointLocationsRequest.hashCode()));
        result = ((result* 31)+((this.supportsInstructionBreakpoints == null)? 0 :this.supportsInstructionBreakpoints.hashCode()));
        result = ((result* 31)+((this.supportsStepBack == null)? 0 :this.supportsStepBack.hashCode()));
        result = ((result* 31)+((this.supportsExceptionOptions == null)? 0 :this.supportsExceptionOptions.hashCode()));
        result = ((result* 31)+((this.supportsSetVariable == null)? 0 :this.supportsSetVariable.hashCode()));
        result = ((result* 31)+((this.supportsClipboardContext == null)? 0 :this.supportsClipboardContext.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.supportsWriteMemoryRequest == null)? 0 :this.supportsWriteMemoryRequest.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Capabilities) == false) {
            return false;
        }
        Capabilities rhs = ((Capabilities) other);
        return (((((((((((((((((((((((((((((((((((((((((this.supportsSetExpression == rhs.supportsSetExpression)||((this.supportsSetExpression!= null)&&this.supportsSetExpression.equals(rhs.supportsSetExpression)))&&((this.supportsDisassembleRequest == rhs.supportsDisassembleRequest)||((this.supportsDisassembleRequest!= null)&&this.supportsDisassembleRequest.equals(rhs.supportsDisassembleRequest))))&&((this.supportsRestartFrame == rhs.supportsRestartFrame)||((this.supportsRestartFrame!= null)&&this.supportsRestartFrame.equals(rhs.supportsRestartFrame))))&&((this.supportsTerminateRequest == rhs.supportsTerminateRequest)||((this.supportsTerminateRequest!= null)&&this.supportsTerminateRequest.equals(rhs.supportsTerminateRequest))))&&((this.supportsConfigurationDoneRequest == rhs.supportsConfigurationDoneRequest)||((this.supportsConfigurationDoneRequest!= null)&&this.supportsConfigurationDoneRequest.equals(rhs.supportsConfigurationDoneRequest))))&&((this.supportSuspendDebuggee == rhs.supportSuspendDebuggee)||((this.supportSuspendDebuggee!= null)&&this.supportSuspendDebuggee.equals(rhs.supportSuspendDebuggee))))&&((this.supportsRestartRequest == rhs.supportsRestartRequest)||((this.supportsRestartRequest!= null)&&this.supportsRestartRequest.equals(rhs.supportsRestartRequest))))&&((this.supportsGotoTargetsRequest == rhs.supportsGotoTargetsRequest)||((this.supportsGotoTargetsRequest!= null)&&this.supportsGotoTargetsRequest.equals(rhs.supportsGotoTargetsRequest))))&&((this.supportsConditionalBreakpoints == rhs.supportsConditionalBreakpoints)||((this.supportsConditionalBreakpoints!= null)&&this.supportsConditionalBreakpoints.equals(rhs.supportsConditionalBreakpoints))))&&((this.supportsModulesRequest == rhs.supportsModulesRequest)||((this.supportsModulesRequest!= null)&&this.supportsModulesRequest.equals(rhs.supportsModulesRequest))))&&((this.supportsCancelRequest == rhs.supportsCancelRequest)||((this.supportsCancelRequest!= null)&&this.supportsCancelRequest.equals(rhs.supportsCancelRequest))))&&((this.supportsHitConditionalBreakpoints == rhs.supportsHitConditionalBreakpoints)||((this.supportsHitConditionalBreakpoints!= null)&&this.supportsHitConditionalBreakpoints.equals(rhs.supportsHitConditionalBreakpoints))))&&((this.supportsLogPoints == rhs.supportsLogPoints)||((this.supportsLogPoints!= null)&&this.supportsLogPoints.equals(rhs.supportsLogPoints))))&&((this.supportedChecksumAlgorithms == rhs.supportedChecksumAlgorithms)||((this.supportedChecksumAlgorithms!= null)&&this.supportedChecksumAlgorithms.equals(rhs.supportedChecksumAlgorithms))))&&((this.supportsReadMemoryRequest == rhs.supportsReadMemoryRequest)||((this.supportsReadMemoryRequest!= null)&&this.supportsReadMemoryRequest.equals(rhs.supportsReadMemoryRequest))))&&((this.supportsExceptionFilterOptions == rhs.supportsExceptionFilterOptions)||((this.supportsExceptionFilterOptions!= null)&&this.supportsExceptionFilterOptions.equals(rhs.supportsExceptionFilterOptions))))&&((this.exceptionBreakpointFilters == rhs.exceptionBreakpointFilters)||((this.exceptionBreakpointFilters!= null)&&this.exceptionBreakpointFilters.equals(rhs.exceptionBreakpointFilters))))&&((this.supportsStepInTargetsRequest == rhs.supportsStepInTargetsRequest)||((this.supportsStepInTargetsRequest!= null)&&this.supportsStepInTargetsRequest.equals(rhs.supportsStepInTargetsRequest))))&&((this.supportsLoadedSourcesRequest == rhs.supportsLoadedSourcesRequest)||((this.supportsLoadedSourcesRequest!= null)&&this.supportsLoadedSourcesRequest.equals(rhs.supportsLoadedSourcesRequest))))&&((this.supportsTerminateThreadsRequest == rhs.supportsTerminateThreadsRequest)||((this.supportsTerminateThreadsRequest!= null)&&this.supportsTerminateThreadsRequest.equals(rhs.supportsTerminateThreadsRequest))))&&((this.supportsExceptionInfoRequest == rhs.supportsExceptionInfoRequest)||((this.supportsExceptionInfoRequest!= null)&&this.supportsExceptionInfoRequest.equals(rhs.supportsExceptionInfoRequest))))&&((this.completionTriggerCharacters == rhs.completionTriggerCharacters)||((this.completionTriggerCharacters!= null)&&this.completionTriggerCharacters.equals(rhs.completionTriggerCharacters))))&&((this.supportsValueFormattingOptions == rhs.supportsValueFormattingOptions)||((this.supportsValueFormattingOptions!= null)&&this.supportsValueFormattingOptions.equals(rhs.supportsValueFormattingOptions))))&&((this.supportsCompletionsRequest == rhs.supportsCompletionsRequest)||((this.supportsCompletionsRequest!= null)&&this.supportsCompletionsRequest.equals(rhs.supportsCompletionsRequest))))&&((this.supportTerminateDebuggee == rhs.supportTerminateDebuggee)||((this.supportTerminateDebuggee!= null)&&this.supportTerminateDebuggee.equals(rhs.supportTerminateDebuggee))))&&((this.supportsSteppingGranularity == rhs.supportsSteppingGranularity)||((this.supportsSteppingGranularity!= null)&&this.supportsSteppingGranularity.equals(rhs.supportsSteppingGranularity))))&&((this.supportsDelayedStackTraceLoading == rhs.supportsDelayedStackTraceLoading)||((this.supportsDelayedStackTraceLoading!= null)&&this.supportsDelayedStackTraceLoading.equals(rhs.supportsDelayedStackTraceLoading))))&&((this.supportsSingleThreadExecutionRequests == rhs.supportsSingleThreadExecutionRequests)||((this.supportsSingleThreadExecutionRequests!= null)&&this.supportsSingleThreadExecutionRequests.equals(rhs.supportsSingleThreadExecutionRequests))))&&((this.supportsDataBreakpoints == rhs.supportsDataBreakpoints)||((this.supportsDataBreakpoints!= null)&&this.supportsDataBreakpoints.equals(rhs.supportsDataBreakpoints))))&&((this.supportsEvaluateForHovers == rhs.supportsEvaluateForHovers)||((this.supportsEvaluateForHovers!= null)&&this.supportsEvaluateForHovers.equals(rhs.supportsEvaluateForHovers))))&&((this.additionalModuleColumns == rhs.additionalModuleColumns)||((this.additionalModuleColumns!= null)&&this.additionalModuleColumns.equals(rhs.additionalModuleColumns))))&&((this.supportsFunctionBreakpoints == rhs.supportsFunctionBreakpoints)||((this.supportsFunctionBreakpoints!= null)&&this.supportsFunctionBreakpoints.equals(rhs.supportsFunctionBreakpoints))))&&((this.supportsBreakpointLocationsRequest == rhs.supportsBreakpointLocationsRequest)||((this.supportsBreakpointLocationsRequest!= null)&&this.supportsBreakpointLocationsRequest.equals(rhs.supportsBreakpointLocationsRequest))))&&((this.supportsInstructionBreakpoints == rhs.supportsInstructionBreakpoints)||((this.supportsInstructionBreakpoints!= null)&&this.supportsInstructionBreakpoints.equals(rhs.supportsInstructionBreakpoints))))&&((this.supportsStepBack == rhs.supportsStepBack)||((this.supportsStepBack!= null)&&this.supportsStepBack.equals(rhs.supportsStepBack))))&&((this.supportsExceptionOptions == rhs.supportsExceptionOptions)||((this.supportsExceptionOptions!= null)&&this.supportsExceptionOptions.equals(rhs.supportsExceptionOptions))))&&((this.supportsSetVariable == rhs.supportsSetVariable)||((this.supportsSetVariable!= null)&&this.supportsSetVariable.equals(rhs.supportsSetVariable))))&&((this.supportsClipboardContext == rhs.supportsClipboardContext)||((this.supportsClipboardContext!= null)&&this.supportsClipboardContext.equals(rhs.supportsClipboardContext))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.supportsWriteMemoryRequest == rhs.supportsWriteMemoryRequest)||((this.supportsWriteMemoryRequest!= null)&&this.supportsWriteMemoryRequest.equals(rhs.supportsWriteMemoryRequest))));
    }

}
