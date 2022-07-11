package com.day3.session1.a.oo;

interface Flyable{
	public void fly() ;
}
interface Swimable{
	public void swim() ;
}
class Bird {
	public void sound() {
		System.out.println("sound of a bird");
	}

	public void eat() {
		System.out.println("bird  is eating");
	}

}

class Emu extends Bird {

}

class XYZ extends Bird implements Swimable, Flyable{
	@Override
	public void swim() {
		System.out.println("swim like anything...");
	}

	public void fly() {
		throw new NullPointerException();
	}
}


class Duck extends Bird implements Swimable{
	@Override
	public void swim() {
		System.out.println("swim like anything...");
	}

	public void fly() {
		throw new NullPointerException();
	}
}

class Eagle extends Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("fly like anything...");
	}
}

public class E_InterfaceImproveTheDesign {

	public static void main(String[] args) {

		Emu d = new Emu();
		
	}
}
