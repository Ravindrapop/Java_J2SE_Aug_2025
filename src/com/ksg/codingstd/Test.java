package com.ksg.codingstd;

public class Test {
	
	public static void main(String[] args) {
		
     Student student1 = new Student();
		
		
		System.out.println(student1.hashCode());
		
		System.out.println(student1.getId());
		
		System.out.println(student1.getName());
		
		student1.setId(101);
		student1.setName("Sangam");
		
		System.out.println(student1.getId());
		System.out.println(student1.getName());

	}
		
	}


