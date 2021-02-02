package com.company;

// import class from another package
import com.external.Employee;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Hard coded values
        Employee emp1 = new Employee("Nila 1", 38, 1200.50);
        System.out.println(emp1.toString());
        System.out.println(emp1.getCompany());

        Employee emp2 = new Employee("Nila 2", 38, 1200.50);
        System.out.println(emp2.toString());
        System.out.println(emp2.getCompany());

        // Using Scanner
    /*    Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Enter Age: ");
        int age = scan.nextInt();
        System.out.println("Enter Salary: ");
        double salary = scan.nextBigDecimal().doubleValue();
        Employee emp3 = new Employee(name.toUpperCase(), age, Math.round(salary));
        System.out.println(emp3.toString());
        System.out.println(emp3.getCompany());

        Integer intAge = Integer.valueOf(age);
        Double doubleSalary = Double.valueOf(salary);
        System.out.println(doubleSalary.intValue());

        */

        // Demo for operators
        int value1 = 21;
        System.out.println( +value1);// 21
        System.out.println( -value1); //-21
        System.out.println( ++value1); // prefix increment 22
        System.out.println( value1++); // postfix prints 22 but increases 23
        System.out.println( value1);
        System.out.println( --value1); // prefix decrement
        System.out.println( value1--); // postfix
        System.out.println( value1);

        // conditional
        System.out.println(value1<100? "Hello": "Bye" );

        // Conversion
        System.out.println(value1/2);
        System.out.println((double)value1/2);


        System.out.println("Short circuit example" );
        System.out.println( (test100() && test200()) );

        System.out.println("Non Short circuit example" );
        System.out.println( (test100() & test200()) );

        System.out.println(new Date().toString());
    }

    public static boolean test100(){
        System.out.println("testing 100");
        return (100<10);
    }

    public static boolean test200(){
        System.out.println("testing 200");
        return (200>30);
    }
}

class AnotherClass {

}
