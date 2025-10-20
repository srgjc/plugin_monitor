package org.tzi.use.monitor.plugins.monitor.vm.mm.python;

import org.tzi.use.monitor.adapter.python.PythonAdapter;
import org.tzi.use.plugins.monitor.vm.mm.VMField;
import org.tzi.use.uml.mm.MAssociationEnd;
import org.tzi.use.uml.mm.MAttribute;

public class PyField implements VMField {

    private final String id;
    private final String className;
    private final String fieldName;
    private final PythonAdapter adapter;

    private MAttribute useAttribute;
    private MAssociationEnd useAssociationEnd;

    public PyField(PythonAdapter adapter, String fieldName, String className) {
        this.adapter = adapter;
        this.fieldName = fieldName;
        this.className = className;
        this.id = String.format("%s:%s", className, fieldName);
    }

    @Override
    public String getName() {
        return fieldName;
    }

    @Override
    public void setUSEAttribute(MAttribute attr) {
        useAttribute = attr;
    }

    @Override
    public MAttribute getUSEAttribute() {
        return useAttribute;
    }

    @Override
    public void setUSEAssociationEnd(MAssociationEnd end) {
        useAssociationEnd = end;
    }

    @Override
    public MAssociationEnd getUSEAssociationEnd() {
        return useAssociationEnd;
    }

    @Override
    public Object getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return id;
    }

}
