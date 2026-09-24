package com.ok.javaZeroToHero.encapsulation;

public class Account {
    private long accountNumber;
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
           balance += amount;
            System.out.println("deposited " + amount);
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -=amount;
            System.out.println("withdrawn " + amount);
        }
        else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }


}
