package com.tnsif.interfaceconcept;

/**
 *
 * @author sys
 */
public class BankImpl implements Bank {

    @Override
    public void withdraw(Account a, double amt) {
        if (amt <= MIN_BALANCE){
    a.setBalance(a.getBalance() - amt);
}else{
    System.err.println("Insufficient balance!");
}
    }
    

    public void deposit(Account a, double amt) {
        if (amt > DEPOSIT_LIMIT) {
            System.err.println("Desposit Limit exceeds!");
        } else {
            a.setBalance(a.getBalance() + amt);
            System.out.println("Deposited" + amt + "into account" + a.getAccNo());

        }
    }

    
}
