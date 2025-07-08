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
                "getattr(__import__('sys').modules['%s'], '%s').__init__.__annotations__",
                moduleName,
                className
        );
    }

    public static String getInstanceExp(String qualifiedClassName) {
        int lastDot = qualifiedClassName.lastIndexOf('.');
        String simpleClassName = qualifiedClassName.substring(lastDot + 1);
        return String.format(
                "vars(next((obj for obj in __import__('gc').get_objects() if isinstance(obj, %s)), None)) if next((obj for obj in __import__('gc').get_objects() if isinstance(obj, %s)), None) else None",
                simpleClassName,
                simpleClassName
        );
    }

    // TODO: migrate to python 3.11 getMembersStatic instead
    public static String getMethodsExpVar(String qualifiedClassName) {
        int lastDot = qualifiedClassName.lastIndexOf('.');
        String moduleName = qualifiedClassName.substring(0, lastDot);
        String simpleClassName = qualifiedClassName.substring(lastDot + 1);
        return String.format(
                "\"\\n\".join([\n" +
                        "  f\"{name}({', '.join([str(p) for p in __import__('inspect').signature(m).parameters.values()])}) -> {__import__('inspect').signature(m).return_annotation.__name__ if isinstance(__import__('inspect').signature(m).return_annotation, type) else str(__import__('inspect').signature(m).return_annotation)}\"\n" +
                        "  for name, m in __import__('inspect').getmembers(__import__('sys').modules['%s'].%s, __import__('inspect').isfunction)\n" +
                        "])",
                moduleName,
                simpleClassName
        );
    }

    public static String getMethodBreakpointInfo(String qualifiedClassName, String methodName) {
        int lastDot = qualifiedClassName.lastIndexOf('.');
        String moduleName = qualifiedClassName.substring(0, lastDot);
        String simpleClassName = qualifiedClassName.substring(lastDot + 1);
        return String.format("{\"file\": __import__('inspect').getsourcefile(getattr(getattr(__import__('sys').modules['%s'], '%s'), '%s')), \"start\": getattr(getattr(__import__('sys').modules['%s'], '%s'), '%s').__code__.co_firstlineno, \"end\": getattr(getattr(__import__('sys').modules['%s'], '%s'), '%s').__code__.co_firstlineno + len(__import__('inspect').getsourcelines(getattr(getattr(__import__('sys').modules['%s'], '%s'), '%s'))[0]) - 1}\n",
                moduleName,
                simpleClassName,
                methodName,
                moduleName,
                simpleClassName,
                methodName,
                moduleName,
                simpleClassName,
                methodName,
                moduleName,
                simpleClassName,
                methodName
                );
    }

}
