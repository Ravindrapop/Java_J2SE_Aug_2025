package com.ksg.flowcontrol;

public class DoWhileExample {
	
	public static void main(String[] args) {
		
		 int i = 6;  // Start from 6
	        
	        do {
	            System.out.println("Count: " + i);
	            i++;
	        } while (i <= 5);  // Condition is false, but checked after one execution
	        
	        System.out.println("Do-while loop executed once even though condition was false.");
	    
		
	}

}
