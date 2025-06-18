
package org.tzi.use.monitor.adapter.python.dap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
 * An `ExceptionOptions` assigns configuration options to a set of exceptions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "path",
    "breakMode"
})
@Generated("jsonschema2pojo")
public class ExceptionOptions {

    /**
     * A path that selects a single or multiple exceptions in a tree. If `path` is missing, the whole tree is selected.
     * By convention the first segment of the path is a category that is used to group exceptions in the UI.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("A path that selects a single or multiple exceptions in a tree. If `path` is missing, the whole tree is selected.\nBy convention the first segment of the path is a category that is used to group exceptions in the UI.")
    private List<ExceptionPathSegment> path = new ArrayList<ExceptionPathSegment>();
    /**
     * This enumeration defines all possible conditions when a thrown exception should result in a break.
     * never: never breaks,
     * always: always breaks,
     * unhandled: breaks when exception unhandled,
     * userUnhandled: breaks if the exception is not handled by user code.
     * (Required)
     * 
     */
    @JsonProperty("breakMode")
    @JsonPropertyDescription("This enumeration defines all possible conditions when a thrown exception should result in a break.\nnever: never breaks,\nalways: always breaks,\nunhandled: breaks when exception unhandled,\nuserUnhandled: breaks if the exception is not handled by user code.")
    private DebugProtocol.ExceptionBreakMode breakMode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * A path that selects a single or multiple exceptions in a tree. If `path` is missing, the whole tree is selected.
     * By convention the first segment of the path is a category that is used to group exceptions in the UI.
     * 
     */
    @JsonProperty("path")
    public List<ExceptionPathSegment> getPath() {
        return path;
    }

    /**
     * A path that selects a single or multiple exceptions in a tree. If `path` is missing, the whole tree is selected.
     * By convention the first segment of the path is a category that is used to group exceptions in the UI.
     * 
     */
    @JsonProperty("path")
    public void setPath(List<ExceptionPathSegment> path) {
        this.path = path;
    }

    /**
     * This enumeration defines all possible conditions when a thrown exception should result in a break.
     * never: never breaks,
     * always: always breaks,
     * unhandled: breaks when exception unhandled,
     * userUnhandled: breaks if the exception is not handled by user code.
     * (Required)
     * 
     */
    @JsonProperty("breakMode")
    public DebugProtocol.ExceptionBreakMode getBreakMode() {
        return breakMode;
    }

    /**
     * This enumeration defines all possible conditions when a thrown exception should result in a break.
     * never: never breaks,
     * always: always breaks,
     * unhandled: breaks when exception unhandled,
     * userUnhandled: breaks if the exception is not handled by user code.
     * (Required)
     * 
     */
    @JsonProperty("breakMode")
    public void setBreakMode(DebugProtocol.ExceptionBreakMode breakMode) {
        this.breakMode = breakMode;
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
        sb.append(ExceptionOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("breakMode");
        sb.append('=');
        sb.append(((this.breakMode == null)?"<null>":this.breakMode));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.breakMode == null)? 0 :this.breakMode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExceptionOptions) == false) {
            return false;
        }
        ExceptionOptions rhs = ((ExceptionOptions) other);
        return ((((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path)))&&((this.breakMode == rhs.breakMode)||((this.breakMode!= null)&&this.breakMode.equals(rhs.breakMode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
