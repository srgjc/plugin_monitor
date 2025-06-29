package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A debug adapter initiated event.
 *
 * The event indicates that one or more capabilities have changed.
 * Since the capabilities are dependent on the client and its UI, it might not be possible
 * to change that at random times (or too late).
 * Consequently this event has a hint characteristic: a client can only be expected to make
 * a 'best effort' in honoring individual capabilities but there are no guarantees.
 * Only changed capabilities need to be included, all other capabilities keep their values.
 */
public class CapabilitiesEventClass {
    private long seq;
    private BreakpointEventType type;
    private CapabilitiesEventBody body;
    private CapabilitiesEventEvent event;

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
    public CapabilitiesEventBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(CapabilitiesEventBody value) { this.body = value; }

    /**
     * Type of event.
     */
    @JsonProperty("event")
    public CapabilitiesEventEvent getEvent() { return event; }
    @JsonProperty("event")
    public void setEvent(CapabilitiesEventEvent value) { this.event = value; }
}
