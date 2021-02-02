package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] numberArray; // declare
        numberArray = new int[10]; // set size
        printArray(numberArray); // default values are printed
        numberArray[0] = 10;
        numberArray[1] = 3;
        numberArray[2] = 200;
        numberArray[3] = 25;
        numberArray[4] = 55;
        numberArray[5] = 33;
        numberArray[6] = 1;
        numberArray[7] = 50;
        numberArray[8] = 76;
        numberArray[9] = 88;

        //numberArray[10] = 100; //cant add elements out of the index
        printArray(numberArray); // elements with set values are printed and other comes with default value
        System.out.println("element at index 5 is " + numberArray[5]);
        System.out.println("length of the array numberArray is " + numberArray.length);

        System.out.println("Sorting array");
        Arrays.sort(numberArray); // sorting
        System.out.println("printing after sorting ");
        printArray(numberArray);
        System.out.println("Search for 300 in array " + Arrays.binarySearch(numberArray, 300));

        System.out.println("Search for 33 in array " + Arrays.binarySearch(numberArray, 33));

        String[] days = new String[5] ; // declare with size
        printArray(days); // default is null

        // String array with known values
        String[] names = {"one","two","three", "four" };
        printArray(names);

        days = names; // can reassign an array
        printArray(days);
    }


    // using for loop
    private static void printArray(int[] numberArray){

        for(int i=0; i< numberArray.length; i++) {
            System.out.println("element at index " + i +" =" + numberArray[i]);
        }
    }

    // using foreach
    private static void printArray(String[] names){

        for(String name: names) {
            System.out.println("element =" + name);
        }
    }
}
