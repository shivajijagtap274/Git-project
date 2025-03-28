package com.exceptionHandling;

public class Policy {

	int id =10;
	String name = "kiran";
	String city = "pune";
	
	public void findPolicy() {
		
		if(id == 11) {
			
			System.out.println("Policy is available");
			
		    	
		} else {
			throw new PolicyNotFoundException("Sorry policy unavailable");
		}
	}
	public static void main(String[] args) {
		Policy policies = new Policy();		
		
		
		policies.findPolicy();
	}
}
