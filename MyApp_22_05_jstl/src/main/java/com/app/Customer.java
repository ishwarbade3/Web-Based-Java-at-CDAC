package com.app;

import java.io.Serializable;


public class Customer implements Serializable {
	private String fName;
	private String lName;
	private String age;
	public Customer(String fName, String lName, String age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	public Customer() {
		super();
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public int getAge() {
		return age;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
