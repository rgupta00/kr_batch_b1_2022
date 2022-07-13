package com.a.collections.list;
import java.util.*;
/*
 * List: AL, LL, Vector
 * java 5: generics
 */
public class A_ArrayList_Demo {

	public static void main(String[] args) {
			//List<String> list=new ArrayList<String>();
			//List<String> list=new LinkedList<String>();
	
		
		
		//hetrogenous ds
//		List list=new ArrayList();
//		list.add("foo");
//		list.add(4);
//		list.add(new Employee(1, "raj", 500000));
//		
//		//
//		Employee e=(Employee) list.get(1);
		
		

		//Generics is a compile time safty net?
		List<String> list=new ArrayList<>(100);
		list.add("foo");
		list.add("raj");
		list.add("anita");
		
		
		
		
		
		
		
		//iterator : cursor : Iterator, ListIteator, Enumeration (X)
		System.out.println("--------using iterator print,delete---------");
		ListIterator<String> it=list.listIterator(list.size());
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
				
		
//		//iterator : cursor : Iterator, ListIteator, Enumeration (X)
//		System.out.println("--------using iterator print,delete---------");
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		System.out.println("----using enhane for loop-print---");
		//how to print them: enhance for loop: syntex suger* over iterator concepts!
		for(String name: list) {
			System.out.println(name);
		}
		
	}
}
