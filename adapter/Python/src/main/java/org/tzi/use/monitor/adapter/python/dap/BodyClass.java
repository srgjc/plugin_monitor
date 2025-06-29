package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Information about the capabilities of a debug adapter.
 *
 * The set of updated capabilities.
 *
 * The capabilities of this debug adapter.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BodyClass {
    private ColumnDescriptor[] additionalModuleColumns;
    private String[] completionTriggerCharacters;
    private ExceptionBreakpointsFilter[] exceptionBreakpointFilters;
    private ChecksumAlgorithm[] supportedChecksumAlgorithms;
    private Boolean supportsBreakpointLocationsRequest;
    private Boolean supportsCancelRequest;
    private Boolean supportsClipboardContext;
    private Boolean supportsCompletionsRequest;
    private Boolean supportsConditionalBreakpoints;
    private Boolean supportsConfigurationDoneRequest;
    private Boolean supportsDataBreakpoints;
    private Boolean supportsDelayedStackTraceLoading;
    private Boolean supportsDisassembleRequest;
    private Boolean supportsEvaluateForHovers;
    private Boolean supportsExceptionFilterOptions;
    private Boolean supportsExceptionInfoRequest;
    private Boolean supportsExceptionOptions;
    private Boolean supportsFunctionBreakpoints;
    private Boolean supportsGotoTargetsRequest;
    private Boolean supportsHitConditionalBreakpoints;
    private Boolean supportsInstructionBreakpoints;
    private Boolean supportsLoadedSourcesRequest;
    private Boolean supportsLogPoints;
    private Boolean supportsModulesRequest;
    private Boolean supportsReadMemoryRequest;
    private Boolean supportsRestartFrame;
    private Boolean supportsRestartRequest;
    private Boolean supportsSetExpression;
    private Boolean supportsSetVariable;
    private Boolean supportsSingleThreadExecutionRequests;
    private Boolean supportsStepBack;
    private Boolean supportsStepInTargetsRequest;
    private Boolean supportsSteppingGranularity;
    private Boolean supportsTerminateRequest;
    private Boolean supportsTerminateThreadsRequest;
    private Boolean supportSuspendDebuggee;
    private Boolean supportsValueFormattingOptions;
    private Boolean supportsWriteMemoryRequest;
    private Boolean supportTerminateDebuggee;
    private Boolean supportsDebuggerProperties;
    private Boolean supportsTerminateDebuggee;

    /**
     * The set of additional module information exposed by the debug adapter.
     */
    @JsonProperty("additionalModuleColumns")
    public ColumnDescriptor[] getAdditionalModuleColumns() { return additionalModuleColumns; }
    @JsonProperty("additionalModuleColumns")
    public void setAdditionalModuleColumns(ColumnDescriptor[] value) { this.additionalModuleColumns = value; }

    /**
     * The set of characters that should trigger completion in a REPL. If not specified, the UI
     * should assume the `.` character.
     */
    @JsonProperty("completionTriggerCharacters")
    public String[] getCompletionTriggerCharacters() { return completionTriggerCharacters; }
    @JsonProperty("completionTriggerCharacters")
    public void setCompletionTriggerCharacters(String[] value) { this.completionTriggerCharacters = value; }

    /**
     * Available exception filter options for the `setExceptionBreakpoints` request.
     */
    @JsonProperty("exceptionBreakpointFilters")
    public ExceptionBreakpointsFilter[] getExceptionBreakpointFilters() { return exceptionBreakpointFilters; }
    @JsonProperty("exceptionBreakpointFilters")
    public void setExceptionBreakpointFilters(ExceptionBreakpointsFilter[] value) { this.exceptionBreakpointFilters = value; }

    /**
     * Checksum algorithms supported by the debug adapter.
     */
    @JsonProperty("supportedChecksumAlgorithms")
    public ChecksumAlgorithm[] getSupportedChecksumAlgorithms() { return supportedChecksumAlgorithms; }
    @JsonProperty("supportedChecksumAlgorithms")
    public void setSupportedChecksumAlgorithms(ChecksumAlgorithm[] value) { this.supportedChecksumAlgorithms = value; }

    /**
     * The debug adapter supports the `breakpointLocations` request.
     */
    @JsonProperty("supportsBreakpointLocationsRequest")
    public Boolean getSupportsBreakpointLocationsRequest() { return supportsBreakpointLocationsRequest; }
    @JsonProperty("supportsBreakpointLocationsRequest")
    public void setSupportsBreakpointLocationsRequest(Boolean value) { this.supportsBreakpointLocationsRequest = value; }

    /**
     * The debug adapter supports the `cancel` request.
     */
    @JsonProperty("supportsCancelRequest")
    public Boolean getSupportsCancelRequest() { return supportsCancelRequest; }
    @JsonProperty("supportsCancelRequest")
    public void setSupportsCancelRequest(Boolean value) { this.supportsCancelRequest = value; }

    /**
     * The debug adapter supports the `clipboard` context value in the `evaluate` request.
     */
    @JsonProperty("supportsClipboardContext")
    public Boolean getSupportsClipboardContext() { return supportsClipboardContext; }
    @JsonProperty("supportsClipboardContext")
    public void setSupportsClipboardContext(Boolean value) { this.supportsClipboardContext = value; }

    /**
     * The debug adapter supports the `completions` request.
     */
    @JsonProperty("supportsCompletionsRequest")
    public Boolean getSupportsCompletionsRequest() { return supportsCompletionsRequest; }
    @JsonProperty("supportsCompletionsRequest")
    public void setSupportsCompletionsRequest(Boolean value) { this.supportsCompletionsRequest = value; }

    /**
     * The debug adapter supports conditional breakpoints.
     */
    @JsonProperty("supportsConditionalBreakpoints")
    public Boolean getSupportsConditionalBreakpoints() { return supportsConditionalBreakpoints; }
    @JsonProperty("supportsConditionalBreakpoints")
    public void setSupportsConditionalBreakpoints(Boolean value) { this.supportsConditionalBreakpoints = value; }

    /**
     * The debug adapter supports the `configurationDone` request.
     */
    @JsonProperty("supportsConfigurationDoneRequest")
    public Boolean getSupportsConfigurationDoneRequest() { return supportsConfigurationDoneRequest; }
    @JsonProperty("supportsConfigurationDoneRequest")
    public void setSupportsConfigurationDoneRequest(Boolean value) { this.supportsConfigurationDoneRequest = value; }

    /**
     * The debug adapter supports data breakpoints.
     */
    @JsonProperty("supportsDataBreakpoints")
    public Boolean getSupportsDataBreakpoints() { return supportsDataBreakpoints; }
    @JsonProperty("supportsDataBreakpoints")
    public void setSupportsDataBreakpoints(Boolean value) { this.supportsDataBreakpoints = value; }

    /**
     * The debug adapter supports the delayed loading of parts of the stack, which requires that
     * both the `startFrame` and `levels` arguments and the `totalFrames` result of the
     * `stackTrace` request are supported.
     */
    @JsonProperty("supportsDelayedStackTraceLoading")
    public Boolean getSupportsDelayedStackTraceLoading() { return supportsDelayedStackTraceLoading; }
    @JsonProperty("supportsDelayedStackTraceLoading")
    public void setSupportsDelayedStackTraceLoading(Boolean value) { this.supportsDelayedStackTraceLoading = value; }

    /**
     * The debug adapter supports the `disassemble` request.
     */
    @JsonProperty("supportsDisassembleRequest")
    public Boolean getSupportsDisassembleRequest() { return supportsDisassembleRequest; }
    @JsonProperty("supportsDisassembleRequest")
    public void setSupportsDisassembleRequest(Boolean value) { this.supportsDisassembleRequest = value; }

    /**
     * The debug adapter supports a (side effect free) `evaluate` request for data hovers.
     */
    @JsonProperty("supportsEvaluateForHovers")
    public Boolean getSupportsEvaluateForHovers() { return supportsEvaluateForHovers; }
    @JsonProperty("supportsEvaluateForHovers")
    public void setSupportsEvaluateForHovers(Boolean value) { this.supportsEvaluateForHovers = value; }

    /**
     * The debug adapter supports `filterOptions` as an argument on the
     * `setExceptionBreakpoints` request.
     */
    @JsonProperty("supportsExceptionFilterOptions")
    public Boolean getSupportsExceptionFilterOptions() { return supportsExceptionFilterOptions; }
    @JsonProperty("supportsExceptionFilterOptions")
    public void setSupportsExceptionFilterOptions(Boolean value) { this.supportsExceptionFilterOptions = value; }

    /**
     * The debug adapter supports the `exceptionInfo` request.
     */
    @JsonProperty("supportsExceptionInfoRequest")
    public Boolean getSupportsExceptionInfoRequest() { return supportsExceptionInfoRequest; }
    @JsonProperty("supportsExceptionInfoRequest")
    public void setSupportsExceptionInfoRequest(Boolean value) { this.supportsExceptionInfoRequest = value; }

    /**
     * The debug adapter supports `exceptionOptions` on the `setExceptionBreakpoints` request.
     */
    @JsonProperty("supportsExceptionOptions")
    public Boolean getSupportsExceptionOptions() { return supportsExceptionOptions; }
    @JsonProperty("supportsExceptionOptions")
    public void setSupportsExceptionOptions(Boolean value) { this.supportsExceptionOptions = value; }

    /**
     * The debug adapter supports function breakpoints.
     */
    @JsonProperty("supportsFunctionBreakpoints")
    public Boolean getSupportsFunctionBreakpoints() { return supportsFunctionBreakpoints; }
    @JsonProperty("supportsFunctionBreakpoints")
    public void setSupportsFunctionBreakpoints(Boolean value) { this.supportsFunctionBreakpoints = value; }

    /**
     * The debug adapter supports the `gotoTargets` request.
     */
    @JsonProperty("supportsGotoTargetsRequest")
    public Boolean getSupportsGotoTargetsRequest() { return supportsGotoTargetsRequest; }
    @JsonProperty("supportsGotoTargetsRequest")
    public void setSupportsGotoTargetsRequest(Boolean value) { this.supportsGotoTargetsRequest = value; }

    /**
     * The debug adapter supports breakpoints that break execution after a specified number of
     * hits.
     */
    @JsonProperty("supportsHitConditionalBreakpoints")
    public Boolean getSupportsHitConditionalBreakpoints() { return supportsHitConditionalBreakpoints; }
    @JsonProperty("supportsHitConditionalBreakpoints")
    public void setSupportsHitConditionalBreakpoints(Boolean value) { this.supportsHitConditionalBreakpoints = value; }

    /**
     * The debug adapter supports adding breakpoints based on instruction references.
     */
    @JsonProperty("supportsInstructionBreakpoints")
    public Boolean getSupportsInstructionBreakpoints() { return supportsInstructionBreakpoints; }
    @JsonProperty("supportsInstructionBreakpoints")
    public void setSupportsInstructionBreakpoints(Boolean value) { this.supportsInstructionBreakpoints = value; }

    /**
     * The debug adapter supports the `loadedSources` request.
     */
    @JsonProperty("supportsLoadedSourcesRequest")
    public Boolean getSupportsLoadedSourcesRequest() { return supportsLoadedSourcesRequest; }
    @JsonProperty("supportsLoadedSourcesRequest")
    public void setSupportsLoadedSourcesRequest(Boolean value) { this.supportsLoadedSourcesRequest = value; }

    /**
     * The debug adapter supports log points by interpreting the `logMessage` attribute of the
     * `SourceBreakpoint`.
     */
    @JsonProperty("supportsLogPoints")
    public Boolean getSupportsLogPoints() { return supportsLogPoints; }
    @JsonProperty("supportsLogPoints")
    public void setSupportsLogPoints(Boolean value) { this.supportsLogPoints = value; }

    /**
     * The debug adapter supports the `modules` request.
     */
    @JsonProperty("supportsModulesRequest")
    public Boolean getSupportsModulesRequest() { return supportsModulesRequest; }
    @JsonProperty("supportsModulesRequest")
    public void setSupportsModulesRequest(Boolean value) { this.supportsModulesRequest = value; }

    /**
     * The debug adapter supports the `readMemory` request.
     */
    @JsonProperty("supportsReadMemoryRequest")
    public Boolean getSupportsReadMemoryRequest() { return supportsReadMemoryRequest; }
    @JsonProperty("supportsReadMemoryRequest")
    public void setSupportsReadMemoryRequest(Boolean value) { this.supportsReadMemoryRequest = value; }

    /**
     * The debug adapter supports restarting a frame.
     */
    @JsonProperty("supportsRestartFrame")
    public Boolean getSupportsRestartFrame() { return supportsRestartFrame; }
    @JsonProperty("supportsRestartFrame")
    public void setSupportsRestartFrame(Boolean value) { this.supportsRestartFrame = value; }

    /**
     * The debug adapter supports the `restart` request. In this case a client should not
     * implement `restart` by terminating and relaunching the adapter but by calling the
     * `restart` request.
     */
    @JsonProperty("supportsRestartRequest")
    public Boolean getSupportsRestartRequest() { return supportsRestartRequest; }
    @JsonProperty("supportsRestartRequest")
    public void setSupportsRestartRequest(Boolean value) { this.supportsRestartRequest = value; }

    /**
     * The debug adapter supports the `setExpression` request.
     */
    @JsonProperty("supportsSetExpression")
    public Boolean getSupportsSetExpression() { return supportsSetExpression; }
    @JsonProperty("supportsSetExpression")
    public void setSupportsSetExpression(Boolean value) { this.supportsSetExpression = value; }

    /**
     * The debug adapter supports setting a variable to a value.
     */
    @JsonProperty("supportsSetVariable")
    public Boolean getSupportsSetVariable() { return supportsSetVariable; }
    @JsonProperty("supportsSetVariable")
    public void setSupportsSetVariable(Boolean value) { this.supportsSetVariable = value; }

    /**
     * The debug adapter supports the `singleThread` property on the execution requests
     * (`continue`, `next`, `stepIn`, `stepOut`, `reverseContinue`, `stepBack`).
     */
    @JsonProperty("supportsSingleThreadExecutionRequests")
    public Boolean getSupportsSingleThreadExecutionRequests() { return supportsSingleThreadExecutionRequests; }
    @JsonProperty("supportsSingleThreadExecutionRequests")
    public void setSupportsSingleThreadExecutionRequests(Boolean value) { this.supportsSingleThreadExecutionRequests = value; }

    /**
     * The debug adapter supports stepping back via the `stepBack` and `reverseContinue`
     * requests.
     */
    @JsonProperty("supportsStepBack")
    public Boolean getSupportsStepBack() { return supportsStepBack; }
    @JsonProperty("supportsStepBack")
    public void setSupportsStepBack(Boolean value) { this.supportsStepBack = value; }

    /**
     * The debug adapter supports the `stepInTargets` request.
     */
    @JsonProperty("supportsStepInTargetsRequest")
    public Boolean getSupportsStepInTargetsRequest() { return supportsStepInTargetsRequest; }
    @JsonProperty("supportsStepInTargetsRequest")
    public void setSupportsStepInTargetsRequest(Boolean value) { this.supportsStepInTargetsRequest = value; }

    /**
     * The debug adapter supports stepping granularities (argument `granularity`) for the
     * stepping requests.
     */
    @JsonProperty("supportsSteppingGranularity")
    public Boolean getSupportsSteppingGranularity() { return supportsSteppingGranularity; }
    @JsonProperty("supportsSteppingGranularity")
    public void setSupportsSteppingGranularity(Boolean value) { this.supportsSteppingGranularity = value; }

    /**
     * The debug adapter supports the `terminate` request.
     */
    @JsonProperty("supportsTerminateRequest")
    public Boolean getSupportsTerminateRequest() { return supportsTerminateRequest; }
    @JsonProperty("supportsTerminateRequest")
    public void setSupportsTerminateRequest(Boolean value) { this.supportsTerminateRequest = value; }

    /**
     * The debug adapter supports the `terminateThreads` request.
     */
    @JsonProperty("supportsTerminateThreadsRequest")
    public Boolean getSupportsTerminateThreadsRequest() { return supportsTerminateThreadsRequest; }
    @JsonProperty("supportsTerminateThreadsRequest")
    public void setSupportsTerminateThreadsRequest(Boolean value) { this.supportsTerminateThreadsRequest = value; }

    /**
     * The debug adapter supports the `suspendDebuggee` attribute on the `disconnect` request.
     */
    @JsonProperty("supportSuspendDebuggee")
    public Boolean getSupportSuspendDebuggee() { return supportSuspendDebuggee; }
    @JsonProperty("supportSuspendDebuggee")
    public void setSupportSuspendDebuggee(Boolean value) { this.supportSuspendDebuggee = value; }

    /**
     * The debug adapter supports a `format` attribute on the `stackTrace`, `variables`, and
     * `evaluate` requests.
     */
    @JsonProperty("supportsValueFormattingOptions")
    public Boolean getSupportsValueFormattingOptions() { return supportsValueFormattingOptions; }
    @JsonProperty("supportsValueFormattingOptions")
    public void setSupportsValueFormattingOptions(Boolean value) { this.supportsValueFormattingOptions = value; }

    /**
     * The debug adapter supports the `writeMemory` request.
     */
    @JsonProperty("supportsWriteMemoryRequest")
    public Boolean getSupportsWriteMemoryRequest() { return supportsWriteMemoryRequest; }
    @JsonProperty("supportsWriteMemoryRequest")
    public void setSupportsWriteMemoryRequest(Boolean value) { this.supportsWriteMemoryRequest = value; }

    /**
     * The debug adapter supports the `terminateDebuggee` attribute on the `disconnect` request.
     */
    @JsonProperty("supportTerminateDebuggee")
    public Boolean getSupportTerminateDebuggee() { return supportTerminateDebuggee; }
    @JsonProperty("supportTerminateDebuggee")
    public void setSupportTerminateDebuggee(Boolean value) { this.supportTerminateDebuggee = value; }

    @JsonProperty("supportsDebuggerProperties")
    public Boolean getSupportsDebuggerProperties() {
        return supportsDebuggerProperties;
    }

    @JsonProperty("supportsDebuggerProperties")
    public void setSupportsDebuggerProperties(Boolean supportsDebuggerProperties) {
        this.supportsDebuggerProperties = supportsDebuggerProperties;
    }

    @JsonProperty("supportsTerminateDebuggee")
    public Boolean getSupportsTerminateDebuggee() {
        return supportsTerminateDebuggee;
    }

    @JsonProperty("supportsTerminateDebuggee")
    public void setSupportsTerminateDebuggee(Boolean supportsTerminateDebuggee) {
        this.supportsTerminateDebuggee = supportsTerminateDebuggee;
    }
}
