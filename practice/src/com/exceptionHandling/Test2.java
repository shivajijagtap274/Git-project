package com.exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("First line");
		System.out.println("second line");
		try {
		int a= 10/0;
		} catch (Exception e) {
			
			System.out.println(e);
			System.out.println("Arithmatic exception");
			
			
		}
		System.out.println("third line");
		
	}
}
