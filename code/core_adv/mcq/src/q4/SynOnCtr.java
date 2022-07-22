package q4;
/*
 * synchronized keyword is/are invalid for
    A. Instance methods
    B. Class methods
    C. Constructors
    D. Initializers
 */
class Demo{
	
//	synchronized Demo(){
//		
//	}
	  static public void fooStatic() {
		  synchronized (Demo.class) {
			  System.out.println("it is normal function fooStatic");
		}
		
	}
	synchronized public void foo() {
		System.out.println("it is normal function foo");
	}
}
public class SynOnCtr {

	public static void main(String[] args) {
		Demo d=new Demo();
	}
}
