package com.reflection_demo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DemoReflection {

	public static void main(String[] args) throws ClassNotFoundException {
		// how to use reflection...
		Emp emp = new Emp(7, "raj", 600000);

		// Class<?> clazz=emp.getClass();

		Class<?> clazz = Class.forName("com.reflection_demo.Emp");

		// hey i want all the method inforation of that clas
		Method[] methods = clazz.getDeclaredMethods();//getMethods()
		
		for (Method m : methods) {
			System.out.println(m.getName()+": "+ m.getParameterCount()+": "+ Modifier.toString(m.getModifiers()));
		}

	}
}






