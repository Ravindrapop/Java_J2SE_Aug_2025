package com.bhupesh.flowcontrol;

public class GradeOfStudent {
	
	public static void main(String[] args) {
		
		int m1 = 30;
	 	int m2 = 60;
		int m3 = 90;
		int m4 = 120;
		
		double per = 0.0;
		int total = 0;
		
		char grade = 'Z';
		
		total = m1+m2+m3+m4;
		
		per = total/4;
		
		if(per>=85) {
			grade = 'A';
		}else if(per>=70) {
			grade = 'B';
		}else if(per>=55) {
			grade = 'C';
		}else if(per>=40) {
			grade = 'D';
		}else {
			grade = 'E';
		}
		
		System.out.println("The Grade is :"+grade);
		
	}

}
