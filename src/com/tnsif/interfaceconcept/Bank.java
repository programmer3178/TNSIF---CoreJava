package com.tnsif.interfaceconcept;

/**
 *
 * @author sys
 */
public interface Bank {

    final double MIN_BALANCE = 1000;
    final double DEPOSIT_LIMIT = 25000;
    final double INTEREST_RATE = 7.8;

    void withdraw(Account a, double amt);

    void deposit(Account a, double amt);

}
