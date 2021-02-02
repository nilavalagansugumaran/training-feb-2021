package com.company.domain;

import java.util.Date;

//Template or blueprint
public class BankAccount  {

    // instance variables or attributes or properties
    private String accountHolderName; // default null
    private double balance; // default 0.0
    private int accountNumber; // 0
    private Date accountCreationDate = new Date();

    // class variable
    private static int counter = 100;

    // Constructors - no return type
    // used for initialising values
    public BankAccount(){

        this("Anonymous", 0.0); // Constructors chaining to call another constructor from one
        System.out.println("default constructor has been invoked" );
        //this.accountHolderName = "Anonymous";
        // this.accountNumber = ++counter;

    }

    public BankAccount(String accountHolderName, double balance){
        System.out.println("parameterised constructor has been invoked" );
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = ++counter;
    }

    // initialisation block - executed everytime new object is created, can appear anywhere, executed as per the order it appears in the class
    {
        System.out.println("initialisation block 1" );
    }
    // initialisation block - executed everytime new object is created, can appear anywhere, executed as per the order it appears in the class
    {
        System.out.println("initialisation block 2" );
    }

    // static initialisation block - executed only once when the class is loaded
    static {
        System.out.println("static initialisation block 1" );
    }

    // instance methods or behaviors
    public void deposit(double amountToDeposit){

        System.out.println("depositing :: " + amountToDeposit);
        balance = balance + amountToDeposit;
        System.out.println("new balance  :: " + balance);
        // return statement is not needed because it is void
    }

    // overloading
    public void deposit(double amountToDeposit, String currency){

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

    // initialisation block - executed everytime new object is created, can appear anywhere, executed as per the order it appears in the class
    {
        System.out.println("initialisation block 3" );
    }

    // static initialisation block - executed only once when the class is loaded
    static {
        System.out.println("static initialisation block 2" );
    }


    // initialisation block - executed everytime new object is created, can appear anywhere, executed as per the order it appears in the class
    {
        System.out.println("initialisation block 4" );
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountCreationDate=" + accountCreationDate +
                ", counter=" + counter +
                '}';
    }
}
