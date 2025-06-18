
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
 * Base Protocol
 * <p>
 * Base class of requests, responses, and events.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seq",
    "type"
})
@Generated("jsonschema2pojo")
public class ProtocolMessage {

    /**
     * Sequence number of the message (also known as message ID). The `seq` for the first message sent by a client or debug adapter is 1, and for each subsequent message is 1 greater than the previous message sent by that actor. `seq` can be used to order requests, responses, and events, and to associate requests with their corresponding responses. For protocol messages of type `request` the sequence number can be used to cancel the request.
     * (Required)
     * 
     */
    @JsonProperty("seq")
    @JsonPropertyDescription("Sequence number of the message (also known as message ID). The `seq` for the first message sent by a client or debug adapter is 1, and for each subsequent message is 1 greater than the previous message sent by that actor. `seq` can be used to order requests, responses, and events, and to associate requests with their corresponding responses. For protocol messages of type `request` the sequence number can be used to cancel the request.")
    private Integer seq;
    /**
     * Message type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Message type.")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Sequence number of the message (also known as message ID). The `seq` for the first message sent by a client or debug adapter is 1, and for each subsequent message is 1 greater than the previous message sent by that actor. `seq` can be used to order requests, responses, and events, and to associate requests with their corresponding responses. For protocol messages of type `request` the sequence number can be used to cancel the request.
     * (Required)
     * 
     */
    @JsonProperty("seq")
    public Integer getSeq() {
        return seq;
    }

    /**
     * Sequence number of the message (also known as message ID). The `seq` for the first message sent by a client or debug adapter is 1, and for each subsequent message is 1 greater than the previous message sent by that actor. `seq` can be used to order requests, responses, and events, and to associate requests with their corresponding responses. For protocol messages of type `request` the sequence number can be used to cancel the request.
     * (Required)
     * 
     */
    @JsonProperty("seq")
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * Message type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Message type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
        sb.append(ProtocolMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seq");
        sb.append('=');
        sb.append(((this.seq == null)?"<null>":this.seq));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.seq == null)? 0 :this.seq.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProtocolMessage) == false) {
            return false;
        }
        ProtocolMessage rhs = ((ProtocolMessage) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.seq == rhs.seq)||((this.seq!= null)&&this.seq.equals(rhs.seq))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
