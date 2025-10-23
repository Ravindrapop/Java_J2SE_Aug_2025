package com.bhupesh.flowcontrol;
import java.util.Scanner;
public class LoopDemo {
	
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the number ");
		int i = b.nextInt();
		
	//	int n = 123;
		int total = 0;
		for(int temp = 0; i>0; ) {
			temp = i%10;
			total = total+temp;
			i = i/10;
		}
		System.out.println("sum of digit = " +total);
	}

}
