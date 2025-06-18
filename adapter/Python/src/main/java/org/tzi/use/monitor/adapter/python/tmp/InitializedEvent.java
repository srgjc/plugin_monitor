package org.tzi.use.monitor.adapter.python.tmp;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("initialized")
public class InitializedEvent extends Event {

    InitializedEvent() {
        super("initialized");
    }

}
