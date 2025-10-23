package com.bhupesh.flowcontrol;

public class LoopDemo1 {
	
	public static void main(String[] args) {
		
		int i = 1110;
		int total = 0;
		for(int temp = 0; i>0;System.out.println("Hello Friends")) {
			temp = i%10;
			total = total+temp;
			i = i/10;
			
			System.out.println(total);
		}
		System.out.println("Sum of digit "+total);
		
		
	}

}
