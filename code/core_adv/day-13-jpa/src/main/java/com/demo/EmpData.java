package com.demo;

public class EmpData {
	
	private int id;
	private String name;
	
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
	public EmpData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public EmpData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmpData [id=" + id + ", name=" + name + "]";
	}
	
	
}
