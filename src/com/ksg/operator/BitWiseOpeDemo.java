package com.ksg.operator;

public class BitWiseOpeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int x = 23;
		
		int y = 33;
		
		if(++x>23 & ++y<33) {
			++x;
		}else {
			++y;
		}
		
		System.out.println(x+" "+y);


	}

}
