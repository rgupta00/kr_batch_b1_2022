package com.a.inner_classes.lambda;

interface Cookable{
	void cook();
}
public class C_AnnInnerClassVsLamda {
	
	public static void main(String[] args) {
		
		
//		Runnable  runnable=new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("--------");
//			}
//		};
//		
//		Runnable  runnable2=new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("--------");
//			}
//		};
//		
//		Runnable  runnable3=new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("--------");
//			}
//		};
		
		//funcational programming* => is a way to do declartive progrmming : how to do data processing in java as u are using SQL
		Runnable  runnable2= ()-> System.out.println("--------");
		Runnable  runnable3= ()-> System.out.println("--------");
		
			
		
		
		
		
		
//		
//		Cookable c=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("street food");
//			}
//		};
//		
//		c.cook();
//		
//		Cookable c2=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("hotel food");
//			}
//		};
//		
//		c2.cook();
//		
//		Cookable c3=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("home food");
//			}
//		};
//		
//		c3.cook();
	}

}
