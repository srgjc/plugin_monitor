package org.tzi.use.monitor.adapter.python.tmp;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.tzi.use.monitor.adapter.python.dap.DAPRequest;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "command"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InitializeRequest.class, name = "initialize")
})
public abstract class Request extends DAPMessage implements DAPRequest {

    protected String command;

    protected Request(Integer seq, String type, String command) {
        super(seq, type);
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

}
