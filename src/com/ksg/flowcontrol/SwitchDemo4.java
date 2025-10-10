package com.ksg.flowcontrol;

public class SwitchDemo4 {

	public static void main(String[] args) {

		int num = 11;
		switch(num%2) {
		case 0:
			System.out.println("num is: even");
			break;
			
		case 1:
		System.out.println("num is: odd");
		break;
		
		case 2:
			System.out.println("num is: odd");
			break;
		}
		
	}

}
