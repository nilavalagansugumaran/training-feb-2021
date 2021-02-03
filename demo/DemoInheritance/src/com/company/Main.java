package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

       // BankAccount bankAccount = new BankAccount("bank account name"); // remove abstract to get it working
       // System.out.println( "Bank account = " + bankAccount.toString());

        BankAccount currentAccount = new CurrentAccount("saving account name", "cheque");
        currentAccount.balance = 100; // can access protected members
        System.out.println("Current Account = " + currentAccount.toString());
        currentAccount.deposit(1000);
        System.out.println("Current Account after deposit = " + currentAccount.toString());

        BankAccount savingsAccount = new SavingsAccount("ISA", 50, "Current Account Name" );
        System.out.println("Savings account = " +savingsAccount.toString());

        savingsAccount.deposit(1000);
        System.out.println("Savings Account after deposit = " + savingsAccount.toString());

        // using instanceof keyword
        if(currentAccount instanceof BankAccount) {
            System.out.println("current account is a bank account");
        }

        if(currentAccount instanceof CurrentAccount) {
            System.out.println("current account is a Current account");
        }

        //Polymorphism
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(currentAccount);
        bankAccountList.add(savingsAccount);
        for(BankAccount bankAccount : bankAccountList) {
            bankAccount.deposit(100); // jvm know which one to call at runtime
            System.out.println("BankACCOUNT after ANOTHER deposit = " + bankAccount.toString());

            // to call extra method
            if(bankAccount instanceof CurrentAccount) {
                CurrentAccount ca = (CurrentAccount) bankAccount;
                ca.doSomething();
            }

        }

      // using interfaces
        AccountClosable closable1 = new CurrentAccount("closable current account", "cheque");
        AccountClosable closable2 = new SavingsAccount("normal", 200, "closable savings account");
        AccountClosable closable3 = new SomeOtherClass();
        closable1.closeAccount();
        closable2.closeAccount();
        closable3.closeAccount();

        List<AccountClosable> closableList = new ArrayList<>();
        closableList.add(closable1);
        closableList.add(closable2);
        closableList.add(closable3);

        for(AccountClosable closable : closableList) {

            closable.closeAccount(); // jvm know which one to call at runtime

            // to call extra method
            if(closable instanceof SomeOtherClass) {
                SomeOtherClass ca = (SomeOtherClass) closable;
                ca.doSomething();
            }

        }
    }
}
