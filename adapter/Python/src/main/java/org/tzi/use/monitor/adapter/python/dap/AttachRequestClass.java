package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;
import org.tzi.use.monitor.adapter.python.dap.custom.DAPRequest;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * The `attach` request is sent from the client to the debug adapter to attach to a debuggee
 * that is already running.
 * Since attaching is debugger/runtime specific, the arguments for this request are not part
 * of this specification.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachRequestClass implements DAPRequest {
    private long seq;
    private AttachRequestType type = AttachRequestType.REQUEST;
    private AttachRequestArgumentsClass arguments;
    private AttachRequestCommand command = AttachRequestCommand.ATTACH;

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
    public AttachRequestArgumentsClass getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(AttachRequestArgumentsClass value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public AttachRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(AttachRequestCommand value) { this.command = value; }
}
