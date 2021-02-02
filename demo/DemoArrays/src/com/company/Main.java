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

        // Multi dimension
        int[][] multiExample = new int[3][3];
        multiExample[0][0] =1;
        multiExample[0][1] =2;
        multiExample[0][2] =3;

        multiExample[1][0] =11;
        multiExample[1][1] =22;
        multiExample[1][2] =33;

        multiExample[2][0] =21;
        multiExample[2][1] =22;
        multiExample[2][2] =23;

        printArray(multiExample);
        int[][] multiExample2 =  {

                {1,2,3},
                {11,22,33},
                {21,22,23}
        };

        int[][] multiExample3 =  {

                {1,2,3},
                {11,22},
                {21}
        };

    }


    // using for loop
    private static void printArray(int[] numberArray){

        for(int i=0; i< numberArray.length; i++) {
            System.out.println("element at index " + i +" =" + numberArray[i]);
        }
    }


    // using for loop
    private static void printArray(int[][] multiDimension){

        for(int x=0; x< multiDimension.length; x++) {
                for(int y =0; y<multiDimension.length; y++ ) {
                    System.out.println("multi element at index x = " +x +" and y =" +y + " = " + multiDimension[x][y]);
                }
        }
    }

    // using foreach
    private static void printArray(String[] names){

        for(String name: names) {
            System.out.println("element =" + name);
        }
    }
}
