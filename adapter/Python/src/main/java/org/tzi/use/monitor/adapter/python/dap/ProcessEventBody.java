package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ProcessEventBody {
    private Boolean isLocalProcess;
    private String name;
    private Long pointerSize;
    private StartMethod startMethod;
    private Long systemProcessID;

    /**
     * If true, the process is running on the same computer as the debug adapter.
     */
    @JsonProperty("isLocalProcess")
    public Boolean getIsLocalProcess() { return isLocalProcess; }
    @JsonProperty("isLocalProcess")
    public void setIsLocalProcess(Boolean value) { this.isLocalProcess = value; }

    /**
     * The logical name of the process. This is usually the full path to process's executable
     * file. Example: /home/example/myproj/program.js.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The size of a pointer or address for this process, in bits. This value may be used by
     * clients when formatting addresses for display.
     */
    @JsonProperty("pointerSize")
    public Long getPointerSize() { return pointerSize; }
    @JsonProperty("pointerSize")
    public void setPointerSize(Long value) { this.pointerSize = value; }

    /**
     * Describes how the debug engine started debugging this process.
     */
    @JsonProperty("startMethod")
    public StartMethod getStartMethod() { return startMethod; }
    @JsonProperty("startMethod")
    public void setStartMethod(StartMethod value) { this.startMethod = value; }

    /**
     * The system process id of the debugged process. This property is missing for non-system
     * processes.
     */
    @JsonProperty("systemProcessId")
    public Long getSystemProcessID() { return systemProcessID; }
    @JsonProperty("systemProcessId")
    public void setSystemProcessID(Long value) { this.systemProcessID = value; }
}
