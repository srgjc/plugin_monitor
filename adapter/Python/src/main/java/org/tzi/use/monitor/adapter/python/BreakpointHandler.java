package org.tzi.use.monitor.adapter.python;

import org.tzi.use.monitor.adapter.python.dap.StoppedEventClass;

public interface BreakpointHandler {
    void handleBreakpoint(StoppedEventClass event);
}
