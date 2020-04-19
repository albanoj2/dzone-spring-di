package com.dzone.albanoj2.spring.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dzone.albanoj2.spring.di.config.AnnotationConfig;
import com.dzone.albanoj2.spring.di.domain.Car;

public class AnnotationApp {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        Car car = context.getBean(Car.class);
        
        car.start();
    }

}
