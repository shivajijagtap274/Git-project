package com.constructors;

public class Demo {

	String name;
	Demo (){
		System.out.println("This is default constructor");
	}
	public static void main(String[] args) {
			
		Demo demo = new Demo();
		System.out.println(demo.name);
	
	}
}
