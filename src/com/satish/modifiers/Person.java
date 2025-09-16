package com.satish.modifiers;

public class Person {
	
	public String name = "satish";
	private String city = "Gwalior";
	protected int age = 25;
		
		public void showName() {
			System.out.println("Name : " + name);
		}
	 protected void showCity() {
		 
		 System.out.println("City : " + city);
	 }
	  private void showAge() {
		 
		 System.out.println("Age : " + age);
	 }
		

}
