package com.superkeyword;

public class Child extends Parent{

	int x = 25;
	public void test() {
		int x = 30;
		Parent p = new Parent();
		System.out.println("Parent class x variable="+p.x);
		System.out.println("Immediate super class of child class z variable"+super.x);
	}
	
}
