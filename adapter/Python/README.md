# USE Monitor Python Adapter

USE monitor plugin that adds support for the monitoring of Python programs.

## Adapter Settings
- Host: Hostname of the machine, where the debuggee program is located.
- Port: Port on which the Debugpy server running the Python program is listening to.
- Workspace: Absolute path to the root directory of the Python program to monitor.
- Max. Instances: Maximum number of instances that USE should map and display.

## How to use the plugin 
1. In the USE project under `use/use-core/target` create the following folder structure:
`mkdir -p lib/plugins/monitor_adapter`
2. Run `mvn clean package`
3. Copy the `MonitorAdapter_Python-1.0-SNAPSHOT.jar` to `lib/plugins/monitor_adapter`
4. Copy the `monitor-1.0-SNAPSHOT.jar` to `lib/plugins`
5. Copy the `monitor/lib/lablib-checkboxtree-3.2.jar` to `lib`
6. Add an IntelliJ run configuration with the main class `org.tzi.use.main.Main`, VM option `--add-exports=jdk.jdi/com.sun.tools.jdi=ALL-UNNAMED` and class path `use-gui`
7. Modify the classpath with the `lib` folder addition

## How to start the Debugpy server

```
#!/usr/bin/env bash

mkdir -p logs

debugpy \
    --listen 5678 \
    --log-to ./logs/ \
    ./<your_script>.py
```
