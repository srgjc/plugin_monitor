package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

/**
 * Unique identifier for the module.
 *
 * The module associated with this frame, if any.
 */
@JsonDeserialize(using = ModuleIDUnion.Deserializer.class)
@JsonSerialize(using = ModuleIDUnion.Serializer.class)
public class ModuleIDUnion {
    public Long integerValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<ModuleIDUnion> {
        @Override
        public ModuleIDUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            ModuleIDUnion value = new ModuleIDUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                default: throw new IOException("Cannot deserialize ModuleIDUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<ModuleIDUnion> {
        @Override
        public void serialize(ModuleIDUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
