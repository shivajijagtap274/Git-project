package com.map;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		HashMap<Employee,String> hashMap = new HashMap<Employee,String>();
		Employee employee = new Employee();
		hashMap.put(employee,employee.getSalary());
	//	hashMap.put(employee, employee.getName());
		System.out.println(hashMap.get(employee));
		System.out.println(hashMap.get(employee));
	}
}
