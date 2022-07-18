package com.solid.d.isp;
// "sepeate what varies"
interface Flyable{
	public void fly() ;
}
interface Swimmable{
	public void swim() ;
}
class Bird{
	public void eat() {
		System.out.println("eat...");
	}	
}

class Duck extends Bird implements Swimmable{

	public void swim() {
		System.out.println("swim like a god");
	}
}

class Eagle extends Bird implements Flyable{

	public void fly() {
		System.out.println("fly like a god");
	}
}

class Emu extends Bird{
	public void eat() {
		System.out.println("eat slow...");
	}	
}

public class AnimalEx {

	public static void main(String[] args) {
		
	}
}
