package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Arguments for `attach` request. Additional attributes are implementation specific.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachRequestArgumentsClass {
    private Restart restart;
    private boolean justMyCode;
    private String sessionId;
    private String clientOs;
    private Map<String, Object> connect;
    private List<Map<String, String>> pathMappings;
    private List<String> debugOptions;
    private boolean showReturnValue;
    private String workspaceFolder;

    /**
     * Arbitrary data from the previous, restarted session.
     * The data is sent as the `restart` attribute of the `terminated` event.
     * The client should leave the data intact.
     */
    @JsonProperty("__restart")
    public Restart getRestart() { return restart; }
    @JsonProperty("__restart")
    public void setRestart(Restart value) { this.restart = value; }
    @JsonProperty("justMyCode")
    public boolean isJustMyCode() {
        return justMyCode;
    }
    @JsonProperty("justMyCode")
    public void setJustMyCode(boolean justMyCode) {
        this.justMyCode = justMyCode;
    }
    @JsonProperty("__sessionId")
    public String getSessionId() {
        return sessionId;
    }
    @JsonProperty("__sessionId")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    @JsonProperty("clientOS")
    public String getClientOs() {
        return clientOs;
    }
    @JsonProperty("clientOS")
    public void setClientOs(String clientOs) {
        this.clientOs = clientOs;
    }
    @JsonProperty("connect")
    public Map<String, Object> getConnect() {
        return connect;
    }
    @JsonProperty("connect")
    public void setConnect(Map<String, Object> connect) {
        this.connect = connect;
    }
    @JsonProperty("pathMappings")
    public List<Map<String, String>> getPathMappings() {
        return pathMappings;
    }
    @JsonProperty("pathMappings")
    public void setPathMappings(List<Map<String, String>> pathMappings) {
        this.pathMappings = pathMappings;
    }
    @JsonProperty("debugOptions")
    public List<String> getDebugOptions() {
        return debugOptions;
    }
    @JsonProperty("debugOptions")
    public void setDebugOptions(List<String> debugOptions) {
        this.debugOptions = debugOptions;
    }
    @JsonProperty("showReturnValue")
    public boolean isShowReturnValue() {
        return showReturnValue;
    }
    @JsonProperty("showReturnValue")
    public void setShowReturnValue(boolean showReturnValue) {
        this.showReturnValue = showReturnValue;
    }
    @JsonProperty("workspaceFolder")
    public String getWorkspaceFolder() {
        return workspaceFolder;
    }
    @JsonProperty("workspaceFolder")
    public void setWorkspaceFolder(String workspaceFolder) {
        this.workspaceFolder = workspaceFolder;
    }
}
