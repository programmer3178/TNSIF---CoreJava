
package com.tnsif.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author sys
 */
public class MultipleCatchDemo {

	public static void main(String[] args) {
		int numberOne, numberTwo, numberThree;
		System.out.println("Enter the two numbers:");
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				numberOne = sc.nextInt();
				numberTwo = sc.nextInt();
				numberThree = sc.nextInt();
				System.out.println("Division is" + numberThree);
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("Invalid input. Please enter digits only.");
				sc.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("Exception caught:" + e.getMessage());
				break;
			} catch (Exception e) {
				System.out.println("Exception caught:" + e.getMessage());
				break;
			}

		}
		sc.close();
	}

}
