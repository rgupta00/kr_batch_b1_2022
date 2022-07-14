package com.f.generics2;

import java.util.Collections;

// i want a glass that can hold any drinkable liquid
interface Liquid{	
}

interface Drinkable{	
}
class Water implements Liquid, Drinkable{
}

class Petrol implements Liquid{
}

class Cake {
}

class Juice implements Liquid{
}

class Glass<T extends Liquid & Drinkable> {
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

}

public class F_GenericsExampleGlassWater {

	public static void main(String[] args) {
		Glass<Water> glass=new Glass<>();
		
	}

}
