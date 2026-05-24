package com.app.bean;


import lombok.NoArgsConstructor;



@NoArgsConstructor

public class Employee {
	private int id;
	private String fName;
	private String pass;
	private String email;
	private String gender;
	private String age;

	public Employee(String fName, String pass, String email, String gender, String age) {
		super();
		this.fName = fName;
		this.pass = pass;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getfName() {
		return fName;
	}

	public String getPass() {
		return pass;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public String getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
