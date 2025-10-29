package com.sg.flowcontrol;

public class FibbonacciSeries {

	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		int n = 10;
		
		System.out.println("Fibbonacci Series");
		
		for(int i = 0; i <= n; i++){
			
			System.out.print(first+" , ");
			
			int next = first + second;
			 first = second;
			second = next;
		}

	}

}
