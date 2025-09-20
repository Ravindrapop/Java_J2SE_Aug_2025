package com.ksg.java8code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8MinAndMax {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(35,56,67,78,12,34);
		int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Maximum Element : "+ max);
		
		int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Minimum Element :"+ min);
		
	}
}
