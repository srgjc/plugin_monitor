package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ModuleEventBody {
    private Module module;
    private BodyReason reason;

    /**
     * The new, changed, or removed module. In case of `removed` only the module id is used.
     */
    @JsonProperty("module")
    public Module getModule() { return module; }
    @JsonProperty("module")
    public void setModule(Module value) { this.module = value; }

    /**
     * The reason for the event.
     */
    @JsonProperty("reason")
    public BodyReason getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(BodyReason value) { this.reason = value; }
}
