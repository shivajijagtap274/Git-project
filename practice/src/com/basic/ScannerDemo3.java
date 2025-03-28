package com.basic;

import java.util.Scanner;

public class ScannerDemo3 {

	public void add(int a,int b) {
		 int c = a+b;
		 System.out.println(c);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		ScannerDemo2  demo = new ScannerDemo2();
		int z = demo.add(firstNumber,secondNumber);
		System.out.println(z);
		
		
	}
}
