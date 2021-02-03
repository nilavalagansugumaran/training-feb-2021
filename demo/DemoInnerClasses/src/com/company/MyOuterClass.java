package com.company;

public class MyOuterClass {

    public void myOuterMethod1(){

        System.out.println("This is a outer class method - MyOuterClass.myOuterMethod1");
    }

    public MyInnerClass createInnerObject() {
        return new MyInnerClass();
    }

    // inner class
    class MyInnerClass {
        public void myInnerMethod1(){
            System.out.println("This is a inner class method - MyInnerClass.myInnerMethod1");
        }
    }
}
