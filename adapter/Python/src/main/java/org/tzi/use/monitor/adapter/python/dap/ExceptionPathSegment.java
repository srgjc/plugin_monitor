package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * An `ExceptionPathSegment` represents a segment in a path that is used to match leafs or
 * nodes in a tree of exceptions.
 * If a segment consists of more than one name, it matches the names provided if `negate` is
 * false or missing, or it matches anything except the names provided if `negate` is true.
 */
public class ExceptionPathSegment {
    private String[] names;
    private Boolean negate;

    /**
     * Depending on the value of `negate` the names that should match or not match.
     */
    @JsonProperty("names")
    public String[] getNames() { return names; }
    @JsonProperty("names")
    public void setNames(String[] value) { this.names = value; }

    /**
     * If false or missing this segment matches the names provided, otherwise it matches
     * anything except the names provided.
     */
    @JsonProperty("negate")
    public Boolean getNegate() { return negate; }
    @JsonProperty("negate")
    public void setNegate(Boolean value) { this.negate = value; }
}
