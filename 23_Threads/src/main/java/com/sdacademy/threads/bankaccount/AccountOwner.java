package com.sdacademy.threads.bankaccount;

public class AccountOwner implements Runnable {

    private Account account;

    public AccountOwner(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            account.withdraw(5);
            account.showBalance();
        }
    }
}
