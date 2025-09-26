package com.as.operator;

public class StudentTest {
	
	public static void main(String[] args) {

		Student s1 = new Student(01, "Harry");

		Student s2 = new Student(01, "Harry");

		System.out.println(s1 == s2);

		System.out.println(s1.equals(s2));

		String st1 = new String("Tom");

		String st2 = new String("Tom");

		System.out.println(st1 == st2);

		System.out.println(st1.equals(st2));

	}

}
