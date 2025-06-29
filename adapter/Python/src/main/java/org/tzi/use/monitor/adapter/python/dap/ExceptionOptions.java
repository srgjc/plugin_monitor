package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * An `ExceptionOptions` assigns configuration options to a set of exceptions.
 */
public class ExceptionOptions {
    private ExceptionBreakMode breakMode;
    private ExceptionPathSegment[] path;

    /**
     * Condition when a thrown exception should result in a break.
     */
    @JsonProperty("breakMode")
    public ExceptionBreakMode getBreakMode() { return breakMode; }
    @JsonProperty("breakMode")
    public void setBreakMode(ExceptionBreakMode value) { this.breakMode = value; }

    /**
     * A path that selects a single or multiple exceptions in a tree. If `path` is missing, the
     * whole tree is selected.
     * By convention the first segment of the path is a category that is used to group
     * exceptions in the UI.
     */
    @JsonProperty("path")
    public ExceptionPathSegment[] getPath() { return path; }
    @JsonProperty("path")
    public void setPath(ExceptionPathSegment[] value) { this.path = value; }
}
