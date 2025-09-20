package com.ksg.java8code;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8SumOfAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 156784;
		Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfDigits);
	}

}
