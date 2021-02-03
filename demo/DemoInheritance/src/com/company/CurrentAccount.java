package com.company;

// Child 2
public class CurrentAccount extends BankAccount{

    private String cheque; //additional attributes

    public CurrentAccount(String name, String cheque) {

        super(name); // calls parent constructor, if we dont add super(), compiler will automatically add it with the default constructor // has to be very first statement
        this.cheque = cheque;
        System.out.println("CurrentAccount constructor is called");
    }

    // deposit is not Extended so parent class behavior will work
}
