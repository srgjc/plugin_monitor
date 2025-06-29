package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * The request resumes the given thread to step into a function/method and allows all other
 * threads to run freely by resuming them.
 * If the debug adapter supports single thread execution (see capability
 * `supportsSingleThreadExecutionRequests`), setting the `singleThread` argument to true
 * prevents other suspended threads from resuming.
 * If the request cannot step into a target, `stepIn` behaves like the `next` request.
 * The debug adapter first sends the response and then a `stopped` event (with reason
 * `step`) after the step has completed.
 * If there are multiple function/method calls (or other targets) on the source line,
 * the argument `targetId` can be used to control into which target the `stepIn` should
 * occur.
 * The list of possible targets for a given source line can be retrieved via the
 * `stepInTargets` request.
 */
public class StepInRequestClass {
    private long seq;
    private AttachRequestType type;
    private StepInRequestArguments arguments;
    private StepInRequestCommand command;

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
    public AttachRequestType getType() { return type; }
    @JsonProperty("type")
    public void setType(AttachRequestType value) { this.type = value; }

    /**
     * Object containing arguments for the command.
     */
    @JsonProperty("arguments")
    public StepInRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(StepInRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public StepInRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(StepInRequestCommand value) { this.command = value; }
}
