package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Map;

/**
 * Arbitrary data from the previous, restarted session.
 * The data is sent as the `restart` attribute of the `terminated` event.
 * The client should leave the data intact.
 *
 * Contains request result if success is true and error details if success is false.
 *
 * Additional data that a debug adapter might want to loop through the client.
 * The client should leave the data intact and persist it across sessions. The client should
 * not interpret the data.
 *
 * Event-specific information.
 *
 * Additional data to report. For the `telemetry` category the data is sent to telemetry,
 * for the other categories the data is shown in JSON format.
 *
 * Object containing arguments for the command.
 *
 * A debug adapter may set `restart` to true (or to an arbitrary object) to request that the
 * client restarts the session.
 * The value is not interpreted by the client and passed unmodified as an attribute
 * `__restart` to the `launch` and `attach` requests.
 */
@JsonDeserialize(using = Restart.Deserializer.class)
@JsonSerialize(using = Restart.Serializer.class)
public class Restart {
    public Double doubleValue;
    public Long integerValue;
    public Boolean boolValue;
    public String stringValue;
    public Object[] anythingArrayValue;
    public Map<String, Object> anythingMapValue;

    static class Deserializer extends JsonDeserializer<Restart> {
        @Override
        public Restart deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            Restart value = new Restart();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_NUMBER_FLOAT:
                    value.doubleValue = jsonParser.readValueAs(Double.class);
                    break;
                case VALUE_TRUE:
                case VALUE_FALSE:
                    value.boolValue = jsonParser.readValueAs(Boolean.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                case START_ARRAY:
                    value.anythingArrayValue = jsonParser.readValueAs(Object[].class);
                    break;
                case START_OBJECT:
                    value.anythingMapValue = jsonParser.readValueAs(Map.class);
                    break;
                default: throw new IOException("Cannot deserialize Restart");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<Restart> {
        @Override
        public void serialize(Restart obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.doubleValue != null) {
                jsonGenerator.writeObject(obj.doubleValue);
                return;
            }
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.boolValue != null) {
                jsonGenerator.writeObject(obj.boolValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            if (obj.anythingArrayValue != null) {
                jsonGenerator.writeObject(obj.anythingArrayValue);
                return;
            }
            if (obj.anythingMapValue != null) {
                jsonGenerator.writeObject(obj.anythingMapValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
