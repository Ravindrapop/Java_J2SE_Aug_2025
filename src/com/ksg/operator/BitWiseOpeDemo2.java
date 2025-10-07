package com.ksg.operator;

public class BitWiseOpeDemo2 {
	
	public static void main(String[] args) {
		
		int x = 40;

		int y = 30;

		if (++x > 40 | ++y < 30) {
			++x;
		} else {
			++y;
		}

		System.out.println(x + " " + y);
	}

}
