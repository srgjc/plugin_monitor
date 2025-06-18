
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
 * A Module object represents a row in the modules view.
 * The `id` attribute identifies a module in the modules view and is used in a `module` event for identifying a module for adding, updating or deleting.
 * The `name` attribute is used to minimally render the module in the UI.
 * 
 * Additional attributes can be added to the module. They show up in the module view if they have a corresponding `ColumnDescriptor`.
 * 
 * To avoid an unnecessary proliferation of additional attributes with similar semantics but different names, we recommend to re-use attributes from the 'recommended' list below first, and only introduce new attributes if nothing appropriate could be found.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "path",
    "isOptimized",
    "isUserCode",
    "version",
    "symbolStatus",
    "symbolFilePath",
    "dateTimeStamp",
    "addressRange"
})
@Generated("jsonschema2pojo")
public class Module {

    /**
     * Unique identifier for the module.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique identifier for the module.")
    private Object id;
    /**
     * A name of the module.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A name of the module.")
    private String name;
    /**
     * Logical full path to the module. The exact definition is implementation defined, but usually this would be a full path to the on-disk file for the module.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Logical full path to the module. The exact definition is implementation defined, but usually this would be a full path to the on-disk file for the module.")
    private String path;
    /**
     * True if the module is optimized.
     * 
     */
    @JsonProperty("isOptimized")
    @JsonPropertyDescription("True if the module is optimized.")
    private Boolean isOptimized;
    /**
     * True if the module is considered 'user code' by a debugger that supports 'Just My Code'.
     * 
     */
    @JsonProperty("isUserCode")
    @JsonPropertyDescription("True if the module is considered 'user code' by a debugger that supports 'Just My Code'.")
    private Boolean isUserCode;
    /**
     * Version of Module.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of Module.")
    private String version;
    /**
     * User-understandable description of if symbols were found for the module (ex: 'Symbols Loaded', 'Symbols not found', etc.)
     * 
     */
    @JsonProperty("symbolStatus")
    @JsonPropertyDescription("User-understandable description of if symbols were found for the module (ex: 'Symbols Loaded', 'Symbols not found', etc.)")
    private String symbolStatus;
    /**
     * Logical full path to the symbol file. The exact definition is implementation defined.
     * 
     */
    @JsonProperty("symbolFilePath")
    @JsonPropertyDescription("Logical full path to the symbol file. The exact definition is implementation defined.")
    private String symbolFilePath;
    /**
     * Module created or modified, encoded as a RFC 3339 timestamp.
     * 
     */
    @JsonProperty("dateTimeStamp")
    @JsonPropertyDescription("Module created or modified, encoded as a RFC 3339 timestamp.")
    private String dateTimeStamp;
    /**
     * Address range covered by this module.
     * 
     */
    @JsonProperty("addressRange")
    @JsonPropertyDescription("Address range covered by this module.")
    private String addressRange;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Unique identifier for the module.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * Unique identifier for the module.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * A name of the module.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A name of the module.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Logical full path to the module. The exact definition is implementation defined, but usually this would be a full path to the on-disk file for the module.
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Logical full path to the module. The exact definition is implementation defined, but usually this would be a full path to the on-disk file for the module.
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * True if the module is optimized.
     * 
     */
    @JsonProperty("isOptimized")
    public Boolean getIsOptimized() {
        return isOptimized;
    }

    /**
     * True if the module is optimized.
     * 
     */
    @JsonProperty("isOptimized")
    public void setIsOptimized(Boolean isOptimized) {
        this.isOptimized = isOptimized;
    }

    /**
     * True if the module is considered 'user code' by a debugger that supports 'Just My Code'.
     * 
     */
    @JsonProperty("isUserCode")
    public Boolean getIsUserCode() {
        return isUserCode;
    }

    /**
     * True if the module is considered 'user code' by a debugger that supports 'Just My Code'.
     * 
     */
    @JsonProperty("isUserCode")
    public void setIsUserCode(Boolean isUserCode) {
        this.isUserCode = isUserCode;
    }

