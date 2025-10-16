package com.ksg.flowcontrol;

public class WhileFalseExample {
	
	public static void main(String[] args) {
		
		int i =6;
		
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println("While loop ended without printing anything.");
	}

}
