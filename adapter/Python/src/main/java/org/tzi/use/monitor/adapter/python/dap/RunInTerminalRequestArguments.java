
package org.tzi.use.monitor.adapter.python.dap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Arguments for `runInTerminal` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "title",
    "cwd",
    "args",
    "env",
    "argsCanBeInterpretedByShell"
})
@Generated("jsonschema2pojo")
public class RunInTerminalRequestArguments {

    /**
     * What kind of terminal to launch. Defaults to `integrated` if not specified.
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("What kind of terminal to launch. Defaults to `integrated` if not specified.")
    private Kind kind;
    /**
     * Title of the terminal.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Title of the terminal.")
    private String title;
    /**
     * Working directory for the command. For non-empty, valid paths this typically results in execution of a change directory command.
     * (Required)
     * 
     */
    @JsonProperty("cwd")
    @JsonPropertyDescription("Working directory for the command. For non-empty, valid paths this typically results in execution of a change directory command.")
    private String cwd;
    /**
     * List of arguments. The first argument is the command to run.
     * (Required)
     * 
     */
    @JsonProperty("args")
    @JsonPropertyDescription("List of arguments. The first argument is the command to run.")
    private List<String> args = new ArrayList<String>();
    /**
     * Environment key-value pairs that are added to or removed from the default environment.
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("Environment key-value pairs that are added to or removed from the default environment.")
    private Env env;
    /**
     * This property should only be set if the corresponding capability `supportsArgsCanBeInterpretedByShell` is true. If the client uses an intermediary shell to launch the application, then the client must not attempt to escape characters with special meanings for the shell. The user is fully responsible for escaping as needed and that arguments using special characters may not be portable across shells.
     * 
     */
    @JsonProperty("argsCanBeInterpretedByShell")
    @JsonPropertyDescription("This property should only be set if the corresponding capability `supportsArgsCanBeInterpretedByShell` is true. If the client uses an intermediary shell to launch the application, then the client must not attempt to escape characters with special meanings for the shell. The user is fully responsible for escaping as needed and that arguments using special characters may not be portable across shells.")
    private Boolean argsCanBeInterpretedByShell;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * What kind of terminal to launch. Defaults to `integrated` if not specified.
     * 
     */
    @JsonProperty("kind")
    public Kind getKind() {
        return kind;
    }

    /**
     * What kind of terminal to launch. Defaults to `integrated` if not specified.
     * 
     */
    @JsonProperty("kind")
    public void setKind(Kind kind) {
        this.kind = kind;
    }

    /**
     * Title of the terminal.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title of the terminal.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Working directory for the command. For non-empty, valid paths this typically results in execution of a change directory command.
     * (Required)
     * 
     */
    @JsonProperty("cwd")
    public String getCwd() {
        return cwd;
    }

    /**
     * Working directory for the command. For non-empty, valid paths this typically results in execution of a change directory command.
     * (Required)
     * 
     */
    @JsonProperty("cwd")
    public void setCwd(String cwd) {
        this.cwd = cwd;
    }

    /**
     * List of arguments. The first argument is the command to run.
     * (Required)
     * 
     */
    @JsonProperty("args")
    public List<String> getArgs() {
        return args;
    }

    /**
     * List of arguments. The first argument is the command to run.
     * (Required)
     * 
     */
    @JsonProperty("args")
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * Environment key-value pairs that are added to or removed from the default environment.
     * 
     */
    @JsonProperty("env")
    public Env getEnv() {
        return env;
    }

    /**
     * Environment key-value pairs that are added to or removed from the default environment.
     * 
     */
    @JsonProperty("env")
    public void setEnv(Env env) {
        this.env = env;
    }

    /**
     * This property should only be set if the corresponding capability `supportsArgsCanBeInterpretedByShell` is true. If the client uses an intermediary shell to launch the application, then the client must not attempt to escape characters with special meanings for the shell. The user is fully responsible for escaping as needed and that arguments using special characters may not be portable across shells.
     * 
     */
    @JsonProperty("argsCanBeInterpretedByShell")
    public Boolean getArgsCanBeInterpretedByShell() {
        return argsCanBeInterpretedByShell;
    }

    /**
     * This property should only be set if the corresponding capability `supportsArgsCanBeInterpretedByShell` is true. If the client uses an intermediary shell to launch the application, then the client must not attempt to escape characters with special meanings for the shell. The user is fully responsible for escaping as needed and that arguments using special characters may not be portable across shells.
     * 
     */
    @JsonProperty("argsCanBeInterpretedByShell")
    public void setArgsCanBeInterpretedByShell(Boolean argsCanBeInterpretedByShell) {
        this.argsCanBeInterpretedByShell = argsCanBeInterpretedByShell;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RunInTerminalRequestArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("cwd");
        sb.append('=');
        sb.append(((this.cwd == null)?"<null>":this.cwd));
        sb.append(',');
        sb.append("args");
        sb.append('=');
        sb.append(((this.args == null)?"<null>":this.args));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("argsCanBeInterpretedByShell");
        sb.append('=');
        sb.append(((this.argsCanBeInterpretedByShell == null)?"<null>":this.argsCanBeInterpretedByShell));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.args == null)? 0 :this.args.hashCode()));
        result = ((result* 31)+((this.cwd == null)? 0 :this.cwd.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.argsCanBeInterpretedByShell == null)? 0 :this.argsCanBeInterpretedByShell.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RunInTerminalRequestArguments) == false) {
            return false;
        }
        RunInTerminalRequestArguments rhs = ((RunInTerminalRequestArguments) other);
        return ((((((((this.args == rhs.args)||((this.args!= null)&&this.args.equals(rhs.args)))&&((this.cwd == rhs.cwd)||((this.cwd!= null)&&this.cwd.equals(rhs.cwd))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.argsCanBeInterpretedByShell == rhs.argsCanBeInterpretedByShell)||((this.argsCanBeInterpretedByShell!= null)&&this.argsCanBeInterpretedByShell.equals(rhs.argsCanBeInterpretedByShell))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))));
    }


    /**
     * What kind of terminal to launch. Defaults to `integrated` if not specified.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Kind {

        INTEGRATED("integrated"),
        EXTERNAL("external");
        private final String value;
        private final static Map<String, Kind> CONSTANTS = new HashMap<String, Kind>();

        static {
            for (Kind c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Kind(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Kind fromValue(String value) {
            Kind constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
