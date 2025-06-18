
package org.tzi.use.monitor.adapter.python.dap;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A structured message object. Used to return errors from requests.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "format",
    "variables",
    "sendTelemetry",
    "showUser",
    "url",
    "urlLabel"
})
@Generated("jsonschema2pojo")
public class Message {

    /**
     * Unique (within a debug adapter implementation) identifier for the message. The purpose of these error IDs is to help extension authors that have the requirement that every user visible error message needs a corresponding error number, so that users or customer support can find information about the specific error more easily.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique (within a debug adapter implementation) identifier for the message. The purpose of these error IDs is to help extension authors that have the requirement that every user visible error message needs a corresponding error number, so that users or customer support can find information about the specific error more easily.")
    private Integer id;
    /**
     * A format string for the message. Embedded variables have the form `{name}`.
     * If variable name starts with an underscore character, the variable does not contain user data (PII) and can be safely used for telemetry purposes.
     * (Required)
     * 
     */
    @JsonProperty("format")
    @JsonPropertyDescription("A format string for the message. Embedded variables have the form `{name}`.\nIf variable name starts with an underscore character, the variable does not contain user data (PII) and can be safely used for telemetry purposes.")
    private String format;
    /**
     * An object used as a dictionary for looking up the variables in the format string.
     * 
     */
    @JsonProperty("variables")
    @JsonPropertyDescription("An object used as a dictionary for looking up the variables in the format string.")
    private Variables variables;
    /**
     * If true send to telemetry.
     * 
     */
    @JsonProperty("sendTelemetry")
    @JsonPropertyDescription("If true send to telemetry.")
    private Boolean sendTelemetry;
    /**
     * If true show user.
     * 
     */
    @JsonProperty("showUser")
    @JsonPropertyDescription("If true show user.")
    private Boolean showUser;
    /**
     * A url where additional information about this message can be found.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("A url where additional information about this message can be found.")
    private String url;
    /**
     * A label that is presented to the user as the UI for opening the url.
     * 
     */
    @JsonProperty("urlLabel")
    @JsonPropertyDescription("A label that is presented to the user as the UI for opening the url.")
    private String urlLabel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Unique (within a debug adapter implementation) identifier for the message. The purpose of these error IDs is to help extension authors that have the requirement that every user visible error message needs a corresponding error number, so that users or customer support can find information about the specific error more easily.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Unique (within a debug adapter implementation) identifier for the message. The purpose of these error IDs is to help extension authors that have the requirement that every user visible error message needs a corresponding error number, so that users or customer support can find information about the specific error more easily.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * A format string for the message. Embedded variables have the form `{name}`.
     * If variable name starts with an underscore character, the variable does not contain user data (PII) and can be safely used for telemetry purposes.
     * (Required)
     * 
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * A format string for the message. Embedded variables have the form `{name}`.
     * If variable name starts with an underscore character, the variable does not contain user data (PII) and can be safely used for telemetry purposes.
     * (Required)
     * 
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * An object used as a dictionary for looking up the variables in the format string.
     * 
     */
    @JsonProperty("variables")
    public Variables getVariables() {
        return variables;
    }

    /**
     * An object used as a dictionary for looking up the variables in the format string.
     * 
     */
    @JsonProperty("variables")
    public void setVariables(Variables variables) {
        this.variables = variables;
    }

    /**
     * If true send to telemetry.
     * 
     */
    @JsonProperty("sendTelemetry")
    public Boolean getSendTelemetry() {
        return sendTelemetry;
    }

    /**
     * If true send to telemetry.
     * 
     */
    @JsonProperty("sendTelemetry")
    public void setSendTelemetry(Boolean sendTelemetry) {
        this.sendTelemetry = sendTelemetry;
    }

    /**
     * If true show user.
     * 
     */
    @JsonProperty("showUser")
    public Boolean getShowUser() {
        return showUser;
    }

    /**
     * If true show user.
     * 
     */
    @JsonProperty("showUser")
    public void setShowUser(Boolean showUser) {
        this.showUser = showUser;
    }

    /**
     * A url where additional information about this message can be found.
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * A url where additional information about this message can be found.
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * A label that is presented to the user as the UI for opening the url.
     * 
     */
    @JsonProperty("urlLabel")
    public String getUrlLabel() {
        return urlLabel;
    }

    /**
     * A label that is presented to the user as the UI for opening the url.
     * 
     */
    @JsonProperty("urlLabel")
    public void setUrlLabel(String urlLabel) {
        this.urlLabel = urlLabel;
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
        sb.append(Message.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("variables");
        sb.append('=');
        sb.append(((this.variables == null)?"<null>":this.variables));
        sb.append(',');
        sb.append("sendTelemetry");
        sb.append('=');
        sb.append(((this.sendTelemetry == null)?"<null>":this.sendTelemetry));
        sb.append(',');
        sb.append("showUser");
        sb.append('=');
        sb.append(((this.showUser == null)?"<null>":this.showUser));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("urlLabel");
        sb.append('=');
        sb.append(((this.urlLabel == null)?"<null>":this.urlLabel));
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
        result = ((result* 31)+((this.variables == null)? 0 :this.variables.hashCode()));
        result = ((result* 31)+((this.urlLabel == null)? 0 :this.urlLabel.hashCode()));
        result = ((result* 31)+((this.showUser == null)? 0 :this.showUser.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sendTelemetry == null)? 0 :this.sendTelemetry.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Message) == false) {
            return false;
        }
        Message rhs = ((Message) other);
        return (((((((((this.variables == rhs.variables)||((this.variables!= null)&&this.variables.equals(rhs.variables)))&&((this.urlLabel == rhs.urlLabel)||((this.urlLabel!= null)&&this.urlLabel.equals(rhs.urlLabel))))&&((this.showUser == rhs.showUser)||((this.showUser!= null)&&this.showUser.equals(rhs.showUser))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sendTelemetry == rhs.sendTelemetry)||((this.sendTelemetry!= null)&&this.sendTelemetry.equals(rhs.sendTelemetry))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
