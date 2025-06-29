package org.tzi.use.monitor.adapter.python;

import org.tzi.use.monitor.adapter.python.dap.BreakpointEventClass;

public interface BreakpointHandler {
    void handleBreakpoint(BreakpointEventClass event);
}
