package com.ksg.java8code;

import java.util.Arrays;
import java.util.List;

public class java8multiplesof5 {

	 
	
	    public static void main(String[] args) 
	    {
	        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	         
	        listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
}
}