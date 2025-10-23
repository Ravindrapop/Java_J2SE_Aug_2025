package com.ksg.java8code;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Java8ReverseEachCode {
	
	public static void main(String[] args) {
		
		String str = "java concept of the day";
		
		String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
		
		System.out.println(reversedStr);
	}

}
