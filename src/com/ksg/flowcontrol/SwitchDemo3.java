package com.ksg.flowcontrol;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 10, num2 = 20;
		
		int x = '+';
		
		double result;
		
		switch (x) {
		
		case '+':
		result = num1 + num2;
		System.out.println("Sum = " + result);
		break;
		
		case '-':
		result = num1 - num2;
		System.out.println("Difference = \" + result");
		break;
		
		case '*':
            result = num1 * num2;
            System.out.println("Product = " + result);
            break;
		
		}
		}

	}


