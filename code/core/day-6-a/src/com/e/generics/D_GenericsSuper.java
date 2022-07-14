package com.e.generics;

import java.util.*;
//? super XXX
/*
 * 				Animal
 * 
 * 				Cat		Dog				
 * 							CostlyDog
 */
class Animal {
}

class Cat extends Animal {
}

class Dog extends Animal {
}

class CostlyDog extends Dog {
}

public class D_GenericsSuper {

	public static void main(String[] args) {

		List<Dog> dogs = new ArrayList<Dog>();

		dogs.add(new Dog());
		dogs.add(new CostlyDog());

		myMethod(dogs);
	}
	//PE  CS rule
	//super ie u can add the data(dog or costlydog) but can not iterate
	private static void myMethod(List<? super Dog> dogs) {
		dogs.add(new CostlyDog());
//		for(Dog dog: dogs) {
//			
//		}
		
	}
}





//dogs.add(new Cat());

		// i want a method that allow to even add an dog but dont allow iteration...
		// then
		// Anytype of dog is alled to be added...
