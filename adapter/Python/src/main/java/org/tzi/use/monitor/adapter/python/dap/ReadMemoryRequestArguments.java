package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `readMemory` request.
 */
public class ReadMemoryRequestArguments {
    private long count;
    private String memoryReference;
    private Long offset;

    /**
     * Number of bytes to read at the specified location and offset.
     */
    @JsonProperty("count")
    public long getCount() { return count; }
    @JsonProperty("count")
    public void setCount(long value) { this.count = value; }

    /**
     * Memory reference to the base location from which data should be read.
     */
    @JsonProperty("memoryReference")
    public String getMemoryReference() { return memoryReference; }
    @JsonProperty("memoryReference")
    public void setMemoryReference(String value) { this.memoryReference = value; }

    /**
     * Offset (in bytes) to be applied to the reference location before reading data. Can be
     * negative.
     */
    @JsonProperty("offset")
    public Long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(Long value) { this.offset = value; }
}
