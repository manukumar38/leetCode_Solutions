package com.leetcode.solutions;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MoneyTransferProgram {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(500);
        BankAccount b2 = new BankAccount(1000);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            transfer (b1, b2, 200);
                });

        executorService.submit(() -> {
                    transfer(b2, b1, 500);
                });

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE,TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("b1 balance :"+b1.getBalance());
        System.out.println("b2 balance :"+b2.getBalance());

    }

    public static void transfer(BankAccount source, BankAccount destination, int amount) {
        synchronized (source) {
            synchronized (destination) {
                source.withdraw(amount);
                destination.deposit(amount);
            }
        }
    }
}

class BankAccount {

    int balance;

    public BankAccount(int balance) {

        this.balance = balance;
    }

    public synchronized void withdraw (int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public synchronized void deposit (int amount) {

        balance += amount;
    }

    public int getBalance() {

        return balance;
    }
}

