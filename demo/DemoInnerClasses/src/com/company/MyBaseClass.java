package com.company;

public class MyBaseClass {

    public void baseMethod1() {
        System.out.println("This is a base class method 1 - baseMethod1");
    }

    public void baseMethod12() {
        System.out.println("This is a base class method 2 - baseMethod2");
    }

}

// create sub class usually
class MyChildClass extends  MyBaseClass {
    @Override
    public void baseMethod1() {
        System.out.println("This is a child class method 1 - baseMethod1");
    }
}

class MyImpl implements MyInterface {
    @Override
    public void method1() {
        System.out.println("This is a child class method 1 - MyImpl.method1");
    }

    @Override
    public void method2() {
        System.out.println("This is a child class method 1 - MyImpl.method2");
    }
}