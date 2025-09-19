package com_yuvraj_coding.standard;


public class Test_of_student_class {

	public static void main(String[] args) {

		Student student = new Student(); 
		// There is no error when you create a reference variable with the same name as your class, because Java is a case-sensitive language.
	
		System.out.println( "Hashcode = " + student.hashCode());
        System.out.println( "Default value of int datatype = " + student.getRollNumber());
        System.out.println( "Default value of String datatype = " + student.getName());
        
        student.setRollNumber(121527034);
        student.setName("Yuvraj Singh Kushwah");
        
        
        System.out.println( "Student’s roll number = " + student.getRollNumber());
        System.out.println( "Student's name = " + student.getName());
        
	}

}
