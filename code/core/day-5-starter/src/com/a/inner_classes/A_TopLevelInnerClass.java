package com.a.inner_classes;

class Outer {
	private int i = 44;
	
	 class Inner {
		private int i = 494;
		void foo() {
			System.out.println("foo method of Inner class : " + Outer.this.i);
		}
	}
	//	Non static method				"this"
	 public void doOuter() {
		 Inner inner=this.new Inner();
		 inner.foo();
	 }
	 
//	 public static  void doOuterStatic() {
//		 Inner inner=new Inner();
//		 inner.foo();
//	 }
}

public class A_TopLevelInnerClass {

	public static void main(String[] args) {
//		Outer.Inner inn=new Outer().new Inner();
//		inn.foo();
	}
}
