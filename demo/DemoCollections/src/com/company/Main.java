package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] stringArray = new String[3] ; // creating an string array
        stringArray[0] = "1"; // index based
        stringArray[1] = "2";
        stringArray[2] = "3";

        for(String obj : stringArray) {
            System.out.println("String array value = " + obj);
        }


        ArrayList arrayList = new ArrayList(); // array list
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add(new Date());
        arrayList.add(10); // add any objects (uses autoboxing) and any number of objects

        System.out.println("List = " + arrayList);

        for(Object obj : arrayList) { // complexity
            if(obj instanceof String) {
                System.out.println((String) obj + " Appending string..");
            } else if(obj instanceof Date) {
                System.out.println(((Date) obj).getTime() );
            } else {
                System.out.println(obj.toString());
            }
        }

        // Generics are type safe
        ArrayList<String> stringOnlyList = new ArrayList(); // array list
        //stringOnlyList.add(new Date()); // can not do
        //stringOnlyList.add(10);// can not do
        stringOnlyList.add("one");
        for(String obj : stringOnlyList) { // no complexity
                System.out.println(obj + " Appending string..");
        }


        ArrayList<Integer> intOnlyList = new ArrayList(); // array list
        //intOnlyList.add(new Date()); // can not do
        intOnlyList.add(10);
        for(Integer obj : intOnlyList) { // no complexity
            int valueFromIntOnlyList = obj; // unboxing
        }


        Map countryCodes = new HashMap(); // NOT TYPE SAFE
        countryCodes.put("UK", "London");
        countryCodes.put("USA", "W DC");
        countryCodes.put(1, new Date());
        System.out.println("countryCodes = " + countryCodes);

        Map<Integer, String> countryCodesStringOnly = new HashMap(); // NOT TYPE SAFE
        countryCodesStringOnly.put(1, "UK");
        countryCodesStringOnly.put(2, "USA");
       // countryCodesStringOnly.put(1, new Date()); // no accepted
        System.out.println("countryCodesStringOnly = " + countryCodesStringOnly);

        System.out.println("contains key check " + countryCodesStringOnly.containsKey("200"));

       Set<Integer> keys =  countryCodesStringOnly.keySet(); // get keys
       for(Integer key : keys) { // iterate the keys
           System.out.println("key = " + key + " and value = "+  countryCodesStringOnly.get(key)); // lookup the key in the map
       }

       // using generic methods
        checkType(keys);
        checkType(countryCodesStringOnly);
        checkType(stringArray);

        // using generic class
        MyList<Integer> myList = new MyList();
        myList.insert(1234);
        System.out.println(myList.getElement(0));
        //myList.insert("string"); // not accepted

        //Collection Utils

    }


    // Own generic method
    private static <A> void checkType(A object) {
        System.out.println("the type is =" + object.getClass().getName());
    }

}

// own type safe list
class MyList<T> {

    private ArrayList<T> elements;

    MyList() {
        elements = new ArrayList<T>();
    }

    public void insert(T element) {
        elements.add(element);
    }

    public T getElement(int index) {
        return  elements.get(index);
    }
}