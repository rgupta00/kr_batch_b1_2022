package com.solid.e.dip.prob1;

public class Car {
	
	private V8Engine engine;
	private MrfTyre tyre;
	
	public Car() {
		engine=new V8Engine();
		tyre=new MrfTyre();
	}
	
	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
