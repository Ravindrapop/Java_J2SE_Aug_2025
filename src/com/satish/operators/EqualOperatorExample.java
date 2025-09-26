package com.satish.operators;

public class EqualOperatorExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a == b); // true → values are same

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2); // false → different memory addresses
		System.out.println(s1.equals(s2)); // true → content is same
	}
}
