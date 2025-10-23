package com.bhupesh.flowcontrol;

public class Student2 {

      private String name;
      private int age;
      
      public Student2(String name , int age) {
    	  this.name = name;
    	  this.age = age;
      }
      
      public String getName() {
    	  return name;
      }
      
      public void setName(String name) {
    	  this.name = name;
      }
      
      public int getAge() {
    	  return age;
      }
      
      public void setAge(int age) {
    	  this.age = age;
      }
      
    	  public static void main(String[] args) {
    		  Student2[] s = new Student2[5];
    		  s[0] = new Student2("Yuvraj",25);
    		  s[1] = new Student2("Mahesh",28);
    		  s[2] = new Student2("Abhishek",38);
    		  s[3] = new Student2("Bhupesh",20);
    		  s[4] = new Student2("Deepak",40);
    		  
    		  int l = s.length;
    		  for(int i = 0; i<l; i++) {
    		  System.out.println("Name : "+s[i].getName()+" - Age : "+s[i].getAge());
    		  }
    		  
    	  }
      
      
		


}
