package com.tnsif.assignment;
/**
 *
 * @author sys
 */
public class BankingTransactionSystem {

    public static void main(String[] args) {

        // Create instances of SavingsAccount and CheckingAccount
        SavingsAccount savings = new SavingsAccount(1000);
        CheckingAccount checking = new CheckingAccount(500);

        // Display initial balances
        savings.displayBalance();
        checking.displayBalance();

        // Perform deposit, withdraw, and balance operations on SavingsAccount
        savings.deposit(200);
        savings.withdraw(100);
        savings.addInterest();
        savings.displayBalance();

        // Perform deposit, withdraw, and balance operations on CheckingAccount
        checking.deposit(300);
        checking.withdraw(200);
        checking.displayBalance();
    }
}
