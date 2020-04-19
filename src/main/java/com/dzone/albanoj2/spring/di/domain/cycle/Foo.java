package com.dzone.albanoj2.spring.di.domain.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Foo {
    
    @SuppressWarnings("unused")
    private Bar bar;

    @Autowired
    public Foo(@Lazy Bar bar) {
        this.bar = bar;
    }
}
