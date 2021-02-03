package com.company;

import java.util.Date;

//parent class
// add "final" to restrict inheritance
// add abstract to force inheritance - cant directly create objet but can be done via the child class
public abstract class BankAccount {

    // instance variables from parent
    private int accountNumber;
    private String holderName;
    private Date creationDate = new Date();
    protected double balance = 0 ;  // give access to child class
    private static int COUNTER = 100; // static member - class variable

    //Constructor
    public BankAccount(String holderName) {
        System.out.println("parent constructor is called");
        this.holderName = holderName;
        accountNumber = ++COUNTER;
    }

    public void deposit(double amount){
        System.out.println("deposit using parent");
        balance = balance + amount;
    }

    // mark method as final in parent class to stop child classes to override
    public final double withdraw(double amount){
        balance = balance - amount;
        return amount;
    }

    // mark method as abstract to allow child to create own implementation only
    public abstract void idDontKnowWhatTodo();

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", creationDate=" + creationDate +
                ", balance=" + balance +
                '}';
    }
}
