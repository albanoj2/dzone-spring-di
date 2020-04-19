package com.dzone.albanoj2.spring.di.domain.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Bar {

    @Autowired
    public Bar(Foo foo) {}
}
