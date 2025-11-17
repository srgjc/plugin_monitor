package org.tzi.use.monitor.adapter.python;

public class PyEvalExBuilder {
    
    private static final int MODULE_NAME_IDX = 0;
    private static final int SIMPLE_CLASS_NAME_IDX = 1;

    public static String getClass(String qualifiedClassName) {
        String[] classNameParts = getClassNameParts(qualifiedClassName);
        return String.format(
                "getattr(__import__('sys').modules['%s'], '%s')",
                classNameParts[MODULE_NAME_IDX],
                classNameParts[SIMPLE_CLASS_NAME_IDX]
        );
    }

    public static String getSelfIdAtCurrentFrame() {
        return "id(self)";
    }

    public static String getInstanceIds(String qualifiedClassName) {
        String[] classNameParts = getClassNameParts(qualifiedClassName);
        return String.format(
                "[id(obj) for obj in __import__('gc').get_objects() if isinstance(obj, getattr(__import__('%s'), '%s'))]\n",
                classNameParts[MODULE_NAME_IDX],
                classNameParts[SIMPLE_CLASS_NAME_IDX]
        );
    }

   public static String getMethodInfo(String qualifiedClassName, String methodName, boolean isModule) {
        if (isModule) {
            return String.format(
                    """
                            (
                              lambda fn: {
                                "args": ','.join([p.name for p in __import__('inspect').signature(fn).parameters.values()]),
                                "file": __import__('os').path.abspath(__import__('inspect').getsourcefile(fn)),
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
                            )(getattr(__import__('sys').modules['%s'], '%s'))
                            """,
                    qualifiedClassName,
                    methodName
            );
        }
        String[] classNameParts = getClassNameParts(qualifiedClassName);
        return String.format(
                """
                        (
                          lambda fn: {
                            "args": ','.join([p.name for p in __import__('inspect').signature(fn).parameters.values()]),
                            "file": __import__('os').path.abspath(__import__('inspect').getsourcefile(fn)),
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
                classNameParts[MODULE_NAME_IDX],
                classNameParts[SIMPLE_CLASS_NAME_IDX],
                methodName
        );
    }

    public static String getDAPValue(Long objectId, String fieldName) {
        return String.format("(next(o for o in __import__('gc').get_objects() if id(o) == %s)).%s",
                objectId,
                fieldName
        );
    }
    
    private static String[] getClassNameParts(String qualifiedClassName) {
        int lastDotIdx = qualifiedClassName.lastIndexOf('.');
        if (lastDotIdx == -1) {
            return new String[]{"__main__", qualifiedClassName};
        }
        return new String[] {
                qualifiedClassName.substring(0, lastDotIdx),
                qualifiedClassName.substring(lastDotIdx + 1)
        };
    }

}
