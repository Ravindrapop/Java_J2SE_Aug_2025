package com.ksg.java8code;

import java.util.stream.IntStream;

public class Java8SumOfTenNaturalNo {

	public static void main(String[] args) {
		
		    {
		        int sum = IntStream.range(1, 11).sum();
		         
		        System.out.println(sum);
	}

}
}