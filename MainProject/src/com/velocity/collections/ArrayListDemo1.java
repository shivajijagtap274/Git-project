package com.velocity.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("manav");
		al.add("prani");
		al.add("itihas");
		Iterator<String> it = al.iterator();
		System.out.println(it.next());
		
		System.out.println("Using for each method");
		for(String s : al) {
			System.out.println(s);
		}
	}
}
