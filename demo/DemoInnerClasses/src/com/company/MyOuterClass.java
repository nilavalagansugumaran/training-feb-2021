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


}
