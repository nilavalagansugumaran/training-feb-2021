package com.example.demobeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemobeansApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemobeansApplication.class, args);

        //BankServiceImpl obj1 = new BankServiceImpl(); - NOT A SPRING BEAN
        BankService bankService1 = ctx.getBean(BankService.class);
        System.out.println("bankService1 to string " + bankService1.toString());
        System.out.println("bankService1 hashcode " + bankService1.hashCode());

        BankService bankService2 = ctx.getBean(BankService.class);
        System.out.println("bankService2 to string " + bankService2.toString());
        System.out.println("bankService2 hashcode " + bankService2.hashCode());



    }

}
