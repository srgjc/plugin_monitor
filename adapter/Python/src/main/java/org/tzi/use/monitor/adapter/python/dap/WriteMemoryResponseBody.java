package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class WriteMemoryResponseBody {
    private Long bytesWritten;
    private Long offset;

    /**
     * Property that should be returned when `allowPartial` is true to indicate the number of
     * bytes starting from address that were successfully written.
     */
    @JsonProperty("bytesWritten")
    public Long getBytesWritten() { return bytesWritten; }
    @JsonProperty("bytesWritten")
    public void setBytesWritten(Long value) { this.bytesWritten = value; }

    /**
     * Property that should be returned when `allowPartial` is true to indicate the offset of
     * the first byte of data successfully written. Can be negative.
     */
    @JsonProperty("offset")
    public Long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(Long value) { this.offset = value; }
}
