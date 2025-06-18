
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
 * A `Source` is a descriptor for source code.
 * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients when specifying breakpoints.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "path",
    "sourceReference",
    "presentationHint",
    "origin",
    "sources",
    "adapterData",
    "checksums"
})
@Generated("jsonschema2pojo")
public class Source {

    /**
     * The short name of the source. Every source returned from the debug adapter has a name.
     * When sending a source to the debug adapter this name is optional.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The short name of the source. Every source returned from the debug adapter has a name.\nWhen sending a source to the debug adapter this name is optional.")
    private String name;
    /**
     * The path of the source to be shown in the UI.
     * It is only used to locate and load the content of the source if no `sourceReference` is specified (or its value is 0).
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("The path of the source to be shown in the UI.\nIt is only used to locate and load the content of the source if no `sourceReference` is specified (or its value is 0).")
    private String path;
    /**
     * If the value > 0 the contents of the source must be retrieved through the `source` request (even if a path is specified).
     * Since a `sourceReference` is only valid for a session, it can not be used to persist a source.
     * The value should be less than or equal to 2147483647 (2^31-1).
     * 
     */
    @JsonProperty("sourceReference")
    @JsonPropertyDescription("If the value > 0 the contents of the source must be retrieved through the `source` request (even if a path is specified).\nSince a `sourceReference` is only valid for a session, it can not be used to persist a source.\nThe value should be less than or equal to 2147483647 (2^31-1).")
    private Integer sourceReference;
    /**
     * A hint for how to present the source in the UI.
     * A value of `deemphasize` can be used to indicate that the source is not available or that it is skipped on stepping.
     * 
     */
    @JsonProperty("presentationHint")
    @JsonPropertyDescription("A hint for how to present the source in the UI.\nA value of `deemphasize` can be used to indicate that the source is not available or that it is skipped on stepping.")
    private PresentationHint presentationHint;
    /**
     * The origin of this source. For example, 'internal module', 'inlined content from source map', etc.
     * 
     */
    @JsonProperty("origin")
    @JsonPropertyDescription("The origin of this source. For example, 'internal module', 'inlined content from source map', etc.")
    private String origin;
    /**
     * A list of sources that are related to this source. These may be the source that generated this source.
     * 
     */
    @JsonProperty("sources")
    @JsonPropertyDescription("A list of sources that are related to this source. These may be the source that generated this source.")
    private List<Source> sources = new ArrayList<Source>();
    /**
     * Additional data that a debug adapter might want to loop through the client.
     * The client should leave the data intact and persist it across sessions. The client should not interpret the data.
     * 
     */
    @JsonProperty("adapterData")
    @JsonPropertyDescription("Additional data that a debug adapter might want to loop through the client.\nThe client should leave the data intact and persist it across sessions. The client should not interpret the data.")
    private Object adapterData;
    /**
     * The checksums associated with this file.
     * 
     */
    @JsonProperty("checksums")
    @JsonPropertyDescription("The checksums associated with this file.")
    private List<Checksum> checksums = new ArrayList<Checksum>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The short name of the source. Every source returned from the debug adapter has a name.
     * When sending a source to the debug adapter this name is optional.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The short name of the source. Every source returned from the debug adapter has a name.
     * When sending a source to the debug adapter this name is optional.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The path of the source to be shown in the UI.
     * It is only used to locate and load the content of the source if no `sourceReference` is specified (or its value is 0).
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * The path of the source to be shown in the UI.
     * It is only used to locate and load the content of the source if no `sourceReference` is specified (or its value is 0).
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * If the value > 0 the contents of the source must be retrieved through the `source` request (even if a path is specified).
     * Since a `sourceReference` is only valid for a session, it can not be used to persist a source.
     * The value should be less than or equal to 2147483647 (2^31-1).
     * 
     */
    @JsonProperty("sourceReference")
    public Integer getSourceReference() {
        return sourceReference;
    }

    /**
     * If the value > 0 the contents of the source must be retrieved through the `source` request (even if a path is specified).
     * Since a `sourceReference` is only valid for a session, it can not be used to persist a source.
     * The value should be less than or equal to 2147483647 (2^31-1).
     * 
     */
    @JsonProperty("sourceReference")
    public void setSourceReference(Integer sourceReference) {
        this.sourceReference = sourceReference;
    }

