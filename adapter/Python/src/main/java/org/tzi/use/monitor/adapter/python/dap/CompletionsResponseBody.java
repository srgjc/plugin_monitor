package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class CompletionsResponseBody {
    private CompletionItem[] targets;

    /**
     * The possible completions for .
     */
    @JsonProperty("targets")
    public CompletionItem[] getTargets() { return targets; }
    @JsonProperty("targets")
    public void setTargets(CompletionItem[] value) { this.targets = value; }
}
