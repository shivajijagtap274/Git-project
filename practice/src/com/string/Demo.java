package com.string;

public class Demo {

	public static void main(String[] args) {
		String name = "shantanu";
		String city = new String("bangalore");
		
		city = name;
		System.out.println(name == city);
		System.out.println(name.equals(city));
	}
}
