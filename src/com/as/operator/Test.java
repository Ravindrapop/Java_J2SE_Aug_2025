package com.as.operator;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee(100, "ABC");

		int a = employee.getId();
		System.out.println(a);
		String n = employee.getName();
		System.out.println(n);

		System.out.println(employee.toString());
	}

}
