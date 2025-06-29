package org.tzi.use.monitor.adapter.python.dap;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * The algorithm used to calculate this checksum.
 *
 * Names of checksum algorithms that may be supported by a debug adapter.
 */
public enum ChecksumAlgorithm {
    MD5, SHA1, SHA256, TIMESTAMP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MD5: return "MD5";
            case SHA1: return "SHA1";
            case SHA256: return "SHA256";
            case TIMESTAMP: return "timestamp";
        }
        return null;
    }

    @JsonCreator
    public static ChecksumAlgorithm forValue(String value) throws IOException {
        if (value.equals("MD5")) return MD5;
        if (value.equals("SHA1")) return SHA1;
        if (value.equals("SHA256")) return SHA256;
        if (value.equals("timestamp")) return TIMESTAMP;
        throw new IOException("Cannot deserialize ChecksumAlgorithm");
    }
}
