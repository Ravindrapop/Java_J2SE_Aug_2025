package com.bhupesh.interfaces;

public class Test implements Left,Right{
	
	public void m1() {
		
	System.out.println("Hello Gys");	
	}
	
	public void m1(int i) {
		
		System.out.println(10);
	}
    public static void main(String[] args) {
    	
    	Test t = new Test();
    	
    	t.m1();
    	t.m1(0);
    }
}
