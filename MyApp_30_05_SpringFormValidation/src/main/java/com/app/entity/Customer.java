package com.app.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
	private String fName;
	@NotNull
	@Size(min=1 ,message = "At Least ! char Require")
	private String lName;
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Customer() {
		super();
	}
	public Customer(String fName, @NotNull @Size(min = 1, message = "At Least ! char Require") String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + "]";
	}
	
	
	

}
