package com.day1.session1.ex1.fun_interface_jdk;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.day1.session1.common.Employee;

public class DemoFI {

	public static void main(String[] args) {
		Employee employee1=new Employee(121, "raja", 5000000);
		
		Supplier<Employee> supplier=()-> new Employee(1, "raj", 6666);
		
		//?
		Supplier<RuntimeException> suppler = ()-> new RuntimeException();
		
		
		
		//Factory design pattern
		
//		Supplier<String> supplier=()-> "java training";
//		
//		System.out.println(supplier.get());
		
		
		
		
		//Consumer
//		Consumer<String> consumer= name-> System.out.println(name);
//			
//		BiConsumer<String, String> consumer2=
//				(name, address)-> System.out.println(name =" : "+ address);
//				
//		consumer.accept("java champs");
//		
//		
//		Employee employee1=new Employee(121, "raja", 5000000);
//		Employee employee2=new Employee(21, "ekta", 5090000);
//		
//		BiFunction<Employee, Employee, Double> biFunction=(e1,  e2)-> e1.getSalary()- e2.getSalary();
//			
//		System.out.println(biFunction.apply(employee2, employee1));
//		
		
		//BiPredicate<Integer, Integer> p2 = (n1, n2) -> n1 > n2;
		
		//e1, e2===> Double
		//we have 2 emp and we want diff of there salay (Double)

		// Function
//		Function<String, Integer> function = name-> name.length();
//		
//		Employee employee=new Employee(121, "raja", 5000000);
//		
//		Function<Employee, EmpData> fun= e-> new EmpData(e.getId(), e.getSalary());
//			
//	

		// if emp get salary more then 5500000: Predicate
//		
//		Predicate<Employee> predicateEmp=e-> e.getSalary()>5500000;
//		System.out.println(predicateEmp.test(employee));
//		//hey i want to get only name of the person : funcation
//			
//		Function<Employee, Double>functionEmp=e1->e1.getSalary();
//		
//		Double sal= functionEmp.apply(employee);
//		System.out.println(sal);

//		Predicate<String> pName=name-> name.contains("raj");
//		
//		System.out.println(pName.test("pan"));
//		
//		Predicate<Integer> predicate1= no-> no%2==0;
//		System.out.println(predicate1.test(441));
//		Predicate<Integer> predicate2= no-> no>7;
//		
//		Predicate<Integer> p3=predicate1.and(predicate2).negate();
//		System.out.println(p3.test(4));
	}

}
