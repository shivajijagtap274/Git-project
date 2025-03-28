package com.thiskeyword;

public class Child extends Parent{

	int x = 25;
	void test() {
		int x = 30;
		Child c = new Child();
		System.out.println("By createing objects="+c.x);
		System.out.println("By using this keyword="+this.x);
	}
}
