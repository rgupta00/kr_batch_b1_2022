package com.day1.session1.ex1;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

@FunctionalInterface
interface MyInterface {
	void foo(); // there should be only one abst method

	default public void fooDefault() {
		System.out.println("foo default");
	}

	public static void fooStatic() {
		System.out.println("foo statci");
	}
}

public class DemoFuncationalInterface {

	public static void main(String[] args) {
		
		//to print all the hidden in java
		
		Comparator<String> comp=( o1,  o2) ->o2.compareTo(o1);
			

		File dir=new File("//home/raj/Desktop/tools/sts-bundle");
		File[]files=null;
		if(dir.isDirectory()) {
			files=dir.listFiles(File::isHidden);
		}
		for(File file: files) {
			System.out.println(file.getName());
		}
		

		// What is functional interface?
		//They support lambda expression
		
		// ann inner class: type inference*
		
		MyInterface interface1=()-> System.out.println("foo method of MyInterface");
			
		//Runnable runnable=() ->System.out.println("job of the thread...");
			
		//Thread thread=new Thread(() ->System.out.println("job of the thread..."));
		
		

		/*
		 * What is functional interface? SAM(Single ast method )
		 * 
		 * @FunctionalInterface Interface and diamond problem and solution Interface
		 * evolution: default method , static method examples
		 */
	}
}
