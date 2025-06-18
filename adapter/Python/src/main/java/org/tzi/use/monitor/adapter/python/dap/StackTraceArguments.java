
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
 * Arguments for `stackTrace` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "threadId",
    "startFrame",
    "levels",
    "format"
})
@Generated("jsonschema2pojo")
public class StackTraceArguments {

    /**
     * Retrieve the stacktrace for this thread.
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    @JsonPropertyDescription("Retrieve the stacktrace for this thread.")
    private Integer threadId;
    /**
     * The index of the first frame to return; if omitted frames start at 0.
     * 
     */
    @JsonProperty("startFrame")
    @JsonPropertyDescription("The index of the first frame to return; if omitted frames start at 0.")
    private Integer startFrame;
    /**
     * The maximum number of frames to return. If levels is not specified or 0, all frames are returned.
     * 
     */
    @JsonProperty("levels")
    @JsonPropertyDescription("The maximum number of frames to return. If levels is not specified or 0, all frames are returned.")
    private Integer levels;
    @JsonProperty("format")
    private Object format;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Retrieve the stacktrace for this thread.
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    public Integer getThreadId() {
        return threadId;
    }

    /**
     * Retrieve the stacktrace for this thread.
     * (Required)
     * 
     */
    @JsonProperty("threadId")
    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    /**
     * The index of the first frame to return; if omitted frames start at 0.
     * 
     */
    @JsonProperty("startFrame")
    public Integer getStartFrame() {
        return startFrame;
    }

    /**
     * The index of the first frame to return; if omitted frames start at 0.
     * 
     */
    @JsonProperty("startFrame")
    public void setStartFrame(Integer startFrame) {
        this.startFrame = startFrame;
    }

    /**
     * The maximum number of frames to return. If levels is not specified or 0, all frames are returned.
     * 
     */
    @JsonProperty("levels")
    public Integer getLevels() {
        return levels;
    }

    /**
     * The maximum number of frames to return. If levels is not specified or 0, all frames are returned.
     * 
     */
    @JsonProperty("levels")
    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    @JsonProperty("format")
    public Object getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(Object format) {
        this.format = format;
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
        sb.append(StackTraceArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("threadId");
        sb.append('=');
        sb.append(((this.threadId == null)?"<null>":this.threadId));
        sb.append(',');
        sb.append("startFrame");
        sb.append('=');
        sb.append(((this.startFrame == null)?"<null>":this.startFrame));
        sb.append(',');
        sb.append("levels");
        sb.append('=');
        sb.append(((this.levels == null)?"<null>":this.levels));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
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
        result = ((result* 31)+((this.threadId == null)? 0 :this.threadId.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.startFrame == null)? 0 :this.startFrame.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levels == null)? 0 :this.levels.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StackTraceArguments) == false) {
            return false;
        }
        StackTraceArguments rhs = ((StackTraceArguments) other);
        return ((((((this.threadId == rhs.threadId)||((this.threadId!= null)&&this.threadId.equals(rhs.threadId)))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.startFrame == rhs.startFrame)||((this.startFrame!= null)&&this.startFrame.equals(rhs.startFrame))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levels == rhs.levels)||((this.levels!= null)&&this.levels.equals(rhs.levels))));
    }

}
