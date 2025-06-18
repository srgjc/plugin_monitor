package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMField;
import org.tzi.use.uml.mm.MAssociationEnd;
import org.tzi.use.uml.mm.MAttribute;

public class PyField extends PyBase implements VMField {

    private final PyFieldRaw pyFieldRaw;

    public PyField(PythonAdapter adapter, PyFieldRaw pyFieldRaw) {
        super(adapter);
        this.pyFieldRaw = pyFieldRaw;
    }

    @Override
    public String getName() {
        return pyFieldRaw.getName();
    }

    @Override
    public void setUSEAttribute(MAttribute attr) {

    }

    @Override
    public MAttribute getUSEAttribute() {
        return null;
    }

    @Override
    public void setUSEAssociationEnd(MAssociationEnd end) {

    }

    @Override
    public MAssociationEnd getUSEAssociationEnd() {
        return null;
    }

    @Override
    public Object getId() {
        return null;
    }

    PyFieldRaw getPyFieldRaw() {
        return pyFieldRaw;
    }

}
