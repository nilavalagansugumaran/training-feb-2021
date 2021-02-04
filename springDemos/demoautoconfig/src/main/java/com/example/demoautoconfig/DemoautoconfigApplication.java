package com.example.demoautoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoautoconfigApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoautoconfigApplication.class, args);

       System.out.println(context.getBean(MyInterface.class).toString());
    }

}
