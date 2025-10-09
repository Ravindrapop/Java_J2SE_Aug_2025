package com.bhupesh.modifiers;

public class BitWisOprDemo1 {
	
	public static void main(String[] arga) {
		
		int a = 40;
		
		int b = 50;
		
		if(++a>40 | ++b<50) {
			++a;
		}else {
			++b;
		}
		
		System.out.println(a+" "+b);
	}

}
