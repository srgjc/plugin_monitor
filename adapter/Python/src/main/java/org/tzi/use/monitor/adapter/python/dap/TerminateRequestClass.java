package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * The `terminate` request is sent from the client to the debug adapter in order to shut
 * down the debuggee gracefully. Clients should only call this request if the capability
 * `supportsTerminateRequest` is true.
 * Typically a debug adapter implements `terminate` by sending a software signal which the
 * debuggee intercepts in order to clean things up properly before terminating itself.
 * Please note that this request does not directly affect the state of the debug session: if
 * the debuggee decides to veto the graceful shutdown for any reason by not terminating
 * itself, then the debug session just continues.
 * Clients can surface the `terminate` request as an explicit command or they can integrate
 * it into a two stage Stop command that first sends `terminate` to request a graceful
 * shutdown, and if that fails uses `disconnect` for a forceful shutdown.
 */
public class TerminateRequestClass {
    private long seq;
    private AttachRequestType type;
    private TerminateRequestArguments arguments;
    private TerminateRequestCommand command;

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
    public TerminateRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(TerminateRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public TerminateRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(TerminateRequestCommand value) { this.command = value; }
}
