package com.ok.javaZeroToHero.encapsulation;

public class Test {
    public static void main(String[] args) {

        Account account = new Account();

        account.setAccountNumber(22110101);
        account.deposit(-10);
        account.withdraw(1000);
        account.deposit(1000);
        account.withdraw(105);
        System.out.println(account.getBalance());
        System.out.println(account.getAccountNumber());





    }
}
