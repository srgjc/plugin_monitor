package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;

public abstract class PyBase {

    protected PythonAdapter adapter;

    public PyBase(PythonAdapter adapter) {
        this.adapter = adapter;
    }

    protected PythonAdapter getAdapter() {
        return this.adapter;
    }

}
