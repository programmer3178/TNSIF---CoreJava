package com.tnsif.interfaceconcept;

/**
 *
 * @author sys
 */
public class BankAppln {

    public static void main(String[] args) {
        Bank bank = new BankImpl();
        //Create an Account
        Account account = new Account(123456, "Shastry", 155000, bank);
        account.getBank().deposit(account, 2000);
        System.out.println(account);
    }

}
