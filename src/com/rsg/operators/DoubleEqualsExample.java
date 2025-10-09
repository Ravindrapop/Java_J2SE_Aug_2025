package com.rsg.operators;

public class DoubleEqualsExample {

	public static void main(String[] args) {

		int x = 10;
		
		int y = 10;
		
		int z = 20;
		
		System.out.println(x == y); //true (values are equal)
		
		System.out.println(x == z); // false (values are different)
		
		
		String s1 = new String("Ankit");
		
		String s2 = new String("Ankit");
		
		String s3 = s1;
		
		System.out.println(s1 == s2);
		
		System.out.println(s1 == s3);
		
	}

}