    /**
     * A hint for how to present the source in the UI.
     * A value of `deemphasize` can be used to indicate that the source is not available or that it is skipped on stepping.
     * 
     */
    @JsonProperty("presentationHint")
    public PresentationHint getPresentationHint() {
        return presentationHint;
    }

    /**
     * A hint for how to present the source in the UI.
     * A value of `deemphasize` can be used to indicate that the source is not available or that it is skipped on stepping.
     * 
     */
    @JsonProperty("presentationHint")
    public void setPresentationHint(PresentationHint presentationHint) {
        this.presentationHint = presentationHint;
    }

    /**
     * The origin of this source. For example, 'internal module', 'inlined content from source map', etc.
     * 
     */
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     * The origin of this source. For example, 'internal module', 'inlined content from source map', etc.
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * A list of sources that are related to this source. These may be the source that generated this source.
     * 
     */
    @JsonProperty("sources")
    public List<Source> getSources() {
        return sources;
    }

    /**
     * A list of sources that are related to this source. These may be the source that generated this source.
     * 
     */
    @JsonProperty("sources")
    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    /**
     * Additional data that a debug adapter might want to loop through the client.
     * The client should leave the data intact and persist it across sessions. The client should not interpret the data.
     * 
     */
    @JsonProperty("adapterData")
    public Object getAdapterData() {
        return adapterData;
    }

    /**
     * Additional data that a debug adapter might want to loop through the client.
     * The client should leave the data intact and persist it across sessions. The client should not interpret the data.
     * 
     */
    @JsonProperty("adapterData")
    public void setAdapterData(Object adapterData) {
        this.adapterData = adapterData;
    }

    /**
     * The checksums associated with this file.
     * 
     */
    @JsonProperty("checksums")
    public List<Checksum> getChecksums() {
        return checksums;
    }

    /**
     * The checksums associated with this file.
     * 
     */
    @JsonProperty("checksums")
    public void setChecksums(List<Checksum> checksums) {
        this.checksums = checksums;
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
        sb.append(Source.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("sourceReference");
        sb.append('=');
        sb.append(((this.sourceReference == null)?"<null>":this.sourceReference));
        sb.append(',');
        sb.append("presentationHint");
        sb.append('=');
        sb.append(((this.presentationHint == null)?"<null>":this.presentationHint));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("sources");
        sb.append('=');
        sb.append(((this.sources == null)?"<null>":this.sources));
        sb.append(',');
        sb.append("adapterData");
        sb.append('=');
        sb.append(((this.adapterData == null)?"<null>":this.adapterData));
        sb.append(',');
        sb.append("checksums");
        sb.append('=');
        sb.append(((this.checksums == null)?"<null>":this.checksums));
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
        result = ((result* 31)+((this.sourceReference == null)? 0 :this.sourceReference.hashCode()));
        result = ((result* 31)+((this.checksums == null)? 0 :this.checksums.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.sources == null)? 0 :this.sources.hashCode()));
        result = ((result* 31)+((this.presentationHint == null)? 0 :this.presentationHint.hashCode()));
        result = ((result* 31)+((this.adapterData == null)? 0 :this.adapterData.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return ((((((((((this.sourceReference == rhs.sourceReference)||((this.sourceReference!= null)&&this.sourceReference.equals(rhs.sourceReference)))&&((this.checksums == rhs.checksums)||((this.checksums!= null)&&this.checksums.equals(rhs.checksums))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.sources == rhs.sources)||((this.sources!= null)&&this.sources.equals(rhs.sources))))&&((this.presentationHint == rhs.presentationHint)||((this.presentationHint!= null)&&this.presentationHint.equals(rhs.presentationHint))))&&((this.adapterData == rhs.adapterData)||((this.adapterData!= null)&&this.adapterData.equals(rhs.adapterData))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }


    /**
     * A hint for how to present the source in the UI.
     * A value of `deemphasize` can be used to indicate that the source is not available or that it is skipped on stepping.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PresentationHint {

        NORMAL("normal"),
        EMPHASIZE("emphasize"),
        DEEMPHASIZE("deemphasize");
        private final String value;
        private final static Map<String, PresentationHint> CONSTANTS = new HashMap<String, PresentationHint>();

        static {
            for (PresentationHint c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PresentationHint(String value) {
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
        public static PresentationHint fromValue(String value) {
            PresentationHint constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
