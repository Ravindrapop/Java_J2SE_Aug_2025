package com.pb.operator;

public class AssignmentOperatorForIncrement {
	public static void main(String[] args) {
		
	int x=10;	
	int y=x++;
	System.out.println("x="+x+".."+"y="+y);
	int z=++x;
	System.out.println("x"+x+".."+"z="+z);
	
	int a=5;
	int b=a++;
	System.out.println("a="+a+",,,"+"b="+b);
		
	



	int u=15;
	int v=--u;
	System.out.println("u="+u+"...."+"v="+v);
	int X=15;
	int Y=X--;
	System.out.println("X="+X+"..."+"Y="+Y);
	}
	
	
	
}