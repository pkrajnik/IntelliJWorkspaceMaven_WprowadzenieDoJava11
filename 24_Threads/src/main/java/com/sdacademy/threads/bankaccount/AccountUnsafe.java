package com.sdacademy.threads.bankaccount;

public class AccountUnsafe implements Account {

    private int balance;

    public AccountUnsafe(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int amountOfmoney) {
        if (balance >= amountOfmoney) {
            System.out.println("Watek: " + Thread.currentThread().getName() + " Wyplacam z konta kwote: " + amountOfmoney);
            balance = balance - amountOfmoney;
        } else {
            System.out.println("Watek: " + Thread.currentThread().getName() + " Nie moge wyplacic, brak pieniedzy!");
        }
    }

    @Override
    public void makeDeposit(int amountOfmoney) {
        System.out.println("Watek: " + Thread.currentThread().getName() + " Wplacam na konto kwote: " + amountOfmoney);
        balance = balance + amountOfmoney;
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
