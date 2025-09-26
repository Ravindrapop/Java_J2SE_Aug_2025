package com.ksg.operator;

public class RelationalExamDemo {

	public static void main(String[] args) {
		
		int x = 15; int y = 20; int z = 15;
		
		 System.out.println("x == z : " + (x == z));   // true
	        System.out.println("x != y : " + (x != y));   // true
	        System.out.println("y > x : " + (y > x));     // true
	        System.out.println("x < y : " + (x < y));     // true
	        System.out.println("x >= z : " + (x >= z));   // true
	        System.out.println("y <= z : " + (y <= z));   // false
	}

}
