package com.empapp.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp")
public class Employee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	
}
