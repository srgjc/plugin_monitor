package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * The item's type. Typically the client uses this information to render the item in the UI
 * with an icon.
 *
 * Some predefined types for the CompletionItem. Please note that not all clients have
 * specific icons for all of them.
 */
public enum CompletionItemType {
    CLASS, COLOR, CONSTRUCTOR, CUSTOMCOLOR, ENUM, FIELD, FILE, FUNCTION, INTERFACE, KEYWORD, METHOD, MODULE, PROPERTY, REFERENCE, SNIPPET, TEXT, UNIT, VALUE, VARIABLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CLASS: return "class";
            case COLOR: return "color";
            case CONSTRUCTOR: return "constructor";
            case CUSTOMCOLOR: return "customcolor";
            case ENUM: return "enum";
            case FIELD: return "field";
            case FILE: return "file";
            case FUNCTION: return "function";
            case INTERFACE: return "interface";
            case KEYWORD: return "keyword";
            case METHOD: return "method";
            case MODULE: return "module";
            case PROPERTY: return "property";
            case REFERENCE: return "reference";
            case SNIPPET: return "snippet";
            case TEXT: return "text";
            case UNIT: return "unit";
            case VALUE: return "value";
            case VARIABLE: return "variable";
        }
        return null;
    }

    @JsonCreator
    public static CompletionItemType forValue(String value) throws IOException {
        if (value.equals("class")) return CLASS;
        if (value.equals("color")) return COLOR;
        if (value.equals("constructor")) return CONSTRUCTOR;
        if (value.equals("customcolor")) return CUSTOMCOLOR;
        if (value.equals("enum")) return ENUM;
        if (value.equals("field")) return FIELD;
        if (value.equals("file")) return FILE;
        if (value.equals("function")) return FUNCTION;
        if (value.equals("interface")) return INTERFACE;
        if (value.equals("keyword")) return KEYWORD;
        if (value.equals("method")) return METHOD;
        if (value.equals("module")) return MODULE;
        if (value.equals("property")) return PROPERTY;
        if (value.equals("reference")) return REFERENCE;
        if (value.equals("snippet")) return SNIPPET;
        if (value.equals("text")) return TEXT;
        if (value.equals("unit")) return UNIT;
        if (value.equals("value")) return VALUE;
        if (value.equals("variable")) return VARIABLE;
        throw new IOException("Cannot deserialize CompletionItemType");
    }
}
