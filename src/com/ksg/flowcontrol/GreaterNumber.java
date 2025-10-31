package com.ksg.flowcontrol;

import java.util.Scanner;

public class GreaterNumber {


		
		
		    public static void main(String[] args) {

		        // Create Scanner object to take input
		        Scanner sc = new Scanner(System.in);

		        // Take two numbers from user
		        System.out.print("Enter first number: ");
		        int num1 = sc.nextInt();

		        System.out.print("Enter second number: ");
		        int num2 = sc.nextInt();

		        // Use if-else to check which is greater
		        if (num1 > num2) {
		            System.out.println(num1 + " is greater.");
		        } else if (num2 > num1) {
		            System.out.println(num2 + " is greater.");
		        } else {
		            System.out.println("Both numbers are equal.");
		        }

		        sc.close(); // Close scanner (optional but good practice)

	}

}
