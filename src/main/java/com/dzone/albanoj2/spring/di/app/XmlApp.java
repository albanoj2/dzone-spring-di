package com.dzone.albanoj2.spring.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dzone.albanoj2.spring.di.domain.Car;

public class XmlApp {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("basic-config.xml");

        Car car = context.getBean(Car.class);
        
        car.start();
    }

}
