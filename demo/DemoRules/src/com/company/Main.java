package com.company;

// import class from another package
import com.external.Employee;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee emp1 = new Employee("Nila 1", 38, 1200.50);
        System.out.println(emp1.toString());
        System.out.println(emp1.getCompany());

        Employee emp2 = new Employee("Nila 2", 38, 1200.50);
        System.out.println(emp2.toString());
        System.out.println(emp2.getCompany());

    }
}

class AnotherClass {

}
