package com.PolicySingleton;

public class PolicySingleton {

	private PolicySingleton() {
		
	}
	private static PolicySingleton instance;
	public static PolicySingleton getPolicySingletonInstance() {
		if(instance == null) {
			instance = new PolicySingleton();
		} else {
			return instance;
		}
		return instance;
	}
}
