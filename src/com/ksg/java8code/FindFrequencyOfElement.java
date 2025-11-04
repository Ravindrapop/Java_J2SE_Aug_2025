package com.ksg.java8code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindFrequencyOfElement {
	
	public static void main(String[] args) {
		
		List<String> StationaryList = Arrays.asList("pen","eraser","pencil","notebook","pen","pencil","eraser");
		Map<String,Long> StationaryCountMap = StationaryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		 System.out.println(StationaryCountMap);
    
	}

}
