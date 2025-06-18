package org.tzi.use.monitor.adapter.python.tmp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.JsonNode;
import org.tzi.use.monitor.adapter.python.dap.DAPEvent;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "event"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InitializedEvent.class, name = "initialized")
})
public abstract class Event extends DAPMessage implements DAPEvent {

    public Event() {}

    public Event(String event) {
        this.event = event;
    }

    @JsonUnwrapped
    private DAPMessage message;

    @JsonProperty("event")
    private String event;

    @JsonProperty("body")
    private JsonNode body;

    public DAPMessage getMessage() {
        return message;
    }

    public void setMessage(DAPMessage message) {
        this.message = message;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public JsonNode getBody() {
        return body;
    }

    public void setBody(JsonNode body) {
        this.body = body;
    }
}
