package com.ksg.operator;

public class NestConditionalOpeDemo1 {

	public static void main(String[] args) {

		  int a = 10;

	        int b = 20;

	        int x = (a > 50) ? 777 : ((b > 100) ? 888 : 999);

	        System.out.println(x);
	    
	}

}
