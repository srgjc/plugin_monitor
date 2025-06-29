package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A debug adapter initiated event.
 *
 * The event indicates that the debuggee has exited and returns its exit code.
 */
public class ExitedEventClass {
    private long seq;
    private BreakpointEventType type;
    private ExitedEventBody body;
    private ExitedEventEvent event;

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
    public ExitedEventBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(ExitedEventBody value) { this.body = value; }

    /**
     * Type of event.
     */
    @JsonProperty("event")
    public ExitedEventEvent getEvent() { return event; }
    @JsonProperty("event")
    public void setEvent(ExitedEventEvent value) { this.event = value; }
}
