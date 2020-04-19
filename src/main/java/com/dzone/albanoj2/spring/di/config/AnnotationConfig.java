package com.dzone.albanoj2.spring.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dzone.albanoj2.spring.di.domain.Camshaft;
import com.dzone.albanoj2.spring.di.domain.Car;
import com.dzone.albanoj2.spring.di.domain.CombustionEngine;
import com.dzone.albanoj2.spring.di.domain.Crankshaft;
import com.dzone.albanoj2.spring.di.domain.Engine;

@Configuration
public class AnnotationConfig {

    @Bean
    public Car car(Engine engine) {
        return new Car(engine);
    }
    
    @Bean
    public Engine engine(Camshaft camshaft, Crankshaft crankshaft) {
        return new CombustionEngine(camshaft, crankshaft);
    }
    
    @Bean
    public Camshaft camshaft() {
        return new Camshaft();
    }
    
    @Bean
    public Crankshaft crankshaft() {
        return new Crankshaft();
    }
}