    /**
     * Version of Module.
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Version of Module.
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * User-understandable description of if symbols were found for the module (ex: 'Symbols Loaded', 'Symbols not found', etc.)
     * 
     */
    @JsonProperty("symbolStatus")
    public String getSymbolStatus() {
        return symbolStatus;
    }

    /**
     * User-understandable description of if symbols were found for the module (ex: 'Symbols Loaded', 'Symbols not found', etc.)
     * 
     */
    @JsonProperty("symbolStatus")
    public void setSymbolStatus(String symbolStatus) {
        this.symbolStatus = symbolStatus;
    }

    /**
     * Logical full path to the symbol file. The exact definition is implementation defined.
     * 
     */
    @JsonProperty("symbolFilePath")
    public String getSymbolFilePath() {
        return symbolFilePath;
    }

    /**
     * Logical full path to the symbol file. The exact definition is implementation defined.
     * 
     */
    @JsonProperty("symbolFilePath")
    public void setSymbolFilePath(String symbolFilePath) {
        this.symbolFilePath = symbolFilePath;
    }

    /**
     * Module created or modified, encoded as a RFC 3339 timestamp.
     * 
     */
    @JsonProperty("dateTimeStamp")
    public String getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Module created or modified, encoded as a RFC 3339 timestamp.
     * 
     */
    @JsonProperty("dateTimeStamp")
    public void setDateTimeStamp(String dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }

    /**
     * Address range covered by this module.
     * 
     */
    @JsonProperty("addressRange")
    public String getAddressRange() {
        return addressRange;
    }

    /**
     * Address range covered by this module.
     * 
     */
    @JsonProperty("addressRange")
    public void setAddressRange(String addressRange) {
        this.addressRange = addressRange;
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
        sb.append(Module.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("isOptimized");
        sb.append('=');
        sb.append(((this.isOptimized == null)?"<null>":this.isOptimized));
        sb.append(',');
        sb.append("isUserCode");
        sb.append('=');
        sb.append(((this.isUserCode == null)?"<null>":this.isUserCode));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("symbolStatus");
        sb.append('=');
        sb.append(((this.symbolStatus == null)?"<null>":this.symbolStatus));
        sb.append(',');
        sb.append("symbolFilePath");
        sb.append('=');
        sb.append(((this.symbolFilePath == null)?"<null>":this.symbolFilePath));
        sb.append(',');
        sb.append("dateTimeStamp");
        sb.append('=');
        sb.append(((this.dateTimeStamp == null)?"<null>":this.dateTimeStamp));
        sb.append(',');
        sb.append("addressRange");
        sb.append('=');
        sb.append(((this.addressRange == null)?"<null>":this.addressRange));
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
        result = ((result* 31)+((this.isOptimized == null)? 0 :this.isOptimized.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.addressRange == null)? 0 :this.addressRange.hashCode()));
        result = ((result* 31)+((this.symbolStatus == null)? 0 :this.symbolStatus.hashCode()));
        result = ((result* 31)+((this.dateTimeStamp == null)? 0 :this.dateTimeStamp.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.symbolFilePath == null)? 0 :this.symbolFilePath.hashCode()));
        result = ((result* 31)+((this.isUserCode == null)? 0 :this.isUserCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Module) == false) {
            return false;
        }
        Module rhs = ((Module) other);
        return ((((((((((((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path)))&&((this.isOptimized == rhs.isOptimized)||((this.isOptimized!= null)&&this.isOptimized.equals(rhs.isOptimized))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.addressRange == rhs.addressRange)||((this.addressRange!= null)&&this.addressRange.equals(rhs.addressRange))))&&((this.symbolStatus == rhs.symbolStatus)||((this.symbolStatus!= null)&&this.symbolStatus.equals(rhs.symbolStatus))))&&((this.dateTimeStamp == rhs.dateTimeStamp)||((this.dateTimeStamp!= null)&&this.dateTimeStamp.equals(rhs.dateTimeStamp))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.symbolFilePath == rhs.symbolFilePath)||((this.symbolFilePath!= null)&&this.symbolFilePath.equals(rhs.symbolFilePath))))&&((this.isUserCode == rhs.isUserCode)||((this.isUserCode!= null)&&this.isUserCode.equals(rhs.isUserCode))));
    }

}
