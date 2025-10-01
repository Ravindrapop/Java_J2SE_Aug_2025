package com.ksg.operator;

public class ShortCirDeko1 {

	public static void main(String[] args) {

		int x  = 5;
		int y  = 10;
		if (x >10  && ++y >10) {
			
			System.out.println("Condition is TRUE");
        } else {
            System.out.println("Condition is FALSE");
        }

        System.out.println("Value of y: " + y);
			
		}
		
	}


