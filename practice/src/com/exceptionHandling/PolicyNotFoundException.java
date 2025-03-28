package com.exceptionHandling;

public class PolicyNotFoundException extends RuntimeException{

	String message;
	
	
	public PolicyNotFoundException(String message) {
		super(message);
	}
}
