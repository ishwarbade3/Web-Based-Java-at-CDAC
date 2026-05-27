
package com.app.entity;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String title;
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
//	private Set<Student> students;
	// private List<Student> students;
	private Set<Student> students;

	public Course() {
		super();
	}

	public Course(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "Course: " + id + "\t" + title;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void add(Student c) {
		if (students == null)
			students = new HashSet<Student>();
		// students = new ArrayList<Student>();

		students.add(c);
	}

}
