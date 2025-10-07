package com.rsg.operators;

public class StuClient {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Hari");
		
		Student s2 = new Student(101,"Hari");
		
//		System.out.println(s1==s2);
		
//		System.out.println(s1.equals(s2));
		
		
		String str1 = new String("Ram");
		String str2 = new String("Ram");
		
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str2));
		
		Object obj = new Object();

		String strr = new String("Hari");
		
		System.out.println(10/0);
		
	}

}
