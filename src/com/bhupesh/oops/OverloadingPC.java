package com.bhupesh.oops;

public class OverloadingPC {
	
	public static void main(String[] args) {
		
		OverloadingC c1 = new OverloadingC();
		c1.m1(10);
		c1.m1();
		c1.m1("Ram");
		
		OverloadingP p1 = new OverloadingP();
		p1.m1("Seeta");
		p1.m1();
		
	//	OverlodingC c2 = new OverloadingP();
		
		OverloadingP p2 = new OverloadingC();
		p2.m1("Krishna");
		p2.m1();
	}

}
