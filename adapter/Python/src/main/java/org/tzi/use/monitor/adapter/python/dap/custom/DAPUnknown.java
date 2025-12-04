package org.tzi.use.monitor.adapter.python.dap.custom;

public class DAPUnknown implements DAPMessage, DAPEvent, DAPResponse {
    private final String rawJson;
    private final String reason;

    public DAPUnknown(String rawJson, String reason) {
        this.rawJson = rawJson;
        this.reason = reason;
    }

    public String getRawJson() {
        return rawJson;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "DAPUnknown{reason='%s', rawJson='%s'}".formatted(reason, rawJson);
    }

    @Override
    public long getRequestSeq() {
        return 0;
    }

}
