package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A debug adapter initiated event.
 *
 * This event indicates that some memory range has been updated. It should only be sent if
 * the corresponding capability `supportsMemoryEvent` is true.
 * Clients typically react to the event by re-issuing a `readMemory` request if they show
 * the memory identified by the `memoryReference` and if the updated memory range overlaps
 * the displayed range. Clients should not make assumptions how individual memory references
 * relate to each other, so they should not assume that they are part of a single continuous
 * address range and might overlap.
 * Debug adapters can use this event to indicate that the contents of a memory range has
 * changed due to some other request like `setVariable` or `setExpression`. Debug adapters
 * are not expected to emit this event for each and every memory change of a running
 * program, because that information is typically not available from debuggers and it would
 * flood clients with too many events.
 */
public class MemoryEventClass {
    private long seq;
    private BreakpointEventType type;
    private MemoryEventBody body;
    private MemoryEventEvent event;

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
    public MemoryEventBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(MemoryEventBody value) { this.body = value; }

    /**
     * Type of event.
     */
    @JsonProperty("event")
    public MemoryEventEvent getEvent() { return event; }
    @JsonProperty("event")
    public void setEvent(MemoryEventEvent value) { this.event = value; }
}
