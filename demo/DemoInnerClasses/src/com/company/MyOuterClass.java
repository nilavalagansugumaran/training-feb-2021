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


    /**
     * Method local inner class examples
     */
    public void outerMethodLocalInnerClass() {

        System.out.println("This is a outer method - outerMethodLocalInnerClass");

        // method local inner class
        class MyMethodLocalInnerClass {
            public void myMethodLocalInnerClassMethod1(){
                System.out.println("This is a method local inner class method - MyMethodLocalInnerClassMethod1");
            }
        }

        MyMethodLocalInnerClass cls = new MyMethodLocalInnerClass();
        cls.myMethodLocalInnerClassMethod1();

    }


    /**
     * Static inner class
     */
    public static class MyInnerStaticClass{

        public void myStaticInnerMethod1(){
            System.out.println("This is a static inner class method - MyInnerClass.myStaticInnerMethod1");
        }
    }

    /**
     * Anonymous class example
     */

    public void demoAnonymousClass(){

        System.out.println("This is a outer method - demoAnonymousClass");

        if(true) {
            //anonymous class from base class, no name only the reference
            MyBaseClass subClass = new MyBaseClass(){

                @Override
                public void baseMethod1() {
                    System.out.println("This is a anonymous child class method 1 - baseMethod1");
                }
            };

            subClass.baseMethod1(); // overridden method
            subClass.baseMethod12(); // base class method

        }

        // anonymous class from interface
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("This is a anonymous child class interface method 1 - method1");
            }

            @Override
            public void method2() {
                System.out.println("This is a anonymous child class interface method 2 - method2");
            }
        };
        myInterface.method1();
        myInterface.method2();

    }

}
