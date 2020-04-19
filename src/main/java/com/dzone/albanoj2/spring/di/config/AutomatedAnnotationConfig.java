package com.dzone.albanoj2.spring.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dzone.albanoj2.spring.di.domain.Car;

@Configuration
@ComponentScan(basePackageClasses = Car.class)
public class AutomatedAnnotationConfig {

}
