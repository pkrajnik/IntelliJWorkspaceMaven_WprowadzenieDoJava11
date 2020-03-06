package com.sdacademy.threads.bankaccount;

public interface Account {
    void withdraw(int amountOfmoney);

    void makeDeposit(int amountOfmoney);

    void showBalance();

    int getBalance(); //Saldo
}
