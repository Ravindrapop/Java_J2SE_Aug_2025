package com.rsg.operators;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		
		
		/*
		 * Iterator<Integer> itr = list.iterator();
		 * 
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
		
		list.forEach((e)->{System.out.println(e);});
		

	}

}
