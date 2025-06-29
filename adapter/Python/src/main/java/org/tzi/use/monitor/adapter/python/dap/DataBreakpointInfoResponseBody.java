package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class DataBreakpointInfoResponseBody {
    private DataBreakpointAccessType[] accessTypes;
    private Boolean canPersist;
    private String dataID;
    private String description;

    /**
     * Attribute lists the available access types for a potential data breakpoint. A UI client
     * could surface this information.
     */
    @JsonProperty("accessTypes")
    public DataBreakpointAccessType[] getAccessTypes() { return accessTypes; }
    @JsonProperty("accessTypes")
    public void setAccessTypes(DataBreakpointAccessType[] value) { this.accessTypes = value; }

    /**
     * Attribute indicates that a potential data breakpoint could be persisted across sessions.
     */
    @JsonProperty("canPersist")
    public Boolean getCanPersist() { return canPersist; }
    @JsonProperty("canPersist")
    public void setCanPersist(Boolean value) { this.canPersist = value; }

    /**
     * An identifier for the data on which a data breakpoint can be registered with the
     * `setDataBreakpoints` request or null if no data breakpoint is available. If a
     * `variablesReference` or `frameId` is passed, the `dataId` is valid in the current
     * suspended state, otherwise it's valid indefinitely. See 'Lifetime of Object References'
     * in the Overview section for details. Breakpoints set using the `dataId` in the
     * `setDataBreakpoints` request may outlive the lifetime of the associated `dataId`.
     */
    @JsonProperty("dataId")
    public String getDataID() { return dataID; }
    @JsonProperty("dataId")
    public void setDataID(String value) { this.dataID = value; }

    /**
     * UI string that describes on what data the breakpoint is set on or why a data breakpoint
     * is not available.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }
}
