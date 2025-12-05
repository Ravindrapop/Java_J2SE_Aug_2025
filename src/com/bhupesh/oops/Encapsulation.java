package com.bhupesh.oops;

public class Encapsulation {
	
	private int balance;
	private String name;
	
	public int getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	Encapsulation(int balance , String name){
		this.balance = balance;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name = "+ name + " , Balance = "+ balance; 
	}
	

}
