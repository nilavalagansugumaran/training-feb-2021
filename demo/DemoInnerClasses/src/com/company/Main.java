package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // create outer class object
        MyOuterClass outerClass = new MyOuterClass();
        outerClass.myOuterMethod1();

        // way 1 - using object reference
        MyOuterClass.MyInnerClass myInnerClass = outerClass.new MyInnerClass();
        myInnerClass.myInnerMethod1();

        //way2 - using new object
        MyOuterClass.MyInnerClass myInnerClass1 = new MyOuterClass().new MyInnerClass();
        myInnerClass1.myInnerMethod1();

        //way3 - using methods
        MyOuterClass.MyInnerClass myInnerClass2 = outerClass.createInnerObject();
        myInnerClass2.myInnerMethod1();

        // using method local inner class
        outerClass.outerMethodLocalInnerClass();
    }
}
