package org.tzi.use.monitor.adapter.python.tmp;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Request.class, name = "request"),
        @JsonSubTypes.Type(value = Response.class, name = "response"),
        @JsonSubTypes.Type(value = Event.class, name = "event")
})
public abstract class DAPMessage {

    protected Integer seq;
    protected String type;

    public DAPMessage() {}

    protected DAPMessage(Integer seq, String type) {
        this.seq = seq;
        this.type = type;
    }

    public Integer getSeq() {
        return seq;
    }


    public String getType() {
        return type;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public void setType(String type) {
        this.type = type;
    }

}
