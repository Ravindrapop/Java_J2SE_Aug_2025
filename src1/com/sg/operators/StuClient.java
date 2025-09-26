package com.sg.operators;

public class StuClient {
	
public static void main(String[] args) {
		
		Student s1 = new Student(1,"Sangam");
		
		Student s2 = new Student(1, "Sangam");
		
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Gurjar");
		String s4 = new String("Gurjar");
		
		
		System.out.println(s3==s4);
		
		System.out.println(s3.equals(s4));

	}

}
