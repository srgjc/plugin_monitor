
package org.tzi.use.monitor.adapter.python.dap;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
 * The checksum of an item calculated by the specified algorithm.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "algorithm",
    "checksum"
})
@Generated("jsonschema2pojo")
public class Checksum {

    /**
     * Names of checksum algorithms that may be supported by a debug adapter.
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    @JsonPropertyDescription("Names of checksum algorithms that may be supported by a debug adapter.")
    private ChecksumAlgorithm algorithm;
    /**
     * Value of the checksum, encoded as a hexadecimal value.
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    @JsonPropertyDescription("Value of the checksum, encoded as a hexadecimal value.")
    private String checksum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Names of checksum algorithms that may be supported by a debug adapter.
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public ChecksumAlgorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Names of checksum algorithms that may be supported by a debug adapter.
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public void setAlgorithm(ChecksumAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Value of the checksum, encoded as a hexadecimal value.
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    public String getChecksum() {
        return checksum;
    }

    /**
     * Value of the checksum, encoded as a hexadecimal value.
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    public void setChecksum(String checksum) {
        this.checksum = checksum;
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
        sb.append(Checksum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("algorithm");
        sb.append('=');
        sb.append(((this.algorithm == null)?"<null>":this.algorithm));
        sb.append(',');
        sb.append("checksum");
        sb.append('=');
        sb.append(((this.checksum == null)?"<null>":this.checksum));
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
        result = ((result* 31)+((this.checksum == null)? 0 :this.checksum.hashCode()));
        result = ((result* 31)+((this.algorithm == null)? 0 :this.algorithm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Checksum) == false) {
            return false;
        }
        Checksum rhs = ((Checksum) other);
        return ((((this.checksum == rhs.checksum)||((this.checksum!= null)&&this.checksum.equals(rhs.checksum)))&&((this.algorithm == rhs.algorithm)||((this.algorithm!= null)&&this.algorithm.equals(rhs.algorithm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }


    /**
     * Names of checksum algorithms that may be supported by a debug adapter.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ChecksumAlgorithm {

        MD_5("MD5"),
        SHA_1("SHA1"),
        SHA_256("SHA256"),
        TIMESTAMP("timestamp");
        private final String value;
        private final static Map<String, ChecksumAlgorithm> CONSTANTS = new HashMap<String, ChecksumAlgorithm>();

        static {
            for (ChecksumAlgorithm c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ChecksumAlgorithm(String value) {
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
        public static ChecksumAlgorithm fromValue(String value) {
            ChecksumAlgorithm constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
