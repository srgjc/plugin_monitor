package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.tmp.DAPMessage;
import org.tzi.use.monitor.adapter.python.tmp.Event;
import org.tzi.use.monitor.adapter.python.tmp.Response;

/**
 * Maps a DAP json message to its respective POJO
 */
public class MessageMapper {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static DAPMessage parseMessage(String json) throws Exception {
        JsonNode tree = mapper.readTree(json);
        String type = tree.get("type").asText();
        return switch (type) {
            case "response" -> mapper.readValue(json, Response.class);
            case "event" -> mapper.readValue(json, Event.class);
            default -> null;
        };
    }

}
