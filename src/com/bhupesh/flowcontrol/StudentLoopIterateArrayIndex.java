package com.bhupesh.flowcontrol;

public class StudentLoopIterateArrayIndex {

	public static void main(String[] args) {

		String[] student = { "Id", "Name", "Rollnumber", "Subject", "School", "Fathername",
				"Address", "Class", "Percentage" };
		String[] stu = {"161433","Bhupesh","1646464161","Array Loop","IGPG College","Ganga Prasad","Gauriganj","BA Final","72"};

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]+" - "+stu[i]);
		}
	}

}
