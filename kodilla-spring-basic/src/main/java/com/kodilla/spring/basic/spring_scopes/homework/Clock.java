package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.time.*;

@Component
@Scope("prototype")
public class Clock {

    public long getTime() {
        return time;
    }

    private long time = System.nanoTime();
}
