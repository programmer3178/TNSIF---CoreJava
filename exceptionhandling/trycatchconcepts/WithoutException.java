
package com.tnsif.exceptionhandling;

/**
 * @author sys
 */
public class WithoutException {

	public static void main(String[] args) {
		int a[] = new int[4];
		try {
			a[3] = 10;
			a[4] = 10;
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		System.err.println("Will not be printed!");
	}

}
