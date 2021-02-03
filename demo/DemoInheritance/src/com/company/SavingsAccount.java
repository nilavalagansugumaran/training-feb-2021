package com.company;

//Child account 1
public class SavingsAccount extends BankAccount{

    private String type; //additional attributes
    private double interest; //additional attributes

    public SavingsAccount(String type, double interest, String accountHolderName){
        super(accountHolderName); // calls parent constructor // // calls parent constructor, if we dont add super(), compiler will automatically add it with the default constructor // has to be very first statement
        this.interest = interest;
        this.type = type;
        System.out.println("SavingsAccount constructor is called");
    }

    // Extends parent class behavior
    @Override
    public void deposit(double amount) {
        super.deposit(amount); // use base class impl, nex add own or extend impl
        System.out.println("SavingsAccount deposit is called");
        balance = balance + interest; // fake calculation
    }

    // This overriding is not possible because the method is final
//
//    @Override
//    public double withdraw(double amount) {
//        super.deposit(amount); // use base class impl, nex add own or extend impl
//        System.out.println("SavingsAccount deposit is called");
//        balance = balance + interest; // fake calculation
//    }


    // has to override - because parent has abstract method
    @Override
    public void idDontKnowWhatTodo() {
        System.out.println("SavingsAccount is doing something");
    }
}
