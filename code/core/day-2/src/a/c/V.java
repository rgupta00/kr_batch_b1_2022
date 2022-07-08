package a.c;

import a.b.*;	//classloader load the class on demand basis

public class V extends A{

	//here we have overriding and increase the vis
	public void fooProtected() {
		System.out.println("public method ");
	}
	
	public static void main(String[] args) {
		 V v=new V();
		 v.fooProtected();
		 System.out.println(v.c);
	}
}
