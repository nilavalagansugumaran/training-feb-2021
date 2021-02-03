package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Current thread name = " + Thread.currentThread().getName());
        PrimeFinder primeFinder1 = new PrimeFinder(10,20);
        //starting on main thread
        primeFinder1.process();
        System.out.println("prime numbers 1 = " + primeFinder1.getPrimes());

        //starting on a separate thread
        PrimeFinder primeFinder2 = new PrimeFinder(21,30);
        Thread thread1 = new Thread(primeFinder2);
        thread1.start();
        System.out.println("prime numbers 2 = " + primeFinder2.getPrimes());

        System.out.println("Current thread name = " + Thread.currentThread().getName());
        // other logic here...
        for(int i =0 ; i< 10; i++) {
            System.out.print(i + ",  " );
        }

        try {
            System.out.println("Current thread name = " + Thread.currentThread().getName());
            thread1.join(); //wait until thread 1 completes before exit
            System.out.println("prime numbers 2 = " + primeFinder2.getPrimes());
        } catch (InterruptedException ie) {

        }

    }
}

//class PrimeFinder implements Runnable {
class PrimeFinder extends Thread {

    private int from, to;
    private List<Integer> primes;

    // Constructor.
    public PrimeFinder(int from, int to) {
        this.from = from;
        this.to = to;
        this.primes = new ArrayList<>();
    }

    // Helper method.
    private boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // write the logic inside run() that will be executed in a thread
    public void run() {
        System.out.println("Current thread name at process() = " + Thread.currentThread().getName());
        for (int number = from; number <= to; number++) {

            // Artificial delay.
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException ex) {}


            // See if number is prime.
            if (isPrime(number)) {
                primes.add(number);
            }
        }
    }

    public void process() {
        System.out.println("Current thread name at process() = " + Thread.currentThread().getName());
        for (int number = from; number <= to; number++) {

            // Artificial delay.
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException ex) {}


            // See if number is prime.
            if (isPrime(number)) {
                primes.add(number);
            }
        }
    }
    // Getters/setters.
    public int getFrom() {
        return from;
    }


    public void setFrom(int from) {
        this.from = from;
    }


    public int getTo() throws Exception {

        super.clone();
        return to;
    }


    public void setTo(int to) {
        this.to = to;
    }


    public List<Integer> getPrimes() {
        return primes;
    }


    public void setPrimes(List<Integer> primes) {
        this.primes = primes;
    }

}