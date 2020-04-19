package com.dzone.albanoj2.spring.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dzone.albanoj2.spring.di.config.AutomatedAnnotationConfig;
import com.dzone.albanoj2.spring.di.domain.Car;

public class AutomatedAnnotationApp {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AutomatedAnnotationConfig.class);

        Car car = context.getBean(Car.class);
        
        car.start();
    }

}
