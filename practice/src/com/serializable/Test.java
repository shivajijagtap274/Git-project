package com.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test  {

	public static void main(String[] args) throws Exception{
		Policy policy = new Policy();
		policy.setId(14);
		policy.setName("Ravikiran");
		policy.setCity("Bengaluru");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shivaji\\Desktop\\serializableTest.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(policy);
		fos.close();
		oos.close();
		
		
		
		
		
		
	}
}
