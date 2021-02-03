package com.company;

import java.io.Serializable;

public class SomeOtherClass implements AccountClosable, Serializable { // can add as many number of interfaces

    @Override
    public void closeAccount(){
        System.out.println("this is SomeOtherClass");
    }

    public void doSomething() {
        System.out.println("SomeOtherClass is doing something");
    }
}
