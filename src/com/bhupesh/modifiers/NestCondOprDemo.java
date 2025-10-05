package com.bhupesh.modifiers;

public class NestCondOprDemo {
	
	public static void main(String[] args) {
		
		int a = 15, b = 25;
		
		int i = (a>35)?444:((b>45)?555:666);
		
		System.out.println(i);
	}

}
