package com.example.demomoreexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemomoreexamplesApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemomoreexamplesApplication.class, args);
       System.out.println("Contact info = " + ctx.getBean(Contact.class).toString());
    }

}
