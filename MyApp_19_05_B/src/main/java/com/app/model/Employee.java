package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	private int id;
	private String fName; 
	private String pass; 
	private String email; 
	private String gender; 
	private String age; 
	
	public void display() {
		System.out.println(id +" "+fName+" "+pass+" "+email+" "+gender+" "+age);
	}

}
