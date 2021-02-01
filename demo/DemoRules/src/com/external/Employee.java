
// class created at another package
package com.external;

// template
public class Employee {

    // Instance variable
    private String name; // reference type
    private int age; // premitives
    private double salary;

    public Employee(String name, int age, double salary) { // local variables
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //constant
    private static final String COMPANY = "Example Corp";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getCompany(){
        return COMPANY;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
