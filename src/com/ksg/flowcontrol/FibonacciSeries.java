package com.ksg.flowcontrol;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 0;
		int second = 1;
		int n = 10;
	
		for(int i =1; i<=10; i++) {
			System.out.println(first+ " ");
			int next = first + second;
			first = second;
			second = next;
		}

	}

}
