package com.bhupesh.modifiers;

public class BitWiseOprDemo {
	
	public static void main(String[] args) {
		
		int a = 40;
		
		int b = 50;
		
		if(++a>40 & ++b<50) {
			++a;
		}else {
			++b;
		}
		
		System.out.println(a+" "+b);
	}

}
