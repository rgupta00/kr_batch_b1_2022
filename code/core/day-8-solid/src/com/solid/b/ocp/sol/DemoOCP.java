package com.solid.b.ocp.sol;
@FunctionalInterface
interface Operation{
	public int apply(int a, int b);
}
//O:OCP: 
 class Calculator{
	static int operate ( int a , int b, Operation operation) {
		return operation.apply(a, b);
	}
	
}
public class DemoOCP {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		
//		Operation addOp=(a,b)-> a+b;
		
		Operation diffOp=(a,b)-> a-b;
		
		System.out.println(Calculator.operate(2, 3, diffOp));
		
	}
}
