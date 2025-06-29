package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A debug adapter initiated event.
 *
 * The event indicates that the execution of the debuggee has stopped due to some condition.
 * This can be caused by a breakpoint previously set, a stepping request has completed, by
 * executing a debugger statement etc.
 */
public class StoppedEventClass implements DAPEvent {
    private long seq;
    private BreakpointEventType type;
    private StoppedEventBody body;
    private StoppedEventEvent event;

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
    public StoppedEventBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(StoppedEventBody value) { this.body = value; }

    /**
     * Type of event.
     */
    @JsonProperty("event")
    public StoppedEventEvent getEvent() { return event; }
    @JsonProperty("event")
    public void setEvent(StoppedEventEvent value) { this.event = value; }
}
