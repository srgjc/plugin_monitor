package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMField;
import org.tzi.use.uml.mm.MAssociationEnd;
import org.tzi.use.uml.mm.MAttribute;

public class PyField extends PyBase implements VMField {

    private final PyFieldRaw pyFieldRaw;
    private final String className;

    private MAttribute useAttribute;

    public PyField(PythonAdapter adapter, PyFieldRaw pyFieldRaw, String className) {
        super(adapter);
        this.pyFieldRaw = pyFieldRaw;
        this.className = className;
    }

    @Override
    public String getName() {
        return pyFieldRaw.getName();
    }

    @Override
    public void setUSEAttribute(MAttribute attr) {
        this.useAttribute = attr;
    }

    @Override
    public MAttribute getUSEAttribute() {
        return useAttribute;
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
        return className + ":" + getName();
    }

    public PyFieldRaw getPyFieldRaw() {
        return pyFieldRaw;
    }

    @Override
    public String toString() {
        return "PyField{" +
                "id=" + getId() +
                ", pyFieldRaw=" + pyFieldRaw +
                '}';
    }
}
