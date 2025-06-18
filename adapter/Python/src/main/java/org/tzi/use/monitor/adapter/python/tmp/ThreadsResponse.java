package org.tzi.use.monitor.adapter.python.tmp;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.tzi.use.monitor.adapter.python.dap.DAPResponse;

import java.util.ArrayList;

public class ThreadsResponse implements DAPResponse {
    @JsonUnwrapped
    private Response response;

    private ArrayList<Thread> threads;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public ArrayList<Thread> getThreads() {
        return threads;
    }

    public void setThreads(ArrayList<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public int getRequestSequence() {
        return this.response.getRequestSeq();
    }
}
