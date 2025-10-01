package com.bhupesh.modifiers;

public class CompoundAssiOprDemo {
	
	public static void main(String[] args) {
		
		
		int w,x,y,z;
		
		w=x=y=z=10;
		
		w+=x*=y-=z/=3;
		
		System.out.println(w+" "+x+" "+y+" "+z);
	}

}
