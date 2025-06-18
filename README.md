## USE Monitor
The USE monitor allows for monitoring running applications and to verify the applications behave as defined in a USE model.

### Requirements

Add the following vm argument to the `use` start script:

```
--add-exports=jdk.jdi/com.sun.tools.jdi=ALL-UNNAMED
```
