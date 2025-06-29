package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * The `cancel` request is used by the client in two situations:
 * - to indicate that it is no longer interested in the result produced by a specific
 * request issued earlier
 * - to cancel a progress sequence.
 * Clients should only call this request if the corresponding capability
 * `supportsCancelRequest` is true.
 * This request has a hint characteristic: a debug adapter can only be expected to make a
 * 'best effort' in honoring this request but there are no guarantees.
 * The `cancel` request may return an error if it could not cancel an operation but a client
 * should refrain from presenting this error to end users.
 * The request that got cancelled still needs to send a response back. This can either be a
 * normal result (`success` attribute true) or an error response (`success` attribute false
 * and the `message` set to `cancelled`).
 * Returning partial results from a cancelled request is possible but please note that a
 * client has no generic way for detecting that a response is partial or not.
 * The progress that got cancelled still needs to send a `progressEnd` event back.
 * A client should not assume that progress just got cancelled after sending the `cancel`
 * request.
 */
public class CancelRequestClass {
    private long seq;
    private AttachRequestType type;
    private CancelRequestArguments arguments;
    private CancelRequestCommand command;

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
    public CancelRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(CancelRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public CancelRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(CancelRequestCommand value) { this.command = value; }
}
