
package com.tnsif.assignment;

/**
 *
 * @author sys
 */
public class Bank {
   static int totalAccounts;

    public Bank() {
    totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    
    
   
}
