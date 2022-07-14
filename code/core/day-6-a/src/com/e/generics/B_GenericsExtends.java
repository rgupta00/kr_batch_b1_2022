package com.e.generics;

import java.util.*;

import com.a.collections.common.Employee;

public class B_GenericsExtends {

	public static void main(String[] args) {
		// <? extends xxx>
		// <? super xxx>
		List<Employee> elist = new ArrayList<>();
		elist.add(new Employee(1, "raj", 80000));
		
		List<Integer> list = new ArrayList<>();
		list.add(44);
		list.add(4);
		list.add(64);
		list.add(7);

		List<Double> dlist = new ArrayList<>();
		dlist.add(44.99);
		dlist.add(4.8);
		dlist.add(64.3);
		dlist.add(7.4);
//		
		printList(list);
		printList(dlist);
		printList(elist);

	}

	// ? extends XXX hey java we can pass any list whose member have something to do
	// with Number
	//u can only print it but can not modify the list 
//	static void printList(List<?> list) {
//		//list.add(e)
//		for (Object temp : list) {
//			System.out.println(temp);
//		}
//	}
	
	//List<? extends Object> list vs List<? > list are same
	static void printList(List<? extends Object> list) {
	//list.add(e)
	for (Object temp : list) {
		System.out.println(temp);
	}
}

}
