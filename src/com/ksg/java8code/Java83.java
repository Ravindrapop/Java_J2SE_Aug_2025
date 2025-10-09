package com.ksg.java8code;

import java.util.Arrays;

public class Java83 {

	public static void main(String[] args) {

		int [] a = new int []{45, 12, 56, 15, 24, 75, 31, 89};
		int sum = Arrays.stream(a).sum();
		System.out.println("sum: " +sum);
		
		double average = Arrays.stream(a).average().getAsDouble();
		System.out.println("average:" + average);
		
	}

}
