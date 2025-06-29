package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A debug adapter initiated event.
 *
 * This event signals that some state in the debug adapter has changed and requires that the
 * client needs to re-render the data snapshot previously requested.
 * Debug adapters do not have to emit this event for runtime changes like stopped or thread
 * events because in that case the client refetches the new state anyway. But the event can
 * be used for example to refresh the UI after rendering formatting has changed in the debug
 * adapter.
 * This event should only be sent if the corresponding capability `supportsInvalidatedEvent`
 * is true.
 */
public class InvalidatedEventClass {
    private long seq;
    private BreakpointEventType type;
    private InvalidatedEventBody body;
    private InvalidatedEventEvent event;

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
    public InvalidatedEventBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(InvalidatedEventBody value) { this.body = value; }

    /**
     * Type of event.
     */
    @JsonProperty("event")
    public InvalidatedEventEvent getEvent() { return event; }
    @JsonProperty("event")
    public void setEvent(InvalidatedEventEvent value) { this.event = value; }
}
