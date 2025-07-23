package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.dap.*;

/**
 * Maps a DAP json message to its respective POJO
 */
public class MessageMapper {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static DAPMessage parseMessage(String json) throws Exception {
        JsonNode tree = mapper.readTree(json);
        String type = tree.get("type").asText();
        return switch (type) {
            case "response" -> parseResponse(tree, json);
            case "event" -> parseEvent(tree, json);
            default -> null;
        };
    }

    private static DAPResponse parseResponse(JsonNode tree, String json) throws JsonProcessingException {
        String command = tree.get("command").asText();
        return switch (command) {
            case "initialize" -> mapper.readValue(json, InitializeResponseClass.class);
            case "attach" -> mapper.readValue(json, AttachResponseClass.class);
            case "configurationDone" -> mapper.readValue(json, ConfigurationDoneResponseClass.class);
            case "threads" -> mapper.readValue(json, ThreadsResponseClass.class);
            case "evaluate" -> mapper.readValue(json, EvaluateResponseClass.class);
            case "pause" -> mapper.readValue(json, PauseResponseClass.class);
            case "stackTrace" -> mapper.readValue(json, StackTraceResponseClass.class);
            case "continue" -> mapper.readValue(json, ContinueResponseClass.class);
            case "disconnect" -> mapper.readValue(json, DisconnectResponseClass.class);
            case "setBreakpoints" -> mapper.readValue(json, SetBreakpointsResponseClass.class);
            case "variables" -> mapper.readValue(json, VariablesResponseClass.class);
            default -> null;
        };
    }

    private static DAPEvent parseEvent(JsonNode tree, String json) throws JsonProcessingException {
        String event = tree.get("event").asText();
        return switch (event) {
            case "initialized" -> mapper.readValue(json, InitializedEventClass.class);
            case "stopped" -> mapper.readValue(json, StoppedEventClass.class);
            case "terminated" -> mapper.readValue(json, TerminatedEventClass.class);
            default -> null;
        };
    }

}
