package org.tzi.use.monitor.adapter.python;

public class PyEvalExBuilder {

    public static String getSelfVarsWithType() {
        return "\",\".join([f\"{k}:{type(v).__name__}\" for k, v in vars(self).items()])\n";
    }

    public static String getFileForClass(String qualifiedClassName) {
        int lastDot = qualifiedClassName.lastIndexOf('.');
        if (lastDot == -1) {
            throw new IllegalArgumentException("Qualified class name must contain at least one dot.");
        }
        String moduleName = qualifiedClassName.substring(0, lastDot);
        String className = qualifiedClassName.substring(lastDot + 1);
        return String.format(
                "getattr(__import__('sys').modules.get(getattr(__import__('sys').modules['%s'], '%s').__module__), '__file__', None)",
                moduleName,
                className
        );
    }

    public static String getSelfIdAtCurrentFrame() {
        return "id(self)";
    }

    public static String getInstanceIds(String qualifiedClassName) {
        int lastDot = qualifiedClassName.lastIndexOf('.');
        if (lastDot == -1) {
            throw new IllegalArgumentException("Qualified class name must contain at least one dot.");
        }
        String moduleName = qualifiedClassName.substring(0, lastDot);
        String className = qualifiedClassName.substring(lastDot + 1);
        return String.format(
                "[id(obj) for obj in __import__('gc').get_objects() if isinstance(obj, getattr(__import__('%s'), '%s'))]\n",
                moduleName,
                className
        );
    }

    public static String getMethodSignaturesExp(String qualifiedClassName) {
        int lastDot = qualifiedClassName.lastIndexOf('.');
        String moduleName = qualifiedClassName.substring(0, lastDot);
        String simpleClassName = qualifiedClassName.substring(lastDot + 1);
        return String.format(
            """
            ";".join([
            f"{name}:{','.join([p.name for p in __import__('inspect').signature(m).parameters.values()])}"
            for name, m in __import__('inspect').getmembers(__import__('sys').modules['%s'].%s, __import__('inspect').isfunction)
            ])
            """, moduleName, simpleClassName
        );
    }

    public static String getMethodBreakpointInfo(String qualifiedClassName, String methodName) {
        int lastDot = qualifiedClassName.lastIndexOf('.');
        String moduleName = qualifiedClassName.substring(0, lastDot);
        String simpleClassName = qualifiedClassName.substring(lastDot + 1);
        return String.format(
                """
                        (
                          lambda fn: {
                            "file": __import__('inspect').getsourcefile(fn),
                            "start": fn.__code__.co_firstlineno + 1,
                            "end": fn.__code__.co_firstlineno + len(__import__('inspect').getsourcelines(fn)[0]) - 1,
                            "returns": [
                              node.lineno + fn.__code__.co_firstlineno - 1
                              for node in __import__('ast').walk(
                                __import__('ast').parse(
                                  __import__('textwrap').dedent(
                                    "".join(__import__('inspect').getsourcelines(fn)[0])
                                  )
                                )
                              )
                              if isinstance(node, __import__('ast').Return)
                            ]
                          }
                        )(getattr(getattr(__import__('sys').modules['%s'], '%s'), '%s'))
                        """,
                moduleName,
                simpleClassName,
                methodName
        );
    }

    public static String getDAPValue(Long objectId, String fieldName) {
        return String.format("(next(o for o in __import__('gc').get_objects() if id(o) == %s)).%s",
                objectId,
                fieldName
        );
    }

}
