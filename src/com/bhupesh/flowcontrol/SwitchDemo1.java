package com.bhupesh.flowcontrol;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		int a = 97;
		final int y = 20;
		
		switch(a) {
		
		case 98:
			System.out.println('b');
			break;
		case 65:
			System.out.println('A');
			break;
		case y:
			System.out.println(20);
			break;
		default:
			System.out.println("No Match Found");
		}
		
		
		
	}

}
