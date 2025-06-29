package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ModulesResponseBody {
    private Module[] modules;
    private Long totalModules;

    /**
     * All modules or range of modules.
     */
    @JsonProperty("modules")
    public Module[] getModules() { return modules; }
    @JsonProperty("modules")
    public void setModules(Module[] value) { this.modules = value; }

    /**
     * The total number of modules available.
     */
    @JsonProperty("totalModules")
    public Long getTotalModules() { return totalModules; }
    @JsonProperty("totalModules")
    public void setTotalModules(Long value) { this.totalModules = value; }
}
