package com.ksg.flowcontrol;

public class StarPattern1 {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {          // outer loop → rows
            for (int j = 1; j <= 4; j++) {      // inner loop → columns
                System.out.print("* ");         // print star on same line
            }
            System.out.println();               // move to next line
        }
		}
	}

