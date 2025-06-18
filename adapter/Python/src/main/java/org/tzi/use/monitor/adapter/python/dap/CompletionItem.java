
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
 * `CompletionItems` are the suggestions returned from the `completions` request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "label",
    "text",
    "sortText",
    "detail",
    "type",
    "start",
    "length",
    "selectionStart",
    "selectionLength"
})
@Generated("jsonschema2pojo")
public class CompletionItem {

    /**
     * The label of this completion item. By default this is also the text that is inserted when selecting this completion.
     * (Required)
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("The label of this completion item. By default this is also the text that is inserted when selecting this completion.")
    private String label;
    /**
     * If text is returned and not an empty string, then it is inserted instead of the label.
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("If text is returned and not an empty string, then it is inserted instead of the label.")
    private String text;
    /**
     * A string that should be used when comparing this item with other items. If not returned or an empty string, the `label` is used instead.
     * 
     */
    @JsonProperty("sortText")
    @JsonPropertyDescription("A string that should be used when comparing this item with other items. If not returned or an empty string, the `label` is used instead.")
    private String sortText;
    /**
     * A human-readable string with additional information about this item, like type or symbol information.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("A human-readable string with additional information about this item, like type or symbol information.")
    private String detail;
    /**
     * Some predefined types for the CompletionItem. Please note that not all clients have specific icons for all of them.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Some predefined types for the CompletionItem. Please note that not all clients have specific icons for all of them.")
    private CompletionItemType type;
    /**
     * Start position (within the `text` attribute of the `completions` request) where the completion text is added. The position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If the start position is omitted the text is added at the location specified by the `column` attribute of the `completions` request.
     * 
     */
    @JsonProperty("start")
    @JsonPropertyDescription("Start position (within the `text` attribute of the `completions` request) where the completion text is added. The position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If the start position is omitted the text is added at the location specified by the `column` attribute of the `completions` request.")
    private Integer start;
    /**
     * Length determines how many characters are overwritten by the completion text and it is measured in UTF-16 code units. If missing the value 0 is assumed which results in the completion text being inserted.
     * 
     */
    @JsonProperty("length")
    @JsonPropertyDescription("Length determines how many characters are overwritten by the completion text and it is measured in UTF-16 code units. If missing the value 0 is assumed which results in the completion text being inserted.")
    private Integer length;
    /**
     * Determines the start of the new selection after the text has been inserted (or replaced). `selectionStart` is measured in UTF-16 code units and must be in the range 0 and length of the completion text. If omitted the selection starts at the end of the completion text.
     * 
     */
    @JsonProperty("selectionStart")
    @JsonPropertyDescription("Determines the start of the new selection after the text has been inserted (or replaced). `selectionStart` is measured in UTF-16 code units and must be in the range 0 and length of the completion text. If omitted the selection starts at the end of the completion text.")
    private Integer selectionStart;
    /**
     * Determines the length of the new selection after the text has been inserted (or replaced) and it is measured in UTF-16 code units. The selection can not extend beyond the bounds of the completion text. If omitted the length is assumed to be 0.
     * 
     */
    @JsonProperty("selectionLength")
    @JsonPropertyDescription("Determines the length of the new selection after the text has been inserted (or replaced) and it is measured in UTF-16 code units. The selection can not extend beyond the bounds of the completion text. If omitted the length is assumed to be 0.")
    private Integer selectionLength;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The label of this completion item. By default this is also the text that is inserted when selecting this completion.
     * (Required)
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * The label of this completion item. By default this is also the text that is inserted when selecting this completion.
     * (Required)
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * If text is returned and not an empty string, then it is inserted instead of the label.
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * If text is returned and not an empty string, then it is inserted instead of the label.
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * A string that should be used when comparing this item with other items. If not returned or an empty string, the `label` is used instead.
     * 
     */
    @JsonProperty("sortText")
    public String getSortText() {
        return sortText;
    }

    /**
     * A string that should be used when comparing this item with other items. If not returned or an empty string, the `label` is used instead.
     * 
     */
    @JsonProperty("sortText")
    public void setSortText(String sortText) {
        this.sortText = sortText;
    }

    /**
     * A human-readable string with additional information about this item, like type or symbol information.
     * 
     */
    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    /**
     * A human-readable string with additional information about this item, like type or symbol information.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * Some predefined types for the CompletionItem. Please note that not all clients have specific icons for all of them.
     * 
     */
    @JsonProperty("type")
    public CompletionItemType getType() {
        return type;
    }

