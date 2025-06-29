package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * Evaluates the given expression in the context of the topmost stack frame.
 * The expression has access to any variables and arguments that are in scope.
 */
public class EvaluateRequestClass {
    private long seq;
    private AttachRequestType type;
    private EvaluateRequestArguments arguments;
    private EvaluateRequestCommand command;

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
    public EvaluateRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(EvaluateRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public EvaluateRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(EvaluateRequestCommand value) { this.command = value; }
}
