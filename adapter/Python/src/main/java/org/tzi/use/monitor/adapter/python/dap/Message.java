package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * A structured error message.
 *
 * A structured message object. Used to return errors from requests.
 */
public class Message {
    private String format;
    private long id;
    private Boolean sendTelemetry;
    private Boolean showUser;
    private String url;
    private String urlLabel;
    private Map<String, String> variables;

    /**
     * A format string for the message. Embedded variables have the form `{name}`.
     * If variable name starts with an underscore character, the variable does not contain user
     * data (PII) and can be safely used for telemetry purposes.
     */
    @JsonProperty("format")
    public String getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(String value) { this.format = value; }

    /**
     * Unique (within a debug adapter implementation) identifier for the message. The purpose of
     * these error IDs is to help extension authors that have the requirement that every user
     * visible error message needs a corresponding error number, so that users or customer
     * support can find information about the specific error more easily.
     */
    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    /**
     * If true send to telemetry.
     */
    @JsonProperty("sendTelemetry")
    public Boolean getSendTelemetry() { return sendTelemetry; }
    @JsonProperty("sendTelemetry")
    public void setSendTelemetry(Boolean value) { this.sendTelemetry = value; }

    /**
     * If true show user.
     */
    @JsonProperty("showUser")
    public Boolean getShowUser() { return showUser; }
    @JsonProperty("showUser")
    public void setShowUser(Boolean value) { this.showUser = value; }

    /**
     * A url where additional information about this message can be found.
     */
    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    /**
     * A label that is presented to the user as the UI for opening the url.
     */
    @JsonProperty("urlLabel")
    public String getURLLabel() { return urlLabel; }
    @JsonProperty("urlLabel")
    public void setURLLabel(String value) { this.urlLabel = value; }

    /**
     * An object used as a dictionary for looking up the variables in the format string.
     */
    @JsonProperty("variables")
    public Map<String, String> getVariables() { return variables; }
    @JsonProperty("variables")
    public void setVariables(Map<String, String> value) { this.variables = value; }
}
