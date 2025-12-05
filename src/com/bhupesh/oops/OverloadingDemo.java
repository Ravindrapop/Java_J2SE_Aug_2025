package com.bhupesh.oops;

public class OverloadingDemo {
	
	public void m1(char c) {
		
		System.out.println("this is a char type argument");
	}

	public void m1(String a) {

		System.out.println("this is a String type argument");
	}

	public void m1(float f) {

		System.out.println("this is a float type argument");
	}

	public static void m1(double d) {             //The static method m1(double) from the type OverloadingDemo should be accessed in a static way

		System.out.println("this is a double type argument");
	}

	public void m1(int i) {

		System.out.println("this is a int type argument");
	}

	public void m1(long l) {

		System.out.println("this is a long type argument");
	}
	
	public static void main(String[] args) {
		
		OverloadingDemo od = new OverloadingDemo();
	//	OverloadingDemo.m1(0.0);
		od.m1(0.0);
	//	od.m1(10);
	//	od.m1('a');
	}

}
