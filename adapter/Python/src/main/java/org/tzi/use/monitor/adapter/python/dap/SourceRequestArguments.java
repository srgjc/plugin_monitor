package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `source` request.
 */
public class SourceRequestArguments {
    private Source source;
    private long sourceReference;

    /**
     * Specifies the source content to load. Either `source.path` or `source.sourceReference`
     * must be specified.
     */
    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }

    /**
     * The reference to the source. This is the same as `source.sourceReference`.
     * This is provided for backward compatibility since old clients do not understand the
     * `source` attribute.
     */
    @JsonProperty("sourceReference")
    public long getSourceReference() { return sourceReference; }
    @JsonProperty("sourceReference")
    public void setSourceReference(long value) { this.sourceReference = value; }
}
