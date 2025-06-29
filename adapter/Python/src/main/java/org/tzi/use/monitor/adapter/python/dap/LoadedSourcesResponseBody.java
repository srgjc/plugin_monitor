package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class LoadedSourcesResponseBody {
    private Source[] sources;

    /**
     * Set of loaded sources.
     */
    @JsonProperty("sources")
    public Source[] getSources() { return sources; }
    @JsonProperty("sources")
    public void setSources(Source[] value) { this.sources = value; }
}
