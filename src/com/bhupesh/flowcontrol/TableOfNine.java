package com.bhupesh.flowcontrol;

public class TableOfNine {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		int table = 9;
		
		int temp = 0;
		
		while(i<=10) {
			
			temp = table*i;
			System.out.println(temp);
			i++;
		}
	}

}
