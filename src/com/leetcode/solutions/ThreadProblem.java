package com.leetcode.solutions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ThreadProblem {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1);

        Runnable t1 = () -> {
            try {
                semaphore.acquire(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread1 starts execution");
            for(int i =0; i< 11 ; i++) {
                System.out.println(i);
            }
            semaphore.release(1);
        };

        Runnable t2 = () -> {
            System.out.println("Thread2 starts execution");
            for(int i =11; i< 21 ; i++) {
                System.out.println(i);
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(t1);
        service.submit(t2);
        service.shutdown();
    }
}
