package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Properties of a data breakpoint passed to the `setDataBreakpoints` request.
 */
public class DataBreakpoint {
    private DataBreakpointAccessType accessType;
    private String condition;
    private String dataID;
    private String hitCondition;

    /**
     * The access type of the data.
     */
    @JsonProperty("accessType")
    public DataBreakpointAccessType getAccessType() { return accessType; }
    @JsonProperty("accessType")
    public void setAccessType(DataBreakpointAccessType value) { this.accessType = value; }

    /**
     * An expression for conditional breakpoints.
     */
    @JsonProperty("condition")
    public String getCondition() { return condition; }
    @JsonProperty("condition")
    public void setCondition(String value) { this.condition = value; }

    /**
     * An id representing the data. This id is returned from the `dataBreakpointInfo` request.
     */
    @JsonProperty("dataId")
    public String getDataID() { return dataID; }
    @JsonProperty("dataId")
    public void setDataID(String value) { this.dataID = value; }

    /**
     * An expression that controls how many hits of the breakpoint are ignored.
     * The debug adapter is expected to interpret the expression as needed.
     */
    @JsonProperty("hitCondition")
    public String getHitCondition() { return hitCondition; }
    @JsonProperty("hitCondition")
    public void setHitCondition(String value) { this.hitCondition = value; }
}
