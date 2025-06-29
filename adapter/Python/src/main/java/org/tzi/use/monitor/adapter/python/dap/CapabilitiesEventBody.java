package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class CapabilitiesEventBody {
    private CapabilitiesClass capabilities;

    /**
     * The set of updated capabilities.
     */
    @JsonProperty("capabilities")
    public CapabilitiesClass getCapabilities() { return capabilities; }
    @JsonProperty("capabilities")
    public void setCapabilities(CapabilitiesClass value) { this.capabilities = value; }
}
