package com.mkv.operators;

public class Operator {

	public static void main(String[] args) {

		int a = 10, b = 5;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int divi = a / b;
		int modulus = a % b;

		System.out.println("Arithmetic Operators:");
		System.out.println("a + b = " + sum);
		System.out.println("a - b = " + sub);
		System.out.println("a * b = " + mul);
		System.out.println("a / b = " + divi);
		System.out.println("a % b = " + modulus);

		System.out.println("\nRelational Operators:");
		System.out.println('A'> 'a');
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println(a <= b);

		System.out.println("\nAssignment Operators:");
		int x = 'A';
		System.out.println("x = " + x);

		x += 5;
		System.out.println("x += 5 → " + x);

		x -= 3;
		System.out.println("x -= 3 → " + x);

		x *= 2;
		System.out.println("x *= 2 → " + x);

		x /= 4;
		System.out.println("x /= 4 → " + x);

		x %= 3;
		System.out.println("x %= 3 → " + x);
	}
}
