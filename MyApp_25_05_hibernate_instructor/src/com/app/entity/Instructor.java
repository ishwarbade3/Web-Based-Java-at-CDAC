package com.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table

public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String fName;
	@Column
	private String lName;
	@Column
	private String email;
	@Column
	private float salary;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="instructer_detail_id")
	private InstructorDetails instructorDetail;
	public Instructor(String fName, String lName, String email, float salary, InstructorDetails instructorDetail) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.salary = salary;
		this.instructorDetail = instructorDetail;
	}
	public Instructor(String fName, String lName, String email, float salary) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Inst" + id +"\t" + fName + "\t"+ lName +"\t" + email + "\t"+ salary + "\t" + instructorDetail;
	}
	
	
	

}
