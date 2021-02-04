package com.example.demobeans;

import com.example.outer.MyOuterBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.example") // to access outer package
public class DemobeansApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemobeansApplication.class, args);

        //BankServiceImpl obj1 = new BankServiceImpl(); - NOT A SPRING BEAN
        BankService bankService1 = ctx.getBean(BankService.class); // access bean from container or bean factory
        System.out.println("bankService1 to string " + bankService1.toString());
        System.out.println("bankService1 hashcode " + bankService1.hashCode());

        BankService bankService2 = ctx.getBean(BankService.class);
        System.out.println("bankService2 to string " + bankService2.toString());
        System.out.println("bankService2 hashcode " + bankService2.hashCode());

        bankService2.takeDeposit();

        //Access bean from outer package
        MyOuterBean myOuterBean = ctx.getBean(MyOuterBean.class);
        System.out.println("myOuterBean to string " + myOuterBean.toString());
        System.out.println("myOuterBean hashcode " + myOuterBean.hashCode());

        // Access Arguments
        MyArgsClass myArgsClass1 = ctx.getBean("myArgsClass", MyArgsClass.class);
        MyArgsClass myArgsClass2 = (MyArgsClass)ctx.getBean("myArgsClass");
        myArgsClass1.printArgs();


        //Access bean from configuration
        MyBean myBean = ctx.getBean(MyBean.class);
        System.out.println("myBean to string " + myBean.toString());
        System.out.println("myBean hashcode " + myBean.hashCode());

        //Access bean from configuration
        MyOtherBean myOtherBean = ctx.getBean(MyOtherBean.class);
        System.out.println("myOtherBean to string " + myOtherBean.toString());
        System.out.println("myOtherBean hashcode " + myOtherBean.hashCode());

    }

}
