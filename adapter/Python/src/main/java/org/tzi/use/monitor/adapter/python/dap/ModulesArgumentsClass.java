package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `modules` request.
 */
public class ModulesArgumentsClass {
    private Long moduleCount;
    private Long startModule;

    /**
     * The number of modules to return. If `moduleCount` is not specified or 0, all modules are
     * returned.
     */
    @JsonProperty("moduleCount")
    public Long getModuleCount() { return moduleCount; }
    @JsonProperty("moduleCount")
    public void setModuleCount(Long value) { this.moduleCount = value; }

    /**
     * The index of the first module to return; if omitted modules start at 0.
     */
    @JsonProperty("startModule")
    public Long getStartModule() { return startModule; }
    @JsonProperty("startModule")
    public void setStartModule(Long value) { this.startModule = value; }
}
