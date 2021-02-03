package com.company;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimpleThreadsMain {

    public static void main(String[] args) {

        simpleThreadsExample();
        threadsUsingExecutors();

    }

    private static void threadsUsingExecutors() {

        System.out.println(" threadsUsingExecutors  thread name at 1 - " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newWorkStealingPool();

        //passing code to method
        executorService.submit(() ->{
            System.out.println(" threadsUsingExecutors Runnable thread name - " + Thread.currentThread().getName());
        });

        try {
            executorService.awaitTermination(2, TimeUnit.SECONDS);
            //executorService.shutdown();
        }catch (InterruptedException  e) {

        }
    }

    private static void simpleThreadsExample() {
        System.out.println(" simpleThreadsExample  thread name at 1 - " + Thread.currentThread().getName());

        // lambda expression to create runnables
        Runnable task = () -> {
           System.out.println(" simpleThreadsExample Runnable thread name - " + Thread.currentThread().getName());
        };

        // create threads and start
        Thread t = new Thread(task);
        t.start();
        System.out.println(" simpleThreadsExample  thread name at 2 - " + Thread.currentThread().getName());
    }
}
