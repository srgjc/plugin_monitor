package org.tzi.use.monitor.adapter.python;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.tzi.use.monitor.adapter.python.dap.custom.DAPEvent;
import org.tzi.use.monitor.adapter.python.dap.custom.DAPMessage;
import org.tzi.use.monitor.adapter.python.dap.custom.DAPResponse;
import org.tzi.use.monitor.adapter.python.dap.custom.DAPUnknown;
import org.tzi.use.monitor.adapter.python.dap.*;

/**
 * Maps a DAP json message to its respective POJO
 */
public class MessageMapper {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static DAPMessage parseMessage(String json) throws Exception {
        JsonNode tree = mapper.readTree(json);
        if (tree == null || !tree.has("type")) {
            return new DAPUnknown(json, "Missing or invalid 'type' field");
        }
        String type = tree.get("type").asText(null);
        if (type == null) {
            return new DAPUnknown(json, "Null 'type' field");
        }
        return switch (type) {
            case "response" -> parseResponse(tree, json);
            case "event" -> parseEvent(tree, json);
            default -> new DAPUnknown(json, "Unsupported type: " + type);
        };
    }

    private static DAPResponse parseResponse(JsonNode tree, String json) throws JsonProcessingException {
        if (!tree.has("command")) {
            return new DAPUnknown(json, "Missing 'command' in response");
        }
        String command = tree.get("command").asText(null);
        if (command == null) {
            return new DAPUnknown(json, "Null 'command' field");
        }
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
            default -> new DAPUnknown(json, "Unknown response command: " + command);
        };
    }

    private static DAPEvent parseEvent(JsonNode tree, String json) throws JsonProcessingException {
        if (!tree.has("event")) {
            return new DAPUnknown(json, "Missing 'event' field in event");
        }
        String event = tree.get("event").asText(null);
        if (event == null) {
            return new DAPUnknown(json, "Null 'event' field");
        }
        return switch (event) {
            case "initialized" -> mapper.readValue(json, InitializedEventClass.class);
            case "stopped" -> mapper.readValue(json, StoppedEventClass.class);
            case "terminated" -> mapper.readValue(json, TerminatedEventClass.class);
            case "continued" -> mapper.readValue(json, ContinuedEventClass.class);
            default -> new  DAPUnknown(json, "Unknown event type: " + event);
        };
    }

}
