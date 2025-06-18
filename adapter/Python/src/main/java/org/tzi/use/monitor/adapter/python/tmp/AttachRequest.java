package org.tzi.use.monitor.adapter.python.tmp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeName("attach")
public class AttachRequest extends Request {

    protected AttachRequestArguments arguments;

    public AttachRequest(Integer seq, AttachRequestArguments arguments) {
        super(seq, "request", "attach");
        this.arguments = arguments;
    }

    public AttachRequestArguments getArguments() {
        return arguments;
    }

    public void setArguments(AttachRequestArguments arguments) {
        this.arguments = arguments;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AttachRequestArguments {
        private String localRoot;
        private String clientOS;
        private Boolean justMyCode;
        private Boolean showReturnValue;
        private String workspaceFolder;
        @JsonProperty("__sessionId")
        private String sessionId;
        private Map<String, Object> connect;
        private List<Map<String, String>> pathMappings;
        private List<String> debugOptions;

        public String getLocalRoot() {
            return localRoot;
        }

        public void setLocalRoot(String localRoot) {
            this.localRoot = localRoot;
        }

        public String getClientOS() {
            return clientOS;
        }

        public void setClientOS(String clientOS) {
            this.clientOS = clientOS;
        }

        public Boolean getJustMyCode() {
            return justMyCode;
        }

        public void setJustMyCode(Boolean justMyCode) {
            this.justMyCode = justMyCode;
        }

        public Boolean getShowReturnValue() {
            return showReturnValue;
        }

        public void setShowReturnValue(Boolean showReturnValue) {
            this.showReturnValue = showReturnValue;
        }

        public String getWorkspaceFolder() {
            return workspaceFolder;
        }

        public void setWorkspaceFolder(String workspaceFolder) {
            this.workspaceFolder = workspaceFolder;
        }

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public Map<String, Object> getConnect() {
            return connect;
        }

        public void setConnect(Map<String, Object> connect) {
            this.connect = connect;
        }

        public List<Map<String, String>> getPathMappings() {
            return pathMappings;
        }

        public void setPathMappings(List<Map<String, String>> pathMappings) {
            this.pathMappings = pathMappings;
        }

        public List<String> getDebugOptions() {
            return debugOptions;
        }

        public void setDebugOptions(List<String> debugOptions) {
            this.debugOptions = debugOptions;
        }
    }
}
