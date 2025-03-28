package com.array;

public class Test {

	public static void main(String[] args) {
		Student []arr;
		arr = new Student[5];
		arr[0] = new Student(1,"aman");
		arr[1] = new Student(2,"suman");
		arr[2] = new Student(3,"kamal");
		arr[3] = new Student(4,"madan");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at"+i+arr[i].rollNo + arr[i].name);
		}
	}
}
