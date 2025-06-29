package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Base class of requests, responses, and events.
 *
 * A client or debug adapter initiated request.
 *
 * This request is sent from the debug adapter to the client to run a command in a terminal.
 * This is typically used to launch the debuggee in a terminal provided by the client.
 * This request should only be called if the corresponding client capability
 * `supportsRunInTerminalRequest` is true.
 * Client implementations of `runInTerminal` are free to run the command however they choose
 * including issuing the command to a command line interpreter (aka 'shell'). Argument
 * strings passed to the `runInTerminal` request must arrive verbatim in the command to be
 * run. As a consequence, clients which use a shell are responsible for escaping any special
 * shell characters in the argument strings to prevent them from being interpreted (and
 * modified) by the shell.
 * Some users may wish to take advantage of shell processing in the argument strings. For
 * clients which implement `runInTerminal` using an intermediary shell, the
 * `argsCanBeInterpretedByShell` property can be set to true. In this case the client is
 * requested not to escape any special shell characters in the argument strings.
 */
public class RunInTerminalRequestClass {
    private long seq;
    private AttachRequestType type;
    private RunInTerminalRequestArguments arguments;
    private RunInTerminalRequestCommand command;

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
    public RunInTerminalRequestArguments getArguments() { return arguments; }
    @JsonProperty("arguments")
    public void setArguments(RunInTerminalRequestArguments value) { this.arguments = value; }

    /**
     * The command to execute.
     */
    @JsonProperty("command")
    public RunInTerminalRequestCommand getCommand() { return command; }
    @JsonProperty("command")
    public void setCommand(RunInTerminalRequestCommand value) { this.command = value; }
}
