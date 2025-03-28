package com.basic;

import java.util.Scanner;

public class ScannerDemo2 {

	int a;
	int b;
	public int add() {
		adds = a+b;
		return adds;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ScannerDemo2 demo = new ScannerDemo2();
		demo.a = scanner.nextInt();
		demo.b = scanner.nextInt();
		demo.add();
	}
}
