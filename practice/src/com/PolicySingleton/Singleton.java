package com.PolicySingleton;

public class Singleton {
 //static Singleton instance;
 //public static Singleton getObject() {
//	 instance = new Singleton();
	// return instance;
 //}
 public static void main(String[] args) {
	 PolicySingleton policy = PolicySingleton.getPolicySingletonInstance();
	 
	 
	 PolicySingleton policy2 = PolicySingleton.getPolicySingletonInstance();
	 System.out.println(policy.hashCode());
	 System.out.println(policy.hashCode());
 }
	
}
