package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ScopesResponseBody {
    private Scope[] scopes;

    /**
     * The scopes of the stack frame. If the array has length zero, there are no scopes
     * available.
     */
    @JsonProperty("scopes")
    public Scope[] getScopes() { return scopes; }
    @JsonProperty("scopes")
    public void setScopes(Scope[] value) { this.scopes = value; }
}
