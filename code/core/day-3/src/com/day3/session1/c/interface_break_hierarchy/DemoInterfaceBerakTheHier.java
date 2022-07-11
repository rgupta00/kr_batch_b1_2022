package com.day3.session1.c.interface_break_hierarchy;
//interface  break the hierarchy

interface Jumpable {
	public void canJump();
}

class Monkey implements Jumpable {
	public void stayOnTree() {
		System.out.println("i love staying on tree");
	}

	public void biteTheKid() {
		System.out.println("i love biteTheKid");
	}

	@Override
	public void canJump() {
		System.out.println("i am the champ forget about me");
	}
}

class Kid implements Jumpable{
	public void goToSchool() {
		System.out.println("going to school :(");
	}

	@Override
	public void canJump() {
		System.out.println("i am the champ u dnot know");
	}
}

public class DemoInterfaceBerakTheHier {

	public static void main(String[] args) {

		Kid kid = new Kid();
		kid.goToSchool();
		kid.canJump();
	}
}
