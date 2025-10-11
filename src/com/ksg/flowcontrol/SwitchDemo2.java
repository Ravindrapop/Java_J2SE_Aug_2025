package com.ksg.flowcontrol;

public class SwitchDemo2 {

	public static void main(String[] args) {

		char ch = 'e';
		switch ('a') {
		case 'a':
			System.out.println('a');
			break;
			
		case 'e':
			System.out.println("result: "+'e');
			break;
			
		case 'i':
			System.out.println('i');
			break;
			
		case 'o':
			System.out.println('o');
			break;
			
		case 'u':
			System.out.println('u');
			break;
			
		default:
			System.out.println("entered value is incorrected");
		}
		
	}

}