    /**
     * Some predefined types for the CompletionItem. Please note that not all clients have specific icons for all of them.
     * 
     */
    @JsonProperty("type")
    public void setType(CompletionItemType type) {
        this.type = type;
    }

    /**
     * Start position (within the `text` attribute of the `completions` request) where the completion text is added. The position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If the start position is omitted the text is added at the location specified by the `column` attribute of the `completions` request.
     * 
     */
    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    /**
     * Start position (within the `text` attribute of the `completions` request) where the completion text is added. The position is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. If the start position is omitted the text is added at the location specified by the `column` attribute of the `completions` request.
     * 
     */
    @JsonProperty("start")
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * Length determines how many characters are overwritten by the completion text and it is measured in UTF-16 code units. If missing the value 0 is assumed which results in the completion text being inserted.
     * 
     */
    @JsonProperty("length")
    public Integer getLength() {
        return length;
    }

    /**
     * Length determines how many characters are overwritten by the completion text and it is measured in UTF-16 code units. If missing the value 0 is assumed which results in the completion text being inserted.
     * 
     */
    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Determines the start of the new selection after the text has been inserted (or replaced). `selectionStart` is measured in UTF-16 code units and must be in the range 0 and length of the completion text. If omitted the selection starts at the end of the completion text.
     * 
     */
    @JsonProperty("selectionStart")
    public Integer getSelectionStart() {
        return selectionStart;
    }

    /**
     * Determines the start of the new selection after the text has been inserted (or replaced). `selectionStart` is measured in UTF-16 code units and must be in the range 0 and length of the completion text. If omitted the selection starts at the end of the completion text.
     * 
     */
    @JsonProperty("selectionStart")
    public void setSelectionStart(Integer selectionStart) {
        this.selectionStart = selectionStart;
    }

    /**
     * Determines the length of the new selection after the text has been inserted (or replaced) and it is measured in UTF-16 code units. The selection can not extend beyond the bounds of the completion text. If omitted the length is assumed to be 0.
     * 
     */
    @JsonProperty("selectionLength")
    public Integer getSelectionLength() {
        return selectionLength;
    }

    /**
     * Determines the length of the new selection after the text has been inserted (or replaced) and it is measured in UTF-16 code units. The selection can not extend beyond the bounds of the completion text. If omitted the length is assumed to be 0.
     * 
     */
    @JsonProperty("selectionLength")
    public void setSelectionLength(Integer selectionLength) {
        this.selectionLength = selectionLength;
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
        sb.append(CompletionItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("sortText");
        sb.append('=');
        sb.append(((this.sortText == null)?"<null>":this.sortText));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("selectionStart");
        sb.append('=');
        sb.append(((this.selectionStart == null)?"<null>":this.selectionStart));
        sb.append(',');
        sb.append("selectionLength");
        sb.append('=');
        sb.append(((this.selectionLength == null)?"<null>":this.selectionLength));
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
        result = ((result* 31)+((this.selectionStart == null)? 0 :this.selectionStart.hashCode()));
        result = ((result* 31)+((this.sortText == null)? 0 :this.sortText.hashCode()));
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.selectionLength == null)? 0 :this.selectionLength.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CompletionItem) == false) {
            return false;
        }
        CompletionItem rhs = ((CompletionItem) other);
        return (((((((((((this.selectionStart == rhs.selectionStart)||((this.selectionStart!= null)&&this.selectionStart.equals(rhs.selectionStart)))&&((this.sortText == rhs.sortText)||((this.sortText!= null)&&this.sortText.equals(rhs.sortText))))&&((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.selectionLength == rhs.selectionLength)||((this.selectionLength!= null)&&this.selectionLength.equals(rhs.selectionLength))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Some predefined types for the CompletionItem. Please note that not all clients have specific icons for all of them.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CompletionItemType {

        METHOD("method"),
        FUNCTION("function"),
        CONSTRUCTOR("constructor"),
        FIELD("field"),
        VARIABLE("variable"),
        CLASS("class"),
        INTERFACE("interface"),
        MODULE("module"),
        PROPERTY("property"),
        UNIT("unit"),
        VALUE("value"),
        ENUM("enum"),
        KEYWORD("keyword"),
        SNIPPET("snippet"),
        TEXT("text"),
        COLOR("color"),
        FILE("file"),
        REFERENCE("reference"),
        CUSTOMCOLOR("customcolor");
        private final String value;
        private final static Map<String, CompletionItemType> CONSTANTS = new HashMap<String, CompletionItemType>();

        static {
            for (CompletionItemType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CompletionItemType(String value) {
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
        public static CompletionItemType fromValue(String value) {
            CompletionItemType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
