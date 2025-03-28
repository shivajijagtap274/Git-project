package com.accessSpecifiers;

public class Test {

	void show(int a) {
		System.out.println("int");
	}
	void show(String s) {
		System.out.println("String");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show('c');
	}
}
