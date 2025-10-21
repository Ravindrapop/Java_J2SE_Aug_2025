package com.bhupesh.flowcontrol;

public class DoWhileDemo1 {

	public static void main(String[] args) {

		int i = 10, a = 20;

		do {
			System.out.println("This condition is false");
		}

		while (i > a);

		System.out.println("This condition is true");

	}
}
