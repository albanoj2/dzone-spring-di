package com.dzone.albanoj2.spring.di.domain;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {

    @Override
    public void turnOn() {
        System.out.println("Started electric engine");
    }
}
