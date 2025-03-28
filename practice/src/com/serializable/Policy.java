package com.serializable;

import java.io.Serializable;

public class Policy implements Serializable{

	private int id;
	private String name;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String toString() {
		return "id="+id+"name="+name+"city="+city;
	}
}
