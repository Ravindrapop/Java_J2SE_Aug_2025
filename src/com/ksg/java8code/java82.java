package com.ksg.java8code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class java82 {
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("java","python","c","java script","html");
		listOfStrings.stream().sorted(Comparator.comparing(String:: length)).forEach(System.out::println);
		listOfStrings.stream().sorted(Comparator.comparing(String ::length).reversed()).forEach(System.out::println);
	}

}
