package com.bhupesh.oops;

public class FSTest {
	
	public static void main(String[] args) {
		
		Father f1 = new Father();
		f1.m1();
	//	f1.m2();         father reference do not call son method
		
		Son s1 = new Son();
		s1.m1();
		s1.m2();
		
		Father f2 = new Son();
		f2.m1();
	//	f2.m2();
		
	//	Son s2 = new Father();
	}

}
