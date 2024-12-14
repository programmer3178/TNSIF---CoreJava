package com.tnsif.assignment;

/**
 *
 * @author sys
 */

abstract class Account {
    
    protected double balance;
    
    public Account(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }
    
    // Abstract methods to be implemented by subclasses
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
    
    // Concrete method shared across all account types
    public final void displayBalance() {
        System.out.println("Current balance: " + this.balance);
    }
}

final class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.03; // 3% interest rate
    
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Savings Account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
    
    public void addInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest of " + interest + " added to Savings Account.");
    }
}

final class CheckingAccount extends Account {
    private static final double TRANSACTION_FEE = 1.50;
    
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Checking Account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (amount > 0 && totalAmount <= balance) {
            balance -= totalAmount;
            System.out.println("Withdrew " + amount + " from Checking Account (Fee: " + TRANSACTION_FEE + ").");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
}

