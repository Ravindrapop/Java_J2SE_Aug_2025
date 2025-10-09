package com.bhupesh.modifiers;

public class ShortCirOprDemo1 {
	
	public static void main(String[] args) {
		
		int i = 30;
		
		int u = 40;
		
		if(++i<30 || ++u>40) {
			++i;
			
		}else {
			++u;
		}
		
		System.out.println(i+" "+u);
	}

}
