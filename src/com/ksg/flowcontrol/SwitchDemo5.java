package com.ksg.flowcontrol;

public class SwitchDemo5 {
	
	public static void main(String[] args) {
		
		int marks = 85;
		switch(marks/10) {
		
		case 10:
        case 9:
            System.out.println("Grade: A");
            break;
        case 8:
        case 7:
            System.out.println("Grade: B");
            break;
        case 6:
        case 5:
            System.out.println("Grade: C");
            break;
        default:
            System.out.println("Grade: Fail");
    
		}
		
	}

}
