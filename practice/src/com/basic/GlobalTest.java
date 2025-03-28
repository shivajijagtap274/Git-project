package com.basic;

public class GlobalTest {

	public void show() {
		int x=10;
		System.out.println(x);
	}
	public static void main(String[] args) {
		GlobalTest test = new GlobalTest();
		test.show();
	}
}
