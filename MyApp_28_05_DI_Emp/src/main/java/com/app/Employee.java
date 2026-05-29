package com.app;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Date date;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getDate() {
		return date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee : " + id + "  " + name + "  " + salary + "  " + date;
	}

}
