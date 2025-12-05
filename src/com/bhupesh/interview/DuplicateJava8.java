package com.bhupesh.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateJava8 {

	public static void main(String[] args) {
		
		int[] arr = {4,4,5,6,7,2,3,4,6,7,7,6};
		Set<Integer> orignal = new HashSet<>();
		
		Set<Integer> duplicates = Arrays.stream(arr).boxed().filter(n -> !orignal.add(n)).collect(Collectors.toSet());
		
		System.out.println(duplicates);

	}

}
