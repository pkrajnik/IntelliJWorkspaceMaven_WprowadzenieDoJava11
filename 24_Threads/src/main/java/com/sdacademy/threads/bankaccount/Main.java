package com.sdacademy.threads.bankaccount;

public class Main {

    public static void main(String[] args) {

        //Account account = new AccountUnsafe(20);
        Account account = new AccountSafe(20);

        AccountOwner accountOwner1 = new AccountOwner(account);
        AccountOwner accountOwner2 = new AccountOwner(account);

        Thread thread1 = new Thread(accountOwner1, "watek1");
        Thread thread2 = new Thread(accountOwner2, "watek2");

        thread1.start();
        thread2.start();
    }
}
