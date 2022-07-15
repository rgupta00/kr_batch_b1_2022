package com.day1.session1.common;

public class EmpData {
	private int id;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmpData(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public EmpData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmpData [id=" + id + ", salary=" + salary + "]";
	}
	
	
	
}
