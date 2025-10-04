package com.ksg.java8code;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CodeSumOfAllDigit {

	public static void main(String[] args) {

		int i = 234567;
		
		Integer SumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(SumOfDigits);
	}

}
