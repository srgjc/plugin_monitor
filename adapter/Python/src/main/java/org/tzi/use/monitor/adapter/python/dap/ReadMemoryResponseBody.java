package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ReadMemoryResponseBody {
    private String address;
    private String data;
    private Long unreadableBytes;

    /**
     * The address of the first byte of data returned.
     * Treated as a hex value if prefixed with `0x`, or as a decimal value otherwise.
     */
    @JsonProperty("address")
    public String getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(String value) { this.address = value; }

    /**
     * The bytes read from memory, encoded using base64. If the decoded length of `data` is less
     * than the requested `count` in the original `readMemory` request, and `unreadableBytes` is
     * zero or omitted, then the client should assume it's reached the end of readable memory.
     */
    @JsonProperty("data")
    public String getData() { return data; }
    @JsonProperty("data")
    public void setData(String value) { this.data = value; }

    /**
     * The number of unreadable bytes encountered after the last successfully read byte.
     * This can be used to determine the number of bytes that should be skipped before a
     * subsequent `readMemory` request succeeds.
     */
    @JsonProperty("unreadableBytes")
    public Long getUnreadableBytes() { return unreadableBytes; }
    @JsonProperty("unreadableBytes")
    public void setUnreadableBytes(Long value) { this.unreadableBytes = value; }
}
