package org.tzi.use.monitor.adapter.python.tmp;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("initialize")
public class InitializeResponse extends Response {

    private Capabilities body;

    public InitializeResponse() {}

    public InitializeResponse(Integer seq, String type) {
        super(seq, type);
    }

    public Capabilities getBody() {
        return body;
    }

    public void setBody(Capabilities body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "InitializeResponse{" +
                "body=" + body +
                ", command='" + command + '\'' +
                ", requestSeq=" + requestSeq +
                ", success=" + success +
                ", message='" + message + '\'' +
                ", seq=" + seq +
                ", type='" + type + '\'' +
                '}';
    }

}
