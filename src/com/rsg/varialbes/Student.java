package com.rsg.varialbes;

public class Student {
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Pooja");
		
		System.out.println(s1.id);
		
		System.out.println(s1.name);
		
		s1.m1();
		
	}
	
	
	public void m1() {
		
		System.out.println(id);
	}
	
	
	

}
