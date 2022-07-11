package com.day3.session1.d.string_demo;

import java.util.Arrays;

import com.day3.common.Emp;

//clonning : deep copy vs shallow copy
//
final class MyImmClass {
	private final int i;
	private final String data;
	private final Emp emp;// is ref is final or object pointed by that ref is final
	private final int[] arr;

	public MyImmClass(int i, String data, Emp emp, int[] arr) {
		this.i = i;
		this.data = data;
		this.emp = emp;
		this.arr = Arrays.copyOf(arr, arr.length);
	}

	public int getI() {
		return i;
	}

	public String getData() {
		return data;
	}

	public Emp getEmp() {
		return new Emp(emp.getId(), emp.getName());
	}

	public int[] getArr() {
		return Arrays.copyOf(arr, arr.length);
	}

	public void print() {
		System.out.println("i :" + i);
		System.out.println("data :" + data);
		emp.print();
		System.out.println("values of array: ");
		for (int a : arr) {
			System.out.print(a + " ,");
		}

	}
}

public class B_HowToCreateImmutableObject {

	public static void main(String[] args) {
		int i = 88;
		String data = "my data";
		Emp emp = new Emp(121, "raja");
		int arr[] = { 5, 7, 8 };

		MyImmClass ob1 = new MyImmClass(i, data, emp, arr);
		ob1.print();
		
//		Emp e2=ob1.getEmp();
//		e2.setId(3333);
//		System.out.println("------------------");
//		ob1.print();
		
		int arr2[]=ob1.getArr();
		arr2[2]=6666;
		System.out.println("------------------");
		ob1.print();
		
		
	}

}
