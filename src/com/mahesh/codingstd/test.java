package com.mahesh.codingstd;

public class test {

	public static void main(String[] args) {

		Employee emp1 = new Employee(0, null);
		Employee emp2 = new Employee(0, null);
		System.out.println(emp1.hashCode());

		System.out.println(emp1.getId());

		System.out.println(emp1.getName());

		emp1.setId(101);
		emp1.setName("Mahesh");
		emp2.setId(102);
		emp2.setName("raj");

		System.out.println(emp1.getId() + "\n" + emp1.getName());
		System.out.println(emp2.getId() + "\n" + emp2.getName());

	}

}
