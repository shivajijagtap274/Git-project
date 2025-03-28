package com.string;

import java.util.Scanner;

public class StringDemo {

	private static String getStudentName(String name) {
		
		return name;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String  s = scanner.next();
		StringDemo demo = new StringDemo();
		demo.getStudentName(s);
		System.out.println(s);
	}
}
