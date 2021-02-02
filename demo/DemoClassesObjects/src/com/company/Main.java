package com.company;

import com.company.domain.BankAccount;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // To create an object
        BankAccount bankAccount = new BankAccount();
        // to check default initialisation
        System.out.println(bankAccount.toString());
        System.out.println(BankAccount.getCounter()); // accessing static methods using class name

        //using setters
        BankAccount bankAccount1 = new BankAccount();
       // bankAccount1.setAccountNumber(101); - set using class variable called counter
        bankAccount1.setAccountHolderName("Nila");
        //access methods
        bankAccount1.deposit(10);
        System.out.println(bankAccount1.toString());
        System.out.println(BankAccount.getCounter()); // accessing static methods using class name

        //using constructor
        BankAccount bankAccount2 = new BankAccount("my name", 200);
        System.out.println(bankAccount2.toString());
        System.out.println(BankAccount.getCounter()); // accessing static methods using class name

    }
}
