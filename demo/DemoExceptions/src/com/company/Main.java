package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        MyFileWriter myFileWriter = new MyFileWriter();
        try {
            myFileWriter.writeToFile("");
        }catch (MyException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
