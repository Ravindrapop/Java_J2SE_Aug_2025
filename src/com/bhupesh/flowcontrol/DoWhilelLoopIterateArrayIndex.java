package com.bhupesh.flowcontrol;

public class DoWhilelLoopIterateArrayIndex {

	public static void main(String[] args) {
		
		String[] s = {"Ram","Seeta","Lakshman","Bharat","Shatrughna","Hanuman","Jaamvant","Suggreev","Angad","Nal","Neel"};
		
		int l = s.length;
		int i = 0;
		
		do {
			System.out.println("name = "+s[i]);
			i++;
		}while(i<l);

	}

}
