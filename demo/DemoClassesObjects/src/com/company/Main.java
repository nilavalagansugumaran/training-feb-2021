package com.company;

import com.company.domain.BankAccount;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // To create an object
        BankAccount bankAccount = new BankAccount();
        // to check default intialisation
        System.out.println(bankAccount.toString());

        //using setters
        bankAccount.setAccountNumber(101);
        bankAccount.setAccountHolderName("Nila");
        bankAccount.deposit(10);
        System.out.println(bankAccount.toString());

    }
}
