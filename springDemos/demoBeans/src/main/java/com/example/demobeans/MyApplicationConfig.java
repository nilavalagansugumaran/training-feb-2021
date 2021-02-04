package com.example.demobeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplicationConfig {

    @Bean(name = {"mybean-1","mybean-2","mybean-3"}) // can have multiple names for same bean
    public MyBean myBean() {
        return new MyBean();
    }

    @Bean
    public MyOtherBean myOtherBean() {
        return new MyOtherBean();
    }

}
