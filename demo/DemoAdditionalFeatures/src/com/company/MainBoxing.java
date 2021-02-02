package com.company;

import java.util.ArrayList;

public class MainBoxing {

    public static void main(String[] args) {
	// write your code here

        ArrayList list = new ArrayList();
        int myValue = 100;
        list.add(new Integer(myValue)); // to add int as an object - explicit
        int newValue = checkBoxing(myValue); // implicit
        System.out.println("new value = " + newValue);
       int readValue =( (Integer) list.get(0)).intValue(); // explicit unboxing

       // dont need to create object (Autoboxing)
       list.add(12345);
        int anotherValue =(Integer) list.get(1); // explicit unboxing

    }

    private static Integer checkBoxing(Integer x){ // implicit
        System.out.println( "initial value = " + x.intValue());

        return x + 100; // implicit
    }

    private static Integer checkBoxing(long x){ // implicit
        System.out.println( "initial long value = " + x);

        return new Long(x + 100).intValue(); // implicit
    }
}
