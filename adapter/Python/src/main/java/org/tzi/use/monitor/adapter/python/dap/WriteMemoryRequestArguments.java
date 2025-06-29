package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * Arguments for `writeMemory` request.
 */
public class WriteMemoryRequestArguments {
    private Boolean allowPartial;
    private String data;
    private String memoryReference;
    private Long offset;

    /**
     * Property to control partial writes. If true, the debug adapter should attempt to write
     * memory even if the entire memory region is not writable. In such a case the debug adapter
     * should stop after hitting the first byte of memory that cannot be written and return the
     * number of bytes written in the response via the `offset` and `bytesWritten` properties.
     * If false or missing, a debug adapter should attempt to verify the region is writable
     * before writing, and fail the response if it is not.
     */
    @JsonProperty("allowPartial")
    public Boolean getAllowPartial() { return allowPartial; }
    @JsonProperty("allowPartial")
    public void setAllowPartial(Boolean value) { this.allowPartial = value; }

    /**
     * Bytes to write, encoded using base64.
     */
    @JsonProperty("data")
    public String getData() { return data; }
    @JsonProperty("data")
    public void setData(String value) { this.data = value; }

    /**
     * Memory reference to the base location to which data should be written.
     */
    @JsonProperty("memoryReference")
    public String getMemoryReference() { return memoryReference; }
    @JsonProperty("memoryReference")
    public void setMemoryReference(String value) { this.memoryReference = value; }

    /**
     * Offset (in bytes) to be applied to the reference location before writing data. Can be
     * negative.
     */
    @JsonProperty("offset")
    public Long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(Long value) { this.offset = value; }
}
