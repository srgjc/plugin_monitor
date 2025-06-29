package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * Retrieves the set of all sources currently loaded by the debugged process.
 * Clients should only call this request if the corresponding capability
 * `supportsLoadedSourcesRequest` is true.
 */
public class LoadedSourcesRequestClass {
    private long seq;
    private AttachRequestType type;
    private Map<String, Object> arguments;
    private LoadedSourcesRequestCommand command;

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
    public Map<String, Object> getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(Map<String, Object> value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public LoadedSourcesRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(LoadedSourcesRequestCommand value) { this.command = value; }
}
