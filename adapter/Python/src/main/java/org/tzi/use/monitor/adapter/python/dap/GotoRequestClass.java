package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * The request sets the location where the debuggee will continue to run.
 * This makes it possible to skip the execution of code or to execute code again.
 * The code between the current location and the goto target is not executed but skipped.
 * The debug adapter first sends the response and then a `stopped` event with reason `goto`.
 * Clients should only call this request if the corresponding capability
 * `supportsGotoTargetsRequest` is true (because only then goto targets exist that can be
 * passed as arguments).
 */
public class GotoRequestClass {
    private long seq;
    private AttachRequestType type;
    private GotoRequestArguments arguments;
    private GotoRequestCommand command;

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
    public GotoRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(GotoRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public GotoRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(GotoRequestCommand value) { this.command = value; }
}
