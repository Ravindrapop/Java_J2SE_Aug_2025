package com.ksg.operator;

public class OperatorExample {
	
	public static void main(String[] args) {
		
		//Arithmetic Operators (+, -, *, /, %);
		int a = 20; int b= 34;
		
		System.out.println("a+b =" +(a+b));
		System.out.println("a-b = " + (a-b));
		System.out.println("a * b = " + (a * b));  
        System.out.println("a / b = " + (a / b));  
        System.out.println("a % b = " + (a % b));  
        
        //Relational (Comparison) Operators (==, !=, >, <, >=, <=)
        
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        
       //  logical Operators (&&, ||, !)
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));  // AND
        System.out.println("x || y = " + (x || y));  // OR
        System.out.println("!x = " + (!x));          // NOT
        
      //  Assignment Operators (=, +=, -=, *=, /=, %=)
        int c = 20;
        System.out.println("\nAssignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c += 5 : " + c);
        c -= 2; // c = c - 2
        System.out.println("c -= 2 : " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2 : " + c);
        c /= 3; // c = c / 3
        System.out.println("c /= 3 : " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3 : " + c);
        
     //   Increment and Decrement (++ and --)
        int num = 5;
        System.out.println("\nIncrement / Decrement:");
        System.out.println("num++ : " + (num++));  // Post-increment
        System.out.println("++num : " + (++num));  // Pre-increment
        System.out.println("num-- : " + (num--));  // Post-decrement
        System.out.println("--num : " + (--num));  // Pre-decrement

	}

}
