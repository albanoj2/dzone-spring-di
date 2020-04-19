package com.dzone.albanoj2.spring.di.domain.cycle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Foo.class)
public class Config {

}
