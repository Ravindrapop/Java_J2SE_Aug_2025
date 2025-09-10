package com.rsg.varialbes;

public class Example3 {
	
	public int add(int a, int b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		
		Example3 obj =  new Example3();
		
		int sum = obj.add(10,20);
		
		System.out.println(sum);

	}

}
