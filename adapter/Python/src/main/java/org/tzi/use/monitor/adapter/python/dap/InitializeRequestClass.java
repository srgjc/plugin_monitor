package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * The `initialize` request is sent as the first request from the client to the debug
 * adapter in order to configure it with client capabilities and to retrieve capabilities
 * from the debug adapter.
 * Until the debug adapter has responded with an `initialize` response, the client must not
 * send any additional requests or events to the debug adapter.
 * In addition the debug adapter is not allowed to send any requests or events to the client
 * until it has responded with an `initialize` response.
 * The `initialize` request may only be sent once.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InitializeRequestClass implements DAPRequest {
    private long seq;
    private String type = "request";
    private InitializeRequestArguments arguments;
    private InitializeRequestCommand command = InitializeRequestCommand.INITIALIZE;

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
    public InitializeRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(InitializeRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public InitializeRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(InitializeRequestCommand value) { this.command = value; }
}
