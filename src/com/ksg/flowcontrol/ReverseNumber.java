package com.ksg.flowcontrol;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int rem = 0;
		int reverse = 0;
		int number = 12345;
		
		while(number>0) {
			rem = number % 10;
			reverse = (reverse*10) + rem;
			number = number / 10;
			
		}
		System.out.println(reverse);
	}

}
