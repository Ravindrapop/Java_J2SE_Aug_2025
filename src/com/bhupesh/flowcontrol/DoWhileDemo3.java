package com.bhupesh.flowcontrol;

public class DoWhileDemo3 {

	public static void main(String[] args) {

		int b = 3463;

		int temp = 0;

		int total = 0;

		do {

			temp = b % 10;
			total = total + temp;
			b = b / 10;

			System.out.println(total);
		} while (b > 0);
		System.out.println("sum of digit " + total);

	}

}
