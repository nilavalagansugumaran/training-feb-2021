package com.company.domain;

import java.util.Date;

//Template or blueprint
public class BankAccount {

    // instance variables or attributes or properties
    private String accountHolderName; // default null
    private double balance; // default 0.0
    private int accountNumber; // 0
    private Date accountCreationDate = new Date();

    // instance methods or behaviors
    public void deposit(double amountToDeposit){

        System.out.println("depositing :: " + amountToDeposit);
        balance = balance + amountToDeposit;
        System.out.println("new balance  :: " + balance);
        // return statement is not needed because it is void
    }

    public double withdraw(double amountToWithdraw){
        System.out.println("Withdrawing :: " + amountToWithdraw);
        balance = balance - amountToWithdraw;

        System.out.println("remaining balance  :: " + balance);
        return balance;
    }

    // getters and setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountCreationDate=" + accountCreationDate +
                '}';
    }
}
