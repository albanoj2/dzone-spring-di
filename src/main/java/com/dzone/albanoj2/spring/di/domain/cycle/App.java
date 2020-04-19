package com.dzone.albanoj2.spring.di.domain.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Foo foo = context.getBean(Foo.class);
    }

}
