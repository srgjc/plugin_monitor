package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

/**
 * The checksum of an item calculated by the specified algorithm.
 */
public class Checksum {
    private ChecksumAlgorithm algorithm;
    private String checksum;

    /**
     * The algorithm used to calculate this checksum.
     */
    @JsonProperty("algorithm")
    public ChecksumAlgorithm getAlgorithm() { return algorithm; }
    @JsonProperty("algorithm")
    public void setAlgorithm(ChecksumAlgorithm value) { this.algorithm = value; }

    /**
     * Value of the checksum, encoded as a hexadecimal value.
     */
    @JsonProperty("checksum")
    public String getChecksum() { return checksum; }
    @JsonProperty("checksum")
    public void setChecksum(String value) { this.checksum = value; }
}
