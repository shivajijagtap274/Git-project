package com.basic;

public class StaticDemo {

	public static void display() {
		System.out.println("This is static display method");
	}
	
	public String show() {
		return "This is non static show method";
	}
	public static void main(String[] args) {
		StaticDemo.display();
		StaticDemo demo = new StaticDemo();
		demo.show();
	}
}
