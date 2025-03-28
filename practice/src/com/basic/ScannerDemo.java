package com.basic;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int x = scanner.nextInt();
		System.out.println("Please enter name");
		String name = scanner.next();
		
		System.out.println("Entered data");
		System.out.println(x);
		System.out.println(name);
		
	}
}
