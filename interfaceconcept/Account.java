
package com.tnsif.interfaceconcept;

/**
 * @author sys
 */
public class Account {
	private int accNo;
	private String name;
	private double balance;
	private Bank bank;

	public Account(int accNo, String name, double balance, Bank bank) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
