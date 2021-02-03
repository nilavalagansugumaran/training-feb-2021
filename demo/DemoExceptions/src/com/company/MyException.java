package com.company;

public class MyException extends Exception {

    public MyException() {
        super("This is my exception");
    }

    public MyException(String message) {
        super(message);
    }
}
