package com.app.bean;



public class Student {
	private int prn;
	private String pass;
	private String fName;
	private String lName;
	private String email;
	private String branch;
	private String gender;
	private String dob;
	private String semister;
	private String course;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getPrn() {
		return prn;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getEmail() {
		return email;
	}

	public String getBranch() {
		return branch;
	}

	public String getGender() {
		return gender;
	}

	public String getDob() {
		return dob;
	}

	public String getSemister() {
		return semister;
	}

	public void setPrn(int i) {
		this.prn = i;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setSemister(String semister) {
		this.semister = semister;
	}

	public Student(int prn, String fName, String lName, String email, String branch, String gender, String dob,
			String semister) {
		super();
		this.prn = prn;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.branch = branch;
		this.gender = gender;
		this.dob = dob;
		this.semister = semister;
	}

	public Student(int prn, String pass, String fName, String lName, String email, String branch, String gender,
			String dob, String semister) {
		super();
		this.prn = prn;
		this.pass = pass;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.branch = branch;
		this.gender = gender;
		this.dob = dob;
		this.semister = semister;
	}

	public Student() {
		super();
	}

}
