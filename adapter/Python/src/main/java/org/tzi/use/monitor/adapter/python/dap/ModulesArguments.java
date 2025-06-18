
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
 * Arguments for `modules` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startModule",
    "moduleCount"
})
@Generated("jsonschema2pojo")
public class ModulesArguments {

    /**
     * The index of the first module to return; if omitted modules start at 0.
     * 
     */
    @JsonProperty("startModule")
    @JsonPropertyDescription("The index of the first module to return; if omitted modules start at 0.")
    private Integer startModule;
    /**
     * The number of modules to return. If `moduleCount` is not specified or 0, all modules are returned.
     * 
     */
    @JsonProperty("moduleCount")
    @JsonPropertyDescription("The number of modules to return. If `moduleCount` is not specified or 0, all modules are returned.")
    private Integer moduleCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The index of the first module to return; if omitted modules start at 0.
     * 
     */
    @JsonProperty("startModule")
    public Integer getStartModule() {
        return startModule;
    }

    /**
     * The index of the first module to return; if omitted modules start at 0.
     * 
     */
    @JsonProperty("startModule")
    public void setStartModule(Integer startModule) {
        this.startModule = startModule;
    }

    /**
     * The number of modules to return. If `moduleCount` is not specified or 0, all modules are returned.
     * 
     */
    @JsonProperty("moduleCount")
    public Integer getModuleCount() {
        return moduleCount;
    }

    /**
     * The number of modules to return. If `moduleCount` is not specified or 0, all modules are returned.
     * 
     */
    @JsonProperty("moduleCount")
    public void setModuleCount(Integer moduleCount) {
        this.moduleCount = moduleCount;
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
        sb.append(ModulesArguments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startModule");
        sb.append('=');
        sb.append(((this.startModule == null)?"<null>":this.startModule));
        sb.append(',');
        sb.append("moduleCount");
        sb.append('=');
        sb.append(((this.moduleCount == null)?"<null>":this.moduleCount));
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
        result = ((result* 31)+((this.moduleCount == null)? 0 :this.moduleCount.hashCode()));
        result = ((result* 31)+((this.startModule == null)? 0 :this.startModule.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ModulesArguments) == false) {
            return false;
        }
        ModulesArguments rhs = ((ModulesArguments) other);
        return ((((this.moduleCount == rhs.moduleCount)||((this.moduleCount!= null)&&this.moduleCount.equals(rhs.moduleCount)))&&((this.startModule == rhs.startModule)||((this.startModule!= null)&&this.startModule.equals(rhs.startModule))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
