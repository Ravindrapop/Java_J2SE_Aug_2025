package com.bhupesh.oops;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		
	
	
	Encapsulation e1 = new Encapsulation(750000,"Abhishek");
	
	e1.setBalance(1200000);
	e1.setName("Bhupesh");
	
	System.out.println(e1.getBalance() +" , "+ e1.getName());
	System.out.println(e1);
	System.out.println(e1.toString());

}
}