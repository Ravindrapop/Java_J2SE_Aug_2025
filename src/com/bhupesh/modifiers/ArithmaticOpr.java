package com.bhupesh.modifiers;

public class ArithmaticOpr {
	
	public static void main(String[] args) {
		
		int i = 10+'b';
		
    	byte b = 15+'c';
		
		long l = 'a'+20;
		
		float f = 10+'d';
		
		double d = 10.25+'e';
		
		System.out.println(i+b-l*f/d);
		
		System.out.println(i+b);
		
		System.out.println(b-l);
		
		System.out.println(l*f);
		
		System.out.println(f/d);
		
	}
}
