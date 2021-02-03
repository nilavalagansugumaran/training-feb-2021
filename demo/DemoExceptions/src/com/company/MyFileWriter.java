package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {

    public void writeToFile() throws IOException { // DELEGATE EXCEPTION HANDLING
        System.out.println("Going to write to file");
        PrintWriter out = null;
        try { // put your code that could go wrong
            out = new PrintWriter(new BufferedWriter(new FileWriter("myfile.txt")));
            out.println("hello");
            out.println("hello nila");

        }catch (IOException exp) { // catch & handle the exception
            exp.printStackTrace();
            System.out.println("exception message = " + exp.getCause());
            throw exp; // to delegate exception
        }
        catch (NullPointerException exp) { // catch & handle the exception
            exp.printStackTrace();
            System.out.println("exception message = " + exp.getCause());
       } finally {
            System.out.println("finally is getting called");
            if(out !=null) { // prevent null exception
                out.close();
            }
        }
    }
}
