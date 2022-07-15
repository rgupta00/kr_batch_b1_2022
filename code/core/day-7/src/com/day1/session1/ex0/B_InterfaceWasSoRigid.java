package com.day1.session1.ex0;

//interface  evoluation
// x
interface ImpInterface {
	void foo();

	default void bar() {
		System.out.println("it is a default method of inteface");
	}

	public static void fooStatic() {
		System.out.println("foo static method of ImpInterface");
	}
}

abstract class UKG implements ImpInterface {
	@Override
	public void foo() {
		System.out.println("imp done by UKG :)");
	}

	abstract public void bar();
}

class IbmImp implements ImpInterface {
	@Override
	public void foo() {
		System.out.println("imp done by ibm :)");
	}
}

public class B_InterfaceWasSoRigid {

	public static void main(String[] args) {
		IbmImp imp=new IbmImp();
		//imp.fooStatic();
	}
}
