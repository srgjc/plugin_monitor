package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * The source where the breakpoint is located.
 *
 * A `Source` is a descriptor for source code.
 * It is returned from the debug adapter as part of a `StackFrame` and it is used by clients
 * when specifying breakpoints.
 *
 * The source location of the breakpoints; either `source.path` or `source.sourceReference`
 * must be specified.
 *
 * Source location that corresponds to this instruction, if any.
 * Should always be set (if available) on the first instruction returned,
 * but can be omitted afterwards if this instruction maps to the same source file as the
 * previous instruction.
 *
 * The source location for which the goto targets are determined.
 *
 * The new, changed, or removed source.
 *
 * The source location where the output was produced.
 *
 * The source for this scope.
 *
 * Specifies the source content to load. Either `source.path` or `source.sourceReference`
 * must be specified.
 *
 * The source of the frame.
 */
public class Source {
    private Restart adapterData;
    private Checksum[] checksums;
    private String name;
    private String origin;
    private String path;
    private SourcePresentationHint presentationHint;
    private Long sourceReference;
    private Source[] sources;

    /**
     * Additional data that a debug adapter might want to loop through the client.
     * The client should leave the data intact and persist it across sessions. The client should
     * not interpret the data.
     */
    @JsonProperty("adapterData")
    public Restart getAdapterData() { return adapterData; }
    @JsonProperty("adapterData")
    public void setAdapterData(Restart value) { this.adapterData = value; }

    /**
     * The checksums associated with this file.
     */
    @JsonProperty("checksums")
    public Checksum[] getChecksums() { return checksums; }
    @JsonProperty("checksums")
    public void setChecksums(Checksum[] value) { this.checksums = value; }

    /**
     * The short name of the source. Every source returned from the debug adapter has a name.
     * When sending a source to the debug adapter this name is optional.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The origin of this source. For example, 'internal module', 'inlined content from source
     * map', etc.
     */
    @JsonProperty("origin")
    public String getOrigin() { return origin; }
    @JsonProperty("origin")
    public void setOrigin(String value) { this.origin = value; }

    /**
     * The path of the source to be shown in the UI.
     * It is only used to locate and load the content of the source if no `sourceReference` is
     * specified (or its value is 0).
     */
    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    /**
     * A hint for how to present the source in the UI.
     * A value of `deemphasize` can be used to indicate that the source is not available or that
     * it is skipped on stepping.
     */
    @JsonProperty("presentationHint")
    public SourcePresentationHint getPresentationHint() { return presentationHint; }
    @JsonProperty("presentationHint")
    public void setPresentationHint(SourcePresentationHint value) { this.presentationHint = value; }

    /**
     * If the value > 0 the contents of the source must be retrieved through the `source`
     * request (even if a path is specified).
     * Since a `sourceReference` is only valid for a session, it can not be used to persist a
     * source.
     * The value should be less than or equal to 2147483647 (2^31-1).
     */
    @JsonProperty("sourceReference")
    public Long getSourceReference() { return sourceReference; }
    @JsonProperty("sourceReference")
    public void setSourceReference(Long value) { this.sourceReference = value; }

    /**
     * A list of sources that are related to this source. These may be the source that generated
     * this source.
     */
    @JsonProperty("sources")
    public Source[] getSources() { return sources; }
    @JsonProperty("sources")
    public void setSources(Source[] value) { this.sources = value; }
}
