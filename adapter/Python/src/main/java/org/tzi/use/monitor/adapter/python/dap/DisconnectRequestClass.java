package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * The `disconnect` request asks the debug adapter to disconnect from the debuggee (thus
 * ending the debug session) and then to shut down itself (the debug adapter).
 * In addition, the debug adapter must terminate the debuggee if it was started with the
 * `launch` request. If an `attach` request was used to connect to the debuggee, then the
 * debug adapter must not terminate the debuggee.
 * This implicit behavior of when to terminate the debuggee can be overridden with the
 * `terminateDebuggee` argument (which is only supported by a debug adapter if the
 * corresponding capability `supportTerminateDebuggee` is true).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisconnectRequestClass implements DAPRequest {
    private long seq;
    private String type = "request";
    private DisconnectRequestArguments arguments;
    private String command = "disconnect";

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
    public DisconnectRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(DisconnectRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public String getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(String value) { this.command = value; }
}
