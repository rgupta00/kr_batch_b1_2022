package com.f.generics2;

import java.util.*;
//how to write generics method

import com.a.collections.common.Employee;

public class H_genericsMethod {

	public static void main(String[] args) {

		Integer a = 2;
		Integer b = 96;
		Integer c = 26;

		Integer maxValue = max(a, b, c);

		
		Employee e1=  new Employee(1, "raj", 8000000);
		Employee e2=  new Employee(1, "ekta", 980000);
		Employee e3=  new Employee(1, "gunika", 890000);
		
		Employee maxEmp= max(e1, e2, e3);
		
		System.out.println(maxValue);
		System.out.println(maxEmp);
	}

	private static <T extends Comparable<T>>  T max(T a, T b, T c) {
		T max = a;
		if (b.compareTo(a) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		return max;
	}

}
