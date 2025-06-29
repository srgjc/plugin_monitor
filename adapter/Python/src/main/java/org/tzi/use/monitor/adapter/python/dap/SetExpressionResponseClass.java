package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * Response for a request.
 *
 * Response to `setExpression` request.
 */
public class SetExpressionResponseClass {
    private long seq;
    private AttachResponseType type;
    private SetExpressionResponseBody body;
    private String command;
    private String message;
    private long requestSeq;
    private boolean success;

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
    public AttachResponseType getType() { return type; }
    @JsonProperty("type")
    public void setType(AttachResponseType value) { this.type = value; }

    /**
     * Contains request result if success is true and error details if success is false.
     */
    @JsonProperty("body")
    public SetExpressionResponseBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(SetExpressionResponseBody value) { this.body = value; }

    /**
     * The command requested.
     */
    @JsonProperty("command")
    public String getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(String value) { this.command = value; }

    /**
     * Contains the raw error in short form if `success` is false.
     * This raw error might be interpreted by the client and is not shown in the UI.
     * Some predefined values exist.
     */
    @JsonProperty("message")
    public String getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(String value) { this.message = value; }

    /**
     * Sequence number of the corresponding request.
     */
    @JsonProperty("request_seq")
    public long getRequestSeq() { return requestSeq; }
    @JsonProperty("request_seq")
    public void setRequestSeq(long value) { this.requestSeq = value; }

    /**
     * Outcome of the request.
     * If true, the request was successful and the `body` attribute may contain the result of
     * the request.
     * If the value is false, the attribute `message` contains the error in short form and the
     * `body` may contain additional information (see `ErrorResponse.body.error`).
     */
    @JsonProperty("success")
    public boolean getSuccess() { return success; }
    @JsonProperty("success")
    public void setSuccess(boolean value) { this.success = value; }
}
