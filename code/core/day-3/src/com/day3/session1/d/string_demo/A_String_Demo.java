package com.day3.session1.d.string_demo;

public class A_String_Demo {

	public static void main(String[] args) {
		
		String data2="a"+"b"+"c";
		//what is the best way to cat.... of the string
		
		String data2Cat= new StringBuilder().append("a").append("b").append("c").toString();
		
		
		
		String data="    data  ";
		data=data.trim();
		
		
		
		
		//String vs						 StringBuilder vs StringBuffer
		
		//immutable						mmutable
									//StringBuilder : is faster : builder design pattern*
//		String s="raj";
//		
//		//jar : tech term in java: java arch
//		
//		String sRev= new StringBuilder().append("raj").reverse().toString();
//		System.out.println(sRev);
		
		
		//string are immutables
		
//		String s2 = "foo";
//		s2.toUpperCase();
//		System.out.println(s2);
//		
		
		
		//---------- == used to check the phyical address
		
//		String s1 = new String("foo");
//		String s2 = "foo";
//		if (s1.equals(s2))
//			System.out.println("Are eq");
//		else
//			System.out.println("not eq");
		
		
		
//		String s1 = new String("foo");
//		System.out.println(s1.hashCode());
		
		//---------- == used to check the phyical address
		
//		String s1 = new String("foo");
//		String s2 = "foo";
//		if (s1 == s2)
//			System.out.println("Are eq");
//		else
//			System.out.println("not eq");

	}
}
