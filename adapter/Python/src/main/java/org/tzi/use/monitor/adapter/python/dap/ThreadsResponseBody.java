package org.tzi.use.monitor.adapter.python.dap;

import com.fasterxml.jackson.annotation.*;

public class ThreadsResponseBody {
    private Thread[] threads;

    /**
     * All threads.
     */
    @JsonProperty("threads")
    public Thread[] getThreads() { return threads; }
    @JsonProperty("threads")
    public void setThreads(Thread[] value) { this.threads = value; }
}
