package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * Sets multiple breakpoints for a single source and clears all previous breakpoints in that
 * source.
 * To clear all breakpoint for a source, specify an empty array.
 * When a breakpoint is hit, a `stopped` event (with reason `breakpoint`) is generated.
 */
public class SetBreakpointsRequestClass {
    private long seq;
    private AttachRequestType type;
    private SetBreakpointsRequestArguments arguments;
    private SetBreakpointsRequestCommand command;

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
    public SetBreakpointsRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(SetBreakpointsRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public SetBreakpointsRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(SetBreakpointsRequestCommand value) { this.command = value; }
}
