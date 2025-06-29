package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * This request is sent from the debug adapter to the client to start a new debug session of
 * the same type as the caller.
 * This request should only be sent if the corresponding client capability
 * `supportsStartDebuggingRequest` is true.
 * A client implementation of `startDebugging` should start a new debug session (of the same
 * type as the caller) in the same way that the caller's session was started. If the client
 * supports hierarchical debug sessions, the newly created session can be treated as a child
 * of the caller session.
 */
public class StartDebuggingRequestClass {
    private long seq;
    private AttachRequestType type;
    private StartDebuggingRequestArguments arguments;
    private StartDebuggingRequestCommand command;

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
    public StartDebuggingRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(StartDebuggingRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public StartDebuggingRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(StartDebuggingRequestCommand value) { this.command = value; }
}
