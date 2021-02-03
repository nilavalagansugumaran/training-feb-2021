package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       // BankAccount bankAccount = new BankAccount("bank account name"); // remove abstract to get it working
       // System.out.println( "Bank account = " + bankAccount.toString());

        CurrentAccount currentAccount = new CurrentAccount("saving account name", "cheque");
        currentAccount.balance = 100; // can access protected members
        System.out.println("Current Account = " + currentAccount.toString());

        SavingsAccount savingsAccount = new SavingsAccount("ISA", 1, "Current Account Name" );
        System.out.println("Savings account = " +savingsAccount.toString());
    }
}
