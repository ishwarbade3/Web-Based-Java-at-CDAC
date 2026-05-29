package com.app;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("2006")
	private int id;
	//@Value("Vaishuuuuuu")
	@Value("${student.name}")
	private String name;
	@Value("NA")
	private String course;
	@Value("Stoling")
	private String job;

	public Student() {
		super();
	}

	public Student(int id, String name, String course, String job) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.job = job;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public String getJob() {
		return job;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Student : " + id + "  " + name + "  " + course + "  " + job;
	}

}
