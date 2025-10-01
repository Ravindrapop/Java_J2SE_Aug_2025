package com.ksg.operator;

public class ShortCirExample {

	public static void main(String[] args) {

		int x = 10;
        int y = 5;

        // Example 1: && (AND)
        if (x > 5 && ++y > 5) {   // second condition checked only if first is true
            System.out.println("Condition 1 is TRUE");
        }
        System.out.println("Value of y after &&: " + y);

        // Reset y for next example
        y = 5;

        // Example 2: || (OR)
        if (x < 5 || ++y > 5) {   // second condition checked only if first is false
            System.out.println("Condition 2 is TRUE");
        }
        System.out.println("Value of y after ||: " + y);
	}

}
