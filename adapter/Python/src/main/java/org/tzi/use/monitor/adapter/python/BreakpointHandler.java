package org.tzi.use.monitor.adapter.python;

import org.tzi.use.monitor.adapter.python.tmp.BreakpointEvent;

public interface BreakpointHandler {
    void handleBreakpoint(BreakpointEvent event);
}
