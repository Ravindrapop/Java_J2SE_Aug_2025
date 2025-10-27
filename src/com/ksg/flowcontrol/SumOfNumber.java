package com.ksg.flowcontrol;

public class SumOfNumber {

	public static void main(String[] args) {

		int rem = 0;
		int sum = 0;
		int number = 13579;
		
		while(number>0) {
			rem = number%10;
			sum = sum + rem;
			number = number/10;
			
		}
		System.out.println(sum);
	}

}
