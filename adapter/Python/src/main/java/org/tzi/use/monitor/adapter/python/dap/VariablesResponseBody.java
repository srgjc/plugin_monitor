package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class VariablesResponseBody {
    private Variable[] variables;

    /**
     * All (or a range) of variables for the given variable reference.
     */
    @JsonProperty("variables")
    public Variable[] getVariables() { return variables; }
    @JsonProperty("variables")
    public void setVariables(Variable[] value) { this.variables = value; }
}
