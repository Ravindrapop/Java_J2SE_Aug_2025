package com.bhupesh.modifiers;

public class EqualityOprDemo1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		
		Thread t2 = new Thread();
		
		Thread t3 = t1;
		
		//System.out.println(t1==t3);
		
		//System.out.println(t2!=t3);
		
		Object o1 = new Object();
		
		Object o2 = new Object();
		
		String s1 = new String("Ram");
		
		System.out.println(o1==s1);
		
		System.out.println(o1!=s1);
		
		System.out.println(s1.equals(s1));
		
		System.out.println(o1==s1);
		
		System.out.println(o1.hashCode());

	}

}
