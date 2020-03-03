package com.sdacademy.threads.bankaccount;

public class AccountSafe implements Account {

    private int balance;

    public AccountSafe(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int amountOfmoney) {
        synchronized (this) {
            if (balance >= amountOfmoney) {
                System.out.println("Watek: " + Thread.currentThread().getName() + " Wyplacam z konta kwote: " + amountOfmoney);
                balance = balance - amountOfmoney;
            } else {
                System.out.println("Watek: " + Thread.currentThread().getName() + " Nie moge wyplacic, brak pieniedzy!");
            }
        }
    }

    @Override
    public void makeDeposit(int amountOfmoney) {
        synchronized (this) {
            System.out.println("Watek: " + Thread.currentThread().getName() + " Wplacam na konto kwote: " + amountOfmoney);
            balance = balance + amountOfmoney;
        }
    }

    @Override
    public void showBalance() {
        System.out.println("Watek: " + Thread.currentThread().getName() + " Stan konta: " + balance);
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
