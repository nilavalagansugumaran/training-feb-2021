package com.company;

// import class from another package
import com.external.Employee;

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
        Scanner scan = new Scanner(System.in);
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
    }
}

class AnotherClass {

}
