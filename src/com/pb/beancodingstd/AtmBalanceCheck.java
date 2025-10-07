package com.pb.beancodingstd;



public class AtmBalanceCheck {
	public static void main(String[] args) {
		
		double balance=10000;
		double withdrawl=3000;
		if(withdrawl<=balance && withdrawl %100==0) {
			System.out.println("Withdrawl is allowed.");
		}
		else {
			System.out.println("Withdrawl is not allowed");
		}
	}

}
