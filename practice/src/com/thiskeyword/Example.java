package com.thiskeyword;

public class Example {

	Example(){
		this("Java");
		System.out.println("Inside constructor without parameter");
	}
	Example(String str){
		System.out.println("Inside constructor with parameter"+str);
	}
	public static void main(String[] args) {
		Example obj = new Example();
	}
}
