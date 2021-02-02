package com.company;

public class MainVarArgsExample {

    public static void main(String[] args) {

        print("nila", "one", "two","three");
        print( "1"); // zero or more

        print( "one", "2");

        print( "one", "2", "3","one", "2", "3","one", "2", "3","one", "2", "3");
    }

    private static void print(String name, String... x) {

        System.out.println("name = " + name);
        for(String a : x) {
            System.out.println(a);
        }
    }
}
