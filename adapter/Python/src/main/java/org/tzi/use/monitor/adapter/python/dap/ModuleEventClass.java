package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A debug adapter initiated event.
 *
 * The event indicates that some information about a module has changed.
 */
public class ModuleEventClass {
    private long seq;
    private BreakpointEventType type;
    private ModuleEventBody body;
    private ModuleEventEvent event;

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
    public BreakpointEventType getType() { return type; }
    @JsonProperty("type")
    public void setType(BreakpointEventType value) { this.type = value; }

    /**
     * Event-specific information.
     */
    @JsonProperty("body")
    public ModuleEventBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(ModuleEventBody value) { this.body = value; }

    /**
     * Type of event.
     */
    @JsonProperty("event")
    public ModuleEventEvent getEvent() { return event; }
    @JsonProperty("event")
    public void setEvent(ModuleEventEvent value) { this.event = value; }
}
