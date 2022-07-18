package com.solid.e.dip.prob1.step2;

public class Demo {

	public static void main(String[] args) {
		//IOC container : Spring , Anular services... 
		Engine engine = new V8Engine();
		Tyre tyre = new CeatType();

		Car car = new Car(engine, tyre);

		car.drive();
	}
}
