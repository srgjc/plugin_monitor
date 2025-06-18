package org.tzi.use.monitor.adapter.python;

public class PyEvalExBuilder {

    public static String getClassFieldTypesExp(String qualifiedClassName) {
        int lastDot = qualifiedClassName.lastIndexOf('.');
        if (lastDot == -1) {
            throw new IllegalArgumentException("Qualified class name must contain at least one dot.");
        }
        String moduleName = qualifiedClassName.substring(0, lastDot);
        String className = qualifiedClassName.substring(lastDot + 1);
        return String.format(
                "getattr(__import__('sys').modules['%s'], '%s').__annotations__",
                moduleName,
                className
        );
    }
}
