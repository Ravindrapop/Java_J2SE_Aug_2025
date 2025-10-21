package com.bhupesh.flowcontrol;

public class DoWhileDemo2 {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		do
		{
			if(i%2!=0);
			i--;
			System.out.println(i);
		}while(i>=10);
		System.out.println("this condition is false");
	}

}
