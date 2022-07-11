package com.day3.session1.d.string_demo;

import com.day3.common.Emp;

class EmpApi{
	public static void processsEmpObject(final Emp emp) {
		//object state can still be change... ref can not be chage
		emp.setId(300000);
	}
}
public class C_FinalVariableArgument {
	
	
	public static void main(String[] args) {
		Emp emp=new Emp(1212, "raja");
		
		emp.print();
		
		EmpApi.processsEmpObject(emp);
		
		emp.print();
		
	}

}
