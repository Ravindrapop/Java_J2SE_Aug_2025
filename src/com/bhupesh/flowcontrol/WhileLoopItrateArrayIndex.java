package com.bhupesh.flowcontrol;

public class WhileLoopItrateArrayIndex {
	
	public static void main(String[] args) {
		
		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n'};
		
		int l = c.length;
		int i = 0;
		
		while(i<l) {
			
			System.out.println("character = "+c[i]);
			i++;
		}
	   
	}

}
