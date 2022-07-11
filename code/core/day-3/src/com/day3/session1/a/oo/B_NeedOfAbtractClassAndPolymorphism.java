package com.day3.session1.a.oo;

import java.util.Scanner;

/*
 * 
 * 					Shape
 * 
 * 		Square			Circle		Triangle
 */
abstract class Shape {
	
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public abstract   void draw() ;
}

class Square extends Shape {
	private String color;

	public Square(String color) {
		super(color);
	}

	public void draw() {
		System.out.println("b * h" + " color : "+ getColor());
	}
}

class Circle extends Shape {
	private String color;

	public Circle(String color) {
		super(color);
	}

	public void draw() {
		System.out.println("PI r* r" +" color : "+ getColor());
	}
}

public class B_NeedOfAbtractClassAndPolymorphism {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. for circle 2. Sqare");
		int choice = scanner.nextInt();

		Shape shape = null;

		if (choice == 1)
			shape = new Circle("red");
		else if (choice == 2)
			shape = new Square("red");

		if (shape != null)
			shape.draw();
		else
			System.out.println("wrong choice");

//		Shape shape2=new Shape("black");
//		shape2.draw();

	}
}
