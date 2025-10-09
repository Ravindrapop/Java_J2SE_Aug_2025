package com.bhupesh.modifiers;

public class Student {
	
	private int rate;
	
	private String name;



public int getRate() {
	return rate;
}

public void setRate(int rate) {
	this.rate = rate;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public static void main(String[] args) {
	
	Student student = new Student();
	student.rate =(780);
	student.name =("Almond");
	System.out.println(student.name+student.rate);

}

}
