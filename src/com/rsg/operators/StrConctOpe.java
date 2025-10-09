package com.rsg.operators;

public class StrConctOpe {

	public static void main(String[] args) {
		
		int a=10, b=20, c=30;
		
		String d = "Ankit";
		
		System.out.println(a+b+c+d); // 60Ankit
		
		System.out.println(a+b+d+c); //30Ankit30
		
		System.out.println(d+a+b+c); //Ankit102030
		
		System.out.println(a+d+b+c); // 10Ankit2030

	}

}
