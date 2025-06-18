package org.tzi.use.monitor.adapter.python.tmp;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.tzi.use.monitor.adapter.python.dap.DAPRequest;

public class EvaluateRequest implements DAPRequest {
    @JsonUnwrapped
    Request dapRequest;
    @JsonUnwrapped
    EvaluateArguments arguments;

    public Request getDapRequest() {
        return dapRequest;
    }

    public void setDapRequest(Request dapRequest) {
        this.dapRequest = dapRequest;
    }

    public EvaluateArguments getArguments() {
        return arguments;
    }

    public void setArguments(EvaluateArguments arguments) {
        this.arguments = arguments;
    }
}
