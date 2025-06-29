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
@JsonDeserialize(using = IDUnion.Deserializer.class)
@JsonSerialize(using = IDUnion.Serializer.class)
public class IDUnion {
    public Long integerValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<IDUnion> {
        @Override
        public IDUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            IDUnion value = new IDUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                default: throw new IOException("Cannot deserialize IDUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<IDUnion> {
        @Override
        public void serialize(IDUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("IDUnion must not be null");
        }
    }
}
