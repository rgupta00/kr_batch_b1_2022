package com.a.collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class D_LL_Employee_Sort {

	public static void main(String[] args) {
		
		List<Employee>  list=new ArrayList<Employee>();
		list.add(new Employee(1, "raj", 3900000.0));
		list.add(new Employee(12, "raj",4000000.0));
		list.add(new Employee(129, "keshav", 45555.0));
		list.add(new Employee(122, "rashim", 790000.0));
		
		printEmps(list);
		
		Collections.sort(list);
		System.out.println("================employee record sorted as per id==============");
		printEmps(list);
		
		Collections.sort(list, new NameAndThenSalarySorter());
		System.out.println("================employee record sorted as per name==============");
		printEmps(list);
		
		//Anno inner class
		Comparator<Employee> comparator=new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.getSalary(), o1.getSalary());
			}
		};
		
		
		Collections.sort(list, comparator);
		System.out.println("================employee record sorted as per salary==============");
		printEmps(list);
		
	}

	static void printEmps(List<Employee> list) {
		Iterator<Employee> emp=list.iterator();
		while(emp.hasNext()) {
			System.out.println(emp.next());
		}
	}

}
