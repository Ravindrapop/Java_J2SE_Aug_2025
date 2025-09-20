package com.shailendra.codingstandard;

public class EmployeeElc {
public static void main(String[] args) {
	Employee employee = new Employee(0, null, null);
	employee.setEmpId(101);
	employee.setEmpName("Shailendra Gurjar");
	employee.setEmpAddress("Noida");
	
	System.out.println(employee.getEmpId());
	System.out.println(employee.getEmpName());
	System.out.println(employee.getEmpAddress());
}
}
