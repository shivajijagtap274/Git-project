package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2 {

	public static void main(String[] args) throws Exception{
		Policy policy = new Policy();
		FileInputStream fis = new FileInputStream("C:\\Users\\Shivaji\\Desktop\\serializableTest.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		Policy policies = (Policy) o;
		System.out.println(policies.getId());
		System.out.println(policies.getName());
		System.out.println(policies.getCity());
		fis.close();
		ois.close();
	}
}
