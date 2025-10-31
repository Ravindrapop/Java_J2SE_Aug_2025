package com.ksg.flowcontrol;

public class TableOfTen {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		int table = 10;
		int temp = 0;
		
		while(i<=10) {
			temp = table*i;
			System.out.println(temp);
			i++;
		}
		 
		
	}

}

