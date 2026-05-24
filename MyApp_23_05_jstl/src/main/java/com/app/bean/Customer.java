package com.app.bean;

import java.io.Serializable;

public class Customer implements Serializable {
	private String fName;
	private String lName;
	private int age;
	private boolean status;

	public Customer(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public Customer(String fName, String lName, int age, boolean status) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
