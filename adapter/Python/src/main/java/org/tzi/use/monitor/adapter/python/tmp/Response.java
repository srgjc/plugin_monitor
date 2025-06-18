package org.tzi.use.monitor.adapter.python.tmp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.tzi.use.monitor.adapter.python.dap.DAPResponse;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "command",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InitializeResponse.class, name = "initialize")
})
public abstract class Response extends DAPMessage implements DAPResponse {

    protected String command;

    @JsonProperty("request_seq")
    protected Integer requestSeq;

    protected Boolean success;

    protected String message;

    public Response() {}

    protected Response(Integer seq, String type) {
        super(seq, type);
    }

    @Override
    public int getRequestSequence() {
        return requestSeq;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Integer getRequestSeq() {
        return requestSeq;
    }

    public void setRequestSeq(Integer requestSeq) {
        this.requestSeq = requestSeq;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
