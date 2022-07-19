package com.dp.creational.a.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton singleton=Singleton.getSingleton();
		System.out.println(singleton.hashCode());
		
		Class<?> clazz=Class.forName("com.dp.creational.a.singleton.Singleton");
		
		//it can even break the encapsulation
//		Constructor<?> constructor[]=clazz.getDeclaredConstructors();
//		
//		constructor[0].setAccessible(true);//hey even it is private i dont care ...i want to access it
//		
//		Singleton singleton2=(Singleton) constructor[0].newInstance();
//		
//		System.out.println(singleton2.hashCode());
		
		//cloning: what happens
//		Singleton singleton2=(Singleton) singleton.clone();
//		System.out.println(singleton2.hashCode());
		
		//ser process can break this
		
//		ObjectOutputStream oos=
//				new ObjectOutputStream(new FileOutputStream(new File("demo.ser")));
//		
//		oos.writeObject(singleton);
		
//		ObjectInputStream ois=
//				new ObjectInputStream(new FileInputStream(new File("demo.ser")));
//		
//		Singleton singleton2=(Singleton) ois.readObject();
//		System.out.println(singleton2.hashCode());
		
		
	}
}










