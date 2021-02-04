package com.example.demoautoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean
    @ConditionalOnProperty(name = "bean1.enabled", havingValue = "yes")
    public MyInterface bean1(){

        return new MyClass1();
    }

    @Bean
    @ConditionalOnProperty(name = "bean1.enabled", havingValue = "no")
    public MyInterface bean2(){

        return new MyClass2();
    }
}
