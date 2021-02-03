package com.company;

//Child account 1
public class SavingsAccount extends BankAccount{

    private String type; //additional attributes
    private double interest; //additional attributes

    public SavingsAccount(String type, double interest, String accountHolderName){
        super(accountHolderName); // calls parent constructor // // calls parent constructor, if we dont add super(), compiler will automatically add it with the default constructor // has to be very first statement
        System.out.println("SavingsAccount constructor is called");
    }
}
