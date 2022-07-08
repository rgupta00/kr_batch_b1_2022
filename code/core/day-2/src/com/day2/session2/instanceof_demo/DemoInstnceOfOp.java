package com.day2.session2.instanceof_demo;

abstract class Animal {
	abstract public void sound();
}
class Cat extends Animal {
	public void sound() {
		System.out.println("meaou...: ");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("bho bho...: ");
	}
	public void nightwatchManShip() {
		System.out.println("bho bho jagat raho...: ");
	}
}
class CostlyDog extends Dog {
	public void sound() {
		System.out.println("bho bho..with style.: ");
	}
	public void nightwatchManShip() {
		System.out.println("bho bho jagat raho.with style..: ");
	}
}
public class DemoInstnceOfOp {

	public static void main(String[] args) {
		Animal []animals=getAnimals();
		
		for(Animal animal: animals) {
			animal.sound();
			//hey compiler shut up...i m telling u it is dog
			if(animal instanceof Dog)
			((Dog) animal).nightwatchManShip();	//typecasting		ClassCastException
		}
		//instanceof
	}

	
	
	
	
	
	
	
	
	
	//some other team member
	static Animal [] getAnimals() {
		Animal []animals= {new Dog(), new Dog(), new Cat(), new Dog(),new CostlyDog()};
		return animals;
	}

}
