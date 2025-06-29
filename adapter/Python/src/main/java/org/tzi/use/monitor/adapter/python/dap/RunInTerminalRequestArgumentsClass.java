package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Arguments for `runInTerminal` request.
 */
public class RunInTerminalRequestArgumentsClass {
    private String[] args;
    private Boolean argsCanBeInterpretedByShell;
    private String cwd;
    private Map<String, String> env;
    private Kind kind;
    private String title;

    /**
     * List of arguments. The first argument is the command to run.
     */
    @JsonProperty("args")
    public String[] getArgs() { return args; }
    @JsonProperty("args")
    public void setArgs(String[] value) { this.args = value; }

    /**
     * This property should only be set if the corresponding capability
     * `supportsArgsCanBeInterpretedByShell` is true. If the client uses an intermediary shell
     * to launch the application, then the client must not attempt to escape characters with
     * special meanings for the shell. The user is fully responsible for escaping as needed and
     * that arguments using special characters may not be portable across shells.
     */
    @JsonProperty("argsCanBeInterpretedByShell")
    public Boolean getArgsCanBeInterpretedByShell() { return argsCanBeInterpretedByShell; }
    @JsonProperty("argsCanBeInterpretedByShell")
    public void setArgsCanBeInterpretedByShell(Boolean value) { this.argsCanBeInterpretedByShell = value; }

    /**
     * Working directory for the command. For non-empty, valid paths this typically results in
     * execution of a change directory command.
     */
    @JsonProperty("cwd")
    public String getCwd() { return cwd; }
    @JsonProperty("cwd")
    public void setCwd(String value) { this.cwd = value; }

    /**
     * Environment key-value pairs that are added to or removed from the default environment.
     */
    @JsonProperty("env")
    public Map<String, String> getEnv() { return env; }
    @JsonProperty("env")
    public void setEnv(Map<String, String> value) { this.env = value; }

    /**
     * What kind of terminal to launch. Defaults to `integrated` if not specified.
     */
    @JsonProperty("kind")
    public Kind getKind() { return kind; }
    @JsonProperty("kind")
    public void setKind(Kind value) { this.kind = value; }

    /**
     * Title of the terminal.
     */
    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }
}
