package com.a.object_class.clone;

import java.util.Date;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private double salary;
	private Date date; // mutable object

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Employee(int id, String name, double salary, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}

	public Employee(Employee employee) {
		this.id = employee.id;
		this.name = employee.name;
		this.salary = employee.salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return name.length();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	// deep copy and shallow copy, seriliazation*
	//1. seriliazation is also a way to do deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employee= (Employee) super.clone();
		Date date=(Date) employee.getDate().clone();
		employee.setDate(date);
		return employee;
	}

}






