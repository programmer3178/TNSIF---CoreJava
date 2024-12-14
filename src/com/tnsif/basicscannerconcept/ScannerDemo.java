package com.tnsif.basicscannerconcept;

/**
 *
 * @author sys
 */
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello" + name);
    }

}
