package com.sg.operators;

public class EqualityOpeDemo2 {
	
public static void main(String[] args) {
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		
		System.out.println(t1==t2);
		
		Object obj = new Object();
		
		String s1 = new String("Rahul");
		
		System.out.println(obj==s1);
		
		System.out.println(obj!=s1);
		

	}

}
