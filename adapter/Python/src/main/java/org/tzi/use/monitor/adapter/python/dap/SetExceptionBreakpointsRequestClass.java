package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * The request configures the debugger's response to thrown exceptions.
 * If an exception is configured to break, a `stopped` event is fired (with reason
 * `exception`).
 * Clients should only call this request if the corresponding capability
 * `exceptionBreakpointFilters` returns one or more filters.
 */
public class SetExceptionBreakpointsRequestClass {
    private long seq;
    private AttachRequestType type;
    private SetExceptionBreakpointsRequestArguments arguments;
    private SetExceptionBreakpointsRequestCommand command;

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
    public AttachRequestType getType() { return type; }
    @JsonProperty("type")
    public void setType(AttachRequestType value) { this.type = value; }

    /**
     * Object containing arguments for the command.
     */
    @JsonProperty("arguments")
    public SetExceptionBreakpointsRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(SetExceptionBreakpointsRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public SetExceptionBreakpointsRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(SetExceptionBreakpointsRequestCommand value) { this.command = value; }
}
