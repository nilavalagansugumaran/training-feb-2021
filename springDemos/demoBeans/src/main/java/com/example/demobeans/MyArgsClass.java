package com.example.demobeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MyArgsClass {

    @Autowired
    private ApplicationArguments applicationArguments;

    public void printArgs(){
        System.out.println("Non option Arguments = " + applicationArguments.getNonOptionArgs());
        System.out.println("Arguments = " + applicationArguments.getOptionNames());
    }
}
