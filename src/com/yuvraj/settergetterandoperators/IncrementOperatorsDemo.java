package com.yuvraj.settergetterandoperators;

public class IncrementOperatorsDemo {

	public static void main(String[] args) {

		// PreIncrement Operator Demo
		int x = 10;
		int y = ++x;
 
		System.out.println(x+" and "+y);
		System.out.println("final value of x = " + x);
		System.out.println("final value of y = " + y);
 
		// PostIncrement Operator Demo
		int a = 5;
		int b = a++;

		System.out.println(a+" and "+b);
		System.out.println("final value of a = " + a);
		System.out.println("final value of b = " + b);

	}

}
