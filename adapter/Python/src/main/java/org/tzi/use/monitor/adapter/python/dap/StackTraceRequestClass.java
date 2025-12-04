package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;
import org.tzi.use.monitor.adapter.python.dap.custom.DAPRequest;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * The request returns a stacktrace from the current execution state of a given thread.
 * A client can request all stack frames by omitting the startFrame and levels arguments.
 * For performance-conscious clients and if the corresponding capability
 * `supportsDelayedStackTraceLoading` is true, stack frames can be retrieved in a piecemeal
 * way with the `startFrame` and `levels` arguments. The response of the `stackTrace`
 * request may contain a `totalFrames` property that hints at the total number of frames in
 * the stack. If a client needs this total number upfront, it can issue a request for a
 * single (first) frame and depending on the value of `totalFrames` decide how to proceed.
 * In any case a client should be prepared to receive fewer frames than requested, which is
 * an indication that the end of the stack has been reached.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StackTraceRequestClass implements DAPRequest {
    private long seq;
    private String type = "request";
    private StackTraceRequestArguments arguments;
    private String command = "stackTrace";

    /**
     * Sequence number of the message (also known as message ID). The `seq` for the first
     * message sent by a client or debug adapter is 1, and for each subsequent message is 1
     * greater than the previous message sent by that actor. `seq` can be used to order
     * requests, responses, and events, and to associate requests with their corresponding
     * responses. For protocol messages of type `request` the sequence number can be used to
     * cancel the request.
     */
    @JsonProperty("seq")
    public long getSeq() { return seq; }
    @JsonProperty("seq")
    public void setSeq(long value) { this.seq = value; }

    /**
     * Message type.
     */
    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    /**
     * Object containing arguments for the command.
     */
    @JsonProperty("arguments")
    public StackTraceRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(StackTraceRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public String getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(String value) { this.command = value; }
}
