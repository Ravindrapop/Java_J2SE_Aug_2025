package com.bhupesh.flowcontrol;

public class CheckNoNegative {
	
	public static void main(String[] args) {
		
		int a = -10;       //a=0(nutral),a=10(positive) 
		
		
		if(a>0) {
			System.out.println("A is positive");
		}else if(a<0) {
			System.out.println("A is negative");
		}else{
			System.out.println("A is nutral");
		}
	} 

}
