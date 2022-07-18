package com.day1.session2.ex6;

import java.util.Optional;

class Insurance {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Car {
	private Insurance insurance;

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

}

class Person {
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
/*
 * may have a may hv ins but must have name Person -----> Car---> Insurance-->
 * name
 */

public class DemoOptional {

	public static void main(String[] args) {

		Insurance insurance=new Insurance();
		insurance.setName("comviva");
		
		Car car=new Car();
		car.setInsurance(insurance);
		
		Person person =new Person();
		person.setCar(car);
		
		printInsuranceName(person);
	}
	
	
	public static void printInsuranceName(Person person) {
		String insuranceName=person.getCar().getInsurance().getName();
		System.out.println(insuranceName);
	}
	
	
}






