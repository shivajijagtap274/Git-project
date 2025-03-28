package com.constructors;

public class Demo3 {

	Demo3(int id,String name,String city){
		
		// super();
		id = id;
		name=name;
		city=city;
		System.out.println(id);
		System.out.println(name);
		System.out.println(city);
	}
	public static void main(String[] args) {
		Demo3 demo = new Demo3(11,"karan","pune");
		
	}
}
